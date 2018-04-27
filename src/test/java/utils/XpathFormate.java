package utils;


import enumbase.XpathEnum;

public class XpathFormate {
	
	public static String getUserXpath(String value)
	{
		
		return getXpath(value,XpathEnum.TAG_USER_ATTRIBUTE);
		
	}
	
	
	public static String getUserNext(String value)
	{
		return getXpath(value,XpathEnum.TAG_USER_NEXT_ATTRIBUTE);
		
	}
	


	public static String getPassXpath(String value)
	{
		return getXpath(value,XpathEnum.TAG_PASS_TEXT);
		
		
	}
	
	
	
	public static String getPassNext(String value)
	{
		return getXpath(value,XpathEnum.TAG_PASS_NEXT_ATTRIBUTE);
		
		
	}
	
	
	
	
	
	//identified by keyvalue and xpath enum
	
	private static String getXpath(String value, XpathEnum xpathEnum) {
		// TODO Auto-generated method stub
		return String.format(xpathEnum.getxpath(), value);
	}
	
	
	

}
