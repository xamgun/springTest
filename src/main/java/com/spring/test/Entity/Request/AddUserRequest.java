package com.spring.test.Entity.Request;


public class AddUserRequest {
    private String name;
    private String email;
    private String senha;


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
}
