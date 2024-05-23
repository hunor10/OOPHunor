package lab9_2;

import java.util.ArrayList;

public interface IDictionary {
    static final String DICTIONARY_FILE="dic.txt";
    boolean add(String word);
    boolean find(String word);

    int size();
}
