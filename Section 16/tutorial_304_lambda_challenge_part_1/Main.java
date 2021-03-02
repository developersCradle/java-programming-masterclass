package tutorial_304_lambda_challenge_part_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;


public class Main {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			String stringToSplit = "Let's split this up into an array";

			String[] parts = stringToSplit.split(" ");
			
			 for (String part : parts) {
				 System.out.println(part);
			}
		};

		runnable.run();

		
		
		
		
		Function<String, String>  lambdaFunction = (source) -> {
			 StringBuilder returnVal = new StringBuilder();
			 for (int i = 0; i < source.length(); i++) {
				if (1 % 2 == 1) {
					returnVal.append(source.charAt(i));
				}
			}
			 return returnVal.toString();
		 };
		 
		 
//		 System.out.println(lambdaFunction.apply("1234567890"));
		 
		 System.out.println( everySecondCharacter( lambdaFunction ,"1234567890"));
		 
		 
		 Supplier<String> iLoveJava = () -> {
			return "I love Java!"; 
		 };
		 
		 String supplierResult = iLoveJava.get();
		 System.out.println(supplierResult);
		 
		 Callable<String> test = () -> {
			 return "test";
		 };
		 
	        List<String> topNames2015 = Arrays.asList(
	                "Amelia",
	                "Olivia",
	                "emily",
	                "Isla",
	                "Ava",
	                "oliver",
	                "Jack",
	                "Charlie",
	                "harry",
	                "Jacob"
	        );
	        
	        
	        List<String> names = new ArrayList<>();
//	        topNames2015.forEach(name -> {
//	        	names.add(name.substring(0, 1).toUpperCase() + name.substring(1));
//	        });
//	        Collections.sort(names);
//	        names.forEach(name -> System.out.println(name));
	        
//	        names.sort(String::compareTo);
//	        names.forEach(System.out::println);
////	         
//	        topNames2015
//	        .stream()
//	        .map( (String name) -> name.substring(0, 1).toUpperCase() + name.substring(1))
//	        .sorted(String::compareTo)
//	        .forEach(System.out::println);
//	        
	        
//	        System.out.println(
//	        		
//	        topNames2015
//	        .stream()
//	        .map(String::toUpperCase)
//            .filter(s->s.startsWith("A"))
//            .count()
//            
//	        );
	        
	     
	        
	        topNames2015
	        .stream()
	        .map( (String name) -> name.substring(0, 1).toUpperCase() + name.substring(1))
	        .peek(peek -> System.out.println(peek))
	        .sum();
	        
	}
	
	
	public static String everySecondCharacter(Function<String, String> function, String number)
	{
		return function.apply(number);
	}

}
