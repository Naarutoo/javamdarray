public class sum {
    public static void main( String[] args ) {
        int arr[] = {3,5,2,5,6,8,7};
        int sum =0;
        for (int i=0;i<arr.length;i++){
            if (i%2==0)
                sum+= arr[i];
        }
        System.out.println(sum);
    }
}
