module com.example.project9 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.project9 to javafx.fxml;
    exports com.example.project9;
}