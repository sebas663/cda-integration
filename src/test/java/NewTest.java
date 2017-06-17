import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewTest {

	public static void main(String[] args) {
		try {
		    Date d = new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse("19991256 12:53:58");
		    System.out.println("good format " + d); 
		} catch (ParseException e) {
			System.out.println(" bad format");
		}
	}

}
