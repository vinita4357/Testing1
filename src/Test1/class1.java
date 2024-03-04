package Test1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


		
		class class1{
			 
		    public void showMeTrue(){
		        System.out.print("class1method");
		    }

		    private int mathMethod(){
		        //Some code
		        return -1;
		    }

		    protected String showMsg(){
		        return "TRUE";
		    }

		    public final void showMsgByText(String msg){
		        //Some code
		    }

		    public static void test23434(){
		    	 System.out.print("class1staticmethod");
		    }
			class class2 extends class1 {
				 
			    public void showMeTrue(){
			        //Some code
			    }

			    private int mathMethod(){
			        //Some code
			        return -1;
			    }

			    protected String showMsg(){
			        return "TRUE";
			    }

			   

			    public static void test23434(){
			        //Some code
			    }

}}
