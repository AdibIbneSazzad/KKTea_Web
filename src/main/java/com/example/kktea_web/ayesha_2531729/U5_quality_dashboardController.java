package com.example.kktea_web.ayesha_2531729;

import com.example.kktea_web.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class U5_quality_dashboardController {
    @javafx.fxml.FXML
    private MenuBar mainBorderPane;
    @javafx.fxml.FXML
    private BorderPane u5QualityDashboardBorderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void openLogOutOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openAuditFinidingsOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openStageQualityCheckOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openQualityReportsOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void OpenAuditPreparationOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openOrganicComplianceOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openCertificationOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openFinishedTeaVerificationOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openLeafQualityCheckOA(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/example/kktea_web/ayesha_2531729/U5G1_LeafQualityCheck.fxml"));
            u5QualityDashboardBorderPane.setCenter(fxmlLoader.load());
        } catch (IOException e) {
        }
    }
}