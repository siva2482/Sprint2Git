package Sprint2Git;

import java.util.Arrays;

import org.testng.annotations.Test;

public class StringPrefix {
	
	public static void string_prefix(String[] s)
	{
		Arrays.sort(s);
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]);
		String s1=s[0];
		String s2=s[s.length-1];
		int i=0;
		while(s1.charAt(i)==s2.charAt(i))
		{
			
		}
	}
	
	@Test
	public void run()
	{
		String[] arr= {"flower","flow","flight"};
		string_prefix(arr);
	}

}
