public class ShellSort {
    private ShellSort(){}

    public static <E extends Comparable<E>>void ShellSort(E[] arr){

        int h= arr.length/2;
        while(h>=1) {


            for (int i =  h; i < arr.length; i ++) {
                E t = arr[i];
                int j;
                for (j = i; j - h >= 0 && t.compareTo(arr[j - h]) < 0; j -= h)
                    arr[j] = arr[j - h];
                arr[j] = t;
            }


            h /= 2;
        }
    }

    public static <E extends Comparable<E>>void ShellSort2(E[] arr){

        int h= 1;
        while(h< arr.length) h=h*3+1;
        //1,4,13,40...
        while(h>=1) {


            for (int i =  h; i < arr.length; i ++) {
                E t = arr[i];
                int j;
                for (j = i; j - h >= 0 && t.compareTo(arr[j - h]) < 0; j -= h)
                    arr[j] = arr[j - h];
                arr[j] = t;
            }


            h /= 3;
        }
    }
}
