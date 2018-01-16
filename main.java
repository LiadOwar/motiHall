import com.sun.javafx.binding.StringFormatter;

import java.util.Random;

/**
 * Created by liad on 17/01/2018.
 */
public class main {
    public static void main(String[] args) {
        int numOfRuns = 10;
        int numGroup1FirstAttampt = 0;
        int numGroup2FirstAttampt = 0;
        for (int gameRunNum = 0 ; gameRunNum < numOfRuns ; ++gameRunNum) {

            Boolean[] curtains = new Boolean[3];
            Random rand = new Random();

            int car = rand.nextInt(3) + 0;
            for (int i = 0; i < 3; ++i) {
                if (i != car) {
                    curtains[i] = false;
                } else {
                    curtains[i] = true;
                }

            }
            for (int i = 0 ; i < 3 ; ++i ) {
                System.out.print("[" + curtains[i] + "]");
            }

            int group1 =rand.nextInt(3) + 0;
            int group2 = rand.nextInt(3) + 0;
            if (curtains[group1] == true) {
                numGroup1FirstAttampt++;
            }
            if (curtains[group2] == true) {
                numGroup2FirstAttampt++;
            }
            System.out.format("\tgroup1 choose [%s] [%s] \t group2 choose [%s] [%s]" , group1, curtains[group1],
                    group2, curtains[group2]);
            System.out.print("\n");
        }
        System.out.format("\tgroup1found car [%s] times, group2 dound car [%s] times" ,
                numGroup1FirstAttampt, numGroup2FirstAttampt);
    }
}
