package br.com.rd.rdevs.contextoDoArtefaroDesenvolvido.model;

public class Casamento extends Certidoes{

	@Override
	public void emissao() {
		super.emissao();
		System.out.println("Certid�o de Casamento");
	}

}
