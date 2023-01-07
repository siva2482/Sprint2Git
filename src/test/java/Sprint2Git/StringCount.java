package Sprint2Git;

import java.util.Arrays;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class StringCount {

	public static String string_count(String s)
	{ 
		
		int count=1;
	int j=0;
	String s1="";
		while(j<s.length() -1 ) {
			
			if(s.charAt(j)==s.charAt(j+1))
			{
				count++;
				
				
			}else
			{
				s1=s1+String.valueOf(count)+s.charAt(j);
				//count++;
				count=1;
				
			}
			
			j++;
		}
		s1=s1+String.valueOf(count)+s.charAt(j);
		
		return s1;
	}
@Test
public void run1()
{
	String actual=string_count("aaabbcaacccbbb");
	Assert.assertEquals("3a2b1c2a3c3b",actual);
	System.out.println(actual);
}
}
