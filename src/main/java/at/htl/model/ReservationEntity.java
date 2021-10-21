package at.htl.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class ReservationEntity extends PanacheEntity implements Serializable {

    @Column(name = "STARTTIME")
    public LocalDateTime start;
    @Column(name = "ENDTIME")
    public LocalDateTime end;
    @Column(name = "RESTIMESTAMP")
    public LocalDateTime timestamp;

    @ManyToOne
    public CustomerEntity customerEntity;
    @ManyToOne
    public CourtEntity courtEntity;

}
