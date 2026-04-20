import java.util.*;

public class ArrayListDictionary implements IDictionary{
    private ArrayList<String> words;

    public ArrayListDictionary() {
        Scanner scanner = new Scanner("dictionary");
        while(scanner.hasNext()) {
            String word = scanner.nextLine();
            words.add(word.trim());
        }
        scanner.close();
    }

    @Override
    public boolean add(String s) {
        if(Collections.binarySearch(words, s)>=0){
            words.add(s);
            return true;
        }
        return false;
    }

    @Override
    public boolean find(String s) {
        for(Object i : words){
            if(i==s){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return words.size();
    }
}
