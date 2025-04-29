package elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;

import java.time.Duration;

public class Input {
    public Input (String name, SelenideElement selector) {
        this.name = name;
        this.selector = selector;
    }
    @Getter
    private String name;
    private SelenideElement selector;


    @Step("Ввод значения в поле")
    public Input setValue (String value) {
        selector.shouldBe(Condition.enabled, Duration.ofSeconds(10))
                .setValue(value);
        return this;
    }
}
