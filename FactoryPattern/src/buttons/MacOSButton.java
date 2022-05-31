package buttons;

public class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("I am a Mac OS button");
    }

    @Override
    public void onClick() {
        System.out.println("Mac is the best!");
    }
}

