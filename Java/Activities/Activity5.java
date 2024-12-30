package activities;

public class Activity5 {
	
	public static void main(String args[]) {
		
		String title = "The Secret";
		Book book1 = new MyBook();
		book1.setTitle(title);
		
		System.out.println("The title of Book is : "+book1.getTitle());
		
	}

}
