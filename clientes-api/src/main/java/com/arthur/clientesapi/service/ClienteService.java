package com.arthur.clientesapi.service;

import com.arthur.clientesapi.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();
    private Long nextId = 1L;

    public List<Cliente> listar() {
        return clientes;
    }

    public Cliente criar(Cliente c) {
        c.setId(nextId);

        nextId++;

        clientes.add(c);

        return c;
    }

    public Cliente buscarPorId(Long id){
        for(Cliente c : clientes){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }

    public boolean remover(Long id){
        for(Cliente c : clientes){
            if(c.getId().equals(id)){
                return clientes.remove(c);
            }
        }
        return false;
    }

    public Cliente atualizar(Long id, Cliente novo){
        Cliente existente = buscarPorId(id);

        if(existente != null){

            existente.setNome(novo.getNome());
            existente.setEmail(novo.getEmail());
            existente.setIdade(novo.getIdade());

            return existente;
        }
        return null;
    }

}
