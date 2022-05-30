package factories;

import buttons.Button;
import buttons.WindowsOSButton;
import checkboxes.CheckBox;
import checkboxes.WindowsOSCheckbox;

public class WindowsOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsOSCheckbox();
    }
}
