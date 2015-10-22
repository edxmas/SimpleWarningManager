/**********************************/
/***   Anatomy of Application   ***/
/**********************************/

app
    - actors
    - assets                compiled asset sources
        - javascripts       compiled javascript sources
        - stylesheets       compiled css sources
    - controllers           application controllers
    - models                application business layer
    - views                 templates
    - Global.java           application global settings
conf
    - application.conf      configuration file
    - routes                routes definition
logs
    - application.log       default log file
project                     sbt configuration files
    - build.properties      marker for sbt project
    - plugins.sbt           sbt plugins including the declaration for Play itself
public                      public assets (not compiled)
    - font-awesome
    - fonts
    - images
    - javascripts
    - stylesheets
target                      generated stuff
test                        source folder for unit or functional tests
    - util                  utility folder for testing class
        - input             input for testing class
        - output            output for testing class
    - test class            testing class
build.sbt                   application build script