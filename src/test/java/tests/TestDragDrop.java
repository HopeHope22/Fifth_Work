package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestDragDrop {
    @BeforeEach
    void openBrowser() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
    }
    @Test
    void dragAndDrop(){
        SelenideElement square_1 = $("#column-a");
        SelenideElement square_2 = $("#column-b");

        square_1.dragAndDropTo(square_2);
        square_2.shouldHave(text("A"));
        sleep(2000);
    }
}
