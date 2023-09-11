package exerciciosOOP;
//dados aleatorios para estudo
public class TestaCliente {
	public static void main(String[] args) {
		Cliente Sarah = new Cliente("Sarah",41,"10/06/1992","593.591.295-60","19.233.412/5");
		Cliente Levi = new Cliente("Levi",24,"14/01/2002","895.234.235-23","24.563.875/7");
		
		Sarah.Visualizar();
		System.out.println("\n");
		Levi.Visualizar();
	}

}
