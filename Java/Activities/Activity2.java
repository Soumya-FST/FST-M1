package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = {10, 77, 10, 54, -11, 10};
		
		int count = 30;
		
		//add(numbers, sum, count);
		if(add(numbers, count))
			System.out.println("Sum is 30");
		
	}

	private static boolean add(int[] numbers, int count) {
		int sum =0;
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i] == 10)
				sum = sum + numbers[i];
			
		}
		if(sum == count)
			return true;
		else
			return false;
			
	}

}
