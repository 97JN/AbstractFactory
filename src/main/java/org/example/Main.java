package org.example;

import org.example.App.ClientApp;
import org.example.factories.GUIFactory;
import org.example.factories.MacOSFactory;
import org.example.factories.WindowsFactory;

//MacOS variant checkbox
public class Main {
    public static ClientApp configureApplication(){
        ClientApp clientApp;
        GUIFactory guiFactory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            guiFactory = new MacOSFactory();
        } else {
            guiFactory = new WindowsFactory();
        }
        clientApp = new ClientApp(guiFactory);
        return clientApp;
    }
    public static void main(String[] args) {
        ClientApp clientApp = configureApplication();
        clientApp.paint();
    }
}