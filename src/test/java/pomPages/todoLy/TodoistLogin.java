package pomPages.todoLy;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class TodoistLogin {

    public TextBox emailTextBox = new TextBox(By.xpath("//input[@class=\"input_email\"]"));
    public Button registrarEmailButton = new Button(By.xpath("//button[@id=\"step_one_submit\"]"));
    public TextBox nameTextBox = new TextBox(By.xpath("//input[@class=\"input_name\"]"));
    public TextBox passTextBox = new TextBox(By.xpath("//input[@type=\"password\"]"));
    public Button registrarButton = new Button(By.xpath("//button[@id=\"step_two_submit\"]"));
    public Button abrirButton = new Button(By.xpath("//a[@class=\"tdo-button js-cta js-cta-finish\"]"));

    public TodoistLogin(){}
}
