package com.jcyepesgarcia.apistudentmanager.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="student")//Esto crea una tabla en la BBDD con el nombre asignado en la propiedad name
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Indica que los atributos id se van a generar de manera automática
    private Long id;
    private String firstName;
    private String lastName;
    @Column(name="email_address", unique = true, nullable = false)// Cuando un atributo d ela clase lleva un nombre diferente al de la columna en la BBBDD, debe usarse esta anotación para señalar la columna a la que apunta el atributo
    private String email;
}
