import java.util.Comparator;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args){

        Company company =new Company("Szapiencia");
        company.hireAll("employees.csv");
        System.out.println();
        company.printAll();
        company.printAlltoFile("dolgozok.csv");
        System.out.println();
        company.printEmploye();
        System.out.println();
        company.printMannager();

        System.out.println("Alphabetically: ");
        company.sortByComparator(new Comparator<Employee>() {

            public int compare(Employee o1, Employee o2) {
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        });
        company.printAll();

    }
}