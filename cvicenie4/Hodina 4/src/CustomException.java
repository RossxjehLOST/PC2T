
public class CustomException extends java.lang.Exception {
	
	public CustomException () {
		
		super ("Zadan� neplatn� priemer");
	}
	
	public CustomException (String text) {
		
		super (text);
	}
}
