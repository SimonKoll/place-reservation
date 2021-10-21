package at.htl.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class CourtTypeEntity extends PanacheEntity implements Serializable {
    public String description;
}
