package com.hortsmann;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		String className= "java.lang.Double";
		Class cl = Class.forName(className);
		Class sc = cl.getSuperclass();
		String modifiers = Modifier.toString(cl.getModifiers());
		if(modifiers.length() >0){
			System.out.print(modifiers+" ");
		}
		System.out.print("class "+className);
		if(sc != null && sc!= Object.class){
			System.out.print(" extends "+ sc.getName());
		}
		System.out.println("\n{");	
		
		printConstructors(cl);
		printMethods(cl);
		printFields(cl);
		
		System.out.println("\n}");
	}
	
	private static void printConstructors(Class cl){
		Constructor[] cons = cl.getDeclaredConstructors();
		for (Constructor con : cons) {
			System.out.print("	");
			String modifiers = Modifier.toString(con.getModifiers());
			if(modifiers.length()>0){
				System.out.print(modifiers+" ");
			}
			System.out.print(con.getName()+"(");
			Class[] paramTypes = con.getParameterTypes();
			for (int i = 0; i < paramTypes.length; i++) {
				if(i>0) {
					System.out.print(", ");
				}
				System.out.print(paramTypes[i].getName());
			}
			System.out.println(");");
			
		}
		System.out.println();
	}
	
	private static void printMethods(Class cl){
		Method[] methods = cl.getDeclaredMethods();
		for (Method method : methods) {
			String name = method.getName();
			System.out.print("	");
			String modifier = Modifier.toString(method.getModifiers());
			if(modifier.length()>0){
				System.out.print(modifier+" ");
			}
			System.out.print(method.getReturnType().getName()+" "+name+"(");
			Class[] paramTypes = method.getParameterTypes(); 
			for (int i = 0; i < paramTypes.length; i++) {
				if(i>0){
					System.out.print(", ");
				}
				System.out.print(paramTypes[i].getName());
			}
			System.out.println(");");
		}
		System.out.println();
	}
	
	
	private static void printFields(Class cl){
		Field[] fields =  cl.getDeclaredFields();
		for (Field field : fields) {
			System.out.print("	");
			String modifier = Modifier.toString(field.getModifiers());
			if(modifier.length()>0){
				System.out.print(modifier+" ");
			}
			System.out.println(field.getType().getName()+" "+field.getName()+";");
		}
	}
}
