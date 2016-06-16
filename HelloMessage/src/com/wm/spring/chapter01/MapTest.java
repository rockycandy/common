package com.wm.spring.chapter01;

//public class MapTest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JComboBox.KeySelectionManager;

import org.springframework.web.accept.ParameterContentNegotiationStrategy;

/**
 *@author WHD
 *2015-3-5
 */


@SuppressWarnings("unused")
public class MapTest {
private static Object Sysout;

//    private static List<String> list= new ArrayList<String>();
    public static void main(String[] args){
    	
    	Map<String,String> params = new HashMap<String,String>();
    	params.put("OrderNo", "42567780");
    	params.put("PurchaseOrder", "90887754");
    	
    	Iterator<String> keys = params.keySet().iterator();
//    	Map<String> cc = params.get(keys);
    	
//    	while (keys.hasNext()){
//    		String key = keys.next();
//    		System.out.println(key);
//		}
    	
    	
    }
    	
}
