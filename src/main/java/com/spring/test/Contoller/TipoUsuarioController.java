package com.spring.test.Contoller;

import com.spring.test.Entity.Request.AddTipoUsuarioRequest;
import com.spring.test.Entity.Request.AddUserRequest;
import com.spring.test.Entity.TipoUsuario;
import com.spring.test.Repository.TipoUsuarioRepository;
import com.spring.test.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TipoUsuarioController {

    private TipoUsuarioRepository tipoUsuarioRepository;

    @Autowired
    public TipoUsuarioController(TipoUsuarioRepository tipoUsuarioRepository) {
        this.tipoUsuarioRepository = tipoUsuarioRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<TipoUsuario> findAllTipoUsuario() {
        return tipoUsuarioRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addTipoUsuario(@RequestBody AddTipoUsuarioRequest addTipoUsuarioRequest){
        TipoUsuario tipoUsuario = new TipoUsuario();
        tipoUsuario.setDescricao(addTipoUsuarioRequest.getDescrição());
        tipoUsuarioRepository.save(tipoUsuario);
    }
}
