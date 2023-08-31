package tasks.task1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
    @FindBy(xpath = "//img[@alt='Электроника']")
    private WebElement electronicsButton;
    @FindBy(xpath = "//a[@title='Телефоны']")
    private WebElement phonesLink;
    @FindBy(xpath = "//a[@data-marker='item-title'][1]")
    private WebElement productLink;
    @FindBy(xpath = "//div[@title='Добавить в избранное и в сравнение']")
    private WebElement addToFavoritesButton;
    @FindBy(name = "favorites-filled")
    private WebElement favoritesButton;
    @FindBy(xpath = "//div[@class='item-snippet-column-2-md2mY']//a")
    private WebElement favoriteProductLink;

    public ElectronicsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickElectronicsButton() {
        electronicsButton.click();
    }

    public void clickPhonesLink() {
        phonesLink.click();
    }

    public void clickAddToFavoritesButton() {
        addToFavoritesButton.click();
    }

    public String getHrefProduct() {
        return productLink.getAttribute("href");
    }

    public void clickFavoritesButton() {
        favoritesButton.click();
    }

    public String getHrefFavoriteProduct() {
        return favoriteProductLink.getAttribute("href");
    }

}
