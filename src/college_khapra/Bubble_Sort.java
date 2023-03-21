
package college_khapra;

public class Bubble_Sort {
    
    public static void main(String[] args) {
        int []arr={433,343,4,55,32,56,7};
        Bubble(arr);
        
    }
    static void Bubble(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
         for(int arv:arr)
        {
            System.out.print(arv+" ");
        }
           System.out.println("");
            }
          
        }
        for(int arv:arr)
        {
            System.out.print(arv+" ");
        }
    }
}
