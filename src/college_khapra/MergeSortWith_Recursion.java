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
public class MergeSortWith_Recursion {
    public static void main(String[] args) {
        int arr[]={34,432,436,64,665,4,54,4,5345,32,2};
        int s=0,e=arr.length-1;
        divide(arr,s,e);
        for(int vv:arr)
        {
            System.out.print(vv+" ");
        }
    }
    
    static void divide(int arr[],int s,int e)
    {
        if(s>=e)
        {
            return;
        }
        int mid=s+(e-s)/2;
        divide(arr,s,mid);
        divide(arr,mid+1,e);
        
        conquer(arr,s,mid,e);
    }
    static void conquer(int arr[],int s,int mid,int e)
    {
        int merge[]=new int[e-s+1];
        int i=s;
        int j=mid+1;
        int x=0;
        while(i<=mid&&j<=e)
        {
            if(arr[i]<arr[j])
            {
                merge[x]=arr[i];
                i++;
                x++;
            }
            else
            {
                merge[x]=arr[j];
                x++;
                j++;
                
            }
            
        }
        while(i<=mid)
        {
            merge[x]=arr[i];
            i++;
            x++;
        }
          while(j<=e)
        {
            merge[x]=arr[j];
            j++;
            x++;
        }
          for(int v=0,p=s;v<merge.length;v++,p++)
          {
              arr[p]=merge[v];
          }
    }
}
