public  class Main{
    public static void main(String[] args){
//        Student en =new Student(1, "Gal", "Bence");
//        en.addGrade("roman", 7.15);
//        en.addGrade("magyar", 8.40);
//        en.addGrade("roman", 9.05);
//        en.computeAverage();
//        System.out.printf("%6.2f", en.getAverage());
//
//        Student s1 =new Student(2, "Kis", "Pista");
//        s1.addGrade("roman", 7.15);
//        s1.addGrade("magyar", 8.40);
//        s1.addGrade("roman", 4.5);
//        s1.computeAverage();
//        System.out.printf("%6.2f",s1.getAverage());
//
//        Student s2 =new Student(3, "Nagy", "Anna");
//        s2.addGrade("roman", 5.30);
//        s2.addGrade("magyar", 6);
//        s2.addGrade("roman", 5);
//        s2.computeAverage();
//        System.out.printf("%6.2f",s2.getAverage());
//
        Bac bac = new Bac("nevek1.txt");
        System.out.println(bac.numPass());
        bac.readGrade("matek");
        bac.readGrade("roman");
        bac.readGrade("magyar");
        bac.computeAverage();
        System.out.println(bac.numPass());
    }
}