// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String min =String.valueOf(minutes);

		if (minutes == 0)
		min += "0";

		if (minutes<10 && minutes!=0)
			min = "0" + min;

		if(hours>=0 && hours<=11){
			if(hours==0)
				System.out.print(hours + ":"+ min+" AM");
			System.out.print(hours + ":"+ min+" AM");
		}

		if(hours>=12 && hours<=23){
			if(hours>=13) {
				hours -= 12;
				System.out.print(hours + ":" + min + " PM");
			}
			else
			System.out.print(hours + ":"+ min+" PM");
		}



	}
}
