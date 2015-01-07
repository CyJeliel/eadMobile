package br.com.www.eadMobile.simulacao;

import br.com.www.eadMobile.arrumar.Resposta;

public class RespostaCorreta implements Resposta {

	@Override
	public void avalia() {
		System.out.println("Sistema diz: Resposta correta");
	}

}
