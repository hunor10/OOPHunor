package lab9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary{
    private ArrayList<String> words=new ArrayList<>();
    private static ArrayListDictionary instance;
    public ArrayListDictionary(){
        //Beolvasni a filebol a szavakat es elhelyezni a word taroloba
        try(Scanner scanner=new Scanner(new File(DICTIONARY_FILE))) {
        while (scanner.hasNextLine())
        {
        String line=scanner.nextLine();
        words.add(line);
        }
        }catch (FileNotFoundException e){e.printStackTrace();}
    }

    public static IDictionary newInstance() {
        if(instance==null)
            instance=new ArrayListDictionary();
        return instance;
    }

    @Override
    public boolean add(String word) {
        //csak nem letezo szot teszunk be a szotarba
        //ha binaris keresest akarunk kell rendezni a tombot
        //Collections.sort(words);- rendezi az Arraylistet abc sorrendbe
        return false;
    }

    @Override
    public boolean find(String word) {

        return Collections.binarySearch(words,word)>=0;//a binaris kereses a poziciot adja vissza, ha nem kapja akkor negativ erteket terit vissza
    }



    @Override
    public int size() {
        return words.size();
    }
}
