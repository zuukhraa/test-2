package ru.itis.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import ru.itis.helper.HttpClientParse;

public class AppController {
    @FXML
    private TextField bus;

    @FXML
    private Text text;

    //может не запуститься, так как ссылка не всегда работает
    private final String url = "https://data.kzn.ru:8082/api/v0/dynamic_datasets/bus/";

    @FXML
    void getData(ActionEvent event)  {
        HttpClientParse httpClientParse = new HttpClientParse();
        text.setText(httpClientParse.getTimeBus(url));
    }
}


