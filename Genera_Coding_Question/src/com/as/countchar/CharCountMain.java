package com.as.countchar;

public class CharCountMain 
{
	  public static void countChars() {
	        CharacterCount cc = new CharacterCount();
	        String op1 = cc.charcount("aaatttaeee");
	        String sts1 = op1.equals("a4,t3,e3") ? "✅ Correct " : "❌ Wrong";
	        System.out.println(sts1);

	        String op2 = cc.charcount("qwqwwwqw");
	        String sts2 = op2.equals("q3,w5") ? "✅ Correct " : "❌ Wrong";
	        System.out.println(sts2);
	    }

	    public static void main(String[] args) throws Exception {
	    
	    	countChars();
	    }
}
