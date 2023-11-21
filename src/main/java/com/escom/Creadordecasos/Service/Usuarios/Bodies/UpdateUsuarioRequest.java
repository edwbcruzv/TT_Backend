package com.escom.Creadordecasos.Service.Usuarios.Bodies;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UpdateUsuarioRequest {

    private Long id;

    private String username;

    private String password;

    private String email;

    private String nombre;

    private String apellido_paterno;

    private String apellido_materno;

    private Date fecha_nacimiento;

}