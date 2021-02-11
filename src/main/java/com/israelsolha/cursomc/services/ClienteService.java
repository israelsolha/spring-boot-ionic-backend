package com.israelsolha.cursomc.services;

import com.israelsolha.cursomc.domain.Cliente;
import com.israelsolha.cursomc.repositories.ClienteRepository;
import com.israelsolha.cursomc.services.exceptions.ObjectNotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExceptions("Objeto não encontrado! Id: " + id + ", Tipo: " +
                Cliente.class.getName()));
    }
}
