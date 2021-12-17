package activities;

public class Activity8 {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 try {
		 Activity8.exceptionTest("will print to console");
		 
		 Activity8.exceptionTest(null);
		 
		 Activity8.exceptionTest("Wont execute");
	}
	 catch(CustomException me) {
		 
		 System.out.println("Inside catch block: " + me.getMessage());
	 }
	}
	 
	 static void exceptionTest(String str) throws CustomException {
		 if( str == null) {
			 throw new CustomException("string value is null");
	 }
		 else {
			 System.out.println(str);
		 }
	 }
}
	
 class CustomException extends Exception{
		private String message;
		
		CustomException(String m){
			this.message = m;
		}
		public String getMessage() {
			return message;
		}
	}

