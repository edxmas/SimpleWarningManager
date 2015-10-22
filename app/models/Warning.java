package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vividsolutions.jts.geom.Geometry;
import org.hibernate.annotations.Type;
import play.db.jpa.JPA;
import utils.WarningSerializer;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Eduard Natale on 13/10/15
 */

@Entity
@SequenceGenerator(name = "warnings_seq", sequenceName = "warnings_seq")
@JsonSerialize(using = WarningSerializer.class)
public class Warning {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "warnings_seq")
    @JsonIgnore
    public Long id;
    @Column(name="the_geom", columnDefinition = "Geometry")
    @Type(type="org.hibernate.spatial.GeometryType")
    public Geometry theGeom;
    @Type(type="org.hibernate.type.TextType")
    public String title;
    public String description;
    public String author;
    public String location;
    @Temporal(TemporalType.TIMESTAMP)
    public Date timestamp;

    public void save() {
        JPA.em().persist(this);
    }

    public static List<Warning> getAll() {
        return JPA.em().createQuery("select w from Warning w", Warning.class).getResultList();
    }
}
