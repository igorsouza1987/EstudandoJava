
public class TestaGeteSet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1221,222232);
		
		conta.setNumero(1336);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
