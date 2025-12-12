package com.clientes.service;

import com.clientes.entity.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente obtenerPorId(Long id);
    List<Cliente> obtenerTodos();

}
