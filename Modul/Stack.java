package Modul;
import java.io.*;
public class Stack
{
int maxsize; //penentu batas elemen stack maksimum
double [] stackarray; //array untuk menyimpan stack
int top;
public void inisiasi(int s) //menentukan ukuran kapasitas stack
{
maxsize = s;
stackarray = new double [maxsize];
top = -1;}
public void push(double data){
	if (top>=maxsize-1)
	System.out.println("Stack Penuh. "+data+"Tidak bisa masuk");
	else {
		top++;
		stackarray[top] = data;
		System.out.println(data +" Masuk ke Stack"); }}
public double pop() {
	double temp;
	if (top>=0) {
		temp = stackarray[top];
		System.out.println(temp + " Keluar dari Stack");
		top--;
		return (temp);}
		else {
			System.out.println("Stack Sudah Kosong");
			return(-1);}}
public void view()
{
	System.out.print("Isi Stack: ");
	for(int i=0; i<=top; i++)
	System.out.print(stackarray[i] + " ");
	System.out.println();}
	public static void main(String[] args)
	{
		Stack stack = new Stack ();
		stack.inisiasi(3);

		stack.push(1);
		stack.push(8);
		stack.push(5);
		stack.push(4);
		stack.pop();
		stack.push(8);
		stack.push(21);
		stack.view();
		stack.pop();
		stack.pop();
		stack.push(2000);
		stack.pop();
		stack.view();
		stack.pop();
		stack.push(54);
		stack.push(90);
		stack.pop();
		stack.push(67);
		stack.pop();
		stack.view(); }}