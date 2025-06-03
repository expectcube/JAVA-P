package Modul;
import java.util.Scanner;
class BinerSearch {
public int pencarianBiner (int b[], int kunciPencarian, int low, int high) {
int i, middle;
while (low<=high) {
middle = (low+high)/2;
if (kunciPencarian==b[middle])
return middle;
else if (kunciPencarian<b[middle])
high = middle-1;
else
low = middle+1; }
return -1; }
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
BinerSearch biner = new BinerSearch();
int i, x, hasil;
boolean ketemu;
int data[] = {1,2,3,4,6,7};
System.out.print ("Masukkan Data yang dicari = ");
x = input.nextInt();
hasil = biner.pencarianBiner(data,x,0,data.length-1);
if (hasil>=0)
System.out.println ("Data tersebut ada pada posisi ke-" +(hasil+1));
else
System.out.println ("Data tidak ditemukan "); }}