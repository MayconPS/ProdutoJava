package estoque;

public class main {
	public static void main(String args[]) {
		Produto n1= new Produto("Teclado","",300);
		Produto n2= new Produto("Mouse","",150);
		Produto n3= new Produto("Celular","", 1000);
		
		n1.addProduto(10);
		n1.rmvProduto(5);
		n1.imprimi();
				
		n2.addProduto(15);
		n2.rmvProduto(7);
		n2.imprimi();
		
		n3.addProduto(5);
		n3.rmvProduto(2);
		n3.imprimi();
	}

}
