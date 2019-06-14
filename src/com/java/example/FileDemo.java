package com.java.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileDemo
{
public static void main(String[] args)throws IOException
{
File f=new File("sss.txt");
System.out.println(f.exists());//false
if(f.exists()==false)
{
f.createNewFile();
System.out.println("769857856");

}
System.out.println(f.exists());//true
FileWriter fw=new FileWriter("sss.txt",true);
fw.write(99);//adding a single character
fw.write("haran\nsoftware solutions\n");
fw.write("\n");
char[] ch={'a','b','c'};
fw.write(ch);
fw.write("\n");
fw.flush();
fw.close();
System.out.println(f.length());
FileReader fr=new FileReader("sss.txt");
int i=fr.read();
//more amount of data
while(i!=-1)
{
System.out.print((char)i);
i=fr.read();
}
}
}