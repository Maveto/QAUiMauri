package pomPages.todoLy;

import controls.Button;
import controls.Image;
import controls.TextBox;
import org.openqa.selenium.By;

public class LeftSection {
    public Button addNewProjectButton= new Button(By.xpath("//td[contains(.,'Add New Project') and @class='ProjItemContent']"));
    public Button addButton= new Button(By.xpath("//input[@id='NewProjNameButton']"));
    public TextBox nameProjectTextBox= new TextBox(By.xpath("//input[@id='NewProjNameInput']"));
    public Button lastProject = new Button(By.xpath("//li[last()]//td[@class='ProjItemContent']"));
    public Image editMenuImage = new Image(By.xpath("//div[@style='display: block;']/img[@src='/Images/dropdown.png']"));
    public Button editButton = new Button(By.xpath("//ul[@id='projectContextMenu']//a[contains(.,'Edit')]"));
    public TextBox editNameProjectTextBox = new TextBox(By.id("ItemEditTextbox"));
    public Button saveButton = new Button(By.xpath("//li//div[@id='ProjectEditDiv']/*[@id=\"ItemEditSubmit\"]"));
    public Button deleteButton = new Button(By.xpath("//a[@id='ProjShareMenuDel']"));

    public LeftSection(){

    }

}