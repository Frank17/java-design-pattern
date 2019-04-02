package dp.simplefactory;

public class ProductFactory {

	public static Product produceProduct(String name) {
		if ("A".equals(name)) {
			return new ProductA();
		} else if ("B".equals(name)) {
			return new ProductB();
		}
		return null;
	}
	
}
