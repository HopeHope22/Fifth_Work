package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class POHomework {
    private SelenideElement searchInput = $("[data-test-selector=nav-search-input]");
    private SelenideElement aboutButtonWiki = $x("//span[@data-content=\"Wiki\"]");
    private SelenideElement wikiPageMore = $(".js-wiki-more-pages-link");
    private SelenideElement selenideWord = $x("//*[.='selenide/selenide']");
    private SelenideElement softAssertionsSection = $x("//*[.='SoftAssertions']");

    public POHomework clickOnWikiButton (){
        aboutButtonWiki.click();
        return this;
    }

    public POHomework clickForShowMore (){
        wikiPageMore.click();
        return this;
    }

    public POHomework setValue (String desiredValue){
        searchInput.setValue(desiredValue).pressEnter();
        return this;
    }

    public POHomework selectDesired (){
        selenideWord.click();
        return this;
    }

    public POHomework selectSection (){
        softAssertionsSection.click();
        return this;
    }
}
