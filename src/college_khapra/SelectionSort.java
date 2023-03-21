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
public class SelectionSort {
    
    public static void main(String[] args) {
        int arr[]={33,4356,766,43,556568,5};
        Selection(arr);
    }
    static void Selection(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int smallest=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        for(int vv:arr)
        {
            System.out.print(vv+" ");
        }
    }
}
