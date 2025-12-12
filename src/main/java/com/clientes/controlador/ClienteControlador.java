package com.clientes.controlador;

import com.clientes.entity.Cliente;
import com.clientes.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/cliente")
@RequiredArgsConstructor
public class ClienteControlador {

    private final ClienteService clienteService;


    @GetMapping("/todos")
    public List<Cliente> obtenerTodos(){
        return clienteService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Cliente obtenerPorId(@PathVariable Long id){
        return clienteService.obtenerPorId(id);
    }
}
