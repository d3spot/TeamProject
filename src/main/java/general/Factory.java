package general;

public class Factory {

	private static Factory instatce = new Factory();

	private Factory() {
	}

	public static Factory getFactory() {
		return Factory.instatce;
	}
}
