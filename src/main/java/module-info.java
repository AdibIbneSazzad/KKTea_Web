module com.example.kktea_web {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.kktea_web to javafx.fxml;
    opens com.example.kktea_web.ayesha_2531729 to javafx.fxml, javafx.base;

    exports com.example.kktea_web;
}