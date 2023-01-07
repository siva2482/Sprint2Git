package Sprint2Git;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class StringSwap {
	
	public static String string_swap(String s,int x,int y)
	{
		String rev="";
		String[] str=s.split(" ");
		try
		{
		for(int i=0;i<str.length;i++)
		{
			String temp=str[x];
			str[x]=str[y];
			str[y]=temp;
		}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please enter a valid index to swap");
		}
		for(int i=0;i<str.length;i++)
		rev=rev+str[i]+" ";
		System.out.println(rev);
		return  rev.trim();
	}
	
	@Test
	public void run1() {
		String s="I am Mohan from Bangalore";
		String expected="Mohan am I from Bangalore";
		Assert.assertEquals(expected.trim(),string_swap(s,2,0) );
		
	}
	
	@Test
	public void run2() {
		String s="I am Mohan from Bangalore";
		String expected="Mohan am I from Bangalore";
		string_swap(s,5,1);
		//Assert.assertEquals(expected.trim(),string_swap(s,5,0) );
		
	}
	
	
       
}
