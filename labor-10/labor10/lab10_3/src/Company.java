import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String Name;
    ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name) {
        Name = name;
    }

    public void hireAll(String Filename){
        try {
            Scanner scanner = new Scanner(new File(Filename));
            while(scanner.hasNextLine()){
                String line= scanner.nextLine();
                String[] items=line.split(",");
                String firstName=items[0].trim();
                String lastName=items[1].trim();
                double salary =Double.parseDouble(items[2].trim());
                int birthYear = Integer.parseInt(items[3].trim());
                if(items.length==4){
                    employees.add(new Employee(firstName, lastName, salary, birthYear));
                }else{
                    employees.add(new Manager(firstName, lastName, salary, birthYear, items[4].trim()));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void printAll(){
        for(Employee e: employees){
            System.out.println(e);
        }
    }

    public void printAlltoFile(String filename){
        try {
            PrintStream ps = new PrintStream(filename);
            for(Employee e: employees){
                ps.print(e.getFirstName()+", "+e.getLastName()+", "+ e.getSalary()+", "+e.getBirthYear());
                if(e instanceof Manager){
                    ps.println(", "+((Manager) e).getDepartment());
                }else{
                    ps.println();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printEmploye(){
        for(Employee e: employees){
            if(e.getClass()==Employee.class){
                System.out.println(e);
            }
        }
    }

    public void printMannager(){
        for(Employee e: employees){
            if(e instanceof Manager){
                System.out.println(e);
            }
        }
    }

    public void hire(Employee e){
        employees.add(e);
    }

    public void fire(int id){
        for(Employee e: employees){
            if(e.getID()==id){
                employees.remove(e);
            }
        }
    }


    public void sortByComparator(Comparator<Employee> comparator) {
        Collections.sort(employees, comparator);
    }
}
