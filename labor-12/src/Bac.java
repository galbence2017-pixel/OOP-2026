import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bac {
    private Map<Integer, Student> students=new HashMap<>();

    public Bac(String filename) {
        try {
            Scanner scanner=new Scanner(new File(filename));
            while (scanner.hasNextLine()){
                String[] items=scanner.nextLine().split(" ");
                int id =Integer.parseInt(items[0]);
                String fn=items[1];
                String ln=items[2];
                students.put(id, new Student(id, fn, ln));
            }
            System.out.println("Erettsegizok szama: " + students.size());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readGrade(String tn){
        try {
            Scanner scanner=new Scanner(new File(tn+".txt"));
            while (scanner.hasNextLine()){
                String[] items=scanner.nextLine().split(" ");
                int id =Integer.parseInt(items[0]);
                double jegy =Double.parseDouble(items[1]);
                Student s=students.get(id);
                if(s==null){
                    System.out.println("nincs ilyen azonositoju diak");
                }
                s.addGrade(tn, jegy);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void computeAverage(){
        for(Integer id : students.keySet()){
            students.get(id).computeAverage();
        }
    }

    public int numPass(){
        int n=0;
        for (Integer id: students.keySet()){
            if(students.get(id).getAverage()!=0){
                n++;
            }
        }
        return n;
    }

}
