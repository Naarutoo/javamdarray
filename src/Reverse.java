public class Reverse {
    public static void main( String[] args ) {
        int A[][] = {{11, 22, 33},
                     {10, 20, 30},
                     {40, 50, 60}};

 for (int i=A.length-1;i>=0;i--) {
     for (int j = A.length - 1; j >= 0; j--) {
         System.out.print(A[i][j]+" ");
     }
     System.out.println();
 }
 }
}