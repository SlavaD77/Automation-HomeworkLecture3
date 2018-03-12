import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventHandler implements WebDriverEventListener {

    public void log(String message){
        System.out.println(message);
    }

    @Override
    public void beforeAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        log("Opening url: " + s);

    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        log("Opened url: " + s);
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        log("Search for element " + by.toString());
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {
        log("Element found successfully ");
    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {
        log("Click on element: " + webElement.getTagName() + " name:" + webElement.getAttribute("name"));
    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {
        log("Element successfully clicked");
    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        log("Fill input field " + webElement.getAttribute("id") + " value: " + charSequences.toString());
    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {
        log("Value successfully changed");
    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {
        log("Before Script");

    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {
        log("After Script");
    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {

    }
}
