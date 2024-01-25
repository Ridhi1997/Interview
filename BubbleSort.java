package Sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] ={50,25,5,20,10};
        int result [] = bubbleSort(arr);
        for (int i=0; i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    /*
    Time complexity: O(N^2), in the worst case. For every element, we iterate over the entire array each time giving an overall time complexity of O(N^2).
    Space complexity: O(1),as no extra space is required.
     */
    public  static  int[] bubbleSort(int arr[]){
        int n = arr.length;
        for (int i=0; i<n-1;i++){
            for (int j=0; j<n-i-1;j++){
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return  arr;
    }
}
