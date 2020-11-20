package by.htp.homework.taskClasses;

import java.util.ArrayList;
import java.util.List;

public class AirLineLogic {

	public List<AirLine> requestByTo(List<AirLine> baseList, String point) {
		List<AirLine> logicRequestTo = new ArrayList<AirLine>();
		
		for (AirLine strTo : baseList) {
			if (strTo.getTo().compareTo(point) == 0) {
				logicRequestTo.add(strTo);
			}
		}
		return logicRequestTo;
	}

	public List<AirLine> requestByDay(List<AirLine> baseList, int day) {
		List<AirLine> logicRequestDay = new ArrayList<AirLine>();
		String dayStr = "" + day;
		
		for (AirLine strDay : baseList) {
			if (strDay.getDay().contains(dayStr)) {
				logicRequestDay.add(strDay);
			}
		}
		return logicRequestDay;
	}

	public int timeToInt(String time) {
		int timeInt;
		int hour;
		int minute;
		
		hour = Integer.parseInt(time.substring(0, 2));
		minute = Integer.parseInt(time.substring(3, 5));
		timeInt = hour * 60 + minute;

		if (time.contains("PM")) {
			timeInt += 12 * 60;
		} else {
			timeInt += 0;
		}

		return timeInt;
	}

	public List<AirLine> requestByDayTime(List<AirLine> baseList, int day, String time) {
		
		List<AirLine> logicRequestDayTime = new ArrayList<AirLine>();
		List<AirLine> tempList = new ArrayList<AirLine>();
		int baseTime;
		int tempTime;
		
		baseTime = timeToInt(time);
		tempList = requestByDay(baseList, day);
		
		for (AirLine timeStr : tempList) {
			tempTime = timeToInt(timeStr.getTime());
			if (tempTime > baseTime) {
				logicRequestDayTime.add(timeStr);
			}

		}

		return logicRequestDayTime;
	}

}
