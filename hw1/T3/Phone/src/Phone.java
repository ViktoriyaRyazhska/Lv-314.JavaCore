import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Phone {
	int tar = 1;
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("������� ������ ��������� � ������ �������");
    float country1 = Float.parseFloat( br.readLine() );
    System.out.println("������� ������ ��������� �� ������ �������");
    float country2 = Float.parseFloat( br.readLine() );
    System.out.println("������� ������ ��������� � ������ �������");
    float country3 = Float.parseFloat( br.readLine() );
    System.out.println("�������� � ������ ������� ����� "+country1);		
    System.out.println("�������� �� ������ ������� ����� "+country2);	
    System.out.println("�������� � ������� ������� ����� "+country3);
	}

}