package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import static sample.Main.sumaCifara;

public class Controller {
    public TextField textField1;
    public TextField textField2;

    public void ispisi(ActionEvent actionEvent) {

        int n = Integer.parseInt(textField1.getText());
        String rezultat = "";

        for (int i = 1; i <= n; i++){
            if(i % sumaCifara(i) == 0){
                if(i != n)
                    rezultat = rezultat + i + " ";
                else rezultat = rezultat + i + ".";
            }
        }
        textField2.setText(rezultat);
    }
}
