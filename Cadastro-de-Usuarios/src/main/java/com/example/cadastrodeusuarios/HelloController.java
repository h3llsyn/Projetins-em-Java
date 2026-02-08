package com.example.cadastrodeusuarios;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private TextField input;
    @FXML
    private ListView<String> listViewUsuarios;
    @FXML
    private AnchorPane container;

    @FXML
    public void initialize() {
        container.requestFocus();
    }

    @FXML
    private void cadastrarUsuario() {
        String nomeUsuario = input.getText();
        if (nomeUsuario.length() >= 2 || listViewUsuarios.contains(nomeUsuario)) {
            listViewUsuarios.getItems().add(nomeUsuario);
        }
    }
}

//input
//cadastrarButton
//listViewUsuarios