package Modul;
import java.io.*;
public class Queue{
public int maxsize;
public double [] queuearray;
public int front;
public int rear;
public int jumlah;
public void inisiasi(int s){
maxsize = s;
queuearray = new double [maxsize];
front = rear = jumlah = 0; }
public void enqueue (double data)
{
	if (jumlah==maxsize)
	System.out.println("Queue penuh."+data+" Tidak Bisa Masuk");
	else {
		queuearray[rear] = data;
		rear = (rear+1)%maxsize;
		jumlah++;
		System.out.println(data +" Masuk ke Queue"); }}
public double dequeue()
{
	double temp;
	if (jumlah==0)
	{
	System.out.println("Queue Sudah Kosong");
	return(-1); }
	else {
		temp = queuearray[front];
		front = (front+1)%maxsize;
		jumlah--;
		System.out.println(temp + " Keluar dari Queue");
		return (temp);}}
public void view()
{
	System.out.print("Isi Queue: ");
	if (jumlah > 0) {
	if (front < rear) {
	for (int i = front; i < rear; i++) {
		System.out.print(queuearray[i] + " ");}
	}
	else {
		for (int i = front; i < maxsize; i++) {
			System.out.print(queuearray[i] + " "); }
			for (int i = 0; i < rear; i++) {
				System.out.print(queuearray[i] + " ");
			}}}System.out.println(); }
public static void
main (String[] args) {
	Queue queue = new
	Queue();
	queue.inisiasi(4);
	queue.enqueue(64);
	queue.dequeue();
	queue.enqueue(57);
	queue.enqueue(39);
	queue.enqueue(11);
	queue.enqueue(1);
	queue.view();

	queue.dequeue();
	queue.view();
	queue.enqueue(88);
	queue.enqueue(99);
	queue.dequeue();
	queue.enqueue(77);
	queue.enqueue(100);
	queue.view();
	queue.dequeue();
	queue.view();
	}
}

