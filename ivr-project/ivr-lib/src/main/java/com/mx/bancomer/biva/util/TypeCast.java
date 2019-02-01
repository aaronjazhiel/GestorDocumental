package com.mx.bancomer.biva.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TypeCast {
	
	
	
	/**
	 * @param obj
	 * @return
	 */
	public static boolean ifNull(Object obj){
		return obj==null;
	}
	
	
	
	/**
	 * @param trim
	 * @return
	 */
	public static boolean  isNullOrEmty(String trim){
		return ifNull(trim) || trim.isEmpty() ;
	}
	
	
	/**
	 * @param arreglo1
	 * @param arreglo2
	 * @return
	 */
	public static Object[]  joinArrays(final Object[] arreglo1,final Object[] arreglo2){
		List<Object> lista=new ArrayList<Object>(Arrays.asList(arreglo1));
		
		      if( ifNull(arreglo1) && !ifNull(arreglo2)){
		    	  return arreglo2;
		      }
		      else if( ifNull(arreglo2) && !ifNull(arreglo1)){
		    	  return arreglo1;
		      }
		      
		      else if( ifNull(arreglo1) && ifNull(arreglo2)){
		    	  return arreglo1;
		      }
		      else{
		    	  
		    	 lista.addAll(Arrays.asList(arreglo1)); 
		         lista.addAll(Arrays.asList(arreglo2));
		      }
		     return  lista.toArray(new Object[0]);
		    
	}
	
	/**
	 * @param arreglo1
	 * @param arreglo2
	 * @return
	 */
	public static Object[]  toArray(Object[] arreglo1,Object[] arreglo2){
		       
		List<Object> lista=new ArrayList<Object>(Arrays.asList(arreglo1));
		
	      if( ifNull(arreglo1) && !ifNull(arreglo2)){
	    	  return arreglo2;
	      }
	      else if( ifNull(arreglo2) && !ifNull(arreglo1)){
	    	  return arreglo1;
	      }
	      
	      else if( ifNull(arreglo1) && ifNull(arreglo2)){
	    	  return arreglo1;
	      }
	      else{
	    	  
	    	 lista.addAll(Arrays.asList(arreglo1)); 
	         lista.addAll(Arrays.asList(arreglo2));
	      }
		    
		     lista.addAll(Arrays.asList(arreglo2));
		     return  lista.toArray(new Integer[0]);
		    
	}
	
	
	/**
	 * @param source
	 * @param destine
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static boolean isEqualsClass(Class source,Class destine){
		   
		     return source.getName().equals(destine.getName());
		      
	}
	/**
	 * @param obj
	 * @param alternative
	 * @return
	 */
	public static Object NVL(Object obj,Object alternative){
		
		 if(ifNull(obj)){
			 return alternative;
		 }
		 else if(isEqualsClass(obj.getClass(),alternative.getClass())){
			  return  ifNull(obj)==true?alternative:obj;
		  }
			  
		 return null;
		
	}
	
	
	/**
	 * @param o
	 * @param m
	 * @param p
	 * @return Object
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 */
	public static Object invoke(Object o,String m,Object... args) throws  IllegalArgumentException, IllegalAccessException, InvocationTargetException, SecurityException, NoSuchMethodException {
		
		 if(ifNull(args)){ 
			 Method method=o.getClass().getMethod(m);
			 return method.invoke(o);
		 }		 
			 
			 Class[] pTypes = new Class[args.length];
             for (int i = 0; i < args.length; i++) {
                 pTypes[i] = args[i].getClass();
             }
             Method method=o.getClass().getMethod(m, pTypes);
             return method.invoke(o, args);

	}
	
	 
	
	 

}
