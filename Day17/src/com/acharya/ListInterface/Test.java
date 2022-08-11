package com.acharya.ListInterface;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Test

{

public static void main(String [] args){

List<Integer> val = new ArrayList<>();

val.add(0);

val.add(11);

val.add(23);

java.util.Iterator<Integer> z=val.iterator();

while(z.hasNext())

{

System.out.print(z.next());}

System.out.println("ArrayList : " + val);

}

}
