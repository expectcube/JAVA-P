package Modul;
import java.util.Scanner;
public class Array24A2{
public static void main (String[]args){
Scanner masuk = new Scanner (System.in);
String kelas []=new String [10];

for(int i=0 ; i<=9;i++) {
System.out.print("Silakan tuliskan nama teman : ");
kelas[i]=masuk.nextLine();
}

for(int i=0 ; i<=9;i++) {
System.out.println("Teman ke-"+(i+1)+" : "+kelas[i]);
}
}}