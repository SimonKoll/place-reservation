package at.htl.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class CustomerEntity extends PanacheEntity implements Serializable {
    public String firstname;
    public String lastname;
    public String street;
    public String houseno;
    public String zip, city;
    public String passwd;
}
