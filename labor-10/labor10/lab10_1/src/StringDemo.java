import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class StringDemo {
    private ArrayList<String>  fruits = new ArrayList<>();

    public StringDemo(String Filename) {
        try {
            Scanner scanner = new Scanner(new File(Filename));
            while(scanner.hasNext()){
                String fruit= scanner.next().trim();
                fruits.add(fruit);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printFruits(){
        System.out.println(fruits);
    }

    public void sortAlphabetically(){
        Collections.sort(fruits);
    }

    public void sortReversAlphabetically(){
        Collections.sort(fruits, Collections.reverseOrder());
    }
}
