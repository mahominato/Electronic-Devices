package com.example.demodevice;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.demodevice.Devicetype;

public class HelloController {

    @FXML
    private RadioButton rbLaptop;

    @FXML
    private RadioButton rbSmartphone;

    @FXML
    private RadioButton rbTablet;

    @FXML
    private TextField textName;

    @FXML
    private TextField textPrice;

    @FXML
    private TextField textWeight;

    @FXML
    private TextField textResolution;

    @FXML
    private TextField textSize;

    @FXML
    private ListView<Device> listView;

    @FXML
    private Label label;

    @FXML
    private Button addButton;

    @FXML
    private Button removeButton;

    @FXML
    private ToggleGroup deviceGroup;

    private final ObservableList<Device> devices = FXCollections.observableArrayList();

    public HelloController() {
    }

    @FXML
    public void initialize() {
        listView.setItems(devices);
    }

    @FXML
    public void onAddClick(ActionEvent event) {
        try {
            String name = textName.getText();
            double price = Double.parseDouble(textPrice.getText());
            double weight = Double.parseDouble(textWeight.getText());

            if (rbSmartphone.isSelected()) {
                int resolution = Integer.parseInt(textResolution.getText());
                int size = Integer.parseInt(textSize.getText());

                Smartphone sm = new Smartphone(Devicetype.SMARTPHONE, name, price, weight, size, resolution);
                devices.add(sm);

            } else if (rbLaptop.isSelected()) {
                int ramSize = Integer.parseInt(textResolution.getText());
                String processorType = textSize.getText();

                Laptop laptop = new Laptop(Devicetype.LAPTOP, name, price, weight, ramSize, processorType);
                devices.add(laptop);

            } else if (rbTablet.isSelected()) {
                int resolution = Integer.parseInt(textResolution.getText());
                int size = Integer.parseInt(textSize.getText());

                Tablet tablet = new Tablet(Devicetype.TABLET, name, price, weight, size, resolution);
                devices.add(tablet);
            }
        } catch (NumberFormatException e) {
            label.setText("Number Format Exception.");
        }
    }

    @FXML
    public void onListClicked() {
        int id = listView.getSelectionModel().getSelectedIndex();
        if (id >= 0) {
            label.setText(devices.get(id).toString());
        }
    }

    @FXML
    public void onRemoveClick() {
        int id = listView.getSelectionModel().getSelectedIndex();
        if (id >= 0) {
            label.setText(devices.get(id).getName() + " deleted.");
            devices.remove(id);
        }
    }

    public Button getAddButton() {
        return addButton;
    }

    public void setAddButton(Button addButton) {
        this.addButton = addButton;
    }

    public Button getRemoveButton() {
        return removeButton;
    }

    public void setRemoveButton(Button removeButton) {
        this.removeButton = removeButton;
    }

    public ToggleGroup getDeviceGroup() {
        return deviceGroup;
    }

    public void setDeviceGroup(ToggleGroup deviceGroup) {
        this.deviceGroup = deviceGroup;
    }
}
