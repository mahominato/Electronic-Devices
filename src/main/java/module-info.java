module org.example.demodevice {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.demodevice to javafx.fxml;
    exports org.example.demodevice;
    exports com.example.demodevice;
    opens com.example.demodevice to javafx.fxml;
}