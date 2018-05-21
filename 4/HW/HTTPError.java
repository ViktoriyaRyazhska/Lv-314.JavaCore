package hw4;

public enum HTTPError {
	BadRequest, Unauthorized, PaymentRequired, Forbidden;

	public static HTTPError WriteError(int code) {
		switch (code) {
		case 401:
			return BadRequest;
		case 402:
			return Forbidden;

		case 403:
			return PaymentRequired;

		case 404:
			return Unauthorized;

		default:
			return null;
		}
	}
}
