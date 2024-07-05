package devices;

//sem resolu��o para problema do diamante
//public class Scanner extends Device {
//
//	public Scanner(String serialNumber) {
//		super(serialNumber);
//	}
//
//	@Override
//	public void processDoc(String doc) {
//		System.out.println("Scanner processing: " + doc);
//		
//	}
//	
//	public String scan() {
//		return "Scanned content";
//	}
//
//}

//com resolu��o para problema do diamante - classe renomeada
public class ConcreteScanner extends Device implements Scanner{

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
		
	}
	
	public String scan() {
		return "Scanned content";
	}

}
