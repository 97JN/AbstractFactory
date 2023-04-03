package org.example.factories;

import org.example.Buttons.Button;
import org.example.Checkboxes.Checkbox;

//abstract factory
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
