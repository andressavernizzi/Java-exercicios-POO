package exerciciosOOP5;
//dados aleatorios para estudo
public class TestaIngresso {
	public static void main(String[] args) {
		
		Ingresso pessoa1 = new Ingresso("Metallica",130.50f,"p-52",true,1);
		Ingresso pessoa2 = new Ingresso("BTS",245.80f,"q-16/q-17",false,2);
		
		pessoa1.Visualizar();
		System.out.println("\n");
		pessoa2.Visualizar();
	}

}
