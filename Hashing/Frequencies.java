
import java.util.*;


class Frequencies
{
    public static void main(String[] args) 
    {
        int[] arr = {10,20,20,30,10};
        Map<Integer, Integer> map = new HashMap<>();
        for(int a: arr)
        {
            if(map.contains(a))
            {
                int key = map.getKey(a);
                int value = map.getValue(key);
                map.put(key, value++);
            }
            else
            {
                map.put(a, 1);
            }
        }
        System.out.println(map);
    }
}
