package com.java.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class BufferedWriterDemo
{
public static void main(String[] args)throws IOException
{
FileWriter fw=new FileWriter("cricket.txt");
BufferedWriter bw=new BufferedWriter(fw);
bw.write(100);
bw.newLine();
char[] ch={'a','b','c','d'};
bw.write(ch);
bw.newLine();
bw.write("SaiCharan jwmeyr4lewtu rjectyu 34jurty7c54fki 34jux67mki ");
bw.newLine();
bw.write("software solutions 1jxdrm4t 4jtyjudf5 54judfkity6 s");
bw.flush();
bw.close();
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