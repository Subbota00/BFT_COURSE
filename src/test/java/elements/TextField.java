package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.NoSuchElementException;
import java.time.Duration;

public class TextField {

    public TextField(String name, SelenideElement selector) {
        this.name = name;
        this.selector = selector;
    }

    @Getter
    private String name;
    private SelenideElement selector;

    @Step("Поиск поля с текстом")
    public TextField checkValue(String text) {
        if (text == null || text.isEmpty()) {
            throw new NullPointerException("Значение 'text' не может быть пустым");
        }
        if (selector != null) {
            try {
                selector.shouldBe(Condition.enabled, Duration.ofSeconds(5))
                        .shouldHave(Condition.exactText(text));
                return this;
            } catch (ElementNotFound enf) {
                throw new NoSuchElementException("Не найден элемент '" + selector + "': " + enf.getMessage(), enf);
            }
        } else throw new NullPointerException("Ошибка : значение локатора передано пустым.");
    }
}