package ss11_stack_and_queue.bai_tap.mvc.view;


import ss11_stack_and_queue.bai_tap.mvc.controller.PersonController;

public class Main {
    public static void main(String[] args) {
        PersonController personController = new PersonController();
        personController.showMenu();
    }
}
