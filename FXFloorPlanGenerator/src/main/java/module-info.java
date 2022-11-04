module com.example.fxfloorplangenerator {
    requires javafx.controls;
    requires javafx.fxml;
    requires aspose.cad;
    requires jdxf;

    requires java.desktop;
    requires com.idrsolutions.jpedal;
    requires aspose.pdf;


    opens com.example.fxfloorplangenerator to javafx.fxml;
    exports com.example.fxfloorplangenerator;
}