module com.example.naughtsandcrosses {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.naughtsandcrosses to javafx.fxml;
    exports com.example.naughtsandcrosses;
}