package Sprint2Git;

import java.util.Arrays;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class StringPrefix {
	
	public static String string_prefix(String[] s)
	{
		String final_prefix="";
		Arrays.sort(s);
		
			
		String s1=s[0];
		String s2=s[s.length-1];
		int i=0;
		while(s1.charAt(i)==s2.charAt(i))
		{
			final_prefix=final_prefix+s1.charAt(i);
			i++;
			
		}
		System.out.println(final_prefix);
		return final_prefix;
	}
	
	@Test
	public void run1()
	{
		String[] arr= {"flower","flow","flight"};
		String actual=string_prefix(arr);
		Assert.assertEquals("fl",actual);
	}
	
	
	@Test
	public void run2()
	{
		String[] str= {"pizza","pizca","pizab","pizbd"};
		String actual=string_prefix(str);
		Assert.assertEquals("piz",actual);
	}

	

	@Test
	public void run3()
	{
		String[] st= {"four","fire","file","fish"};
		String actual=string_prefix(st);
		Assert.assertEquals("f",actual);
	}
	
	@Test
	public void run4()
	{
		String[] st1= {"four","nail","file","bail"};
		String actual=string_prefix(st1);
		Assert.assertEquals("",actual);
	}

}
