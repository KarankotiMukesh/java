package testingcodes;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("hii welcome home ?");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}

	}

}
