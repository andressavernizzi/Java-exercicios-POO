package exerciciosOOP2;
//dados aleatorios para estudo
public class TestaFuncionario {
	
	public static void main(String[] args) {
		Funcionario Sarah = new Funcionario("Sarah",41,"112","gerente","7am-5pm");
		Funcionario Levi = new Funcionario("Levi",24,"245","caixa","7am-5pm");
		
		Sarah.Visualizar();
		System.out.println("\n");
		Levi.Visualizar();
	}
	

}
