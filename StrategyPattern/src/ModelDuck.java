public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehaviour = new DoesNotFly();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
