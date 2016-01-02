package Collections;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String time = in.next();
	String[] timeArray = time.split(":");
	if (time.contains("AM")) {
	    timeArray[2] = timeArray[2].replace("AM", "");
	    if (timeArray[0].equals("12")) {
		System.out.println("00:" + timeArray[1] + ":" + timeArray[2]);
	    } else {
		System.out.println(time.replace("AM", ""));
	    }
	} else {
	    timeArray[2] = timeArray[2].replace("PM", "");
	    if (!timeArray[0].equals("12")) {
		timeArray[0] = (Integer.parseInt(timeArray[0]) + 12) + "";
	    }
	    System.out.println(timeArray[0] + ":" + timeArray[1] + ":" + timeArray[2]);
	}
    }
}
