package homework_7.AnimalRefactored;

public class Hamster extends Domestic {
    public Hamster(int age, int weight, String color, String name) {
        super(age, weight, color, name);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.print(" I live in the cage");
    }

    @Override
    public void info() {
        super.info();
    }
}