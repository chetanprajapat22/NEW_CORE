package in.co.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class OrderByMarksDesc implements Comparator<Marksheet> {
    @Override
    public int compare(Marksheet m1, Marksheet m2) {
        if (m1.marks> m2.marks){
            return -1;
        } else if (m1.marks== m2.marks) {

            return 0;
        }else {
            return 1;
        }
    }
}
