package Modul;
import java.util.Scanner;
class LiniearSearch {
    public static void main(String args[]) 
    {
        Scanner masukan = new Scanner(System.in);
        int i;
        int item;
        int array [] = {1,4,2,6,8,4};
        System.out.print ("Masukan angka yang dicari: ");
        item = masukan.nextInt();
        for (i = 0; i < array.length; i++)
        {
            if (array[i] == item) 
            {
                System.out.println(item+" Berada pada lokasi "+(i+1));
                break;
            }
        }
        if  (i == array.length)
        System.out.println(item + " Data tidak ada ");                                                      
    }
}
