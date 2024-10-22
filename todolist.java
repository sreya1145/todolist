import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("Enter a command (add/view/remove/exit): ");
            command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.println("Enter task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    break;
                case "view":
                    System.out.println("Tasks: " + tasks);
                    break;
                case "remove":
                    System.out.println("Enter task number to remove: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
            }
        } while (!command.equals("exit"));
    }
}
