package t3;

public enum Continent {
	NorthAmerica, Europe, Asia, SouthAmerica, Africa, Australia, Antarktida;
	public static Continent countries(String st) {
		if ("Brazilia" == st) {
			return SouthAmerica;
		}
		if ("Russian" == st) {
			return Asia;
		}
		if ("Ukraine" == st) {
			return Europe;
		}
		if ("USA" == st) {
			return NorthAmerica;
		}
		if ("Chad" == st) {
			return Africa;
		}
		if ("New Zelland" == st) {
			return Australia;
		} else
			return Antarktida;
	}

}
