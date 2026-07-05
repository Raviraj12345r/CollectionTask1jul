package map.com;

import java.util.HashMap;
import java.util.Map;

public class hasmap {

	public static void main(String[] args) {
		
		
		Map<Integer ,String> Employe=new HashMap<>();
		
		Employe.put(1, "Raviraj");
		Employe.put(12, "Tejas");
		Employe.put(3, "Sonam");
		Employe.put(15, "Rahul");
		Employe.put(7, "Ramdas");
		Employe.put(19, "Satyam");
		Employe.put(26, "Virat");
		
		for(Integer ID :Employe.keySet()){
			
			System.out.println( ID+"----->"+Employe.get(ID));
	
		}
		
		for(String Name :Employe.values()){
			
			System.out.println( Name+"----->"+Employe);
	
		}
		
		System.err.println(Employe.containsKey(3));


	}
}
