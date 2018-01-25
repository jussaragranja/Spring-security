package br.com.locadora.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import br.com.locadora.model.Cliente;
import br.com.locadora.model.Usuario;
import br.com.locadora.repository.filtros.FiltroCliente;
import br.com.locadora.service.ClienteService;

public class ClienteController {
	
	public static String Cadastrar_Clientes = "/clientes/addClientes";
	
	public static String Listar_Clientes = "/clientes/clientes";
	
	@Autowired
	private ClienteService clienteServer;
	
	public ModelAndView findAll(@ModelAttribute("filtro") FiltroCliente filtro) {		
		ModelAndView mv = new ModelAndView(Listar_Clientes);
		List<Cliente> clientes = this.clienteServer.findByNome(filtro);
		mv.addObject("clientes", clientes);
		return mv;
	}	
}
