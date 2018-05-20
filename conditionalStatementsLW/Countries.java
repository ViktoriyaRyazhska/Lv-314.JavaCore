package conditionalStatementsLW;

public enum Countries {
	AFRICA, SOUTHAMERICA, NORTHAMERICA, AVSTRELIA, EURASIA;

	public static Countries achiveContinet(String month) {
		
		switch (month) {
		case "Ukraine":
		case "Poland":
			return Countries.EURASIA;
		
		case "USA":
		case "Canada":
			return NORTHAMERICA;
		case "Avstrelia":
			return AVSTRELIA;
		case "Egypt":
		case "Sudan":
			return AFRICA;
		case "Brazil":
		case "Peru":
			return SOUTHAMERICA;
		default: System.out.println("Here is no metches for name of country");
		}
		return null;
	}

}
