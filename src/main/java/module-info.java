module com.example.kktea_web {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kktea_web to javafx.fxml;
    exports com.example.kktea_web;
}