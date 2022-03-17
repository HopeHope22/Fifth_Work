package pages;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class Components {

    public void openPage(){
        Configuration.browserSize = "1920x1080";
        open("https://github.com/");
    }
}
