package com.stuffsystem.util;

// ****************************************************************************
// Shorthand for System.out.print(s) & println(s):  pr.s(s) & pr.ln(s)
// ****************************************************************************
public class pr
{
   // Print a string
   public static void s(final String s)
   {
       System.out.print(s);
   }

   // Print a string and endline char
   public static void ln(final String s)
   {
       System.out.println(s);
   }

   // Print a string
   public static void s(final Object o)
   {
       s(o.toString());
   }

   // Print a string and endline char
   public static void ln(final Object o)
   {
       ln(o.toString());
   }
}



