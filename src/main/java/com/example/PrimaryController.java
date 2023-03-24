package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PrimaryController {

    @FXML 
    private TextField textField;

    @FXML 
    private Text savedNumbers;

    private String firstNumber = "";
    private String currentNumber = "";

    private String calculationType;

  
    @FXML 
    void button0Clicked(ActionEvent event) {
        addNumber("0");
    }
    @FXML 
    void button1Clicked(ActionEvent event) {
        addNumber("1");
    }
    @FXML 
    void button2Clicked(ActionEvent event) {
        addNumber("2");
    }
    @FXML 
    void button3Clicked(ActionEvent event) {
        addNumber("3");
    }
    @FXML 
    void button4Clicked(ActionEvent event) {
       addNumber("4");
    }
    @FXML 
    void button5Clicked(ActionEvent event) {
        addNumber("5");
    }
    @FXML 
    void button6Clicked(ActionEvent event) {
        addNumber("6");
    }
    @FXML 
    void button7Clicked(ActionEvent event) {
        addNumber("7");
    }
    @FXML 
    void button8Clicked(ActionEvent event) {
       addNumber("8");
    }
    @FXML 
    void button9Clicked(ActionEvent event) {
        addNumber("9");
    }

    @FXML 
    void addAction(ActionEvent event) {
        calculationSetup("+");
    }

    @FXML 
    void minusAction(ActionEvent event) {
        calculationSetup("-");
    }   
    
    @FXML 
    void divideAction(ActionEvent event) {
        calculationSetup("/");
    }

    @FXML 
    void multiplicationAction(ActionEvent event) {
        calculationSetup("*");
    }


    public void updateTextField() {
        textField.setText(currentNumber);
    }

    public void addNumber(String number) {
        currentNumber += number;
        updateTextField();
    }

    public void calculationSetup(String calculationType){
        this.calculationType = calculationType;
        firstNumber = currentNumber;
        currentNumber = "";
    }


    @FXML 
    void clearTextField(ActionEvent event) {
        currentNumber = "";
        textField.setText("");
        savedNumbers.setText("");
    }

    @FXML 
    void calculate(ActionEvent event) {
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(currentNumber);

        switch(calculationType) {
            case "+":
              int calculatedNumber1 = firstNumberInt + secondNumberInt;
              textField.setText(String.valueOf(calculatedNumber1));

              String save1 = firstNumber + " + " + currentNumber + " = " + calculatedNumber1;
              savedNumbers.setText(save1);

              currentNumber = String.valueOf(calculatedNumber1);

              break;
            case "-":
              int calculatedNumber2 = firstNumberInt - secondNumberInt;
              textField.setText(String.valueOf(calculatedNumber2));

              String save2 = firstNumber + " - " + currentNumber + " = " + calculatedNumber2;
              savedNumbers.setText(save2);

              currentNumber = String.valueOf(calculatedNumber2);
              break;
            case "/":
              double calculatedNumber3 = firstNumberInt / (double) secondNumberInt;
              textField.setText(String.valueOf(calculatedNumber3));

              String save3 = firstNumber + " / " + currentNumber + " = " + calculatedNumber3;
              savedNumbers.setText(save3);

              currentNumber = String.valueOf(calculatedNumber3);
              break;
            case "*":
              int calculatedNumber4 = firstNumberInt * secondNumberInt;
              textField.setText(String.valueOf(calculatedNumber4));

              String save4 = firstNumber + " * " + currentNumber + " = " + calculatedNumber4;
              savedNumbers.setText(save4);


              currentNumber = String.valueOf(calculatedNumber4);
              break;
        }

    }



}
