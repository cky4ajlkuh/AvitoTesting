package tasks.task2.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tasks.task2.BaseSecondTest;
import tasks.task2.page.BookPage;


public class BookTest extends BaseSecondTest {

    @Test
    @DisplayName("Кейс №4. Проверка успешного добавления товара в избранное со страницы товара")
    void test() {
        BookPage page = new BookPage(driver);
        page.clickAddToFavorites();
        String firstName = page.getNameOfProductLayout();
        page.clickFavoritesButton();
        String SecondName = page.getNameOfFavoriteProductLayout();
        Assertions.assertEquals(firstName, SecondName);
    }

}
