public class Bubblesor {
    public static void main(String[] args) {
        int [] arr = { 64, 25, 12, 22, 11};

        for(int i =0; i< arr.length; i++){
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

            }

        }
        System.out.println("Sorted array:-");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
