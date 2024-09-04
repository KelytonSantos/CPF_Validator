package com.cpf.validation.controller;

import com.cpf.validation.ValidCPF;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDTO {

    @NotNull(message = "CPF cannot be null")
    @Size(min = 11, max = 14, message = "CPF must be between 11 and 14 characters")
    @ValidCPF
    private String cpf;

    public UserDTO() {
    }

    public UserDTO(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
