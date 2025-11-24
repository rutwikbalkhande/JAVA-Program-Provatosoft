package array;

public class AlphabateSort {
    // rearrange alpabate without sorting

    public static void main(String[] args) {

        char arr[]={'b','a','f','e','d','c'};

        char temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){

                         temp=arr[i];

                        arr[i]=arr[j];

                        arr[j]=temp;

                }

            }

        }
        for(char s: arr){
            System.out.println(arr);
        }

}}