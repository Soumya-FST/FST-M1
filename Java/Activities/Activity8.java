package activities;

class CustomException extends Exception{
	private String message;
	
	//consturctor
	CustomException(String message){
		this.message = message;
	}
	@Override
	public String getMessage() {
	    return message;
	}
	
}

public class Activity8 {
	public static void main(String[] args) {
		try {
            Activity8.exceptionTest("Will print to console");           
            Activity8.exceptionTest(null); 
            Activity8.exceptionTest("this statement will not be printed");
		}
		catch(CustomException e) {
			 System.out.println("Error: " + e.getMessage());
		}
	}
		public static  void exceptionTest(String R) throws CustomException{
			if(R == null) {
				throw new CustomException("Value is null");
			}
			else {
				System.out.println(R);
			}
			
			}
	}


