package com.brianfair.javagroupproject.models;

public class StringArrayFunctions {
	
	public static String strArrToStr(String[] arr)
	{
    	String str = "";
    	for(int i = 0; i< arr.length; i++)
    	{
    		if (i == 0)
    		{
        		str = arr[i];
    		}
    		else
    		{
        		str += ","+arr[i];
    		}
    	}
    	return str;
	}
	
	
	public static String[] strToStrArr(String str)
	{
		if (str != null)
		{
	    	String[] str_array = str.split(",");
	    	return str_array;
		}
		String[] nothing = null;
		return nothing;
	}

}
// lines to add to controller
//String str_toppings = StringArrayFunctions.strArrayToString(arr_toppings);
//String[] str_arr_toppings = StringArrayFunctions.stringToStrArray(str_toppings);
//String price = Prices.calculatePrice(arr_toppings, size, quantity);
