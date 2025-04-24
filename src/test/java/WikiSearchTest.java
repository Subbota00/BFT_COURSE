import com.codeborne.selenide.Condition;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.TmsLink;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WikiSearchTest extends BaseTest {
    public By searchInput = By.xpath("//*[@id=\"searchInput\"]");
    public By searchButton = By.xpath("//*[@id=\"searchButton\"]");
    public By siteSab = By.xpath("//*[@id=\"siteSub\"]");

    @Test
    @DisplayName("Поиск в википедии")
    @Severity(SeverityLevel.NORMAL)
    @TmsLink("www.Jira.com/TK-1")
    public void testSearch() {
        openWiki();
        inputFor("Марси");
        clickSearch();
        checkResult();
    }

    @Step("Открыть главную страницу Википедии")
    private void openWiki() {
        open("https://ru.wikipedia.org/wiki/Заглавная_страница");
    }

    @Step("Ввод в поле поиска значение {query}")
    private void inputFor(String query) {
        $(searchInput).setValue(query);
    }

    @Step("Нажать кнопку \"Поиск\"")
    private void clickSearch() {
        $(searchButton).click();
    }

    @Step("Проверить результат поиска")
    private void checkResult() {
        try {
            $(siteSab).shouldBe(visible).shouldHave(Condition.exactText("Материал из Википедии — свободной энциклопедии"));
            System.out.println("Элемент найден");
        } catch (Throwable e) {
            System.out.println("Элемент не найден или содержит другой текст");
            throw e;
        }
    }
}
