package org.example.factories;

import org.example.Buttons.Button;
import org.example.Buttons.WindowsButton;
import org.example.Checkboxes.Checkbox;
import org.example.Checkboxes.WindowsCheckbox;

//specific factory
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton(){
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
