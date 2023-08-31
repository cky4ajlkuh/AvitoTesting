package tasks.task1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnimalPage {
    @FindBy(xpath = "//img[@alt='Животные']")
    private WebElement animalsButton;
    @FindBy(xpath = "//a[@title='Кошки']")
    private WebElement catsLink;
    @FindBy(xpath = "//a[@data-marker='item-title'][1]")
    private WebElement productLink;
    @FindBy(xpath = "//div[@class='style-header-add-favorite-M7nA2']//button[@title='Добавить в избранное']")
    private WebElement addToFavoritesButton;
    @FindBy(name = "favorites-filled")
    private WebElement favoritesButton;
    @FindBy(xpath = "//div[@class='item-snippet-column-2-md2mY']//a")
    private WebElement favoriteProductLink;

    public AnimalPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickAnimalsButton() {
        animalsButton.click();
    }

    public void clickCatsLink() {
        catsLink.click();
    }

    public String GetHrefProduct() {
        return productLink.getAttribute("href");
    }

    public void clickProductLink() {
        productLink.click();
    }

    public void clickAddToFavoritesButton() {
        addToFavoritesButton.click();
    }

    public void clickFavoritesButton() {
        favoritesButton.click();
    }

    public String GetHrefFavoriteProduct() {
        return favoriteProductLink.getAttribute("href");
    }

}
