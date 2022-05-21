public class DuckSimulator {
    public static void main(String[] args) {
//        Mallard Duck
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.setQuackBehavior(new MuteQuack());
        mallard.performQuack();

//        Model Duck
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
