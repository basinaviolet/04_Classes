package by.htp.homework.taskClasses;

import java.util.ArrayList;
import java.util.List;

public class AirLineMain {

	public static void main(String[] args) {

		List<AirLine> airLineList = new ArrayList<AirLine>();

		// String to, String num, String type, String time, String day
		airLineList.add(new AirLine("Moskow", "Msk1234", "Ty", "09:25 PM", "1/3/5"));
		airLineList.add(new AirLine("Kiev", "K2345", "SuperJet", "10:30 AM", "3/6/7"));
		airLineList.add(new AirLine("London", "Lnd1234", "Il", "11:00 PM", "2/5"));
		airLineList.add(new AirLine("Paris", "Prs1234", "Il", "12:00 AM", "1/3"));
		airLineList.add(new AirLine("Vienna", "Vnn1234", "SuperJet", "01:30 PM", "3/7"));
		airLineList.add(new AirLine("Warsaw", "Wrs1234", "Airbus", "02:30 AM", "2/7"));
		airLineList.add(new AirLine("Vilnius", "Vln1234", "Airbus", "03:00 PM", "3/6"));
		airLineList.add(new AirLine("Sofia", "Sfa1234", "Boeing", "04:00 AM", "1/7"));
		airLineList.add(new AirLine("Krakow", "Krk1234", "TSuperJet", "05:20 PM", "4/6"));
		airLineList.add(new AirLine("Odessa", "Ods1234", "Airbus", "06:00 AM", "1/3"));
		airLineList.add(new AirLine("Kiev", "Kie4365", "Ty", "07:00 PM", "2/4"));
		airLineList.add(new AirLine("Moskow", "Msk6578", "Boeing", "08:10 AM", "3/7"));
		airLineList.add(new AirLine("Kiev", "Kie4567", "Boeing", "09:00 AM", "2/4/7"));
		airLineList.add(new AirLine("Moskow", "Msk6543", "Boeing", "10:15 PM", "1/3"));

		AirLineLogic requestObj = new AirLineLogic();
		AirLineView printList = new AirLineView();

		List<AirLine> requestList = new ArrayList<AirLine>();

		String pointTo = "Kiev";
		requestList = requestObj.requestByTo(airLineList, pointTo);
		printList.print(requestList, "\nRequest by direction:");

		int day = 6;
		requestList = requestObj.requestByDay(airLineList, day);
		printList.print(requestList, "\nRequest by day:");

		String time = "10:00 AM";
		requestList = requestObj.requestByDayTime(airLineList, day,  time);
		printList.print(requestList, "\nRequest by day & time:");

	}
}
