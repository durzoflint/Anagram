import java.io.*;
import java.util.*;
class Anagrams
{
	static String prev="";
	public static void main(String arghh[])throws Exception
	{
		input();
	}
	static void input()throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("Questions.txt"));
		String s=br.readLine();
		while((s=br.readLine())!=null)
		{
			char ar[]=new char[s.length()];
			for(int i=0;i<s.length();i++)
			ar[i]=s.charAt(i);
			s="";
			Arrays.sort(ar);
			for(int i=0;i<ar.length;i++)
			s=s+ar[i];
			generate(s,"");
		}
	}
	static void generate(String s,String x)
	{
		if(s.length()==0&&prev.indexOf(x)==-1)
		{
			System.out.println(x);
			prev=prev+x+" ";
		}
		for(int i=0;i<s.length();i++)
		try
		{generate(s.substring(0,i)+s.substring(i+1),x+s.charAt(i));}
		catch(Exception e){}
	}
}