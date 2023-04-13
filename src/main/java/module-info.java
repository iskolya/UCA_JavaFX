module uca.org.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens uca.org.javafx to javafx.fxml;
    exports uca.org.javafx;
    opens uca.org.javafx.tipCalculator to javafx.fxml;
    exports uca.org.javafx.tipCalculator;

}