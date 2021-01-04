package com.nelioalves.cursomc.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nelioalves.cursomc.CursomcApplication;
import com.nelioalves.cursomc.dto.ClienteNewDTO;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = CursomcApplication.class)
public class ClienteService {
	
	@Test
	public void clienteSaveTest() {
		ClienteNewDTO clienteNewDTO = new ClienteNewDTO(
				 "João da Silva/",
//				null,
				 "joao@gmail.com",
				 "39044683756",
				 1,
				 "997723874",
				 "32547698",
				 "Rua das Acácias",
				 "345",
				 "Apto 302",
				 "38746928",
				 "61992066255", 
				 null, 
				 null, 
				 2);
		
		int teste = clienteNewDTO.getNome().indexOf("^\\w*");
		
		System.out.println("teste aqui " + teste);
		
		Assert.assertEquals(clienteNewDTO.getCidadeId(), Integer.valueOf(2));
		
		Assert.assertNotNull(null, clienteNewDTO);
		Assert.assertNotNull(clienteNewDTO.getNome());
	}

}
