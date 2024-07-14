package filehandling;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class REadFileAndWordDuplicate {

	

	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("C:\\Users\\ACER\\Documents\\GTH Practicals\\Java\\Writer.txt");
		BufferedReader reader = null;
        Map<String, Integer> wordCountMap = new HashMap<>();
        
        try {
            reader = new BufferedReader(f);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (wordCountMap.containsKey(word)) {
                        // If word already exists in the map, increment its count
                        wordCountMap.put(word, wordCountMap.get(word) + 1);
                    } else {
                        // If word does not exist in the map, add it with count 1
                        wordCountMap.put(word, 1);
                    }
                }
            }
		for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate word: " + entry.getKey());
            }
        }
        }catch(Exception e) {
        	System.out.println(e);
        }
	}
}
	


