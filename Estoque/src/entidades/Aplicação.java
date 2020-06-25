package entidades;

public class Aplicação {

	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
		
	}
	public void addProducts (int quantity) {
		this.quantity += quantity;
		
	}
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
		
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+", "
				+quantity
				+"units, Total: $ "
				+String.format("%.2f", totalValueInStock());
				
				
		
	}
}
//se eu tiver que criar alguma relação entre atributo e argumento doparametro, vou estar faznedo uma ambiguidade
