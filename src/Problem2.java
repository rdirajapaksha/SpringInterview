
import java.util.ArrayList;
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
public class Problem2 {

    private static List<String> combineLists(String[] list1, String[] list2) {

        List<String> AllList = new ArrayList<String>();
        List<String> mergedList = new ArrayList<String>();

        for (String val : list1) {
            AllList.add(val);
        }
        for (String val : list2) {
            AllList.add(val);
        }

        for (int i = 0; i < AllList.size(); i++) {

            if (i < list1.length) {
                mergedList.add(AllList.get(i));
                mergedList.add(AllList.get(i + list1.length));
            }

        }

        return mergedList;
    }

    public static void main(String[] args) {
        String[] list1 = {"a", "b", "c"};
        String[] list2 = {"1", "2", "3"};

        List<String> mergedList = combineLists(list1, list2);

        System.out.println("Merged List : " + mergedList);

    }
}
