package furuma_resort.view;

import furuma_resort.controller.Controller;
import furuma_resort.repository.imp.EmployeeRepository;

public class View {

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.showMenu();
    }
}
