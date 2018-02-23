/*
 * Return:The return statement is used to explicitly return from a method. 
 * That is, it causes a program control to transfer back to the caller of the method.
			Example:

 */

package com.statements.control;

			// Java program to illustrate using return
			class ReturnDemo
			{
			    public static void main(String args[])
			    {
			        boolean t = true;
			        System.out.println("Before the return.");
			     
			        if (t)
			            return;
			 
			        // Compiler will bypass every statement 
			        // after return
			        System.out.println("This won't execute.");
			    }
			}

