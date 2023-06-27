public class StudentManager {
    public static void main(String[] args) {
        String[] options = {"Add new student", "Search a student", "Update name and mark", "Remove a student", "List all", "Quit"};
        int choice = 0;
        StudentList list = new StudentList();
        do {
            System.out.println("\nStudent managing Program");
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    list.AddStudent();
                    break;
                case 2:
                    list.searchStudent();
                    break;
                case 3:
                    list.UpdateStudent();
                    break;
                case 4:
                    list.removeStudent();
                    break;
                case 5:
                    list.printAll();
                    break;    
                default:
                    System.out.println("Bye!");
                    break;
            }
        } while (choice > 0 && choice < 6);
    }
}