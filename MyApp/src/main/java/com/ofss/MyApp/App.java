package com.ofss.MyApp;

public class App 
{
    public static void main( String[] args )
    {
		Calculator calc1 = new Calculator();
		System.out.println( "Add"+calc1.add(10,5));
		System.out.println( "Add"+calc1.multiply(10,5));
    }
}
