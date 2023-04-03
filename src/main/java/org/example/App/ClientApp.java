package org.example.App;

import org.example.Buttons.Button;
import org.example.Checkboxes.Checkbox;
import org.example.factories.GUIFactory;

public class ClientApp {
    private Button button;
    private Checkbox checkbox;

    public ClientApp(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }
    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
