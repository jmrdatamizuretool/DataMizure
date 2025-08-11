package com.jmr.framework.util;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

public class JMRUtil {

	private JMRUtil() {
	}

	private static final String SPLITTER = "/";

	@SuppressWarnings("rawtypes")
	public static Class getClassFromString(String entityClass) {
		Class claz = null;
		try {
			claz = Class.forName(entityClass);
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return claz;
	}

	public static String getParamsAsString(Map<String, String> reqParams) {
		StringBuilder paramsAsStr = new StringBuilder("");

		if (!isNullOrEmpty(reqParams)) {
			for (Entry<String, String> entry : reqParams.entrySet()) {
				if (!paramsAsStr.toString().isEmpty()) {
					paramsAsStr.append("&");
				}
				paramsAsStr.append(entry.getKey() + "=" + entry.getValue());
			}
		}

		return paramsAsStr.toString();
	}

	public static Boolean isNull(Object... values) {
		Boolean rtnVal = Boolean.FALSE;
		for (Object sVal : values) {
			if (sVal == null) {
				rtnVal = Boolean.TRUE;
				break;
			}
		}
		return rtnVal;
	}

	public static Boolean isNullOrZero(Double... values) {
		Boolean rtnVal = Boolean.FALSE;
		for (Double sVal : values) {
			if (isNull(sVal) || sVal == 0) {
				rtnVal = Boolean.TRUE;
				break;
			}
		}
		return rtnVal;
	}

	public static Boolean isNullOrZero(Integer... values) {
		Boolean rtnVal = Boolean.FALSE;
		for (Integer sVal : values) {
			if (isNull(sVal) || sVal == 0) {
				rtnVal = Boolean.TRUE;
				break;
			}
		}
		return rtnVal;
	}

	@SuppressWarnings("rawtypes")
	public static Boolean isEmpty(Object value) {
		Boolean rtnVal = Boolean.FALSE;
		if (value instanceof String) {
			String str = (String) value;
			str = str.trim();
			if (str.isEmpty())
				rtnVal = Boolean.TRUE;
		} else if (value instanceof StringBuilder) {
			StringBuilder str = (StringBuilder) value;
			rtnVal = isEmpty(str.toString());
		} else if (value instanceof Collection && ((Collection) value).isEmpty()) {
			rtnVal = Boolean.TRUE;
		} else if (value instanceof Map && ((Map) value).isEmpty()) {
			rtnVal = Boolean.TRUE;
		} else if (value instanceof StringBuilder && ((StringBuilder) value).length() == 0) {
			rtnVal = Boolean.TRUE;
		}

		return rtnVal;
	}

	public static Boolean isNullOrEmpty(Object... values) {
		Boolean rtnVal = isNull(values);

		if (rtnVal)
			return rtnVal;

		for (Object value : values) {
			rtnVal = isEmpty(value);
			if (rtnVal) {
				break;
			}
		}

		return rtnVal;
	}

	public static Boolean isNull(Object value) {
		Boolean rtnVal = Boolean.FALSE;
		if (value == null) {
			rtnVal = Boolean.TRUE;
		} else if (value instanceof String) {
			if (value.equals("null")) {
				rtnVal = Boolean.TRUE;
			}
		}
		return rtnVal;
	}

	public static Boolean isNotNull(Object value) {
		return !isNull(value);
	}

	public static String objectToString(Object obj) {
		String str = null;
		if (isNotNull(obj)) {
			str = obj.toString();
		}
		return str;
	}

	public static int stringtoInt(String sInput) {

		int num = 0;
		if (!isNullOrEmpty(sInput)) {
			try {
				num = Integer.parseInt(sInput);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		return num;
	}

	public static Double stringtoDouble(String sInput) {

		Double num = null;
		if (!isNullOrEmpty(sInput)) {
			try {
				num = Double.parseDouble(sInput);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		return num;
	}

	public static Long stringtoLong(String sInput) {

		Long num = null;
		if (!isNullOrEmpty(sInput)) {
			try {
				num = Long.parseLong(sInput);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
		return num;
	}

	public static boolean isAlpha(String pInStr) {
		boolean retVal = true;
		char[] chIn = pInStr.toCharArray();

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
		if ((pInStr.charAt(0) == '-' && pInStr.length() != 1) || (pInStr.charAt(0) == '+' && pInStr.length() != 1))
			pInStr = pInStr.substring(1);

		char[] chIn = pInStr.toCharArray();

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

	public static String getDocUploadPath() {

		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		return Calendar.getInstance().get(Calendar.YEAR) + SPLITTER + month + SPLITTER
				+ Calendar.getInstance().get(Calendar.DATE) + SPLITTER;
	}

	public static Double getPercentageValue(Double value, Double percVal) {

		if (isNullOrZero(percVal))
			return 0.0;
		return (value * percVal) / 100;
	}

	public static String formatNumber(Double value, Boolean isDecimal) {

		if (isNull(value)) {
			return null;
		}

		String format = "#.00";

		if (!isDecimal) {
			format = "#";
		}

		DecimalFormat df = new DecimalFormat(format);
		return df.format(value);
	}

	public static String formatNumber(Double value) {
		return formatNumber(value, Boolean.TRUE);
	}

	public static Double getWholeNumber(Double value) {
		String num = formatNumber(value, Boolean.FALSE);

		if (isNotNull(num))
			return Double.valueOf(num);
		else
			return null;
	}

	public static boolean isNullOrZero(Long... values) {
		Boolean rtnVal = Boolean.FALSE;
		for (Long sVal : values) {
			if (sVal == null || sVal == 0) {
				rtnVal = Boolean.TRUE;
				break;
			}
		}
		return rtnVal;
	}
}
