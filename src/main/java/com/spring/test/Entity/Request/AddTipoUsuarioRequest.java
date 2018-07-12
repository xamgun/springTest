package com.spring.test.Entity.Request;


public class AddTipoUsuarioRequest {

    private Long id;
    private String descrição;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }


}
