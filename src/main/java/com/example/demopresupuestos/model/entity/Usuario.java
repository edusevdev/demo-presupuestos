package com.example.demopresupuestos.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "USUARIO")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CONTRASENA")
    private String contrasena;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "EMAIL_RESPONSABLE")
    private String emailResponsable;
}
