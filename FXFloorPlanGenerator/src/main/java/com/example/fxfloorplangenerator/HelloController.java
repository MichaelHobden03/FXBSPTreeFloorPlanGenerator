package com.example.fxfloorplangenerator;

import com.idrsolutions.image.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import org.jpedal.examples.viewer.Commands;
import org.jpedal.examples.viewer.Viewer;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome To Michaels JFX App");
    }

    @FXML
    private Pane paneImageArea;

    @FXML
    private Pane ImagePane;
    @FXML
    private ImageView ImageViewArea;
    @FXML
    private TextField tfTotalSize;

    @FXML
    void generateLayout(ActionEvent event) throws IOException {
        Main main = new Main();
        main.main(Integer.parseInt(tfTotalSize.getText()),Integer.parseInt(tfMaxRoomSize.getText()), Integer.parseInt(tfMinRoomSize.getText()));
        BufferedImage img = null;
        img = ImageIO.read(new File("Converted_Image.jpg"));
        Image image = convertToFxImage(img);
        ImageViewArea.setImage(image);

    }
    private static Image convertToFxImage(BufferedImage image) {
        WritableImage wr = null;
        if (image != null) {
            wr = new WritableImage(image.getWidth(), image.getHeight());
            PixelWriter pw = wr.getPixelWriter();
            for (int x = 0; x < image.getWidth(); x++) {
                for (int y = 0; y < image.getHeight(); y++) {
                    pw.setArgb(x, y, image.getRGB(x, y));
                }
            }
        }

        return new ImageView(wr).getImage();
    }



};



