class Task {


    private String taskId;
    private String taskName;
    private String status;



    public Task(String taskId,
                String taskName,
                String status) {

        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }



    public String getTaskId() {

        return taskId;
    }



    @Override
    public String toString() {

        return "Task[" + taskId + "] "
                + taskName
                + " (" + status + ")";
    }
}




public class TaskManagement {



    // Node class for Linked List

    private static class Node {


        Task task;

        Node next;



        Node(Task task) {

            this.task = task;
        }
    }




    private Node head;




    // Add Task

    public void add(Task task) {


        Node newNode = new Node(task);



        if (head == null) {

            head = newNode;

            return;
        }




        Node temp = head;



        while (temp.next != null) {

            temp = temp.next;
        }



        temp.next = newNode;

    }






    // Search Task

    public Task search(String taskId) {


        Node temp = head;



        while (temp != null) {



            if (temp.task.getTaskId().equals(taskId)) {


                return temp.task;
            }


            temp = temp.next;

        }



        return null;
    }







    // Traverse Tasks

    public void traverse() {


        Node temp = head;



        while (temp != null) {


            System.out.println(temp.task);


            temp = temp.next;
        }

    }







    // Delete Task

    public boolean delete(String taskId) {



        if (head == null) {

            return false;
        }





        if (head.task.getTaskId().equals(taskId)) {


            head = head.next;


            return true;
        }





        Node previous = head;

        Node current = head.next;





        while (current != null) {



            if (current.task.getTaskId().equals(taskId)) {


                previous.next = current.next;


                return true;
            }




            previous = current;

            current = current.next;

        }



        return false;

    }







    public static void main(String[] args) {



        TaskManagement manager = new TaskManagement();




        manager.add(
                new Task(
                        "TASK101",
                        "Complete Project Documentation",
                        "Completed"
                )
        );



        manager.add(
                new Task(
                        "TASK102",
                        "Develop Login Module",
                        "In Progress"
                )
        );



        manager.add(
                new Task(
                        "TASK103",
                        "Test Application",
                        "Pending"
                )
        );





        System.out.println("Current Task List");


        manager.traverse();






        System.out.println("\nSearching for TASK102:");

        System.out.println(
                manager.search("TASK102")
        );






        System.out.println("\nDeleting TASK101...");


        manager.delete("TASK101");



        System.out.println("\nUpdated Task List");


        manager.traverse();

    }
}