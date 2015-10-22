#!/bin/bash

# update repository and install mysql-server
sudo yum install mysql-server
sudo /sbin/service mysqld start
sudo /usr/bin/mysql_secure_installation

# grant access from outside network using iptables
sudo iptables -I INPUT -p tcp --dport 3306 -m state --state NEW,ESTABLISHED -j ACCEPT
sudo iptables -I OUTPUT -p tcp --sport 3306 -m state --state ESTABLISHED -j ACCEPT
sudo /sbin/service mysqld restart

# launch at startup
sudo chkconfig mysqld on

# create database, user, assign privileges
Q1="CREATE DATABASE IF NOT EXISTS SpiderDroidDB;"
Q2="CREATE USER 'spiderdroid2'@'localhost' IDENTIFIED BY 'sp1dy';"
Q3="GRANT ALL ON SpiderDroidDB.* TO 'spiderdroid'@'localhost' IDENTIFIED BY 'sp1dy';"
Q4="FLUSH PRIVILEGES;"
SQL="${Q1}${Q2}${Q3}${Q4}"

mysql -u root -p -e "$SQL"