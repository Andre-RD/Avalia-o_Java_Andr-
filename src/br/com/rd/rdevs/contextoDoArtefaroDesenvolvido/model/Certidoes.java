package br.com.rd.rdevs.contextoDoArtefaroDesenvolvido.model;

public abstract class Certidoes implements Emissao{
	private int numeroRegistrosCertidao;
	private static int numeroCertidoes;
	private String nomesCertidao1;
	private String nomesCertidao2;
	private String nomesDeclarante1;
	private String nomesDeclarante2;
	private String dataEmissao;
	private String nomeTabeliao;
	private String nomeCartorio;
	
	
	
	public static int getID() {
		  return numeroCertidoes++;
	}
	
//	public void NomesEnvolvidos(int numeroParte, String nomesCertidao) {
//		this.nomesCertidao[numeroParte] = nomesCertidao;
//	}
//	public void NomesTestemunhas(int numeroParte, String nomesDeclarante) {
//		this.nomesDeclarante[numeroParte] = nomesDeclarante;
//	}
	
	public void ContratoDados (int numeroRegistroCertidao, String dataEmissao) {
		this.setNumeroRegistrosCertidao(numeroRegistroCertidao);
		this.setDataEmissao(dataEmissao);
	}	
	
	public void CartorioDados(String nomeCartorio, String nomeTabeliao) {
		this.setNomeCartorio(nomeCartorio);
		this.setNomeTabeliao(nomeTabeliao);
	}

	public void emissao() {
		System.out.println("Emissão de Certidão");
	}
	
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public int getNumeroRegistrosCertidao() {
		return numeroRegistrosCertidao;
	}
	public void setNumeroRegistrosCertidao(int numeroRegistrosCertidao) {
		this.numeroRegistrosCertidao = numeroRegistrosCertidao;
	}
	public String getNomeTabeliao() {
		return nomeTabeliao;
	}
	public void setNomeTabeliao(String nomeTabeliao) {
		this.nomeTabeliao = nomeTabeliao;
	}
	public String getNomeCartorio() {
		return nomeCartorio;
	}
	public void setNomeCartorio(String nomeCartorio) { 
		this.nomeCartorio = nomeCartorio;
	}

	public String getNomesCertidao1() {
		return nomesCertidao1;
	}

	public void setNomesCertidao1(String nomesCertidao1) {
		this.nomesCertidao1 = nomesCertidao1;
	}

	public String getNomesCertidao2() {
		return nomesCertidao2;
	}

	public void setNomesCertidao2(String nomesCertidao2) {
		this.nomesCertidao2 = nomesCertidao2;
	}

	public String getNomesDeclarante1() {
		return nomesDeclarante1;
	}

	public void setNomesDeclarante1(String nomesDeclarante1) {
		this.nomesDeclarante1 = nomesDeclarante1;
	}

	public String getNomesDeclarante2() {
		return nomesDeclarante2;
	}

	public void setNomesDeclarante2(String nomesDeclarante2) {
		this.nomesDeclarante2 = nomesDeclarante2;
	}
	
	public void imprimirDados() {
		System.out.println("Numero de certidões" + numeroCertidoes);
		System.out.println("Numero do Registro" + this.numeroRegistrosCertidao);
		System.out.println("Nomes dos envolvidos"+ this.nomesCertidao1 +" e "+ this.nomesCertidao2);
		System.out.println("Nomes dos Declarantes"+ this.nomesDeclarante1 +" e "+ this.nomesDeclarante2);
		System.out.println("Data de Emissão" + this.dataEmissao);
		System.out.println("Nome Tabelião" + this.nomeTabeliao);
		System.out.println("Nome Cartório" + this.nomeCartorio);
	}
	
	
	
}
