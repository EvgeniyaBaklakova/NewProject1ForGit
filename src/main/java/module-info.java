module com.example.newproject1forgit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.newproject1forgit to javafx.fxml;
    exports com.example.newproject1forgit;
}