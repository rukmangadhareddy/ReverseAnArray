package com.bridgelabzs.programes;
import java.util.*;

public class MPractice {

	public static void main(String[] args) {
		Map<String,Integer> studentScores = new HashMap<>();

		studentScores.put("ram",646);
		studentScores.put("ramu",64866);
		studentScores.put("ravi",64356);
		studentScores.put("raju",4236646);
		studentScores.put("rom",6403256);
		System.out.println("ram:"+studentScores.get("ram"));
		System.out.println("/nStudent scores:");
		
		for(Map.Entry<String, Integer>entry :studentScores.entrySet()) {
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
	String studentName= "ravi";
	if(studentScores.containsKey(studentName)) {
		System.out.println("/n"+studentName + "s' score:"+studentScores.get(studentName));
	}else {
		System.out.println("/n"+studentName + "not found in the map.");
	}
}
}
