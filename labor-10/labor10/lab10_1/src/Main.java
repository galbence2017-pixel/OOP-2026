public class Main {
    public static void main(String[] args){
        StringDemo s = new StringDemo("fruits.txt");
        System.out.println("a beolvasott gyumolcsok:");
        s.printFruits();
        System.out.println("Alphabetikusan rendezve: ");
        s.sortAlphabetically();
        s.printFruits();
        System.out.println("Alphabetikusan rendezve: ");
        s.sortReversAlphabetically();
        s.printFruits();
    }
}