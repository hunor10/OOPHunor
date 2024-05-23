package lab9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryService {
    private IDictionary dictionary;
    public DictionaryService(DictionaryType dtype){
        dictionary=DictionaryProvider.createDictionary(dtype);
    }
     boolean findWord(String word){
        return dictionary.find(word);
    }
    ArrayList<String> findWordsFile(String file){
        ArrayList<String> unknownWords=new ArrayList<>();
        try(Scanner scanner=new Scanner(new File(file))) {
            while (scanner.hasNextLine())
            {
                String line=scanner.nextLine();
                unknownWords.add(line);
            }
        }catch (FileNotFoundException e){e.printStackTrace();}
        ArrayList<String> unknownWordsInDictionary=new ArrayList<>();
        for(String word:unknownWords){
            if(!findWord(word))
                unknownWordsInDictionary.add(word);
        }
        return unknownWordsInDictionary;
    }

}
