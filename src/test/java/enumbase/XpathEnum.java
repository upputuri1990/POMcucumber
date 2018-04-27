package enumbase;

public enum XpathEnum {
	
   TAG_USER_ATTRIBUTE("//input[@id='identifierId']"),
	
	
	
	TAG_USER_NEXT_ATTRIBUTE("//div[@id='identifierNext']"),
	
	
	TAG_PASS_TEXT("//input[@name='password']"),
	
	
	TAG_PASS_NEXT_ATTRIBUTE("//div[@id='passwordNext']/div[2]");
	
	
	private String xPath=null;
	private XpathEnum(String value) {
		// TODO Auto-generated constructor stub
		
		xPath=value;
	
	}
	
	
	public String getxpath()
	{
		return xPath;
		
	}
	
	
	
	
			
			
}
