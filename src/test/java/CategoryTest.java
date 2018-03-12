import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.DashboardPage;
import pages.LoginPage;
import utils.General;

public class CategoryTest extends BaseScript {
    public static void main(String[] args) throws InterruptedException{

        String categoryName = "MyTest" + System.currentTimeMillis();

        WebDriver driver = getConfiguredDriver();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.executeLogin();

        DashboardPage dashboardPage = new DashboardPage(driver);

        dashboardPage.hoverCatalogMenuItem();

        dashboardPage.clickCategoriesSubMenuItem();

        dashboardPage.clickAddCategory();

        dashboardPage.fillCategoryName(categoryName);

        dashboardPage.scrollPageDown();

        dashboardPage.clickCategoryFormSubmitButton();

        dashboardPage.fillCategoryNameSearchField(categoryName);

        dashboardPage.clickSearchButton();

        WebElement newCategory = dashboardPage.getCellWithText(categoryName);

        System.out.println("New category found in Categories table: " + newCategory.getText());

        quiteDriver(driver);



        // TODO prepare driver object
        // WebDriver driver = getConfiguredDriver();
        // ...

        // login

        // create category

        // check that new category appears in Categories table

        // finish script

    }
}
