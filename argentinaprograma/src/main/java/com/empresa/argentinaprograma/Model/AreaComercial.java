package com.empresa.argentinaprograma.Model;

import java.util.ArrayList;
import java.util.List;

public class AreaComercial {

	private List<Cliente> clientes = new ArrayList<>();

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public AreaComercial() {
    }
}


