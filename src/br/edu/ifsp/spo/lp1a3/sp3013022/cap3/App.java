package br.edu.ifsp.spo.lp1a3.sp3013022.cap3;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Ol�, Mundo!");
		
		//Instanciando classe Scanner
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
				
		String nome;
		String sobrenome;
		int dia;
		int mes;
		int ano;
		
		//Pedindo Informa��es
		System.out.print("Digite o primeiro nome: ");
		nome = ler.nextLine();
		System.out.print("Digite o sobrenome: ");
		sobrenome = ler.nextLine();
		System.out.print("Digite o dia de nascimento: ");
		dia = ler.nextInt();
		System.out.print("Digite o m�s de nascimento: ");
		mes = ler.nextInt();
		System.out.print("Digite o ano de nascimento: ");
		ano = ler.nextInt();
		
		//Instanciando
		HeartRates heart = new HeartRates(nome, sobrenome, dia, mes, ano);
		
		//Imprimindo informa��es
		System.out.println("Nome: " + heart.getNome() + " " + heart.getSobrenome());
		System.out.println("Data de Nascimento: " + heart.getDia() + "/" + heart.getMes() + "/" + heart.getAno());
		
		//C�lculo da idade
		System.out.println("Idade: " + heart.idadeAtual(heart.getDia(), heart.getMes(), heart.getAno()) + " anos");
		
		//C�lculo da frequ�ncia card�aca m�xima
		System.out.println("Frequ�ncia Card�aca M�xima: " + heart.freqCardMax() + " por minuto.");
		
		//C�lculo da frequ�ncia card�aca alvo
		heart.freqCardAlvo();
		
		/* Testes
		System.out.println(heart.getNome());
		System.out.println(heart.idadeAtual(heart.getDia(), heart.getMes(), heart.getAno()));
		System.out.println(heart.freqCardMax());

		heart.freqCardAlvo();
		*/
	}

}
