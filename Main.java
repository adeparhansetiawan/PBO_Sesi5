public class Main {
    public static void main(String[] args) {
        
        // 1. Test Student
        Student s = new Student("Budi", "Jakarta");
        s.addCourseGrade("Math", 80);
        s.addCourseGrade("English", 90);
        
        System.out.println(s.toString()); // Menampilkan nama & alamat
        s.printGrades();
        System.out.println("Average: " + s.getAverageGrade());
        
        System.out.println(); // Spasi antar output
        
        // 2. Test Teacher
        Teacher t = new Teacher("Pak Andi", "Bandung");
        System.out.println("Teacher: " + t.getName());
        
        // Mencoba tambah kursus
        System.out.println("Add Math: " + t.addCourse("Math"));    // Harus true
        System.out.println("Add Math again: " + t.addCourse("Math")); // Harus false (karena sudah ada)
        
        // Mencoba hapus kursus
        System.out.println("Remove Math: " + t.removeCourse("Math"));    // Harus true
        System.out.println("Remove Math again: " + t.removeCourse("Math")); // Harus false
        
        System.out.println(t.toString());
    }
}