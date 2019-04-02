package dp.simplefactory;

public class SimpleFactoryClient {

	public static void main(String[] args) {
		Product product = ProductFactory.produceProduct("A");
		product.doSomeThing();
		product = ProductFactory.produceProduct("B");
		product.doSomeThing();
	}

}
