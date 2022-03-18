package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
		
		// Objetos -> null
		// String s = null;
		

		//String s = "";
		//System.out.println(s);
		
		// byte, short, int, long -> 0
		// float, double -> 0.0
		//boolean -> false
		// char -> '\u0000'
	}
	
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormtada(){
		System.out.println(this.obterDataFormatada());
	}
	
}
