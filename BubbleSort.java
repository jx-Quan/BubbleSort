public class BubbleSort {
    private BubbleSort(){}

    public static <E extends Comparable <E> > void sortmax(E[] arr){

        for(int i=0;i<arr.length-1;i++){

            //在arr[n-i-1]位置上放合适的元素
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0)
                    swap(arr,j,j+1);
            }
        }

    }

    public static <E extends Comparable <E> > void sortmin(E[] arr){
        for(int i=0;i<arr.length-1;i++){
            //i是有序元素的个数`1
            //在arr[i]位置上放上合适的元素
            int swappedIndex= arr.length-1;
            for(int j=arr.length-1;j>i;j--){
                if(arr[j].compareTo(arr[j-1])<0)
                    swap(arr,j,j-1);
                swappedIndex=j-1;
            }
            i= swappedIndex+1;
        }

    }
    public static <E extends Comparable <E> > void sort2(E[] arr){

        for(int i=0;i<arr.length-1;i++){

            boolean isSwapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0) {
                    swap(arr, j, j + 1);
                    isSwapped=true;
                }

                if(!isSwapped)  break;
            }
        }
    }

    public static <E extends Comparable <E> > void sort3(E[] arr){

        for(int i=0;i<arr.length-1;){

            int swappedIndex=0;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].compareTo(arr[j+1])>0) {
                    swap(arr, j, j + 1);
                    swappedIndex=j+1;
                }

                //if(swappedIndex==0) break;
                i=arr.length-swappedIndex;
            }
        }
    }
    private static <E>void swap(E[] arr,int i,int j){
        E temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
