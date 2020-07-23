package br.com.rd.rdevs.contextoDoArtefaroDesenvolvido.model;

public abstract class Contratos implements Emissao {
	private int numeroRegistroContrato;
	private static int numeroContratos;
	private String nomePartesEnvolvidas1;
	private String nomePartesEnvolvidas2;
	private String nomeTestemunhas1;
	private String nomeTestemunhas2;
	private String dataEmissao;
	private String dataRegistro;
	private String nomeTabeliao;
	private String nomeCartorio;
	
	public static int getID() {
		  return numeroContratos++;
	}
//	public void NomesEnvolvidos(int numeroParte, String nomePartesEnvolvidas) {
//		this.nomePartesEnvolvidas[numeroParte] = nomePartesEnvolvidas;
//	}
//	public void NomesTestemunhas(int numeroParte, String nomeTestemunhas) {
//		this.nomeTestemunhas[numeroParte] = nomeTestemunhas;
//	}
	
	
	public void NomesTestemunhas(String nomeTestemunhas1, String nomeTestemunhas2) {
		this.nomeTestemunhas1 = nomeTestemunhas1;
		this.nomeTestemunhas2 = nomeTestemunhas2;
	}
	
	public void NomesEnvolvidos(String nomePartesEnvolvidas1, String nomePartesEnvolvidas2) {
		this.nomePartesEnvolvidas1 = nomePartesEnvolvidas1;
		this.nomePartesEnvolvidas2 = nomePartesEnvolvidas2;
	}
	
	public void ContratoDados (int numeroRegistroContrato, String dataRegistro, String dataEmissao) {
		this.setNumeroRegistroContrato(numeroRegistroContrato);
		this.setDataEmissao(dataEmissao);
		this.setDataRegistro(dataRegistro);
	}	
	
	public void CartorioDados(String nomeCartorio, String nomeTabeliao) {
		this.setNomeCartorio(nomeCartorio);
		this.setNomeTabeliao(nomeTabeliao);
	}
		
	
	public int getNumeroRegistroContrato() {
		return numeroRegistroContrato;
	}
	public void setNumeroRegistroContrato(int numeroRegistroContrato) {
		this.numeroRegistroContrato = numeroRegistroContrato;
	}
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
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
	
	public void emissao() {
		System.out.println("Emissão de Contrato!");
	}

	public String getNomePartesEnvolvidas1() {
		return nomePartesEnvolvidas1;
	}

	public void setNomePartesEnvolvidas1(String nomePartesEnvolvidas1) {
		this.nomePartesEnvolvidas1 = nomePartesEnvolvidas1;
	}

	public String getNomePartesEnvolvidas2() {
		return nomePartesEnvolvidas2;
	}

	public void setNomePartesEnvolvidas2(String nomePartesEnvolvidas2) {
		this.nomePartesEnvolvidas2 = nomePartesEnvolvidas2;
	}

	public String getNomeTestemunhas1() {
		return nomeTestemunhas1;
	}

	public void setNomeTestemunhas1(String nomeTestemunhas1) {
		this.nomeTestemunhas1 = nomeTestemunhas1;
	}

	public String getNomeTestemunhas2() {
		return nomeTestemunhas2;
	}

	public void setNomeTestemunhas2(String nomeTestemunhas2) {
		this.nomeTestemunhas2 = nomeTestemunhas2;
	}
	
	public void imprimirDados() {
		System.out.println("Numero do Contrato: " + numeroContratos);
		System.out.println("Numero do Registro: " + this.numeroRegistroContrato);
		System.out.println("Nomes dos envolvidos: "+ this.nomePartesEnvolvidas1 +" e "+ this.nomePartesEnvolvidas2);
		System.out.println("Nomes das Testemunhas: "+ this.nomeTestemunhas1 +" e "+ this.nomeTestemunhas2);
		System.out.println("Data de Emissão: " + this.dataEmissao);
		System.out.println("Nome Tabelião: " + this.nomeTabeliao);
		System.out.println("Nome Cartório: " + this.nomeCartorio);
	}
	


}
