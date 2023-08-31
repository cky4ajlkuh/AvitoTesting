package tasks.task1.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tasks.task1.BaseFirstTest;
import tasks.task1.pages.ElectronicsPage;

public class ElectronicsTest extends BaseFirstTest {
    @Test
    @DisplayName("Кейс №3. Проверка успешного добавления товара определенной категории в избранное со страницы поиска")
    void test() {
        ElectronicsPage page = new ElectronicsPage(driver);
        page.clickElectronicsButton();
        page.clickPhonesLink();
        page.clickAddToFavoritesButton();
        String firstLink = page.getHrefProduct();
        page.clickFavoritesButton();
        String secondLink = page.getHrefFavoriteProduct();
        Assertions.assertEquals(firstLink, secondLink);
    }

}
