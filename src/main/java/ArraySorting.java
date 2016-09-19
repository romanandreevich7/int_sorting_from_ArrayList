import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by roman on 9/19/16.
 */
public class ArraySorting {
        public static void main(String[] args) throws Exception
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            ArrayList<Integer> intArrayList = new ArrayList<Integer>();
            ArrayList<Integer> intArrayList1 = new ArrayList<Integer>();

            for (int i = 0; i < 5; i++)
            {
                intArrayList.add(Integer.parseInt(reader.readLine()));

            }

            for (int j = 0; j < 5; j++)
            {
                Object objMin = Collections.min(intArrayList);
                int indexToDelete = intArrayList.indexOf(objMin);
                intArrayList1.add((Integer)objMin);
                intArrayList.remove(indexToDelete);

            }

            System.out.println(intArrayList1);

        }
    }


