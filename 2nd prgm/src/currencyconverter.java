
public class currencyconverter {
	double[] exchangerates = new double[] {63.0,3.0,5.0};
	void printcurrencies()
	{
	System.out.println("rupee:" +exchangerates[0]);
	System.out.println("dirham:" +exchangerates[1]);
	System.out.println("real:" +exchangerates[2]);
	}
	
	public static void main(String[] args) {
		
		currencyconverter cc = new currencyconverter();
		cc.printcurrencies();

	}

}
