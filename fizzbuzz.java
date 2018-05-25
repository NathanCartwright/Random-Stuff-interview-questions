
public class fizzbuzz {

	public static void main(String[] args) {
		
		// variables
		
		int[] nums = new int[101]; 
		
		// initialize the array
		
		for(int i = 1; i < nums.length; i++) { // traverse the array 
			
			nums[i] = i; // fill the array with each index to create 100 numbers
			
			
			if((nums[i] % 3 ==0) && (nums[i] % 5 ==0)) { // for mutiples of both 3 and 5 print fizzbuzz
				System.out.println("FizzBuzz");
			}
			
			else if(nums[i] % 3 ==0) {
				System.out.println("Fizz");   // foor each mutiple of 3 print fizz instead of that index
			}
			else if(nums[i] % 5 ==0) {
					System.out.println("Buzz"); // for each mutiple of 5 print buzz instead of that index
				}

					else
						System.out.println(nums[i]); // if it is not a multiple of 3,5 or a combination of both simply print the index
		}
		
		
		// print the array just to test 1-100
		
		
	}// main ends
	
}// class ends

