package lab9_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DictionaryService service =
                new DictionaryService(DictionaryType.ARRAY_LIST);
        System.out.println("Unknown words from a file: ");
        System.out.println( service.findWordsFile( "words.txt"));

    }
}
