package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;

public class Button {

    public Button(String name, SelenideElement selector) {
        this.name = name;
        this.selector = selector;
    }

    @Getter
    private String name;
    private SelenideElement selector;

    @Step("Нажатие на кнопку")
    public Button clickButton() {
        if (selector != null) {
            try {
                selector.shouldBe(Condition.enabled, Duration.ofSeconds(5))
                        .click();
                return this;
            } catch (ElementNotFound enf) {
                throw new NoSuchElementException("Не найден элемент '" + selector + "': " + enf.getMessage(), enf);
            }
        } else throw new NullPointerException("Ошибка : значение локатора передано пустым.");
    }
}