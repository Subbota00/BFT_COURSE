package pages;

import elements.Button;
import elements.Input;
import elements.TextField;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class WikiHeadPage {

    protected final Input searchInput = new Input("Ввод значения в поле поиска", $x("//*[@id='searchInput']"));
    protected final Button searchButton = new Button("Кнопка поиска", $x("//*[@id='searchButton']"));
    protected final TextField siteSub = new TextField("Текстовое поле", $x("//*[@id='siteSub']"));

    @Step("Открыть главную страницу Википедии")
    public void openWiki() {
        open("https://ru.wikipedia.org/wiki/Заглавная_страница");
    }

    @Step("Ввод в поле поиска значение {query}")
    public void inputFor(String value) {
        searchInput.setValue(value);
    }

    @Step("Нажать кнопку \"Поиск\"")
    public void clickSearch() {
        searchButton.clickButton();
    }

    @Step("Проверить результат поиска")
    public void checkResult() {
        try {
            siteSub.checkValue("Материал из Википедии — свободной энциклопедии");
            System.out.println("Элемент найден");
        } catch (Throwable e) {
            System.out.println("Элемент не найден или содержит другой текст");
            throw e;
        }
    }
}