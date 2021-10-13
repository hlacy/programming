module com.example.intellij_progs {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intellij_progs to javafx.fxml;
    exports com.example.intellij_progs;
}