
public enum HTTPError{
	NotFound(405), MethodNotAllowed(406), NotAcceptable(407),NotTheCodeOfError();
	
	private int errorNumber;
	
	HTTPError(int a ) {
		this.errorNumber=a;
	}
	HTTPError( ) {}
	
public String toSring() {
	return this.name();
}
}
