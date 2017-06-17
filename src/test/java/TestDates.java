import java.util.Calendar;

public class TestDates {

	public static void main(String[] args) {
		calculate(1);
	}
	
	private static void calculate(int x){
		//Obtengo el lunes de esta semana
	    Calendar c = Calendar.getInstance();
	    c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	    //Le quito una semana
	    c.add(Calendar.WEEK_OF_YEAR, x);
	    //Test
	    System.out.println("Date " + c.getTime());
	    x++;
	    if(x!=10){
	        calculate(x);
	    }
	}

}
