package io.github.danieldlc.service;

import io.github.danieldlc.model.Cliente;
import io.github.danieldlc.repository.ClientesRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        ClientesRepository clientesRepository = new ClientesRepository();
    }

    public void validarCliente(Cliente cliente){

    }
}
