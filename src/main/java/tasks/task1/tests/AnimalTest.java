package tasks.task1.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tasks.task1.BaseFirstTest;
import tasks.task1.pages.AnimalPage;

public class AnimalTest extends BaseFirstTest {

    @Test
    @DisplayName("Кейс №1. Проверка успешного добавления товара в избранное со страницы товара")
    void test() {
        AnimalPage page = new AnimalPage(driver);
        page.clickAnimalsButton();
        page.clickCatsLink();
        String firstLink = page.GetHrefProduct();
        page.clickProductLink();
        switchToActiveWindow(driver);
        page.clickAddToFavoritesButton();
        page.clickFavoritesButton();
        String secondLink = page.GetHrefFavoriteProduct();
        Assertions.assertEquals(firstLink, secondLink);
    }

}
