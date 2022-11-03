package t4n1exercici1;

import java.util.ArrayList;

public class Month {
	public static ArrayList<String> addMonths() {

		ArrayList<String> months = new ArrayList<String>();
		months.add("Gener");
		months.add("Febrer");
		months.add("Març");
		months.add("Abril");
		months.add("Maig");
		months.add("Juny");
		months.add("Juliol");
		months.add("Agost");
		months.add("Setembre");
		months.add("Octubre");
		months.add("Novembre");
		months.add("Desembre");

		return months;
	}

	/*
	 * DateFormatSymbols myMonth = new DateFormatSymbols(); // Create
	 * DateFormatSymbols object String[] monthsArray = myMonth.getMonths(); // Call
	 * getMonths() in DateFormatSymbols class for (String month : monthsArray) { //
	 * Loop through the string array to add and display list of months
	 * months.add(month); System.out.println(month);
	 */
}
