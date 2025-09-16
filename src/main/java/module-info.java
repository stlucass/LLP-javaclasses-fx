module org.example.javaclassesfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens org.example.javaclassesfx to javafx.fxml;
    exports org.example.javaclassesfx;
}