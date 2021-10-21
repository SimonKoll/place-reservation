package at.htl.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class CourtEntity extends PanacheEntityBase implements Serializable {

    @Id
    public Long id;
    public String location;

    @ManyToOne
    public CourtTypeEntity courtTypeEntity;
}
