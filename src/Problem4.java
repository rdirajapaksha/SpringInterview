
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rdind
 */
public class Problem4 {

    private static String getLargerNo(int[] arr) {
        String largeNo = "";
        int key = 0;
        int val = 0;

        HashMap map = new HashMap();

        for (int num : arr) {
            map.put(Integer.parseInt(String.valueOf(num).substring(0, 1)), num);
        }

        while (map.size() > 0) {

            List<Integer> keyList = new ArrayList(map.keySet());
            key = Integer.parseInt(Collections.max(keyList).toString());
            val = Integer.parseInt(map.get(key).toString());
            largeNo += val;
            map.remove(key);
        }

        return largeNo;
    }

    public static void main(String[] args) {

        int[] arr = {50, 2, 1, 9};
        String largeNo = getLargerNo(arr);

        System.out.println("Large No : " + largeNo);
    }
}
