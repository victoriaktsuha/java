package devices;

//sem resolu��o para problema do diamante
//public class Printer extends Device{
//
//	public Printer(String serialNumber) {
//		super(serialNumber);
//	}
//
//	@Override
//	public void processDoc(String doc) {
//		System.out.println("Printer processing: " + doc);
//		
//	}
//	
//	public void print(String doc) {
//		System.out.println("Pricing: " + doc);
//	}
//
//}

//com resolu��o para problema do diamante - classe renomeada
public class ConcretePrinter extends Device implements Printer{

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
		
	}
	
	@Override
	public void print(String doc) {
		System.out.println("Pricing: " + doc);
	}


}
