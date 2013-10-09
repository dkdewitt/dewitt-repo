package com.stuffsystem.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.XMLGregorianCalendar;

public class CommonUtil {

    // substring method that allows negative values like in python
    public static String getSubstring(String str, int beginIndex) {
        if(beginIndex < 0) {
            if(str.length() >= -beginIndex) {
                beginIndex = str.length() + beginIndex;
            }
            else {
                beginIndex = 0;
            }
        }
        return str.substring(beginIndex);
    }

    // find an int value in an int array
    public static boolean inArray(int value, int[] intArray) {
        boolean found = false;
        for( int ix=0; !found && ix<intArray.length; ++ix ) {
            found = (value == intArray[ix]);
        }
        return found;
    }

    // get a date string
    public static String getDateString(GregorianCalendar cal) {
        return "" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.DAY_OF_MONTH) + "/" + (cal.get(Calendar.YEAR));
    }
    public static String getDateString(XMLGregorianCalendar cal) {
        return "" + cal.getMonth() + "/" + cal.getDay() + "/" + cal.getYear();
    }

    // make sure a year is not an unreasonable value
    public static boolean validateYear(int year) {
        return (year >= 1700 && year <= 2100);
    }

    // make sure a month is valid.
    public static boolean validateMonth(int month) {
        return (month >= 1 && month <= 12);
    }

    // make sure the day value is reasonable.  Only an approximation;
    // must test with the full date.
    public static boolean validateDay(int day) {
        return (day >= 1 && day <= 31);
    }

    // "validate" a date
    public static boolean validateDate(int year, int month, int day) {
        boolean valid = false;
        if( CommonUtil.validateYear(year) && 
            CommonUtil.validateMonth(month) && 
            CommonUtil.validateDay(day) ) 
        {
            Date date = null;
            String inputDate = "" + month + "-" + day + "-" + year;
            //pr.ln("validating date: ["+inputDate+"]");
            try {
                DateFormat formatter = new SimpleDateFormat("M-d-yyyy");
                formatter.setLenient(false);
                date = formatter.parse(inputDate);
                valid = true;
            } 
            catch (ParseException e) { 
                valid = false;
            }
        }
        return valid;
    }

    // This may not be necessary for JSON/REST but this fixes a Gregorian 
    // calendar so it can be properly converted to XML.
    public static GregorianCalendar fixDateForXml(GregorianCalendar inCal) {
        GregorianCalendar calFix = new GregorianCalendar(
            inCal.get(Calendar.YEAR), 
            inCal.get(Calendar.MONTH) - 1,  // java uses 0-based months (??)
            inCal.get(Calendar.DAY_OF_MONTH));
        return calFix;
    }

}

