package products;

public class Product {

	public String name;
	public double price;
	public int quant;
	
	public double totalValueInStock(){
	
		double total;
		total = price*quant;
		return total;
	}
	
	public void AddProduct(int n) {
		quant += n;
	}
	
	public void RemoveProduct(int n) {
		quant -= n;
	}
}
