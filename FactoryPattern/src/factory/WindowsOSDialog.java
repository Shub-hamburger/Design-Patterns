package factory;

import buttons.Button;
import buttons.WindowsOSButton;

public class WindowsOSDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsOSButton();
    }
}
