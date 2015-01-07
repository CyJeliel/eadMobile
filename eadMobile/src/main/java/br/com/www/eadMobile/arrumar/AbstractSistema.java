package br.com.www.eadMobile.arrumar;

public abstract class AbstractSistema implements Sistema {

	@Override
	public void exibe(HasExibicao hasExibicao) {
		hasExibicao.exibe();
	}

	@Override
	public void perguntaSobre(Topico topico) {
		topico.exibePergunta();
	}

	@Override
	public void avalia(Resposta resposta) {
		resposta.avalia();
	}

	@Override
	public void ensinaSobre(Topico topico) {
		topico.exibeExplicacao();
	}

}
