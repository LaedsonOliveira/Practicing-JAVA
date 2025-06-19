package toDoList;

import java.time.LocalDate;
import java.util.Scanner;

public class MainToDoList {
    public static void main(String[] args) {

        TaskList taskList = new TaskList();
        LocalDate dateNow = LocalDate.now();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n \n \nToDoList, " + dateNow);
        System.out.println("Your task list is currently empty! \n \nAdd news task! \n");

        boolean program = true;
        while (program){
            System.out.println("Choose the option: \n 1 - Create Task \n 2 - Get Task List \n 3 - Search Task \n 4 - Delete Task");
            int act = scanner.nextInt();

            switch (act){

                case 1:
                    System.out.println("Write the title of task:");
                    String title = scanner.nextLine();
                    System.out.println("Write the description of task:");
                    String description = scanner.nextLine();
                    System.out.println("Choose the importance of task: (t) - true (f) - false");
                    boolean importance = ;
                    taskList.createTask(title, description, dateNow, importance);
                    break;

                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Value, try again!");
            }
            break;
        }



    }
}
