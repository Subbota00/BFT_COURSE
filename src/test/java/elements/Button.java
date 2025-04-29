package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import lombok.Getter;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class Button {

    public Button(String name, SelenideElement selector) {
        this.name = name;
        this.selector = selector;
    }
    @Getter
    private String name;
    private SelenideElement selector;

    @Step ("Нажатие на кнопку")
    public Button clickButton() {
        selector.shouldBe(Condition.enabled, Duration.ofSeconds(10))
                .click();
        return this;
    }
}
