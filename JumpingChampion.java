import java.util.*; 
import java.io.*; 

/*Collect a list of prime numbers, and find the greatest difference of between each consecutive number in the set*/
public class JumpingChampion {
	
	//Generates a list of prime numbers
	public ArrayList<Integer> getPrime(int a, int b) { 
		ArrayList<Integer> primeList = new ArrayList<Integer>(); 
		primeList.add(2);
		int boundary = Math.sqrt(b); 
		for(int i =2; i<boundary; i++) {
			i+
		}
		
	}
	
	//Returns the largest difference in the given array
	public int champion(int[] a) {
		
	} 
	
	public static void main (String [] args) {
		JumpingChampion jc = new JumpingChampion(); 
		File n = ""; 
		FileReader fr = new FileReader(n); 
		BufferedReader br = new BufferedReader(fr); 
		String cur = ""; 
		String[] cases; 
		String splitIt; 
		
		//Take in all the input data
		while((cur = br.readLine()) != null) {
			splitIt += cur; 
		}
		
		//Input is in one string. Determine the number of cases, and record each case 
		String[] cases = splitIt.split("\n"); 
			
		//Get the number of cases 
		int condition = cases[0];
			
		//For each case, make the list of prime numbers
		//Get the difference of each consecutive prime number and get the largest difference
		for(int i = 1; i <= condition; i++) { 
			String[] test = case[i].split("\\s"); //Split the case on a whitespace to get the range
			int a = Integer.parseInt(test[0]);//Convert to int
			int b = Integer.parseInt(test[1]); 
			String[] primes = jc.getPrime(a,b); //Get a list of prime numbers
			System.out.println(jc.champion(primes)); //Get the largest difference 	
		}
	}
}