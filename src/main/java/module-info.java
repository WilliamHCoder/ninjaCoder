module com.ninjacoders.ninjacoder {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.ninjacoders.ninjacoder to javafx.fxml;
    exports com.ninjacoders.ninjacoder;
}
