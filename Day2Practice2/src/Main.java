
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.add();
		customerManager.delete();
		customerManager.update();
		System.out.println("------------------");
		System.out.println(sub(1, 3, 4, 8, 42, 38, 91));
		System.out.println("------------------");

		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.topla(10, 6));

		dortIslem.carpma(20, 3);
		dortIslem.bolme(17, 12);

		System.out.println("------------------");
		Product product = new Product();
		product.name = "Pc";
		System.out.println(product.name);
		ProductManager productManager = new ProductManager();
		productManager.add(product);

	}

	public static int sub(int... numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}
		return sum;
	}

}
