package com.skillbrain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElementsEx extends BaseTest{
    @Test
    public void TemaElemente() {
        driver.get("https://testpages.eviltester.com/styled/index.html");
        String expectedTitle = "Web Testing and Automation Practice Application Pages";
        String actualTitle = driver.getTitle();
        System.out.println("Titlul continutului paginii este: " +actualTitle);
        Assert.assertEquals(actualTitle,expectedTitle, "Titlul nu este cel asteptat");// Gasirea unui element de pe pagina

//link element 1
        WebElement basicWebPageLink=driver.findElement(By.linkText("Basic Web Page Example"));
        basicWebPageLink.click();
        WebElement titlulPagini =driver.findElement(By.cssSelector("body > div > h1"));
        System.out.println("Titlul pagini este :"+titlulPagini.getText());
        WebElement explanation=driver.findElement(By.cssSelector("body > div > div.explanation > p"));
        System.out.println("Paragraful este:"+explanation.getText());
        WebElement paragraful1 =driver.findElement(By.cssSelector("#para1"));
        System.out.println("Primul paragraf :"+paragraful1.getText());
        WebElement paragraful2 =driver.findElement(By.cssSelector("#para2"));
        System.out.println("Al doilea paragraf este:"+paragraful2.getText());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // reintoarcere la pagina pricipala
        WebElement indexLink=driver.findElement(By.linkText("Index"));
        indexLink.click();
        //link element 2
        WebElement elementattributestest=driver.findElement(By.linkText("Element Attributes Examples"));
        elementattributestest.click();
        WebElement titlulpagini2=driver.findElement(By.cssSelector("body > div > h1"));
        System.out.println("Titlul al celei de a doua pagina este :"+titlulpagini2.getText());
        WebElement greenButton=driver.findElement(By.xpath("/html/body/div/div[4]/button"));
        greenButton.click();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // reintoarcere la pagina pricipala
        WebElement indexLink2=driver.findElement(By.linkText("Index"));
        indexLink2.click();
        //link element 3
        WebElement findbytest=driver.findElement(By.linkText("Locators - Find By Playground Test Page"));
        findbytest.click();
        WebElement jump=driver.findElement(By.xpath("//*[@id=\"li16\"]"));
        jump.click();
        WebElement Paragraful15=driver.findElement(By.cssSelector("#p15"));
        System.out.println("Textul paragrafului 15 este: "+Paragraful15.getText());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // reintoarcere la pagina pricipala
        WebElement indexLink3=driver.findElement(By.linkText("Index"));
        indexLink3.click();
        //link element 4
        WebElement webdriverexamplepage=driver.findElement(By.linkText("WebDriver Example Page"));
        webdriverexamplepage.click();
        WebElement EnterNumbers=driver.findElement(By.cssSelector("#main-content > div:nth-child(4) > form > label"));
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        WebElement input=driver.findElement(By.cssSelector("#numentry"));
        input.sendKeys("555");
        WebElement Buton=driver.findElement(By.cssSelector("#submit-to-server"));
        Buton.click();
        WebElement mesaj=driver.findElement(By.cssSelector("#message"));
        System.out.println("Mesajul este :"+mesaj.getText());

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Inchiderea browserului
        driver.quit();
    }

@Test
    public void TemaElements2(){
driver.get("https://demoqa.com/text-box");
//primul tab
        WebElement Elements=driver.findElement(By.cssSelector("#app > div > div > div > div:nth-child(1) > div > div > div:nth-child(1) > span > div > div.header-text"));
    WebElement Elementclick=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]/span"));
    Elementclick.click();
    WebElement textbox=driver.findElement(By.cssSelector("#item-0"));
    WebElement titlulpagini=driver.findElement(By.cssSelector("#app > div > div > div > div.col-12.mt-4.col-md-6 > h1"));
    System.out.println("Titlul pagini este: "+titlulpagini.getText());
    WebElement inputFullname =driver.findElement(By.xpath("//*[@id=\"userName\"]"));
    inputFullname.sendKeys("Samartean Daniel Eusebiu");
    WebElement inputEmail=driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
    inputEmail.sendKeys("danielsamartean@gmail.com");
    WebElement inputadress=driver.findElement(By.cssSelector("#currentAddress"));
    inputadress.sendKeys("Bistrita");
    WebElement button=driver.findElement(By.xpath("//*[@id=\"userForm\"]/div[5]/div"));
    button.click();
    try {
        Thread.sleep(2000);
    } catch (Exception e) {
        e.printStackTrace();
    }
    //al doilea tab
    WebElement Elementclick2=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]/span"));
    Elementclick2.click();
    WebElement Checkbox=driver.findElement(By.cssSelector("#item-1"));
    Checkbox.click();
    WebElement titluiPaginiADoua = driver.findElement(By.cssSelector("#app > div > div > div > div.col-12.mt-4.col-md-6 > h1"));
    System.out.println("Titlui celei de a doua pagina este :"+titluiPaginiADoua.getText());
    WebElement checkboxHome =driver.findElement(By.cssSelector("#tree-node > ol > li > span > label > span.rct-checkbox"));
    checkboxHome.click();
    try {
        Thread.sleep(2000);
    } catch (Exception e) {
        e.printStackTrace();
    }
    //al treile tab
    WebElement Elementclick3=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[1]/span/div/div[1]/span"));
    Elementclick3.click();
    WebElement radiobutton=driver.findElement(By.cssSelector("#item-2"));
    radiobutton.click();
    WebElement titlul3=driver.findElement(By.cssSelector("#app > div > div > div > div.col-12.mt-4.col-md-6 > h1"));
    System.out.println("Titlul al celui de al treilea tab este :"+titlul3);
    WebElement intrebare=driver.findElement(By.cssSelector("#app > div > div > div > div.col-12.mt-4.col-md-6 > div:nth-child(3) > div.mb-3"));
    WebElement raspuns =driver.findElement(By.xpath("//*[@id=\"yesRadio\"]"));
    try {
        Thread.sleep(2000);
    } catch (Exception e) {
        e.printStackTrace();
    }
    // Inchiderea browserului
    driver.quit();
}
}


