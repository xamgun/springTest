package com.spring.test.Entity.Request;

import com.spring.test.Entity.TipoUsuario;

public class AddUserRequest {
    private String name;
    private String email;
    private String senha;
    private TipoUsuario tipoUsuario;


    public String getSenha() {
        return senha;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
