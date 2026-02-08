module com.example.cantinajavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cantinajavafx to javafx.fxml;
    exports com.example.cantinajavafx;
}