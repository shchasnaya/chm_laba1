package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application implements EventHandler<ActionEvent> {
    String fun = new String("");
    TextField limitA = new TextField("A");
    TextField limitB = new TextField("B");
    TextField precisionofmethod = new TextField("eps");
    TextField enter = new TextField("Enter your function");

    Button bracket_left = new Button("(");
    Button bracket_right = new Button(")");
    Button multiplication = new Button("*");
    Button degree = new Button("^");
    Button division = new Button("/");
    Button minus = new Button("-");
    Button plus = new Button("+");
    Button nullptr = new Button("0");
    Button one = new Button("1");
    Button two = new Button("2");
    Button three = new Button("3");
    Button four = new Button("4");
    Button five = new Button("5");
    Button six = new Button("6");
    Button seven = new Button("7");
    Button eight = new Button("8");
    Button nine = new Button("9");
    Button dot = new Button(".");

    Button sin = new Button("sin");
    Button cos = new Button("cos");
    Button tan = new Button("tg");
    Button cot = new Button("ctg");

    Button ln = new Button("ln");
    Button e = new Button("e");
    Button sqrt = new Button("√");
    Button PI = new Button("π");

    Button equally = new Button(" = ");
    Button ixs = new Button("x");
    TextField out = new TextField("Result");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == one) {
            enter.appendText("1");
        }
        if (event.getSource() == two) {
            enter.appendText("2");
        }
        if (event.getSource() == three) {
            enter.appendText("3");
        }
        if (event.getSource() == four) {
            enter.appendText("4");
        }
        if (event.getSource() == five) {
            enter.appendText("5");
        }
        if (event.getSource() == six) {
            enter.appendText("6");
        }
        if (event.getSource() == seven) {
            enter.appendText("7");
        }
        if (event.getSource() == eight) {
            enter.appendText("8");
        }
        if (event.getSource() == nine) {
            enter.appendText("9");
        }
        if (event.getSource() == nullptr) {
            enter.appendText("0");
        }
        if (event.getSource() == plus) {
            enter.appendText("+");
        }
        if (event.getSource() == minus) {
            enter.appendText("-");
        }
        if (event.getSource() == multiplication) {
            enter.appendText("*");
        }
        if (event.getSource() == division) {
            enter.appendText("/");
        }
        if (event.getSource() == degree) {
            enter.appendText("^");
        }
        if (event.getSource() == dot) {
            enter.appendText(".");
        }
        if (event.getSource() == bracket_left) {
            enter.appendText("(");
        }
        if (event.getSource() == bracket_right) {
            enter.appendText(")");
        }
        if (event.getSource() == sin) {
            enter.appendText("sin");
        }
        if (event.getSource() == cos) {
            enter.appendText("cos");
        }
        if (event.getSource() == tan) {
            enter.appendText("tan");
        }
        if (event.getSource() == cot) {
            enter.appendText("ctg");
        }
        if (event.getSource() == ln) {
            enter.appendText("ln");
        }
        if (event.getSource() == sqrt) {
            enter.appendText("√");
        }
        if (event.getSource() == PI) {
            enter.appendText("π");
        }
        if (event.getSource() == e) {
            enter.appendText("e");
        }
        if (event.getSource() == ixs) {
            enter.appendText("x");
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        primaryStage.setTitle("Laboratory work № 1");

        ChoiceBox<String> methods = new ChoiceBox();
        methods.getItems().addAll("Dichotomy", "Newton`s method", "Chord method", "Method of simple iterations");
        methods.setValue("Dichotomy");

        VBox uppanel = new VBox();
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(methods, precisionofmethod, limitA, limitB);

        uppanel.setPadding(new Insets(10, 10, 20, 10));
        VBox.setMargin(enter, new Insets(0.0, 0.0, 20.0, 0.0));
        VBox.setMargin(methods, new Insets(0.0, 0.0, 20.0, 0.0));


        uppanel.getChildren().addAll(enter, hBox);

        //Scene scene=new Scene(uppanel,300,250);
        //primaryStage.setScene(scene);
        //primaryStage.show();

        root.setPadding(new Insets(10, 10, 10, 10));

        sin.setMinWidth(60);
        sin.setMinHeight(60);
        cos.setMinWidth(60);
        cos.setMinHeight(60);
        tan.setMinWidth(60);
        tan.setMinHeight(60);
        cot.setMinWidth(60);
        cot.setMinHeight(60);

        VBox trigonometry = new VBox(10, sin, cos, tan, cot);
        trigonometry.setPadding(new Insets(10, 10, 10, 10));
        //trigonometry.setMinHeight(200);
        //trigonometry.setMinWidth(70);
        //trigonometry.setPadding(new Insets(10,10,10,10));


        GridPane center = new GridPane();

        //GridPane.setMargin(center, new Insets(10,10,10,10));
        center.setHgap(5);
        center.setVgap(5);
        center.setMaxWidth(280);
        center.setMaxHeight(270);
        //center.setPadding(new Insets(10,10,10,10));
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(50);
        center.getColumnConstraints().add(column1);

        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(50);
        center.getColumnConstraints().add(column2);

        ColumnConstraints column3 = new ColumnConstraints();
        column3.setPercentWidth(50);
        center.getColumnConstraints().add(column3);

        ColumnConstraints column4 = new ColumnConstraints();
        column4.setPercentWidth(50);
        center.getColumnConstraints().add(column4);

        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(50);
        center.getRowConstraints().add(row1);

        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(50);
        center.getRowConstraints().add(row2);

        RowConstraints row3 = new RowConstraints();
        row3.setPercentHeight(50);
        center.getRowConstraints().add(row3);

        RowConstraints row4 = new RowConstraints();
        row4.setPercentHeight(50);
        center.getRowConstraints().add(row4);

        RowConstraints row5 = new RowConstraints();
        row5.setPercentHeight(50);
        center.getRowConstraints().add(row5);

        bracket_left.setMaxWidth(Double.MAX_VALUE);
        bracket_left.setMaxHeight(Double.MAX_VALUE);
        nullptr.setMaxWidth(Double.MAX_VALUE);
        nullptr.setMaxHeight(Double.MAX_VALUE);
        plus.setMaxWidth(Double.MAX_VALUE);
        plus.setMaxHeight(Double.MAX_VALUE);
        bracket_right.setMaxWidth(Double.MAX_VALUE);
        bracket_right.setMaxHeight(Double.MAX_VALUE);
        dot.setMaxWidth(Double.MAX_VALUE);
        dot.setMaxHeight(Double.MAX_VALUE);
        nine.setMaxWidth(Double.MAX_VALUE);
        nine.setMaxHeight(Double.MAX_VALUE);
        eight.setMaxWidth(Double.MAX_VALUE);
        eight.setMaxHeight(Double.MAX_VALUE);
        seven.setMaxWidth(Double.MAX_VALUE);
        seven.setMaxHeight(Double.MAX_VALUE);
        six.setMaxWidth(Double.MAX_VALUE);
        six.setMaxHeight(Double.MAX_VALUE);
        five.setMaxWidth(Double.MAX_VALUE);
        five.setMaxHeight(Double.MAX_VALUE);
        four.setMaxWidth(Double.MAX_VALUE);
        four.setMaxHeight(Double.MAX_VALUE);
        three.setMaxWidth(Double.MAX_VALUE);
        three.setMaxHeight(Double.MAX_VALUE);
        two.setMaxWidth(Double.MAX_VALUE);
        two.setMaxHeight(Double.MAX_VALUE);
        multiplication.setMaxWidth(Double.MAX_VALUE);
        multiplication.setMaxHeight(Double.MAX_VALUE);
        one.setMaxWidth(Double.MAX_VALUE);
        one.setMaxHeight(Double.MAX_VALUE);
        degree.setMaxWidth(Double.MAX_VALUE);
        degree.setMaxHeight(Double.MAX_VALUE);
        minus.setMaxWidth(Double.MAX_VALUE);
        minus.setMaxHeight(Double.MAX_VALUE);
        division.setMaxWidth(Double.MAX_VALUE);
        division.setMaxHeight(Double.MAX_VALUE);

        one.setStyle("-fx-background-color: #008C9E");
        two.setStyle("-fx-background-color : #008C9E");
        three.setStyle("-fx-background-color : #008C9E");
        four.setStyle("-fx-background-color : #008C9E");
        five.setStyle("-fx-background-color : #008C9E");
        six.setStyle("-fx-background-color : #008C9E");
        seven.setStyle("-fx-background-color : #008C9E");
        eight.setStyle("-fx-background-color : #008C9E");
        nine.setStyle("-fx-background-color : #008C9E");
        nullptr.setStyle("-fx-background-color : #008C9E");
        dot.setStyle("-fx-background-color : #008C9E");

        plus.setStyle("-fx-background-color :#00B4CC");
        minus.setStyle("-fx-background-color :#00B4CC");
        multiplication.setStyle("-fx-background-color :#00B4CC");
        division.setStyle("-fx-background-color : #00B4CC");
        degree.setStyle("-fx-background-color : #00B4CC");
        bracket_left.setStyle("-fx-background-color :#00B4CC");
        bracket_right.setStyle("-fx-background-color :  #00B4CC");


        sin.setStyle("-fx-background-color:  #00B4CC");
        cos.setStyle("-fx-background-color: #00B4CC");
        tan.setStyle("-fx-background-color:  #00B4CC");
        cot.setStyle("-fx-background-color:  #00B4CC");

        ln.setStyle("-fx-background-color:  #00B4CC");
        PI.setStyle("-fx-background-color:  #00B4CC");
        sqrt.setStyle("-fx-background-color: #00B4CC");
        e.setStyle("-fx-background-color: #00B4CC");

        methods.setStyle("-fx-background-color : #F1F2F4");
        enter.setStyle("-fx-background-color: #F1F2F4");
        out.setStyle("-fx-background-color: #F1F2F4");
        precisionofmethod.setStyle("-fx-background-color: #F1F2F4");
        limitA.setStyle("-fx-background-color: #F1F2F4");
        limitB.setStyle("-fx-background-color: #F1F2F4");

        equally.setStyle("-fx-background-color: #00DFFC");
        ixs.setStyle("-fx-background-color: #00DFFC");

        center.add(bracket_left, 0, 0);
        center.add(bracket_right, 1, 0);
        center.add(multiplication, 2, 0);
        center.add(seven, 0, 1);
        center.add(eight, 1, 1);
        center.add(nine, 2, 1);
        center.add(four, 0, 2);
        center.add(five, 1, 2);
        center.add(six, 2, 2);
        center.add(one, 0, 3);
        center.add(two, 1, 3);
        center.add(three, 2, 3);
        center.add(dot, 2, 4);
        center.add(degree, 3, 0);
        center.add(division, 3, 1);
        center.add(minus, 3, 2);
        center.add(nullptr, 0, 4, 2, 1);
        center.add(plus, 3, 3, 1, 2);

        ln.setMinWidth(60);
        ln.setMinHeight(60);
        e.setMinWidth(60);
        e.setMinHeight(60);
        sqrt.setMinWidth(60);
        sqrt.setMinHeight(60);
        PI.setMinWidth(60);
        PI.setMinHeight(60);
        VBox special = new VBox(10, ln, e, sqrt, PI);
        special.setPadding(new Insets(10, 10, 10, 10));

        HBox bottom = new HBox(15);

        //HBox.setMargin(bottom, new Insets(10,0,10,10));
        bottom.setPadding(new Insets(0, 0, 0, 10));
        out.setMinWidth(280);
        out.setMinHeight(60);
        equally.setMinHeight(60);
        equally.setMinWidth(60);
        ixs.setMinHeight(60);
        ixs.setMinWidth(60);

        bottom.getChildren().addAll(equally, out, ixs);


        root.setTop(uppanel);
        root.setRight(special);
        root.setCenter(center);
        root.setLeft(trigonometry);
        root.setBottom(bottom);
        root.setStyle("-fx-background-color: #343838");
        equally.setOnAction(e -> getMethod(methods));
        one.setOnAction(this);
        two.setOnAction(this);
        three.setOnAction(this);
        four.setOnAction(this);
        five.setOnAction(this);
        six.setOnAction(this);
        seven.setOnAction(this);
        eight.setOnAction(this);
        nine.setOnAction(this);
        nullptr.setOnAction(this);
        plus.setOnAction(this);
        minus.setOnAction(this);
        division.setOnAction(this);
        multiplication.setOnAction(this);
        bracket_right.setOnAction(this);
        bracket_left.setOnAction(this);
        dot.setOnAction(this);
        degree.setOnAction(this);

        sin.setOnAction(this);
        cos.setOnAction(this);
        tan.setOnAction(this);
        cot.setOnAction(this);

        ln.setOnAction(this);
        PI.setOnAction(this);
        sqrt.setOnAction(this);
        e.setOnAction(this);
        ixs.setOnAction(this);
        Scene scene = new Scene(root, 470, 475);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void getMethod(ChoiceBox<String> methods) {
        String method = methods.getValue();
        if (method == "Dichotomy") {
            String function = enter.getText();
            out.clear();
            out.appendText(Dichotomy.dichotomy(function, Double.parseDouble(limitA.getText()), Double.parseDouble(limitB.getText()), Double.parseDouble(precisionofmethod.getText())));
            Graph.show(function, Double.parseDouble(limitA.getText()), Double.parseDouble(limitB.getText()));
        }
        if (method == "Newton`s method") {
            String function = enter.getText();
            out.clear();
            out.appendText(MethodOfNewton.Newton(function, Double.parseDouble(limitA.getText()), Double.parseDouble(limitB.getText()), Double.parseDouble(precisionofmethod.getText())));
            Graph.show(function, Double.parseDouble(limitA.getText()), Double.parseDouble(limitB.getText()));
        }
        if (method == "Chord method") {
            String function = enter.getText();
            out.clear();
            out.appendText(MethodChord.method_chord(function, Double.parseDouble(limitA.getText()), Double.parseDouble(limitB.getText()), Double.parseDouble(precisionofmethod.getText())));
            Graph.show(function, Double.parseDouble(limitA.getText()), Double.parseDouble(limitB.getText()));
        }
        if (method == "Method of simple iterations") {
            out.clear();
            String function = enter.getText();
            out.appendText(SimpleIterations.simpleiterations(function, Double.parseDouble(limitA.getText()), Double.parseDouble(limitB.getText()), Double.parseDouble(precisionofmethod.getText())));
            Graph.show(function, Double.parseDouble(limitA.getText()), Double.parseDouble(limitB.getText()));
        }
    }
}

