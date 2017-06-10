package numbers;




import java.awt.Font;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class PiCalc extends Application {

	private GridPane gridPane;
	private Scene scene;
	private TextArea result;
	
	private int LIMIT = 50;
	
	public static void main(String[] args) {
		
//		new PiCalc();
		Application.launch(args);
		
	}
	
	@Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculate Pi to n decimal places.");

		//Creating a GridPane container
		gridPane = new GridPane();
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		gridPane.setVgap(5);
		gridPane.setHgap(5);
		gridPane.setAlignment(Pos.CENTER);
		
		//Defining the input text field
		final TextField input = new TextField();
		input.setPromptText("Choose integer n.");
		input.setPrefColumnCount(10);
		input.getText();
		GridPane.setConstraints(input, 0, 0);
		gridPane.getChildren().add(input);
		
		result = new TextArea();
		GridPane.setConstraints(result, 0, 3);
		gridPane.getChildren().add(result);

        
        Button run = new Button("Run...");
        run.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
    			int limit = Integer.parseInt(input.getText());
    			result.setText(input.getText());
            }
        });

		GridPane.setConstraints(run, 0, 1);
		gridPane.getChildren().add(run);

		
		scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
		gridPane.setVisible(true);

////		decimalPlaces = new JTextField();

		
//		north = new JPanel(new GridLayout(1, 3));
//		north.add(label);
//		decimalPlaces = new JTextField();
//		north.add(decimalPlaces);
//		run = new JButton("Run..");
//		
//		run.addActionListener(this);
//		
//		
//		frame.add(north, BorderLayout.NORTH);
//		frame.add(new JScrollPane(result), BorderLayout.CENTER);
//
//		north.add(run, BorderLayout.SOUTH);
//		jFrame.setVisible(true);
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//			int limit = Integer.parseInt(jDecimalPlaces.getText());
//			int i = 1;
//			boolean flag = false;
//			result.setText(jDecimalPlaces.getText());
//	}
}
