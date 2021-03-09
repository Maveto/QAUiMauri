package controls;

import org.openqa.selenium.Alert;
import singletonSession.Session;

public class AlertControl {

    public void alertAccept(){
        Alert alert = Session.getSession().getDriver().switchTo().alert();
        alert.accept();
    }

    public void alertDismiss(){
        Alert alert = Session.getSession().getDriver().switchTo().alert();
        alert.dismiss();
    }
}
