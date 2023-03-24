package com.as.anno.genegetset;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

public class GetSetProcessor 
{
	public static void generateAccessors(Object obj)
	{
		
		Class<?> clazz = obj.getClass();
		
		for (Field field : clazz.getDeclaredFields()) {
			
			String name=field.getName();
			
			String camelCaseFieldName=Character.toUpperCase(name.charAt(0))+name.substring(1);
			
			String getterName= "get"+camelCaseFieldName;
			String setterName= "set"+camelCaseFieldName;
			
			System.out.println(getterName);
			System.out.println(setterName);
			
			try {
				clazz.getMethod(getterName).invoke(obj);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| NoSuchMethodException | SecurityException e) {
				
				e.printStackTrace();
			}
			
			
		}
	}

}
