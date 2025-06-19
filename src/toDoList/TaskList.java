package toDoList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class TaskList {

    private int numberTasks;
    private int numberOkTasks;
    private int numberNotTasks;

    private List<Task> listTasks = new ArrayList<>();
    private List<Task> listCompletTask = new ArrayList<>();

    public void getAllTask(){
        System.out.println("          ALL TASKS");
        if (listTasks != null) {
            for (Task task : listTasks) {
                System.out.println("+----------------------------------------------");
                System.out.println("| id: " + task.getId() + " Title: " + task.getTitle());
                System.out.println("+-----------------------------------------------");
            }
        }
        else{
            System.out.println("+----------------------------------------------");
            System.out.println("|  List empty");
            System.out.println("+-----------------------------------------------");
        }
    }

    public void getTask(int id){
        Task getTask = null;
        for (Task task : listTasks){
            if( task.getId() == id){
                getTask = task;
            }
            if (getTask != null){
                System.out.println("ID: "+ getTask.getId()+ " Title: "+ getTask.getTitle());
            }
        }
    }

    public String createTask(String title, String description, LocalDate deliveryDate, boolean importance){
        try{
            Task task = new Task(title, description, deliveryDate,importance);
            listTasks = Collections.singletonList(task);
        }catch (Exception e){
            return "Invalid information";
        }

        return "Task added successfully";

    }

    public String completeTask(int id){
        Task taskRemoved = null;
        try{
            for (Task task: listTasks){
                if(task.getId() == id){
                    taskRemoved = task;
                    break;
                }
                if (taskRemoved != null){
                    listTasks.remove(taskRemoved);
                    listCompletTask.add(taskRemoved);
                    return "Task "+ taskRemoved.getTitle()+" completed successfully";
                }
            }
        }catch (Exception e){
            return "Action failed";
        }

        return "";
    }

    public String deleteTask(int id){
        Task taskRemoved = null;
        try{
            for (Task task: listTasks){
                if(task.getId() == id){
                    taskRemoved = task;
                    break;
                }
                if (taskRemoved != null){
                    listTasks.remove(taskRemoved);
                    return "Task "+ taskRemoved.getTitle()+" removed successfully";
                }
            }
        }catch (Exception e){
            return "Action failed";
        }

        return "";
    }

}
