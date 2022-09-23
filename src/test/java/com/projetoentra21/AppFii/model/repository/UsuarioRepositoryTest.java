package com.projetoentra21.AppFii.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.projetoentra21.AppFii.models.Usuario;
import com.projetoentra21.AppFii.repository.UsuarioRepository;


@SpringBootTest
@ExtendWith(SpringExtension.class)		
public class UsuarioRepositoryTest {
	
	@Autowired
	UsuarioRepository repository;
	
	
	@Test
	public void deveVerificarAExistenciaDeUmEmail() {
		//1 - Elemento (Cenário)
		Usuario usuario = Usuario.builder().nome("user").email("user@email.com").build();
		repository.save(usuario);
		
		//2 - Elemento (Execução/Ação)
		boolean result = repository.existsByEmail("user@email.com");
		
		
		// 3 - Elemento (Verificação)
		Assertions.assertThat(result).isTrue();
		
		
	}

}
