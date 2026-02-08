module com.example.cadastrodeusuarios {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.cadastrodeusuarios to javafx.fxml;
    exports com.example.cadastrodeusuarios;
}