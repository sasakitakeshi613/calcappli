package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SampleController implements Initializable{
	@FXML Button b1;
	@FXML Button b2;
	@FXML Button b3;
	@FXML Button b4;
	@FXML Button b5;
	@FXML Button b6;
	@FXML Button b7;
	@FXML Button b8;
	@FXML Button b9;
	@FXML Button b0;
	@FXML Button bper;
	@FXML Button bmulti;
	@FXML Button bplus;
	@FXML Button bminus;
	@FXML Button bc;
	@FXML Button bequal;
	@FXML Label l1;
	
	//一次受けと二次受け
	int k1 = 0;
	int k2 = 0;
	
	String before,after;
	
	//四則演算
	String shiki ;
	
	String key, k3, k4;
	String s;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		b1.setOnAction((ActionEvent event)->{
			l1.setText(l1.getText() + "1");
		});
		b2.setOnAction((ActionEvent event)->{
			l1.setText(l1.getText() + "2");
		});
		b3.setOnAction((ActionEvent event)->{
			l1.setText(l1.getText() + "3");
		});
		b4.setOnAction((ActionEvent event)->{
			l1.setText(l1.getText() + "4");
		});
		b5.setOnAction((ActionEvent event)->{
			l1.setText(l1.getText() + "5");
		});
		b6.setOnAction((ActionEvent event)->{
			l1.setText(l1.getText() + "6");
		});
		b7.setOnAction((ActionEvent event)->{
			l1.setText(l1.getText() + "7");
		});
		b8.setOnAction((ActionEvent event)->{
			l1.setText(l1.getText() + "8");
		});
		b9.setOnAction((ActionEvent event)->{
			l1.setText(l1.getText() + "9");
		});
		b0.setOnAction((ActionEvent event)->{
			l1.setText(l1.getText() + "0");
		});
		bc.setOnAction((ActionEvent event)->{
			l1.setText("");
		});
		bplus.setOnAction((ActionEvent event)->{
			k1 = Integer.parseInt(l1.getText());
			l1.setText(l1.getText() +""+ "+");
			shiki = "plus";
			s = "＋";
		});
		bequal.setOnAction((ActionEvent event)->{
			k4 = Integer.toString(k1);
			k3 = l1.getText();
			k3 = k3.substring(k4.length());
			k3 = k3.replaceAll(s, "");
			k2 = Integer.parseInt(k3,10);
			switch(shiki) {
			case "plus":
				k1 += k2;
				break;
			case "bm":
				k1 -= k2;
				break;
			case "bw":
				k1 /= k2;
				break;
			case "bk":
				k1 *= k2;
				break;
			}
			l1.setText(Integer.toString(k1));
		});
	}
	
}
