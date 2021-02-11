package com.israelsolha.cursomc.services;

import com.israelsolha.cursomc.domain.Pedido;
import com.israelsolha.cursomc.repositories.PedidoRepository;
import com.israelsolha.cursomc.services.exceptions.ObjectNotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido buscar(Integer id) {
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExceptions("Objeto não encontrado! Id: " + id + ", Tipo: " +
                Pedido.class.getName()));
    }
}
