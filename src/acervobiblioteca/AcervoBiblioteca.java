package acervobiblioteca;

public class AcervoBiblioteca {

	public static void main(String[] args) {
		Cliente c1 = new Cliente();
		
		c1.setNome("Ramon");
		c1.setCpf(123456789);
		System.out.println(c1.getNome());
		System.out.println(c1.getCpf());
	}

}
