module com.example.github_javafx_test {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.github_javafx_test to javafx.fxml;
    exports com.example.github_javafx_test;
}