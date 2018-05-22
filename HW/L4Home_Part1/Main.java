package home1;

import java.io.IOException;
import home1.SimpleProject;
/*
 * read 3 float numbers and check: are they all belong to the range [-5,5]; read
 * 3 integer numbers and write max and min of them; read number of HTTP Error
 * (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
 */
public class Main {
	public static void main(String[] args) throws IOException {

		System.out.println(SimpleProject.isInRange(3.3f, 2.15f, 5.00f));
		System.out.println("Maximum:" + SimpleProject.max(4, 2, 1) + " Minimum:" + SimpleProject.min(4, 2, 1));
		System.out.println(HttpError.httpError(404));
	}
}
