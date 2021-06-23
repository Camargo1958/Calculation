public class Calculation {
    public static int findMaximum(int arr[]){
        int max = arr[0];
        for (int i=1;i<arr.length; i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public static int findMinimum(int arr[]){
        int min = arr[0];
        for (int i=1;i<arr.length; i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int maximum=findMaximum(new int[]{1,3,4,2});
        System.out.println("The maximum number is: "+maximum);
    }
}