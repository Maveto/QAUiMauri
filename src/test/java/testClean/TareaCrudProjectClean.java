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

public class TareaCrudProjectClean {

    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    CenterSection centerSection = new CenterSection();
    LeftSection leftSection = new LeftSection();
    AlertControl alertControl = new AlertControl();
    String user="upbui@upbui.com";
    String pwd="1234";

    @Test
    public void verify_login_todoly() throws InterruptedException {

        String name = "Clean Project";
        Session.getSession().getDriver().get("http://todo.ly/");
        //login
        mainPage.loginImage.click();
        loginModal.loginAction(user, pwd);
        //crate
        leftSection.addNewProjectButton.click();
        leftSection.nameProjectTextBox.set(name);
        leftSection.addButton.click();
        Thread.sleep(2000);
        Assert.assertEquals("ERROR !!Projecto No Creado",name, centerSection.projectNameLabel.getText());
        //update
        String newName = "CleanProject Update";
        leftSection.lastProject.click();
        leftSection.editMenuImage.click();
        leftSection.editButton.click();
        leftSection.editNameProjectTextBox.clear();
        leftSection.editNameProjectTextBox.set(newName);
        leftSection.saveButton.click();
        Thread.sleep(2000);
        Assert.assertEquals("No se cambio el nombre", newName, centerSection.projectNameLabel.getText());

        //delete
        leftSection.lastProject.click();
        leftSection.editMenuImage.click();
        leftSection.deleteButton.click();
        alertControl.alertAccept();
        Thread.sleep(2000);

        Assert.assertNotEquals("El proyecto no se pudo eliminar", centerSection.projectNameLabel.getText(), newName);


    }

    @After
    public void close() throws InterruptedException {
        Thread.sleep(1000);
        Session.getSession().closeSession();
    }
}
