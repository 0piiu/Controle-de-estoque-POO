package entities;

public class Product {
	
		public String name;
		public int quantity;
		public double price;
		
		public double totalValueInStock () {
			return price * quantity;
			}
		
		public void addProducts (int a) {
			this.quantity += a;	
		}
		
		public void removeProducts (int a) {
			this.quantity -= a;
		} 
		
		public String toString() {
			return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, total: $" + String.format("%.2f", totalValueInStock()); 
		}
		
}