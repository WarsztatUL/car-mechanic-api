package pl.arturzaczek.carMechanicDB.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false)
    private String vin;
    @Column(length = 30, nullable = false)
    private String licensePlate;
    private LocalDate firstRegistrationDate;
    private Integer prodYear;
    private String brand;
    private String model;
    @Enumerated(value = EnumType.STRING)
    private BodyType bodyType;
    private int mileage;
    private String color;
    @OneToOne(cascade = CascadeType.MERGE)
    private Engine engine;
    @ManyToMany
    private Set<Customer> customers;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private Set<ServiceRequest> serviceRequests;


}
