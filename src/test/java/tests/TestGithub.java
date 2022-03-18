package tests;

import org.junit.jupiter.api.Test;
import pages.Components;
import pages.POHomework;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TestGithub {
    Components Components1 = new Components();
    POHomework PageObject = new POHomework();
    String desiredValue = "selenide";

    @Test
    void SearchSomePage(){
        Components1
                .openPage();
        PageObject
                .setValue(desiredValue)
                .selectDesired()
                .clickOnWikiButton()
                .clickForShowMore();

        $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
    }

    @Test
    void JUnit5Example(){
        Components1
                .openPage();
        PageObject
                .setValue(desiredValue)
                .selectDesired()
                .clickOnWikiButton()
                .clickForShowMore()
                .selectSection();
        $x("//body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
