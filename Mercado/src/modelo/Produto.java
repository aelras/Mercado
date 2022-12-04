package modelo;

import utils.Utils;

public class Produto {
	private static int count =1;
	private int id;
	private String nome;
	private Double preço;
	
	
	public Produto(String nome, Double preço) {
		this.id = count;
		this.nome = nome;
		this.preço = preço;
		Produto.count +=1;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreço() {
		return preço;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preço=" +Utils.doubleToString(this.getPreço()) + "]";
	}



	



	
	
}
