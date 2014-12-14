package Buildmanagement;

import com.google.common.base.*;

public class Buildmanagement 
{
	// if there is a string input the string will be splittet at every whitespace und printed
	public static void main(String[] args) 
	{
  	  if(args.length != 0) 
  	  {
      	Iterable<String> news = Splitter.on(CharMatcher.BREAKING_WHITESPACE).split(args[0]);
      	for(String dsa : news) 
    	  {
      	  System.out.println(dsa);
	      }
	    }
	    else
	    System.out.println("Nothing to split");
	}
}	
