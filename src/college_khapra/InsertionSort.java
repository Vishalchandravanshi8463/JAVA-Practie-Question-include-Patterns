/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_khapra;

/**
 *
 * @author vishal chandravanshi
 */
public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={32,34,64,667,8644,32,34,5};
        insertion(arr);
    }
    static void insertion(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int j=i-1;
            int current=arr[i];
            while(j>=0&&current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
                
            }
            arr[j+1]=current;
            
        }
       for(int vv:arr)
       {
           System.out.print(vv+" ");
       }
    }
}
