package factory;

import buttons.Button;
import buttons.MacOSButton;

public class MacOSDialog extends Dialog {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}
