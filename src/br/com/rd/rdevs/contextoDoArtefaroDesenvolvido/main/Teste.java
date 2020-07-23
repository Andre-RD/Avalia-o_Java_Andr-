package br.com.rd.rdevs.contextoDoArtefaroDesenvolvido.main;

import java.util.ArrayList;

import br.com.rd.rdevs.contextoDoArtefaroDesenvolvido.model.CompraEVenda;
import br.com.rd.rdevs.contextoDoArtefaroDesenvolvido.model.Contratos;
import br.com.rd.rdevs.contextoDoArtefaroDesenvolvido.model.PrestacaoDeServicos;

public class Teste {

	public static void main(String[] args) {
		CompraEVenda contrato1 = new CompraEVenda();
		contrato1.NomesEnvolvidos("Fabio","Ivo");
		contrato1.CartorioDados("Cartorio RD", "André");
		contrato1.NomesTestemunhas("Pessoa passaro","Etevaldo");
		contrato1.ContratoDados(123, "23/07/2020", "22/07/2020");
		contrato1.emissao();
		
		
		PrestacaoDeServicos contrato2 = new PrestacaoDeServicos();
		contrato2.NomesEnvolvidos("Jonas","Léo");
		contrato2.CartorioDados("Cartorio RD", "André");
		contrato2.NomesTestemunhas("Canguru","Pernalonga");
		contrato2.ContratoDados(124, "23/07/2020", "22/07/2020");
		contrato2.emissao();
	
		
		
		
		ArrayList<Contratos> contratos = new ArrayList<Contratos>();
		contratos.add(contrato1);
		contratos.add(contrato2);
		
		
		for(Contratos c: contratos) {
			c.getID();
			c.imprimirDados();
		}
		
		

	}

}
