package com.javatechie.git_demo;

public class App 
{
	
	public int add(int a,int b,int c ) {
		c=a+b;
		return c;
		}
	public void addData(String data) {
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("Welcome to git-hub");
		}
		
	}
		
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
