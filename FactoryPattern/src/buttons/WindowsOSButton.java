package buttons;

public class WindowsOSButton implements Button {
    @Override
    public void render() {
        System.out.println("I am a Windows OS button");
    }

    @Override
    public void onClick() {
        System.out.println("Windows is the best!");
    }
}
