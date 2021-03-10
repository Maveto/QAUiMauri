package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.todoLy.TodoistLogin;
import pomPages.todoLy.TodoistFirstPage;
import pomPages.todoLy.TodoistMain;
import singletonSession.Session;

import java.util.Random;

public class TodoistTest {

    TodoistFirstPage firstPage = new TodoistFirstPage();
    TodoistLogin login = new TodoistLogin();
    TodoistMain main = new TodoistMain();

    String user="upbui@upbui.com";
    String pwd="1234";

    @Test
    public void verify_login_and_create() throws InterruptedException {
        String pass = "Mauri_1234";
        Session.getSession().getDriver().get("https://todoist.com/es");
        //login
        firstPage.startButton.click();
        login.emailTextBox.click();
        login.emailTextBox.set(createEmail());
        login.registrarEmailButton.click();
        login.nameTextBox.click();
        login.nameTextBox.set("Mauri");
        login.passTextBox.click();
        login.passTextBox.set(pass);
        login.registrarButton.click();
        login.abrirButton.click();

        Thread.sleep(2000);
        Assert.assertTrue("No se pudo iniciar sesion", main.userImg.controlIsDisplayed());


    }

    private String createEmail() {
        Random random = new Random();
        int code = random.nextInt(1000);
        return "mauri"+code+"@"+code+".com";
    }

    @After
    public void close() throws InterruptedException {
        Thread.sleep(5000);
        Session.getSession().closeSession();
    }
}
