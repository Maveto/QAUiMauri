package pomPages.todoLy;

import controls.Button;
import controls.Image;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class CenterSection {
    public Label projectNameLabel= new Label(By.xpath("//div[@id='CurrentProjectTitle']"));
    public TextBox newItemName = new TextBox(By.xpath("//textarea[@id=\"NewItemContentInput\"]"));
    public Button addNewItemButton = new Button(By.xpath("//input[@id=\"NewItemAddButton\"]"));
    public Button lastItem = new Button(By.xpath("//li[last()]//div[@class='ItemContentDiv']"));
    public TextBox editItemTextBox = new TextBox(By.xpath("//li[last()]//textarea[@id='ItemEditTextbox']"));
    public Image saveItemEdit = new Image(By.xpath("//div[@id='ItemEditDiv']//img[@id='ItemEditSubmit']"));
    public Button displayMenuButton = new Button(By.xpath("//li[last()]//div[@class='ItemIndicator']//img[@style=\"display: inline;\"]"));
    public Button deleteButton = new Button(By.xpath("//li[@class='delete separator']"));
    public Label deleteMessage = new Label(By.xpath("//div[@id=\"HeaderMessageInfo\"]"));

    public CenterSection(){}
}