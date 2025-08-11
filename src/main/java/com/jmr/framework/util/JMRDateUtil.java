/*
 * Copyright (c) 2014, JMR Infotech and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of JMR or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.jmr.framework.util;


import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;

import org.springframework.stereotype.Component;



@Component
public class JMRDateUtil {
	public static final String DATE_SPLITTER = "/";
	public static final String DATE_SPLITTER_1 = "-";
	public static final String DATE_FORMATMMddyyyy = "MM" + DATE_SPLITTER + "dd" + DATE_SPLITTER + "yyyy";
	public static final String DATE_FORMAT = "dd" + DATE_SPLITTER + "MM" + DATE_SPLITTER + "yyyy";
	
	public static final String DATE_FORMATMM = "dd" + DATE_SPLITTER_1 + "MMM" + DATE_SPLITTER_1 + "yyyy";

	public static final String REV_DATE_FORMAT = "yyyy" + DATE_SPLITTER + "MM" + DATE_SPLITTER + "dd";

	public static final String TIME_24_FORMAT = "hh24:mm:ss";

	public static final String TIME_TICK_FORMAT = "hh:mm:ss a";

	public static final String TIME_FORMAT = "hh:mm:ss";

	public static final String DATE_TIME_TICK_FORMAT = DATE_FORMAT + " " + TIME_TICK_FORMAT;

	public static final String DATE_TIME_FORMAT = DATE_FORMAT + " " + TIME_FORMAT;

	public static final String DATE_TIME_24_FORMAT = DATE_FORMAT + " " + TIME_24_FORMAT;
	static final String MONTHS = "MONTHS";
	static final String TODAY = "TODAY";
	static final String MINUTES = "MINUTES";
	private int totalDays = 0; // COUNT OF DAYS
	private int yearOne = 0; // FIRST YEAR ENTERED
	private int monthOne = 0; // FIRST MONTH ENTERED
	private int dayOne = 0; // FIRST DAY ENTERED
	private int yearTwo = 0; // SECOND YEAR ENTERED
	private int monthTwo = 0; // SECOND MONTH ENTERED
	private int dayTwo = 0; // SECOND DAY ENTERED
	private int lowYear = 1901;
	private int highYear = 9000;
	Month[] monthList = new Month[13];

	public JMRDateUtil() {
		super();
		monthList[0] = null;
		monthList[1] = new Month(31, "January");
		monthList[2] = new Month(28, "February");
		monthList[3] = new Month(31, "March");
		monthList[4] = new Month(30, "April");
		monthList[5] = new Month(31, "May");
		monthList[6] = new Month(30, "June");
		monthList[7] = new Month(31, "July");
		monthList[8] = new Month(31, "August");
		monthList[9] = new Month(30, "September");
		monthList[10] = new Month(31, "October");
		monthList[11] = new Month(30, "November");
		monthList[12] = new Month(31, "December");
	}

	public String subDays(String strDate, int days) {
		int day = stringtoInt(strDate.substring(0, 2));
		int month = (stringtoInt(strDate.substring(3, 5)) - 1);
		int year = stringtoInt(strDate.substring(6, 10));
		Calendar calendar = new GregorianCalendar(year, month, day);
		calendar.add(Calendar.DATE, -days);
		String strMthTemp = Integer.toString((calendar.get(Calendar.MONTH) + 1));
		if (strMthTemp != null) {
			strMthTemp = strMthTemp.trim();
			if (strMthTemp.length() == 1)
				strMthTemp = "0" + strMthTemp;
		}
		String strDayTmp = Integer.toString(calendar.get(Calendar.DATE));
		if (strDayTmp != null) {
			strDayTmp = strDayTmp.trim();
			if (strDayTmp.length() == 1)
				strDayTmp = "0" + strDayTmp;
		}
		String strdate = strDayTmp + "/" + strMthTemp + "/" + calendar.get(Calendar.YEAR);
		return strdate;

	}

	public String addDays(String strDate, int days) {

		int day = stringtoInt(strDate.substring(0, 2));
		int month = (stringtoInt(strDate.substring(3, 5)) - 1);
		int year = stringtoInt(strDate.substring(6, 10));
		Calendar calendar = new GregorianCalendar(year, month, day);
		calendar.add(Calendar.DATE, days);
		String strMthTemp = Integer.toString((calendar.get(Calendar.MONTH) + 1));
		if (strMthTemp != null) {
			strMthTemp = strMthTemp.trim();
			if (strMthTemp.length() == 1)
				strMthTemp = "0" + strMthTemp;
		}
		String strDayTmp = Integer.toString(calendar.get(Calendar.DATE));
		if (strDayTmp != null) {
			strDayTmp = strDayTmp.trim();
			if (strDayTmp.length() == 1)
				strDayTmp = "0" + strDayTmp;
		}
		String strdate = strDayTmp + "/" + strMthTemp + "/" + calendar.get(Calendar.YEAR);
		return strdate;
	}

	// This will add Months to a given Date . If you want to subtract pass -ve
	// Months
	public String addMonths(String strDate, int noOfMonths) {
		int year = 0;
		int month = 0;
		int day = 0;
		// Date dt = null;
		String strdate = "";
		if (strDate != null) {

			day = stringtoInt(strDate.substring(0, 2));
			month = (stringtoInt(strDate.substring(3, 5)) - 1);
			year = stringtoInt(strDate.substring(6, 10));
			Calendar calendar = new GregorianCalendar(year, month, day);
			calendar.add(Calendar.MONTH, noOfMonths);
			String strMthTemp = Integer.toString((calendar.get(Calendar.MONTH) + 1));
			if (strMthTemp != null) {
				strMthTemp = strMthTemp.trim();

				if (strMthTemp.length() == 1)
					strMthTemp = "0" + strMthTemp;
			}
			String strDayTmp = Integer.toString(calendar.get(Calendar.DATE));
			if (strDayTmp != null) {
				strDayTmp = strDayTmp.trim();

				if (strDayTmp.length() == 1)
					strDayTmp = "0" + strDayTmp;
			}
			strdate = strDayTmp + "/" + strMthTemp + "/" + calendar.get(Calendar.YEAR);
		}
		return strdate;
	}

	public String addYears(String strDate, int noOfYears) {

		int year = 0;
		int month = 0;
		int day = 0;
		// Date dt = null;
		String strdate = "";
		if (strDate != null) {
			String str = strDate.toString();
			day = stringtoInt(strDate.substring(0, 2));
			month = (stringtoInt(strDate.substring(3, 5)) - 1);
			year = stringtoInt(strDate.substring(6, 10));
			Calendar calendar = new GregorianCalendar(year, month, day);
			calendar.add(Calendar.YEAR, noOfYears);

			String strMthTemp = Integer.toString((calendar.get(Calendar.MONTH) + 1));

			if (strMthTemp != null) {
				strMthTemp = strMthTemp.trim();

				if (strMthTemp.length() == 1)
					strMthTemp = "0" + strMthTemp;
			}
			String strDayTmp = Integer.toString(calendar.get(Calendar.DATE));
			if (strDayTmp != null) {
				strDayTmp = strDayTmp.trim();

				if (strDayTmp.length() == 1)
					strDayTmp = "0" + strDayTmp;
			}
			strdate = strDayTmp + "/" + strMthTemp + "/" + calendar.get(Calendar.YEAR);
		}
		return strdate;
	}

	/*
	 * public int findDiff(String strDate1, String strDate2) {
	 * 
	 * int noOfDays = 0; int year1 = 0; int month1 = 0; int day1 = 0; int year2
	 * = 0; int month2 = 0; int day2 = 0; String str = "";
	 * if (strDate1 != null) { day1 = stringtoInt(strDate1.substring(0, 2));
	 * month1 = (stringtoInt(strDate1.substring(3, 5))); year1 =
	 * stringtoInt(strDate1.substring(6, 10));
	 * 
	 * } else { return 0; } if (strDate2 != null) {
	 * 
	 * day2 = stringtoInt(strDate2.substring(0, 2)); month2 =
	 * (stringtoInt(strDate2.substring(3, 5))); year2 =
	 * stringtoInt(strDate2.substring(6, 10));
	 * 
	 * } else { return 0; }
	 * 
	 * 
	 * noOfDays = getDayDifference(); //
	 * 
	 * return noOfDays; }
	 */
	public int findDiff(String strDate1, String strDate2) {

		int noOfDays = 0;
		int year1 = 0;
		int month1 = 0;
		int day1 = 0;
		int year2 = 0;
		int month2 = 0;
		int day2 = 0;
		String str = "";
		if (strDate1 != null) {
			day1 = stringtoInt(strDate1.substring(0, 2));
			month1 = stringtoInt(strDate1.substring(3, 5));
			year1 = stringtoInt(strDate1.substring(6, 10));

		} else {
			return 0;
		}
		if (strDate2 != null) {

			day2 = stringtoInt(strDate2.substring(0, 2));
			month2 = stringtoInt(strDate2.substring(3, 5));
			year2 = stringtoInt(strDate2.substring(6, 10));

		} else {
			return 0;
		}

		noOfDays = getDayDifference(year1, month1, day1, year2, month2, day2);
		noOfDays++;

		return noOfDays;
	}

	public static boolean isLeapYear(int inYear) {

		boolean leapFlag = false;
		if (inYear % 4 == 0) {
			if (inYear % 100 == 0) {
				if (inYear % 400 == 0)
					leapFlag = true;
				else
					leapFlag = false;
			} else {
				leapFlag = true;
			}
		} else {
			leapFlag = false;
		}
		return leapFlag;
	}

	public static int daysInMonth(int pMonth, int pYear) {

		if (pMonth == 4 || pMonth == 6 || pMonth == 9 || pMonth == 11) {
			return 30;
		} else if (pMonth == 2) {
			if (isLeapYear(pYear)) {
				return 29;
			} else {
				return 28;
			}
		} else {
			return 31;
		}
	}

	public int daysInYear(int pYear) {
		if (isLeapYear(pYear)) {
			return 366;
		} else {
			return 365;
		}
	}

	public static int getMonth(String strDate) {
		int month = 0;
		if (strDate != null && strDate.length() != 0) {
			month = (stringtoInt(strDate.substring(3, 5)) - 1);
		}
		return month;
	}

	public static int getYear(String strDate) {
		int year = 0;
		if (strDate != null) {
			year = stringtoInt(strDate.substring(6, 10));
		}
		return year;
	}

	public static int getDay(String strDate) {
		int day = 0;
		if (strDate != null && strDate.length() != 0) {
			day = stringtoInt(strDate.substring(0, 2));
		}
		return day;
	}

	public String getWeekDay(String strDate) {
		Calendar ca1 = Calendar.getInstance();

		java.util.Date dateStr = new java.util.Date();
		try {

			JMRConstants l2lCnstnts = new JMRConstants();
			dateStr = new SimpleDateFormat(l2lCnstnts.L2L_DateFormat).parse(strDate);

		} catch (Exception e) {
			
		}

		ca1.setTime(dateStr);

		java.util.Date dayDt = ca1.getTime();
		String dayStr = "";
		DateFormat frmt = new SimpleDateFormat("EEEE");

		try {

			dayStr = frmt.format(dayDt);

		} catch (Exception e) {
			
		}
		return dayStr;
	}

	public static boolean isLastDayOfMonth(String date) {
		boolean lastDayMonth = false;
		int month = getMonth(date);
		int day = getDay(date);
		int year = getYear(date);
		int lastDay = daysInMonth(month, year);
		if (lastDay == day) {
			lastDayMonth = true;
		}
		return lastDayMonth;
	}

	public boolean isValidDate(String pDateStr) {

		int dayOfMonth, month, year;
		if (pDateStr.length() >= 10) {
			String date = pDateStr.substring(0, 10);
			String[] strArr = split(date, "/");

			dayOfMonth = stringtoInt(strArr[0]);
			month = stringtoInt(strArr[1]);
			year = stringtoInt(strArr[2]);
		} else {
			return false;
		}
		if (dayOfMonth <= 0 || dayOfMonth > 31) {
			return false;
		} else if (month <= 0 || month > 12) {
			return false;
		} else if (year <= 0) {
			return false;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return true;
		} else if (month == 2) {
			if (!isLeapYear(year) && dayOfMonth > 28) {
				return false;
			} else if (dayOfMonth > 29) {
				return false;
			}
		} else if (dayOfMonth > 30)
			return false;
		return true;
	} // isValidDate

	public int compareDates(String fst_date, String sec_date) {
		int retrn_val = 0;
		try {

			String[] dateArr1 = fst_date.split("/");
			String[] dateArr2 = sec_date.split("/");

			String date_1 = dateArr1[2] + "/" + dateArr1[1] + "/" + dateArr1[0];
			String date_2 = dateArr2[2] + "/" + dateArr2[1] + "/" + dateArr2[0];

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

			Date date1 = (Date) sdf.parse(date_1);
			Date date2 = sdf.parse(date_2);

			if (date1.compareTo(date2) > 0)
				retrn_val = 1;
			else if (date1.compareTo(date2) < 0)
				retrn_val = -1;
			else if (date1.compareTo(date2) == 0)
				retrn_val = 0;
		} catch (ParseException ex) {
			
		}
		return retrn_val;
	}

	public static String changeDateFormat(java.sql.Date pDate) {
		String strDate = "";
		JMRConstants JMRConstants = new JMRConstants();
		if (pDate != null) {
			try {
				SimpleDateFormat dstFormat = new SimpleDateFormat(JMRConstants.L2L_DateFormat);
				strDate = dstFormat.format(pDate);

			} // try
			catch (Exception ex) {
				
			}
		}
		return strDate;
	}

	// jojin added on 9-12-13 for Changing one date format to another
	public String changeDateFormatStr(String dateStr, String curFrmt) throws Exception {

		String strDate = "";

		SimpleDateFormat sdf = new SimpleDateFormat(curFrmt);

		if (dateStr != null && !dateStr.equals("")) {
			try {

				Date argDate = sdf.parse(dateStr);
				JMRConstants JMRConstants = new JMRConstants();
				sdf.applyPattern(JMRConstants.L2L_DateFormat);
				strDate = sdf.format(argDate);

			} catch (ParseException e) {
				
				throw e;
			}

		}

		return strDate;

	}

	public int findYrDiff(String strDate1, String strDate2) {

		int year1 = 0;
		int year2 = 0;

		if (strDate1 != null) {

			year1 = stringtoInt(strDate1.substring(6, 10));

		} else {
			return 0;
		}
		if (strDate2 != null) {

			year2 = stringtoInt(strDate2.substring(6, 10));

		} else {
			return 0;
		}
		int noYrs = (getYearDiff(year1, year2)) / 365;
		return noYrs;
	}

	public String formatDateDiff(int diffInMonths, String respModel) {

		String respDateDiff = "0";
		Integer yrsDiff = diffInMonths / 12;
		if (respModel.equals("Y")) {
			respDateDiff = yrsDiff.toString();
		} else if (respModel.equals("YM")) {
			Integer remainingMnths = diffInMonths - (yrsDiff * 12);
			respDateDiff = yrsDiff + "." + remainingMnths;
		}
		return respDateDiff;
	}

	public String getDiffInYrs_Mnths(String date1, String date2, String respModel) {
		int diffInMnths = findMonthsDiff(date1, date2);
		return formatDateDiff(diffInMnths, respModel);
	}

	public static String getCurrentSystemDate() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public static String checkForNull(String sInput) {

		String sOutput = "";
		if (sInput != null) {
			sOutput = sInput.trim();
		}
		return sOutput;
	}

	public static Object checkForNull(Object obj) {

		if (obj != null) {
			return obj;
		} else
			return "";
	}

	public static Date checkForNull(Date date) {

		if (date != null) {
			return date;
		} else
			return null;
	}

	public static int stringtoInt(String sInput) {

		int num = 0;
		sInput = checkForNull(sInput);
		if (sInput.equals("")) {
			num = 0;
		} else {
			num = Integer.parseInt(sInput);
		}
		return num;
	}

	public static double stringtoDouble(String sInput) {

		double num = 0;
		sInput = checkForNull(sInput);
		if (sInput.equals("")) {
			num = 0;
		} else {
			num = Double.parseDouble(sInput);
		}
		return num;
	}

	public static BigDecimal stringtoBigDecimal(String sInput) {

		BigDecimal bd = null;
		sInput = checkForNull(sInput);
		if (sInput.equals("")) {
			bd = new BigDecimal("0");
		} else {
			bd = new BigDecimal(sInput);
		}
		return bd;
	}

	public static String[] split(String sInput, String delimeter) {

		String array[] = null;
		// sInput = isNull(sInput);
		if (!sInput.equals("")) {
			StringTokenizer st = new StringTokenizer(sInput, delimeter);
			array = new String[st.countTokens()];
			int count = 0;
			while (st.hasMoreTokens()) {
				array[count] = st.nextToken();
				count++;
			}
		} else {
			array = new String[0];
		}
		return array;
	}

	public static String[] split(String sInput, String delimeter, boolean countToken) {

		String array[] = null;
		sInput = checkForNull(sInput);

		if (!sInput.equals("")) {
			StringTokenizer st = new StringTokenizer(sInput, delimeter, true);
			String strRow = "";
			ArrayList list = new ArrayList(20);
			while (st.hasMoreTokens()) {
				String tmpToken = st.nextToken();
				if (tmpToken.equals("~")) {
					if (strRow == "") {
						list.add(strRow);
					}
					strRow = "";
				} else {
					strRow = tmpToken;
					list.add(strRow);
				}
			}

			array = new String[list.size()];
			array = (String[]) list.toArray(array);
		} else {
			array = new String[0];
		}
		return array;
	}

	public static String lpad(String input, int length, char topad) {

		input = checkForNull(input);
		if (input.length() == length) {
			return input;
		} else {
			String temp = "";
			for (int iCount = 0; iCount < length - input.length(); iCount++) {
				temp = temp + topad + "";
			}
			input = temp + input;
			return input;
		}
	}

	public static String NVL(String input, String value) {

		input = checkForNull(input);
		value = checkForNull(value);
		if (input.equals(""))
			return value;
		else
			return input;
	}

	public static Date NVL(Date input, Date value) {

		if (input == null)
			return value;
		else
			return input;
	}

	public static Object NVL(Object input, Object value) {

		if (input == null)
			return value;
		else
			return input;
	}

	public static int getParamNo(String aList, String aComp, String aSep) {

		int position, p;
		String list1, temp, pattern;
		list1 = aList;
		list1.trim();

		if (list1.substring(0, 1) != aSep)
			list1 = aSep + list1;

		pattern = aSep + aComp + aSep;
		position = list1.indexOf(pattern);

		if (position == -1)
			return -1;

		temp = list1.substring(0, position);
		position = 0;
		p = temp.indexOf(aSep);
		while (p != -1) {
			position = position + 1;
			temp = temp.substring(p + 1);
			p = temp.indexOf(aSep);
		}
		return position;
	}

	public static String getParam(String str, int p) {

		int i = 0, j = 0, prev = -1;
		if (p == -1)
			return null;

		do {
			prev = j;
			j = str.indexOf("~", prev + 1);
			i++;
		} while (i <= p);

		if (j == -1)
			return null;
		else
			return (str.substring(p == 0 ? prev : prev + 1, j));
	}

	public static String getQuote(String aStr) {

		aStr = checkForNull(aStr);
		if (!aStr.equals("")) {
			return "'" + aStr + "'";
		} else {
			return aStr;
		}
	}

	public static char getCharAt(String input, int position) {
		input = checkForNull(input);
		if (input == "" || input.equals("")) {
			return input.charAt(position);
		} else {
			return ' ';
		}
	}

	public String getTimeStamp(String txn_dt) {
		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat(" HH:mm:ss");
		String timeNow = formatter.format(currentDate.getTime());
		return txn_dt + " " + timeNow;
	}

	public static String encodeResponse(String mainStr) {
		return replaceAll(mainStr, "&", "&amp;");
	}

	public static String replaceAll(String text, String find, String replaceWith) {

		String strResult = "";

		int start = 0;
		int end;
		text = checkForNull(text);
		if (text.equals(""))
			strResult = text;
		else {
			while ((start = text.indexOf(find, start)) != -1) {
				end = start + find.length();
				text = text.substring(0, start) + replaceWith + text.substring(end);
				start = start + replaceWith.length();
			}
			strResult = text;
		}

		return strResult;

	}

	public static String replace(String text, String find, String replaceWith) {

		String strResult = "";
		int start = 0;
		int end;

		text = checkForNull(text);

		if (text.equals("")) {

			strResult = text;

		} else {

			start = text.indexOf(find, start);

			if (start != -1) {

				end = start + find.length();

				text = text.substring(0, start) + replaceWith + text.substring(end);

			}
			strResult = text;
		}

		return strResult;
	}

	public static int countOccurences(String mainString, String substring) {
		int dataLength = mainString.length();
		int substringLength = substring.length();
		int count = 0;
		if (substringLength != 0) {
			for (int bindex = 0, eindex = -1; bindex <= dataLength; bindex = eindex + substringLength) {
				eindex = mainString.indexOf(substring, bindex);
				count++;
				if (eindex == -1)
					break;
			}
		}
		return count - 1;
	}

	public static String checkDateNull(Date date) {
		if (date != null) {
			return date.toString();
		} else
			return "";
	}

	public static boolean isElementInArray(String[] array, String element) {
		element = checkForNull(element);

		Arrays.sort(array);

		int searchIndex = Arrays.binarySearch(array, element);
		if (searchIndex >= 0) {
			return true;
		}
		return false;
	}

	public static boolean isElementLikeInArray(String[] array, String element) {
		element = checkForNull(element);
		for (int index = 0; index < array.length; index++) {
			int searchIndex = checkForNull(array[index]).indexOf(element);
			if (searchIndex >= 0) {
				return true;
			}
		}
		return false;
	}

	/*public static String getXML(Clob clob) throws SQLException {
		Reader reader = null;
		BufferedReader buffReader = null;
		StringBuffer xml = new StringBuffer(1024);
		try {
			reader = clob.getCharacterStream();
			buffReader = new BufferedReader(reader);
			String line = null;
			while ((line = buffReader.readLine()) != null) {
				xml.append(line);
			}
		} catch (IOException ioe) {
			
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (buffReader != null)
					buffReader.close();
			} catch (IOException ioe) {
				
			}
		}
		return xml.toString();
	}

	public static byte[] compressXml(Clob clob) throws SQLException {
		Reader reader = null;
		BufferedReader buffReader = null;
		Deflater deflater = null;
		ByteArrayOutputStream bos = null;
		StringBuffer xml = null;
		byte[] compressedData = null;
		try {
			reader = clob.getCharacterStream();
			buffReader = new BufferedReader(reader);
			xml = new StringBuffer(1024);
			String line = null;
			while ((line = buffReader.readLine()) != null) {
				xml.append(line);
			}
			byte[] byteXML = xml.toString().getBytes();
			deflater = new Deflater();
			deflater.setLevel(Deflater.BEST_COMPRESSION);
			deflater.setInput(byteXML);
			deflater.finish();
			bos = new ByteArrayOutputStream(byteXML.length);
			byte[] buf = new byte[1024];
			while (!deflater.finished()) {
				int count = deflater.deflate(buf);
				bos.write(buf, 0, count);
			}
			// Get the compressed data
			compressedData = bos.toByteArray();

		} catch (IOException ioe) {
			
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (buffReader != null)
					buffReader.close();
				if (bos != null)
					bos.close();
				deflater.end();
			} catch (IOException ioe) {
				
			}
		}
		return compressedData;
	}
*/
	public static void main(String[] args) {
	}

	public static boolean isAlphaNumeric(String pInStr) {
		boolean retVal = true;
		char chIn[] = pInStr.toCharArray();

		for (int arrIndex = 0; arrIndex < chIn.length; arrIndex++) {
			retVal = Character.isLetterOrDigit(chIn[arrIndex]);

			if (!retVal)
				retVal = Character.isWhitespace(chIn[arrIndex]);

			if (!retVal)
				return retVal;

		}
		return retVal;
	}

	public static boolean isAlpha(String pInStr) {
		boolean retVal = true;
		char chIn[] = pInStr.toCharArray();

		for (int arrIndex = 0; arrIndex < chIn.length; arrIndex++) {
			retVal = Character.isLetter(chIn[arrIndex]);
			if (!retVal)
				retVal = Character.isWhitespace(chIn[arrIndex]);
			if (!retVal)
				return retVal;
		}
		return retVal;
	}

	public static boolean isNumeric(String pInStr) {
		boolean retVal = true;
		if ((pInStr.charAt(0) == '-' & pInStr.length() != 1) || (pInStr.charAt(0) == '+' & pInStr.length() != 1))
			pInStr = pInStr.substring(1);

		char chIn[] = pInStr.toCharArray();

		for (int arrIndex = 0; arrIndex < chIn.length; arrIndex++) {
			char chr = chIn[arrIndex];
			retVal = Character.isDigit(chr);
			if (!retVal) {
				if ('.' != chr)
					retVal = false;
				else
					retVal = true;
			}
			if (!retVal)
				return retVal;
		}
		return true;
	}

	public static boolean isUpperCaseAlphaNumeric(String pInStr) {
		boolean retVal = true;
		char chIn[] = pInStr.toCharArray();

		for (int arrIndex = 0; arrIndex < chIn.length; arrIndex++) {
			retVal = Character.isLetterOrDigit(chIn[arrIndex]);
			if (retVal)
				retVal = Character.isUpperCase(chIn[arrIndex]);
			if (!retVal)
				return retVal;
		}
		return retVal;
	}

	public static String decodeData(String mainStr) {
		String tempVar = mainStr;
		if (!isAlpha(mainStr)) {
			tempVar = replaceAll(tempVar, "*", "%");
		}
		return tempVar;
	}

	public boolean hasValues(String val) {
		boolean hasVals = true;
		if (val.equals("") || val == null || val.toUpperCase().equals("NULL"))
			hasVals = false;
		return hasVals;
	}

	public int getDayDifference(int year1, int month1, int day1, int year2, int month2, int day2) {
		boolean errorFlag = false;

		yearOne = year1;
		monthOne = month1;
		dayOne = day1;
		yearTwo = year2;
		monthTwo = month2;
		dayTwo = day2;

		errorFlag = false;
		if (yearOne < lowYear || yearOne > highYear) {
			errorFlag = true;
		} else if (yearTwo < lowYear || yearTwo > highYear) {
			errorFlag = true;
		} else if (monthOne < 1 || monthOne > 12) {
			errorFlag = true;
		} else if (monthTwo < 1 || monthTwo > 12) {
			errorFlag = true;
		} else if (dayOne < 1 || (dayOne > getDaysForMonth(yearOne, monthOne))) {
			errorFlag = true;
		} else if (dayTwo < 1 || (dayTwo > getDaysForMonth(yearTwo, monthTwo))) {
			errorFlag = true;
		}
		if (errorFlag) {
			throw new IllegalArgumentException("Bad value in one of the date parameters.");
		}

		int yearDiffCount = 0;
		int monthDiffCount = 0;
		int tempDays = 0;
		totalDays = 0;
		sortDates();
		if (yearOne < yearTwo) { // YEARS ARE DIFFERENT
			yearDiffCount = yearTwo - yearOne;

			if (yearDiffCount >= 2) {
				totalDays = getYearDiff(yearOne, yearTwo);
			}
		}

		if (yearOne == yearTwo) { // DATES ARE IN THE SAME YEAR
			// MONTHS ARE THE SAME. DON'T NEED TO WORRY ABOUT LEAP DAY AS IT IS
			// COUNTED
			if (monthOne == monthTwo) {
				tempDays = dayTwo - dayOne - 1;
				if (tempDays < 0)
					tempDays = 0;
				totalDays = totalDays + tempDays;
			} else { // MONTHS ARE DIFFERENT
				totalDays = totalDays + getDaysForMonth(yearOne, monthOne) - dayOne;
				monthDiffCount = monthTwo - monthOne;
				if (monthDiffCount >= 2) {
					totalDays = totalDays + getMonthDiff(yearOne, monthOne + 1, monthTwo - 1);
				}
				// COMPUTE DAYS FOR HIGH MONTH FROM BEGINNING OF MONTH
				// AGAIN, DON'T HAVE TO WORRY ABOUT LEAP YEAR, COUNTED IN
				// HIGH_DAY
				totalDays = totalDays + dayTwo - 1; // CAN'T COUNT LAST DAY
													// ITSELF
			}
		} else { // YEAR DIFFERENCE IS ONE OR MORE YEARS LIKE 1999,2000 OR
					// 1978,1980
			// FOR LOW YEAR DAYS
			totalDays = totalDays + getDaysForMonth(yearOne, monthOne) - dayOne;
			// monthDiffCount = 12 - monthOne;
			monthDiffCount = 13 - monthOne;
			if (monthDiffCount >= 2) { // COUNT ALL MONTHS TO END OF YEAR
				totalDays = totalDays + getMonthDiff(yearOne, monthOne + 1, 12);
			}
			// FOR HIGH YEAR DAYS
			if (monthTwo > 1) {
				totalDays = totalDays + getMonthDiff(yearTwo, 1, monthTwo - 1);
			}
			// COMPUTE DAYS FOR HIGH MONTH FROM BEGINNING OF MONTH
			// AGAIN, DON'T HAVE TO WORRY ABOUT LEAP YEAR, COUNTED IN HIGH_DAY
			totalDays = totalDays + dayTwo - 1; // CAN'T COUNT LAST DAY ITSELF
		}
		return totalDays;
	}

	public int getMonthDiff(int inCurrYear, int lowMonth, int highMonth) {

		int x = 0;
		int daysInMonth = 0;
		int totDays = 0;
		for (x = (lowMonth); x <= (highMonth); x++) {
			daysInMonth = getDaysForMonth(inCurrYear, x);
			totDays = totDays + daysInMonth;
		}
		return totDays;
	}

	public int getYearDiff(int lowYear, int highYear) {
		int x = 0;
		int daysInYear = 0;
		int totDays = 0;
		for (x = (lowYear + 1); x <= (highYear - 1); x++) {
			if (isLeapYear(x))
				daysInYear = 366;
			else
				daysInYear = 365;
			totDays = totDays + daysInYear;
		}
		return totDays;
	}

	private void sortDates() {

		// SORT BY YEAR FIRST, THEN MONTH, THEN DAY.
		if (yearOne > yearTwo) {
			swapDates("Y");
		} else if ((yearOne == yearTwo) && (monthOne > monthTwo)) {
			swapDates("M");
		} else if ((yearOne == yearTwo) && (monthOne == monthTwo) && (dayOne > dayTwo)) {
			swapDates("D");
		} else { // DO NOTHING. THEY ARE IN THE RIGHT ORDER
		}
	} // END sortDates

	private void swapDates(String swapScope) {
		int tempYear = 0;
		int tempMonth = 0;
		int tempDay = 0;
		tempYear = yearOne;
		tempMonth = monthOne;
		tempDay = dayOne;
		if (swapScope.equals("Y")) {
			yearOne = yearTwo;
			yearTwo = tempYear;
			monthOne = monthTwo;
			monthTwo = tempMonth;
			dayOne = dayTwo;
			dayTwo = tempDay;
		} else if (swapScope.equals("M")) {
			monthOne = monthTwo;
			monthTwo = tempMonth;
			dayOne = dayTwo;
			dayTwo = tempDay;
		} else if (swapScope.equals("D")) {
			dayOne = dayTwo;
			dayTwo = tempDay;
		}
	}

	public int findMonthsDiff(String date1, String date2) {
		Date beginningDate = getDateObj(date1);
		Date endingDate = getDateObj(date2);

		if (beginningDate == null || endingDate == null)
			return 0;

		Calendar cal1 = new GregorianCalendar();
		cal1.setTime(beginningDate);
		Calendar cal2 = new GregorianCalendar();
		cal2.setTime(endingDate);

		int diffInMnths = differenceInMonths(cal1, cal2);

		if (diffInMnths < 0)
			diffInMnths = 0;

		return diffInMnths;
	}

	private static Integer differenceInMonths(Calendar beginningDate, Calendar endingDate) {

		if (beginningDate == null || endingDate == null)
			return 0;

		int m1 = beginningDate.get(Calendar.YEAR) * 12 + beginningDate.get(Calendar.MONTH);
		int m2 = endingDate.get(Calendar.YEAR) * 12 + endingDate.get(Calendar.MONTH);
		return m2 - m1;
	}

	public static Date getDateObj(String dateStr) {
		DateFormat df = new SimpleDateFormat(JMRConstants.L2L_DateFormat);
		Date DatObj = null;
		try {
			DatObj = df.parse(dateStr);

		} catch (ParseException e) {
			DatObj = null;
		}
		return DatObj;
	}

	private class Month {

		String monthName;
		int daysInMonth;

		public Month(int inDaysInMonth, String inMonthName) {

			daysInMonth = inDaysInMonth;
			monthName = inMonthName;
		}
		// RETURN DAYS FOR THE CURRENT MONTH

		public int getDays() {

			return daysInMonth;
		}
	} // END CLASS MONTH

	public int getDaysForMonth(int inYear, int inMonth) {

		int daysForMonth = 0;

		boolean leapYearFlag = false;

		leapYearFlag = isLeapYear(inYear);

		daysForMonth = monthList[inMonth].getDays();
		if ((leapYearFlag) && (inMonth == 2))
			daysForMonth++;

		return daysForMonth;
	}

	public static String getTodayDate(String splitter) {

		Integer[] dateArr = getTodayDateAsArr();
		return dateArr[0] + splitter + dateArr[1] + splitter + dateArr[2];
	}

	public static Integer[] getTodayDateAsArr() {

		Integer[] dateArr = new Integer[3];
		Calendar cal = Calendar.getInstance();

		dateArr[0] = cal.get(Calendar.DAY_OF_MONTH);
		dateArr[1] = cal.get(Calendar.MONTH) + 1;
		dateArr[2] = cal.get(Calendar.YEAR);

		return dateArr;
	}

	public static Date getTodayDate() {
		return new Date();
	}

	public static String getDateStringFromDate(Date dateVal) {
		return getDateStringFromDate(dateVal, Boolean.TRUE);
	}

	public static String getDateStringFromDate(Date dateVal, Boolean isDate) {

		if (JMRUtil.isNull(dateVal))
			return null;

		String format = DATE_FORMAT;

		if (!isDate) {
			format = DATE_TIME_TICK_FORMAT;
		}

		return getDateStringFromDate(format, dateVal);
	}

	public static String getDateStringFromDate(String format, Date dateVal) {

		if (JMRUtil.isNull(dateVal)) {
			return null;
		}

		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(dateVal);
	}

	public static String getDateStringFromDate(Date dateVal, String format) {
		if (JMRUtil.isNull(dateVal))
			return null;

		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(dateVal);
	}

	public static Date getDateFromString(String strDate, Boolean isDate) {
		Date dateVal = null;

		if (JMRUtil.isNullOrEmpty(strDate))
			return dateVal;

		String format = DATE_FORMAT;

		if (!isDate) {
			format = DATE_TIME_FORMAT;
		}

		return getDateFromString(strDate, format);
	}

	public static Date getDateFromString(String strDate, String format) {
		Date dateVal = null;

		if (JMRUtil.isNullOrEmpty(strDate))
			return dateVal;

		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			dateVal = sdf.parse(strDate);
		} catch (ParseException e) {
			
		}

		return dateVal;
	}

	public static Date addMonths(Date date, int noOfMonths) {
		if (JMRUtil.isNull(date))
			return date;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, noOfMonths);
		date = calendar.getTime();
		return date;
	}

	public static Date addDays(Date date, int days) {
		if (JMRUtil.isNull(date))
			return date;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, days);
		date = calendar.getTime();
		return date;
	}

	public static Date getStartDateOfDay(Date date) {

		if (JMRUtil.isNull(date))
			date = getTodayDate();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		setTimeToBeginningOfDay(calendar);
		return calendar.getTime();
	}

	private static void setTimeToBeginningOfDay(Calendar calendar) {
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MILLISECOND, 0);
	}

	public static Date getDateFromString(String strDate) {
		return getDateFromString(strDate, Boolean.TRUE);
	}

	public static Date subtractDays(Date date, int days) {
		return addDays(date, -days);
	}

	public static String subtractDays(String dateStr, int days) {
		Date date = getDateFromString(dateStr, Boolean.TRUE);
		Date rtnDate = subtractDays(date, days);
		return getDateStringFromDate(rtnDate, Boolean.TRUE);
	}

	public static Date subtractMonths(Date date, int months) {
		return addMonths(date, -months);
	}

	public static Integer compareDates(Date date1, Date date2) {
		if (JMRUtil.isNull(date1) || JMRUtil.isNull(date2)) {
			return null;
		}
		return date1.compareTo(date2);
	}

	

	public static String getTodayDateAsStr() {
		return getTodayDate(DATE_SPLITTER);
	}

	

	public static Date lastDateofCurrentMonth() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		setTimeToEndofDay(calendar);
		return calendar.getTime();
	}

	private static void setTimeToEndofDay(Calendar calendar) {
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		calendar.set(Calendar.MILLISECOND, 999);
	}

	public static Date getDateFromDateString(String dateVal, String format) {
		if (JMRUtil.isNull(dateVal))
			return null;

		if (JMRUtil.isNull(format))
			format = DATE_TIME_TICK_FORMAT;

		SimpleDateFormat sdf = new SimpleDateFormat(format);

		Date rtnDtVal = null;

		try {
			rtnDtVal = sdf.parse(dateVal);
		} catch (ParseException e) {
			
		}
		return rtnDtVal;
	}

	public static String getTodayDateAsRev(String splitter) {

		Integer[] dateArr = getTodayDateAsArr();
		return dateArr[2] + splitter + dateArr[1] + splitter + dateArr[0];
	}

	public static String addMinutes(String dateStr, int minutes) {
		Date date = getDateFromString(dateStr, Boolean.TRUE);
		Date rtnDate = addMinutes(date, minutes);
		return getDateStringFromDate(rtnDate, Boolean.TRUE);
	}

	public static Date addMinutes(Date date, int minutes) {
		if (JMRUtil.isNull(date))
			return date;
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MINUTE, minutes);
		date = calendar.getTime();
		return date;
	}

	public static String getMonthName(Date date) {
		if (JMRUtil.isNull(date))
			date = getTodayDate();

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.MONTH, getMonth(date));

		return calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
	}

	public static int getMonth(Date date) {
		return getDateAttr(date, Calendar.MONTH);
	}

	public static int getDateAttr(String dateStr, int attrType) {
		Date date = getDateFromString(dateStr, Boolean.TRUE);
		return getDateAttr(date, attrType);
	}

	public static int getDateAttr(Date date, int attrType) {

		if (JMRUtil.isNull(date))
			return -1;

		Calendar calendar = Calendar.getInstance();
		if (JMRUtil.isNotNull(date)) {
			calendar.setTime(date);
			return calendar.get(attrType);
		}

		return -1;
	}

	public static int getYear(Date date) {
		return getDateAttr(date, Calendar.YEAR);
	}
	public static Date getEndDateOfDay(Date date) {

		if (JMRUtil.isNull(date))
			date = getTodayDate();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		setTimeToEndofDay(calendar);
		return calendar.getTime();
	}
	
	public static Date beginDateOfAnyMonth(int year, int month) {
		return beginDateOfAnyMonth(null, year, month, Boolean.TRUE);
	}

	public static Date beginDateOfAnyMonth(Date date, int year, int month, Boolean withTimeChange) {
		Calendar calendar = Calendar.getInstance();
		if (JMRUtil.isNotNull(date))
			calendar.setTime(date);
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		if (withTimeChange)
			setTimeToBeginningOfDay(calendar);
		return calendar.getTime();
	}

	public static Date endDateOfAnyMonth(int year, int month) {
		return endDateOfAnyMonth(year, month, Boolean.TRUE);
	}

	public static Date endDateOfAnyMonth(int year, int month, Boolean withTimeChange) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		if (withTimeChange)
			setTimeToEndofDay(calendar);
		return calendar.getTime();
	}

}
