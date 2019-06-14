package com.java.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class PrintWriterDemo {
public static void main(String[] args)throws IOException
{
FileWriter fw=new FileWriter("cricket.txt");
PrintWriter out=new PrintWriter(fw);
out.write(100);
out.println(100);
out.println(true);
out.println('c');
out.println("SaiCharan");
out.flush();
out.close();
FileReader fr=new FileReader("cricket.txt");
BufferedReader br=new BufferedReader(fr);
String line=br.readLine();
while(line!=null)
{
System.out.println(line);
line=br.readLine();
}
br.close();

}
}