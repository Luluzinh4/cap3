package br.edu.ifsp.spo.lp1a3.sp3013022.cap3;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DataAtual {
	
	/*
	public String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
	*/

	public String getDataDia() {
		DateFormat dateFormat = new SimpleDateFormat("dd");
		Date dia = new Date();
		return dateFormat.format(dia);
	}
	
	public String getDataMes() {
		DateFormat dateFormat = new SimpleDateFormat("MM");
		Date mes = new Date();
		return dateFormat.format(mes);
	}
	
	public String getDataAno() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy");
		Date ano = new Date();
		return dateFormat.format(ano);
	}
	
}
