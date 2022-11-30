package com.charmest.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

// Annotation Lombok qui ajouteles getters / setters pour nous
@Data
@Entity
@Table(name = "employees")
public class Employee {

	// Clé primaire
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Lien avec un champ de la table
    @Column(name="first_name")
    private String firstName;

    // Lien avec un champ de la table
    @Column(name="last_name")
    private String lastName;

    // Pas besoin d'annotation @Column ici étant donné que le nom est identique dans la table
    private String mail;

    // Pas besoin d'annotation @Column ici étant donné que le nom est identique dans la table
    private String password;

}
