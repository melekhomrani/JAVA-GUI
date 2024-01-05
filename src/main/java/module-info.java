module tn.esprit.gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens tn.esprit.gui to javafx.fxml;
    exports tn.esprit.gui;
}