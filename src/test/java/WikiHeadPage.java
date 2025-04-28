import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class WikiHeadPage {

    @FindBy(how = How.XPATH, using = "//*[@id='searchInput']")
    private SelenideElement searchInput;

    @FindBy(how = How.XPATH, using = "//*[@id='searchButton']")
    private SelenideElement searchButton;

    @FindBy(how = How.XPATH, using = "//*[@id='siteSub']")
    private SelenideElement siteSub;

    public WikiHeadPage() {
        Selenide.page(this);
    }

    @Step("Открыть главную страницу Википедии")
    void openWiki() {
        open("https://ru.wikipedia.org/wiki/Заглавная_страница");
    }

    @Step("Ввод в поле поиска значение {query}")
    void inputFor(String query) {
        searchInput
                .shouldBe(visible, Duration.ofSeconds(10)) //Явное ожидание 10 секунд
                .setValue(query);
    }

    @Step("Нажать кнопку \"Поиск\"")
    void clickSearch() {
        searchButton
                .shouldBe(visible, Duration.ofSeconds(10))
                .click();
    }

    @Step("Проверить результат поиска")
    void checkResult() {
        try {
            siteSub
                    .shouldBe(visible) // Явное ожидание по дефолту 4 секунды
                    .shouldHave(Condition.exactText("Материал из Википедии — свободной энциклопедии"));
            System.out.println("Элемент найден");
        } catch (Throwable e) {
            System.out.println("Элемент не найден или содержит другой текст");
            throw e;
        }
    }
}
