package br.edu.ifsp.spo.lp1a3.sp3013022.cap3;

public class HeartRates {

	private String nome;
	private String sobrenome;
	private int dia;
	private int mes;
	private int ano;
	
	//Constructor
	public HeartRates (String nome, String sobrenome, int dia, int mes, int ano) {
		setNome(nome);
		setSobrenome(sobrenome);
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//Métodos
	
	//Calcular e retornar a idade em anos
	public int idadeAtual(int dia, int mes, int ano) {
		
		DataAtual dataAtual = new DataAtual();
		int diaAtual = Integer.parseInt(dataAtual.getDataDia());
		int mesAtual = Integer.parseInt(dataAtual.getDataMes());
		int anoAtual = Integer.parseInt(dataAtual.getDataAno());
		
		if(mes > mesAtual) {
			return anoAtual - 1 - ano;
		}else {
			if(mes == mesAtual) {
				if(dia > diaAtual) {
					return anoAtual - 1 - ano;
				}else {
					return anoAtual - ano;
				}
			}else {
				return anoAtual - ano;
			}
		}		
	}
	
	//Calcular e retornar a frequência cardíaca máxima
	public int freqCardMax() {
		
		int frequencia = 220 - idadeAtual(dia, mes, ano);
		return frequencia;
	}
	
	//Calcular e retornar a frequência cardíaca alvo
	//Pensar
	/*
	public int freqCardAlvo() {
		
		int freqAlvoMin = 0;
		return freqAlvoMin;
	}
	*/
	public void freqCardAlvo() {
		
		double freqAlvoMin = 0.5 * freqCardMax();
		double freqAlvoMax = 0.85 * freqCardMax();
		
		System.out.println("A frequência cardíaca alvo está entre " + freqAlvoMin + " e " + freqAlvoMax);
	}
}
