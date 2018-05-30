import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Methods {

	
	public  Set union(Set set1, Set set2){
		Set set_result = new HashSet();
		set_result.addAll(set1);
		set_result.addAll(set2);
		return set_result;
	}
	
	public  Set intersect(Set set1, Set set2){
		if(set1.containsAll(set2)){
			return set2;
		}
		else{
			Set set_r_1 = new HashSet();
			Set set_r_2 = new HashSet();
			set_r_1.addAll(set1);
			set_r_2.addAll(set2);
			set_r_1.retainAll(set_r_2);
			set_r_2.retainAll(set_r_1);
		return set_r_2;
		}
	}
	
	
}
