import java.util.HashMap;
import java.util.Map;

public class duplicateElements {
    public static void main( String[] args ) {


        int arr[][] = {{11, 22, 33}, {10, 11, 30}, {40, 50, 11}};

        HashMap<Integer, Integer> map = new HashMap<>();
    for (int i=0;i<arr.length;i++){
        for (int j=0;j<arr.length;j++){
            if (map.containsKey(arr[i][j])){
                int count = map.get(arr[i][j]);
                map.put(arr[i][j],count +1);
            }
            else
                map.put(arr[i][j],1);
        }
    }
    int count2 =0;
    for (Map.Entry<Integer,Integer> entry : map.entrySet()){
        count2= entry.getValue();
        if (count2>1){
            System.out.println(entry.getKey());
        }
    }


    }
}
