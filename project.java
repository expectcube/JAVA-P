import java.util.Scanner;
public class project  {
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
        // Menentukan ukuran array 2D
System.out.print("Masukkan jumlah anak: ");
int umur = scanner.nextInt();

int[] jumlahanak = new int[umur];

System.out.println("\nMasukkan umur anak:");
        for (int i = 0; i < umur; i++) {
                System.out.print("Anak ke  " + (i +1) + ":");
                jumlahanak[i] = scanner.nextInt();
            }
System.out.println("desend:");
for(int i=0;i<jumlahanak.length;i++)   {
int tmp=jumlahanak[i];
int j=i;
while((j>0)&&(tmp>jumlahanak[j-1])) {
jumlahanak[j]=jumlahanak[j-1];
j--;    }
jumlahanak[j]=tmp;   }
// mencetak hasil
for(int h=0;h<jumlahanak.length;h++)    {
System.out.println(jumlahanak[h]); }


System.out.println("asend");
for(int i=0;i<jumlahanak.length;i++)   {
int tmp=jumlahanak[i];
int j=i;
while((j>0)&&(tmp<jumlahanak[j-1])) {
jumlahanak[j]=jumlahanak[j-1];
j--;    }
jumlahanak[j]=tmp;   }
// mencetak hasil
for(int h=0;h<jumlahanak.length;h++)    {
System.out.println(jumlahanak[h]); }









}}