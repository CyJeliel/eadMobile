package br.com.www.eadMobile.simulacao;

import br.com.www.eadMobile.arrumar.Topico;

public class Ribossomo implements Topico {

	@Override
	public void exibePergunta() {
		System.out.println("Sistema diz: nome da organela?");
	}

	@Override
	public void exibeExplicacao() {
		System.out.println("Sistema diz: nome da organela é Ribossomo");
	}

}
