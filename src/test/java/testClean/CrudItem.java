package testClean;

import controls.AlertControl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.CenterSection;
import pomPages.todoLy.LeftSection;
import pomPages.todoLy.LoginModal;
import pomPages.todoLy.MainPage;
import singletonSession.Session;

public class CrudItem {

    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    CenterSection centerSection = new CenterSection();
    LeftSection leftSection = new LeftSection();
    AlertControl alertControl = new AlertControl();
    String user="upbui@upbui.com";
    String pwd="1234";

    @Test
    public void verify_item_crud_todoly() throws InterruptedException {

        String name = "Clean Project";
        Session.getSession().getDriver().get("http://todo.ly/");
        //login
        mainPage.loginImage.click();
        loginModal.loginAction(user, pwd);
        //crate project
        leftSection.addNewProjectButton.click();
        leftSection.nameProjectTextBox.set(name);
        leftSection.addButton.click();
        Thread.sleep(2000);

        //create item
        String itemName = "new Item";
        centerSection.newItemName.click();
        centerSection.newItemName.clear();
        centerSection.newItemName.set(itemName);
        centerSection.addNewItemButton.click();
        Thread.sleep(2000);
        Assert.assertEquals("No se creo el item", itemName, centerSection.lastItem.getText());

        //update item
        String newItemName = "new Item Update";
        centerSection.lastItem.click();
        centerSection.editItemTextBox.clear();
        centerSection.editItemTextBox.set(newItemName);
//        centerSection.saveItemEdit.click();
        Thread.sleep(2000);
        Assert.assertEquals("No se edito el item", newItemName, centerSection.lastItem.getText());

        //delete item
        centerSection.lastItem.click();
        centerSection.displayMenuButton.click();
        centerSection.deleteButton.click();
        Thread.sleep(1000);
        Assert.assertTrue("No se elimino el item", centerSection.deleteMessage.controlIsDisplayed());
    }

    @After
    public void close() throws InterruptedException {

        //delete project
        leftSection.lastProject.click();
        leftSection.editMenuImage.click();
        leftSection.deleteButton.click();
        alertControl.alertAccept();

        Thread.sleep(1000);
        Session.getSession().closeSession();
    }
}
