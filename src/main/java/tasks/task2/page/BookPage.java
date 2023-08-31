package tasks.task2.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {
    @FindBy(xpath = "//div[@class='style-header-add-favorite-M7nA2']//button[@title='Добавить в избранное']")
    private WebElement addToFavoritesButton;
    @FindBy(xpath = "//span[@data-marker='item-view/title-info']")
    public WebElement nameOfProductLayout;
    @FindBy(name = "favorites-filled")
    private WebElement favoritesButton;
    @FindBy(xpath = "//div[@class='item-snippet-column-2-md2mY']//strong")
    private WebElement nameOfFavoriteProductLayout;

    public BookPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickAddToFavorites() {
        addToFavoritesButton.click();
    }

    public String getNameOfProductLayout() {
        return nameOfProductLayout.getText();
    }

    public void clickFavoritesButton() {
        favoritesButton.click();
    }

    public String getNameOfFavoriteProductLayout() {
        return nameOfFavoriteProductLayout.getText();
    }

}
