package ss7_adstract_class_and_interface.thuc_hanh.animal_and_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }
    public String howToEat(){
        return "Could be fried";
    }
}
