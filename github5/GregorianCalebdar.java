package github5;
import java.util.GregorianCalendar;
public class GregorianCalebdar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				GregorianCalendar calendar = new GregorianCalendar(2021,1,1);
				System.out.println(calendar.YEAR + "��" + calendar.MONTH + "��" + calendar.DAY_OF_MONTH+ "��");
				
				calendar.setTimeInMillis(1234567898765L);
				System.out.println(calendar.YEAR + "��" + calendar.MONTH + "��" + calendar.DAY_OF_MONTH+"��");
		
	}

}
