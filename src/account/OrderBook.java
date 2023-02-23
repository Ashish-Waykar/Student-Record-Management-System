package JavafxPackage;
import account.AccountantSection;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javax.swing.JOptionPane;
public class OrderBook extends Application
{
public static void main(String[] args)
{
launch(args);
}
Stage stage;

TextField name;
TextField phone;
TextField book;
TextField address;
RadioButton java;
RadioButton MP;
RadioButton spm;
RadioButton balagurusamy;
RadioButton TP;
CheckBox letest;
CheckBox second;
CheckBox third;
@Override 
public void start(Stage primaryStage)
{
stage = primaryStage;

// Create the name label and text field ➝32
Label lblName = new Label("Name:");
name = new TextField();
name.setMinWidth(100);
name.setPrefWidth(200);
name.setMaxWidth(300);
name.setPromptText("Enter the name here");
// Create the phone number label and text field ➝40
Label lblPhone = new Label("Phone Number:");
phone = new TextField();
phone.setMinWidth(60);
phone.setPrefWidth(120);
phone.setMaxWidth(180);
phone.setPromptText("Enter the phone number here");
// code for book name 
Label lblBook = new Label("book name:");
book = new TextField();
book.setMinWidth(60);
book.setPrefWidth(120);
book.setMaxWidth(180);
book.setPromptText("Enter the book name here");
// Create the address label and text field ➝48
Label lblAddress = new Label("Address:");
address = new TextField();
address.setMinWidth(100);
address.setPrefWidth(200);
address.setMaxWidth(300);
address.setPromptText("Enter the address here");
// Create the size pane ➝56
Label lblSize = new Label("Subjects");
java = new RadioButton("Java");
MP = new RadioButton("Microprocessors");
spm = new RadioButton("S.P.M.");
MP.setSelected(true);
ToggleGroup groupSize = new ToggleGroup();
java.setToggleGroup(groupSize);
MP.setToggleGroup(groupSize);
spm.setToggleGroup(groupSize);
VBox paneSize = new VBox(lblSize, java, MP, spm);
paneSize.setSpacing(10);

// Create the crust pane ➝70
Label lblCrust = new Label("Publication");
balagurusamy = new RadioButton("Balagurusamy");
TP = new RadioButton("Tutorials point");
balagurusamy.setSelected(true);
ToggleGroup groupCrust = new ToggleGroup();
balagurusamy.setToggleGroup(groupCrust);
TP.setToggleGroup(groupCrust);
VBox paneCrust = new VBox(lblCrust, balagurusamy, TP);
paneCrust.setSpacing(10);
// Create the editions pane ➝82
Label lblToppings = new Label("Edition");
letest = new CheckBox("Latest");
second = new CheckBox("Last Second");
third = new CheckBox("Last Third");
VBox paneToppings = new VBox(lblToppings, letest,
second, third);
paneToppings.setSpacing(10);
// Create the buttons ➝92
Button btnOK = new Button("OK");
btnOK.setPrefWidth(80);
btnOK.setOnAction(e -> btnOK_Click() );
Button btnCancel = new Button("Back");
btnCancel.setPrefWidth(80);
btnCancel.setOnAction(e -> btnCancel_Click() );
HBox paneButtons = new HBox(10, btnOK, btnCancel);
// Create the GridPane layout ➝103
GridPane grid = new GridPane();
grid.setPadding(new Insets(10));
grid.setHgap(10);
grid.setVgap(10);
grid.setMinWidth(500);
grid.setPrefWidth(500);
grid.setMaxWidth(800);
// Add the nodes to the pane ➝112
grid.addRow(0, lblName, name);
grid.addRow(1, lblPhone, phone);
grid.addRow(2, lblAddress, address);
grid.addRow(3, paneSize, paneCrust, paneToppings);
grid.add(paneButtons,2,4);
// Set alignments and spanning ➝119
grid.setHalignment(lblName, HPos.RIGHT);
grid.setHalignment(lblPhone, HPos.RIGHT);
grid.setHalignment(lblAddress, HPos.RIGHT);
grid.setColumnSpan(name,2);
grid.setColumnSpan(phone,2);
grid.setColumnSpan(address,2);
// Set column widths ➝127
ColumnConstraints col1 = new ColumnConstraints();
col1.setPercentWidth(33);
ColumnConstraints col2 = new ColumnConstraints();
col2.setPercentWidth(33);
ColumnConstraints col3 = new ColumnConstraints();
col3.setPercentWidth(33);
grid.getColumnConstraints().addAll(col1, col2, col3);
// Create the scene and the stage ➝136
Scene scene = new Scene(grid);
primaryStage.setScene(scene);
primaryStage.setTitle("Book Order");
primaryStage.setMinWidth(500);
primaryStage.setMaxWidth(900);
primaryStage.show();
grid.setStyle("-fx-background-color: white;");



}
public void btnOK_Click() 
{
// Create a message string with the customer information
String msg = "Customer:\n\n";
msg += "\t" + name.getText() + "\n";
msg += "\t" + phone.getText() + "\n\n";
msg += "\t" + address.getText() + "\n";
msg += "You have ordered a Book Of ";
// Add the pizza size
if (java.isSelected())
msg += "Java ";
if (MP.isSelected())
msg += "Microprocessor ";
if (spm.isSelected())
msg += "S.P.M. ";
// Add the crust style
if (balagurusamy.isSelected())
msg += "Publication of Balagurusamy with ";
if (TP.isSelected())
msg += "Publication of Tutorials point with ";
// Add the editions
String editions = "";
editions = buildToppings(letest, editions);
editions = buildToppings(second, editions);
editions = buildToppings(third, editions);
if (editions.equals(""))
javax.swing.JOptionPane.showMessageDialog(null,"Sorry, you can't select the edation of book!");
//msg += "you does not selected the edition";
else
msg += "the following Edition :\n"
+ editions;
// Display the message
JOptionPane.showMessageDialog(null, "Order Details"+msg);
}
public String buildToppings(CheckBox chk, String msg) 
{
// Helper method for displaying the list of editions
if (chk.isSelected())
{
if (!msg.equals(""))
{
msg += ", ";
}
msg += chk.getText();
}
return msg;
}
public void btnCancel_Click() 
{
    AccountantSection.main(new String[]{});
    stage.close();
}
}