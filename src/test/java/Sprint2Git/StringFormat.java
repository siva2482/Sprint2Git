package Sprint2Git;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class StringFormat {
	
	
	public static  String format_string(String s)
	{
		

		ArrayList<String> capsb=new ArrayList<String>();
		ArrayList<String> smallsb=new ArrayList<String>();
		ArrayList<String> numsb=new ArrayList<String>();
		String Sorted_String="";
		for (int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				if(capsb.contains(String.valueOf(s.charAt(i))));
				capsb.remove(String.valueOf(s.charAt(i)));
				capsb.add(String.valueOf(s.charAt(i)));
			}
		       
			
			if(Character.isLowerCase(s.charAt(i)))
			{
				if(smallsb.contains(String.valueOf(s.charAt(i))));
				smallsb.remove(String.valueOf(s.charAt(i)));
				smallsb.add(String.valueOf(s.charAt(i)));
			}
				
			if(Character.isDigit(s.charAt(i)))
			{
				if(numsb.contains(String.valueOf(s.charAt(i))));
				numsb.remove(String.valueOf(s.charAt(i)));
				numsb.add(String.valueOf(s.charAt(i)));
		}
		}
		Collections.sort(capsb);
		Collections.sort(smallsb);
		Collections.sort(numsb);
		for(String w:capsb)
		{
			Sorted_String=Sorted_String+w;
		}
		for(String w:smallsb)
		{
			Sorted_String=Sorted_String+w;
		}
		Sorted_String=Sorted_String+" ";
		for(String w:numsb)
		{
			Sorted_String=Sorted_String+w;
		}
		
		System.out.println(Sorted_String);
		return Sorted_String;
	}
	
	@Test
	public void run1()
	{
		
		Assert.assertEquals("ABEfg 2345",format_string("AAfgEf B45352"));
	}
	@Test
	public void run2()
	{
		
		Assert.assertEquals("ABCDSahlow 0159",format_string("Show09allBC 1950AD"));
	}
	
	@Test
	public void run3()
	{
		Assert.assertEquals("ABCDSahlow 0159",format_string("Show09allBC 1950 AD"));
	}


}
