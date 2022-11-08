package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Candidates;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> candidates = new HashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			int votes = 0;
			String candidate = br.readLine();
			while (candidate != null) {
				
				String[] result = candidate.split(",");
				Candidates cd = new Candidates(result[0], Integer.parseInt(result[1]));
				if(candidates.containsKey(cd.getName()) == true) {
					votes = candidates.get(cd.getName());
				}
				candidates.put(cd.getName(), cd.getVote() + votes);
				candidate = br.readLine();
			}
			
			for(String key : candidates.keySet()) {
				
				System.out.println(key + ": " + candidates.get(key));
				
			}
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
