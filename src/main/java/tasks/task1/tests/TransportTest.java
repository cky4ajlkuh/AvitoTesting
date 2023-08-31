package tasks.task1.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tasks.task1.BaseFirstTest;
import tasks.task1.pages.TransportPage;

public class TransportTest extends BaseFirstTest {

    @Test
    @DisplayName("Кейс №2. Проверка успешного добавления товара определенной категории в избранное со страницы поиска")
    void test() {
        TransportPage page = new TransportPage(driver);
        page.clickAllCategoriesButton();
        page.clickTransportLink();
        page.clickCarsLink();
        page.clickFordLink();
        page.clickFocusLink();
        page.clickAddToFavoritesButton();
        String firstLink = page.getHrefProduct();
        page.clickFavoritesButton();
        String secondLink = page.getHrefFavoriteProduct();
        Assertions.assertEquals(firstLink, secondLink);
    }

}
