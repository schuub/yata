package yata;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label versionInfo;
    public Label lbTimer;
    public Button btnStart;
    public Button btnSkip;

    public void initialize() {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        versionInfo.setText("Willkommen, JavaFX " + javafxVersion + "\nRunning on Java " + javaVersion + ".");
        lbTimer.setText("00:00");
    }
    
    public void handleStartClick() {
    	System.out.println("Timer started");
    }
    public void handleSkipClick() {
    	System.out.println("Phase skipped");
    }
}
