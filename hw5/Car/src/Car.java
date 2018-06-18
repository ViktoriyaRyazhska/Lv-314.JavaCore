import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {

	
       private int yearOfProduction ;
       private String type;
       private float engineCapacity;
       
            public Car (){
       }
             public Car (int yearOfProduction, String type ,float engineCapacity) {
            	 this.engineCapacity = engineCapacity;
            	 this.type = type ;
            	 this.yearOfProduction = yearOfProduction;
             }
             
			public int getYearOfProduction() {
				return yearOfProduction;
			}

			@Override
			public String toString() {
				return "Car [yearOfProduction=" + yearOfProduction + ", type=" + type + ", engineCapacity="
						+ engineCapacity + "]";
			}
			public void setYearOfProduction(int yearOfProduction) {
				this.yearOfProduction = yearOfProduction;
			}

			public String getType() {
				return type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public float getEngineCapacity() {
				return engineCapacity;
			}

			public void setEngineCapacity(float engineCapacity) {
				this.engineCapacity = engineCapacity;
			}
       
     public  int getSort () throws NumberFormatException, IOException {
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 		int year = Integer.parseInt(br.readLine());
    	 return year;
     }

	
	}


