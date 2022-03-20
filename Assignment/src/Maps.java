import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		 HashMap<String,String> map=new HashMap<String,String>();//Creating HashMap 
		map.put("SanteFe", "Two Million Degree");
		map.put("Sushil", "Best");
		System.out.println(map);
		
		map.put("Sushil", "Be");
		System.out.println(map);
		
		System.out.println(map.get("SantaFe"));
		map.remove("Sushil");
		System.out.println(map);
		
		
		//map.get("sushil");
		
		
				
		
	}
}
