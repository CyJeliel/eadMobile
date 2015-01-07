package br.com.www.eadMobile.simulacao;

import br.com.www.eadMobile.arrumar.Exercicio;
import br.com.www.eadMobile.arrumar.Materia;
import br.com.www.eadMobile.arrumar.Resposta;
import br.com.www.eadMobile.arrumar.Sistema;
import br.com.www.eadMobile.arrumar.Topico;


public class SimuladorEadMobile {

	public static void main(String[] args) {

		Sistema sistema = new SistemaOrganelas();
		
		UsuarioSimulacao usuario = new UsuarioSimulacao();

		simulaMateria(sistema, usuario);

		simulaExercicio(sistema, usuario);
		
	}

	private static void simulaMateria(Sistema sistema, UsuarioSimulacao usuario) {
		
		Materia materia = new OrganelaMateria();
		
		sistema.exibe(materia);

		Topico topico = usuario.selecionaTopico(materia);

		sistema.ensinaSobre(topico);
	}

	private static void simulaExercicio(Sistema sistema, UsuarioSimulacao usuario) {
		
		Exercicio exercio = new ExercicioOrganelas();
		
		//Sistema: Exibe o esquema da célula para o usuário
		sistema.exibe(exercio);
		
		//Usuário: Seleciona uma organela
		Topico topico = usuario.selecionaTopico(exercio);
		
		//Sistema: Pergunta o nome da organela
		sistema.perguntaSobre(topico);
		
		//Usuário: Responde
		Resposta resposta = usuario.responde();
		
		//Sistema: verifica se está correto. Se sim, responde ok, se não, responde errado
		sistema.avalia(resposta);
	}

}
