package map.com;

import java.util.*;

public class l2map {

    public static void main(String[] args) {

        Map<String, List<String>> movie = new HashMap<>();

        List<String> show1 = Arrays.asList(
                "P. Tarde",
                "R. Deshmukh",
                "A. Bachchan"
        );

        List<String> show2 = Arrays.asList(
                "Shah Rukh Khan",
                "Deepika Padukone",
                "John Abraham"
        );

        List<String> show3 = Arrays.asList(
                "Aamir Khan",
                "Kareena Kapoor",
                "R. Madhavan"
        );

        movie.put("Raja Shivaji", show1);
        movie.put("Pathaan", show2);
        movie.put("3 Idiots", show3);

        // Print key first and then value
        for (Map.Entry<String, List<String>> entry : movie.entrySet()) {
            System.out.println(entry.getKey() + " -----> " + entry.getValue());
        }
        for (String nm :movie.keySet()) {
        	System.out.println(movie.get(nm));
        	for(String showname : movie.get(nm)) {
        		for(int i=0;i<showname.length();i++) {
        			System.out.println(showname.charAt(i));
        		}
        	}
        }
    }
}