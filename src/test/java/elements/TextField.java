package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;

import java.time.Duration;

public class TextField {

    public TextField (String name, SelenideElement selector) {
        this.name = name;
        this.selector = selector;
    }
    @Getter
    private String name;
    private SelenideElement selector;

    @Step("Поиск поля с текстом")
    public TextField checkValue (String text) {
        selector.shouldBe(Condition.enabled, Duration.ofSeconds(10))
                .shouldHave(Condition.exactText(text));
        return this;
    }
}
