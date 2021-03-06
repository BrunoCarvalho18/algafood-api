package com.algaworks.algafood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.algaworks.algafood.di.modelo.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificacaoEmailMock implements Notificador{
	
	public NotificacaoEmailMock() {
	   System.out.println("NotificadorEmail MOCK");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK: Notificação seria enviada para %s através do email %s\n",
				cliente.getNome(),cliente.getEmail(),mensagem);
		
		
	}

}
