import java.util.HashMap;
import java.util.Map;

public class Student {
    private int id;
    private String fName;
    private String lName;
    private Map<String,Double> grades;
    private double average;

    public Student(int id, String fname, String lname) {
        this.id = id;
        fName = fname;
        lName = lname;
        grades=new HashMap<>();
    }

    public void addGrade(String subject, double grade){
        grades.put(subject, grade);
    }

    public double getGrades(String subject){
        Double grade=grades.get(subject);
        if(grade==null){
            throw new RuntimeException("nem letezo tantargy");
        }
        return grade;
    }

    public void computeAverage(){
        double avg=0;
        for(String i: grades.keySet()){
            double grade=grades.get(i);
            if(grade<5){
                return;
            }
            avg+=grade;
        }
        avg=avg/grades.size();
        if (avg < 6) {
            return;
        }
        this.average=avg;
    }

    public double getAverage() {
        return average;
    }

    public int getId() {
        return id;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", grades=" + grades +
                ", average=" + average +
                '}';
    }
}
