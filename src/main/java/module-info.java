module williamcsc325.colorchooserchallenge {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens williamcsc325.colorchooserchallenge to javafx.fxml;
    exports williamcsc325.colorchooserchallenge;
}