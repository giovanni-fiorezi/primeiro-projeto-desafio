public class PrimeiroProjetoApresentacao {
	
	public static void main(String[] args) {
		
		Apresentacao dados = new Apresentacao();
		dados.setNome("Giovanni");
		dados.setSobrenome("Fiorezi Giovanelli");
		dados.setIdade(26);
		dados.setProfissao("Desenvolvedor de Software");
		dados.setDescricao("Ultimamente tenho me inspirado em atletas de grande performance, e o todos eles tem algo em comum: "
				+ "determinação, foco e consistência. "
				+ "Observando isso passei a me inspirar e para me tornar um Engenheiro de Software irei trilhar esse caminho!");
		
		System.out.println("Nome completo: " + dados.getNome() + " " + dados.getSobrenome());
		System.out.println("Idade : " + dados.getIdade());
		System.out.println("Profissão: " + dados.getProfissao());
		System.out.println(dados.getDescricao());
	}

}
