package estoque;

public class Produto {
	private String nome;
	private String descricao;
	private double preco;
	private int qtd_estoque;
	
	public Produto(String nome, String descricao,double preco) {
		this.nome= nome;
		this.descricao= descricao;
		this.preco= preco;
	}
	public void imprimi() {
		System.out.println("\n" + "Nome:"+ this.nome+"\nDescricao:"+this.descricao+"\nPreco:"+this.preco+"\nEstoque:"+this.qtd_estoque);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd_estoque() {
		return qtd_estoque;
	}

	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
	
	public void addProduto(int add) {
		
		qtd_estoque+= add;
	}
	
	public void rmvProduto(int rmv) {
		
		qtd_estoque-=rmv;
	}
}
