package studiKasus1;

public class Commision extends Hourly {
	private double total;
	private double rateSales;
	
	public Commision(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double rateSales) {
		super(eName, eAddress, ePhone, socSecNumber,rate);
		this.rateSales = rateSales;
		total = 0;
	}
	
	public void addSales(double totalSales) {
		total += totalSales;
	}
	
	public double pay() {
		double payment = super.pay() + total * rateSales ;
		total = 0;
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sales: " + total;
		return result;
	}
}
