package activities;

public class MyBook extends Book{

	
	public void setTitle(String s) {
		title = s;
	}	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String title = "Hover Car Racer";
		
	    MyBook newNovel = new MyBook();
	    
	     newNovel.setTitle(title);
	     
	     System.out.println("The title is: "+newNovel.getTitle());
		
		}

	}
	
	
	abstract class Book {
		
		String title;
		
		abstract void setTitle( String titlename);
		
	    public String getTitle() {
	    	return title;
	    }
	}

