package Collection;

import java.util.Comparator;

/**
 * Created by user on 07.08.2019.
 */
public  class ComparatorLengthString implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.length()> o2.length())
            return 1;
        else if(o1.length()< o2.length())
            return -1;
        else
            return 0;
    }
}
