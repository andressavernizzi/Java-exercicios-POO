package exerciciosOOP6;
//dados aleatorios para estudo
public class TestaCurso {
	public static void main(String[] args) {
		
		Curso pessoa1 = new Curso("TI","Beatriz","205432","7am-1pm",55);
		Curso pessoa2 = new Curso("Rh","Pablo","174623","8am-12pm",100);
		
		pessoa1.Visualizar();
		System.out.println("\n");
		pessoa2.Visualizar();
	}
}
