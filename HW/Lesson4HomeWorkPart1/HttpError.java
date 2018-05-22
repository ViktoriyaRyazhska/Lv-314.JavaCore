package home1;

public enum HttpError {
	Bad_Request, Unauthorized, Payment_Required, Forbidden, Not_Found, Method_Not_Allowed, Not_Acceptable, CODE_NOT_EXIST;
	public static HttpError httpError(int code) {
		switch (code) {
		case 400:
			return Bad_Request;
		case 401:
			return Unauthorized;
		case 402:
			return Payment_Required;
		case 403:
			return Forbidden;
		case 404:
			return Not_Found;
		case 405:
			return Method_Not_Allowed;
		case 406:
			return Not_Acceptable;
		default:
			return CODE_NOT_EXIST;

		}
	}
}
