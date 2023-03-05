import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MainFormController {
    public TextField txtLanguage;
    public TextField txtSelectedLanguage;
    public ListView<String> lstLanguage;

    public void saveLanguageOnAction(ActionEvent actionEvent) {
        lstLanguage.getItems().add(txtLanguage.getText());
        txtLanguage.clear();
    }

    public void initialize(){
        setData();
        lstLanguage.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            txtSelectedLanguage.setText(newValue);
        });
    }

    private void setData(){
        ObservableList<String> list = FXCollections.observableArrayList();
        list.addAll("hello","hola","ayobowan","greetings","wanakkam");
        lstLanguage.setItems(list);
    }


}
