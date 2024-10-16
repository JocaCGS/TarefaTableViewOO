package com.colini.controllers;

import com.colini.models.Pessoa;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

public class tableViewController {

    @FXML
    private Pane PaneTela;

    @FXML
    private TableView<Pessoa> TbVTELAPRINCIPAL;

    @FXML
    private TableColumn<Pessoa, Integer> TbVid;
    
    @FXML
    private TableColumn<Pessoa, Integer> TbVidade;

    @FXML
    private TableColumn<Pessoa, String> TbVnome;
    
    
    public void initialize() {
        
        TbVid.setCellValueFactory(new PropertyValueFactory<>("id"));
        TbVidade.setCellValueFactory(new PropertyValueFactory<>("idade"));
        TbVnome.setCellValueFactory(new PropertyValueFactory<>("nome"));

        ObservableList<Pessoa> listadePessoas = FXCollections.observableArrayList();
        
        TbVTELAPRINCIPAL.setItems(listadePessoas);

        listadePessoas.add(new Pessoa("João", 25, 1));
        listadePessoas.add(new Pessoa("Maria", 30, 2));
        listadePessoas.add(new Pessoa("Ana", 22, 3));
        listadePessoas.add(new Pessoa("Carlos", 35, 4));
        listadePessoas.add(new Pessoa("Beatriz", 28, 5));
        listadePessoas.add(new Pessoa("Diego", 40, 6));
        listadePessoas.add(new Pessoa("Fernanda", 31, 7));


        //Obrigado GPT por me ajudar com esse observableList e como settar os dados na tableview =^w^=


    }



}
