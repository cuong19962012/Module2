package ss11_stack_and_queue.mvc.view;


import ss11_stack_and_queue.mvc.controller.PersonController;

public class Main {
    public static void main(String[] args) {
        PersonController personController = new PersonController();
        personController.showMenu();
    }
}
