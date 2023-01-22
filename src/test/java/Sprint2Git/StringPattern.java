package Sprint2Git;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class StringPattern {

	public static Map<List<String>,List<String>> Pattern_find(String[] s)
	{
		List<String> appnum_list=new ArrayList<String>();
		List<String> hallnum_list=new ArrayList<String>();
		 Map<List<String>,List<String>> hmap=new HashMap<List<String>,List<String>>();
		 for(int i=0;i<s.length;i++)
		{
		String s1="application";
		String s2="ticket";
		int i1 = 0;
		int n = 0;
		int i2=0;
		Pattern pattern1=Pattern.compile("\\d+{6,}");
		 
		 Matcher matcher1=pattern1.matcher(s[i]);
Pattern pattern2=Pattern.compile("(?=.?[A-Z])(?=.*[0-9])[A-Z0-9]+$");
		 
		 Matcher matcher2=pattern2.matcher(s[i]);
		if(s[i].contains("application")|| s[i].contains("Application"))
		{
		 i1=	s[i].indexOf("application");
		 n=i1+s1.length();
		 boolean found1=false;
		 
		 while(matcher1.find(n) ) {
			// System.out.println(matcher1.start());
			//System.out.println(matcher1.end());
			 System.out.println(matcher1.group());
			 break;
			// String s3=s[i].substring(matcher1.start(),matcher1.end());
			 //System.out.println(s3);
			// appnum_list.add(s3);
		 }
		 while(matcher2.find(n) ) {
			 //System.out.println(matcher2.start());
			 //System.out.println(matcher2.end());
			 System.out.println(matcher2.group());
			 break;
			// String s3=s[i].substring(matcher1.start(),matcher1.end());
			//System.out.println(s3);
			 //appnum_list.add(s3);
		 }
		}
		if(s[i].contains("ticket"))
		{
		 i2=	s[i].indexOf("ticket");
		 n=i2+s2.length();
		 boolean found2=false;
		 
		 if(matcher1.find(n)) {
			// System.out.println(matcher1.start());
			 //System.out.println(matcher1.end());
			 System.out.println(matcher1.group());
			 //String s3=s[i].substring(matcher1.start(),matcher1.end());
			 //System.out.println(s3);
			 //hallnum_list.add(s3);
		 }
		 
		 if(matcher2.find(n)) {
			 //System.out.println(matcher2.start());
			 //System.out.println(matcher2.end());
			 System.out.println(matcher2.group());
			// String s3=s[i].substring(matcher1.start(),matcher1.end());
			 //System.out.println(s3);
			
			// System.out.println(s[i].substring(matcher2.start(),matcher2.end()));
			 //hallnum_list.add(s3);
		 }
		}
		//hmap.put(appnum_list, hallnum_list);
		//System.out.println(i1);
		//System.out.println(n);
		}
		 //System.out.println(hmap);
		 return hmap;
	}
	
	@Test
	public void run()
	
	{
		String[] str= {"Your application has been accepted and your registration number is 093467 and your hall"
				+ "ticket number is BNG32016","Application number 9823019348 has been accepted.  your hall ticket number is  0955693",
				"Hall ticket is generated with number 39458 for the application AB123XZ"};
		 Map<List<String>,List<String>> rmap=new HashMap<List<String>,List<String>>();		
		rmap=Pattern_find(str);
		//System.out.println(rmap);
				
	}
	
}