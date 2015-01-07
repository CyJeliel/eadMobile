package br.com.www.eadMobile.simulacao;

import br.com.www.eadMobile.arrumar.HasTopico;
import br.com.www.eadMobile.arrumar.IsUsuario;
import br.com.www.eadMobile.arrumar.Resposta;
import br.com.www.eadMobile.arrumar.Topico;

public class UsuarioSimulacao implements IsUsuario {

	@Override
	public Topico selecionaTopico(HasTopico hasTopico) {
		System.out.println("Usuário diz: selecionei ribossomo");
		return new Ribossomo();
	}

	@Override
	public Resposta responde() {
		System.out.println("Usuário diz: ribossomo");
		return new RespostaCorreta();
	}

}
