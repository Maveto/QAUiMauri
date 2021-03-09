package controls;

import org.openqa.selenium.By;

public class TextBox extends Control{
    public TextBox(By locator) {
        super(locator);
    }

    public void clear() {
        this.findControl();
        this.getControl().clear();
    }
}
