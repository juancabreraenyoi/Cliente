package com.clientes.service;

import com.clientes.entity.Cliente;
import com.clientes.entity.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteServiceImplement implements ClienteService {

    private final ClienteRepository clienteRepository;


    @Override
    public List<Cliente> obtenerTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente obtenerPorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("No se encontro el Cliente por id"));
    }



}
