package exerciciosOOP4;
//dados aleatorios para estudo
public class TesteFarmacia {
	public static void main(String[] args) {
		
		Farmacia tramal = new Farmacia("Tramal",72.90f,"193",20,true);
		Farmacia epocler = new Farmacia("Epocler",2.90f,"57",1,false);
		
		tramal.Visualizar();
		System.out.println("\n");
		epocler.Visualizar();
	}

}
