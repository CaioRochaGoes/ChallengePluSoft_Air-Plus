package br.com.fiap.challengePluSoft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
@Entity
public class Permission {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank @Size(max= 60, message="Nome não pode conter mais de 60 caracteres")
    private String name;
    @NotBlank @Size(max= 300, message="A descrição não pode conter mais de 300 caracteres")
    private String description;
    @NotNull
    private Boolean is_active;
}
