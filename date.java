import java.text.SimpleDateFormat;
import java.util.*;
public class main2
{
public static void main(String[] args) 
{
Date d= new Date();
SimpleDateFormat f= new SimpleDateFormat("dd/MM/yyyy");
String strDate1 = f.format(d);
System.out.println("Current date is : " + strDate1);
f= new SimpleDateFormat("MM-dd-yyyy");
String strDate2 = f.format(d);
System.out.println("Current date is : " + strDate2);
f = new SimpleDateFormat("EEEE MMMM dd yyyy");
String strDate3 = f.format(d);
System.out.println("Current date is : " + strDate3);
f = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
String strDate4 = f.format(d);
System.out.println("Current date and time is : " + strDate4);
f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
String strDate5 = f.format(d);
System.out.println("Current date and time is : " + strDate5);
f = new SimpleDateFormat("HH:mm:ss");
String strDate6 = f.format(d);
System.out.println("Current time is : " + strDate6);
Calendar c = Calendar.getInstance(TimeZone.getDefault());
System.out.println("current week of year is : " + c.get(Calendar.WEEK_OF_YEAR));
System.out.println("current week of month is : " + c.get(Calendar.WEEK_OF_MONTH));
System.out.println("current day of the year is : " + c.get(Calendar.DAY_OF_YEAR));
}
}