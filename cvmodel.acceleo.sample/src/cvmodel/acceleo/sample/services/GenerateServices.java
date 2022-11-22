package cvmodel.acceleo.sample.services;

import cv.Person;
import cv.PhoneCountryCode;
import cv.StartEndTimeFrame;
import cv.TimeFrame;

import java.text.SimpleDateFormat;

public class GenerateServices {
	static final SimpleDateFormat sdf = new SimpleDateFormat("MMM, yyy"); 
	static final SimpleDateFormat birthdaysdf = new SimpleDateFormat("MMM dd, yyyy"); 
	
	public static String formatDate(TimeFrame tf) {
		return sdf.format(tf.getStartDate()) + " - now";
	}
	
	public static String formatDateStartEnd(StartEndTimeFrame setf) {
		return sdf.format(setf.getStartDate()) + " - " + sdf.format(setf.getEndDate());
	}
	
	public static String formatBirthDate(Person p) {
		return birthdaysdf.format(p.getDateOfBirth());
	}
	
	public static Integer getCountryCodeExtension(PhoneCountryCode countryCode) {
		return countryCode.getValue();
	}
}
