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
    private int contadorId;

    private List<Task> listTasks = new ArrayList<>();
    private List<Task> listCompletTask = new ArrayList<>();

    public void getAllTask(){
        System.out.println("         TASKS");
        System.out.println("+----------------------------------------------");
        if (listTasks != null) {
            for (Task task : listTasks) {
                System.out.println("| id: " + task.getId() + " Title: " + task.getTitle() + " Delivery: " + task.getDeliveryDate());
                System.out.println("+-----------------------------------------------");
            }
        }
        else{
            System.out.println("+----------------------------------------------");
            System.out.println("|  List empty");
            System.out.println("+-----------------------------------------------");
        }
    }

    public String getTask(int id){
        Task getTask = null;
        for (Task task : listTasks){
            if( task.getId() == id){
                getTask = task;
            }
            if (getTask != null){
                return ("ID: "+ getTask.getId()+ " Title: "+ getTask.getTitle() + " Delivery: " + task.getDeliveryDate());
            }
        }
        return "";
    }

    public String createTask(String title, String description, LocalDate deliveryDate, int term){
        try{
            contadorId++;
            LocalDate dateDeliveryTask = deliveryDate.plusDays(term);
            Task task = new Task(title, description, dateDeliveryTask, contadorId);
            listTasks.add(task);
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
                }
                if (taskRemoved != null){
                    listTasks.remove(taskRemoved);
                    return "Task "+ taskRemoved.getTitle()+" removed successfully";
                } else{
                    return "Invalid ID, try again";
                }
            }
        }catch (Exception e){
            return "Action failed";
        }

        return "";
    }

}
