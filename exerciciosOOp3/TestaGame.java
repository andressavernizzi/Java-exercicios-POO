package exerciciosOOp3;
//dados aleatorios para estudo
public class TestaGame {
	public static void main(String[] args) {
		
		Produto jogo1 = new Produto("Terraria",10.99f,"Aventura","Xbox","Multiplayer");
		Produto jogo2 = new Produto("Resident Evil 15",252.99f,"Terror","Playstation 5","Singleplayer");
		
		jogo1.Visualizar();
		System.out.println("\n");
		jogo2.Visualizar();
	}

}
