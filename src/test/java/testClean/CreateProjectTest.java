package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.*;
import singletonSession.Session;

public class CreateProjectTest {

    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    CenterSection centerSection = new CenterSection();
    LeftSection leftSection = new LeftSection();
    String user="upbui@upbui.com";
    String pwd="1234";

    @Test
    public void verify_login_todoly() throws InterruptedException {
        String name = "Clean Project";
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.loginAction(user, pwd);

        leftSection.addNewProjectButton.click();
        leftSection.nameProjectTextBox.set(name);
        leftSection.addButton.click();

        Thread.sleep(2000);
        Assert.assertEquals("ERROR !!Projecto No Creado",name, centerSection.projectNameLabel.getText());
    }

    @After
    public void close(){
        Session.getSession().closeSession();
    }
}
