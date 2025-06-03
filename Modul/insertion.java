package Modul;
public class insertion  {
    public static void main(String args[])  {
    int a[]={7,16,5,9,1};
        for(int i=0;i<a.length;i++)   {
        int tmp=a[i];
        int j=i;
        while((j>0)&&(tmp>a[j-1])) {
        a[j]=a[j-1];
        j--;    }
        a[j]=tmp;   }
        // mencetak hasil
        for(int h=0;h<a.length;h++)    {
        System.out.println(a[h]); 
        }
    }
}
