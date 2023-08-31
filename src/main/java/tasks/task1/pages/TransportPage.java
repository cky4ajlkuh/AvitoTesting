package tasks.task1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransportPage {
    @FindBy(xpath = "//button[@data-marker='top-rubricator/all-categories']")
    private WebElement allCategoriesButton;
    @FindBy(xpath = "//strong[@data-name='Транспорт']")
    private WebElement transportLink;
    @FindBy(xpath = "//a[@title='Автомобили']")
    private WebElement carsLink;
    @FindBy(xpath = "//a[@title='Ford']")
    private WebElement fordLink;
    @FindBy(xpath = "//a[@title='Focus']")
    private WebElement focusLink;
    @FindBy(xpath = "//a[@data-marker='item-title'][1]")
    private WebElement productLink;
    @FindBy(xpath = "//div[@title='Добавить в избранное и в сравнение'][1]")
    private WebElement addToFavoritesButton;
    @FindBy(name = "favorites-filled")
    private WebElement favoritesButton;
    @FindBy(xpath = "//div[@class='item-snippet-column-2-md2mY']//a")
    private WebElement favoriteProductLink;

    public TransportPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickAllCategoriesButton() {
        allCategoriesButton.click();
    }

    public void clickTransportLink() {
        transportLink.click();
    }

    public void clickCarsLink() {
        carsLink.click();
    }

    public void clickFordLink() {
        fordLink.click();
    }

    public void clickFocusLink() {
        focusLink.click();
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
