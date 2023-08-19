package com.Test_Shafiq.pages;

import com.Test_Shafiq.Driver.DriverSingleton;
import org.apache.commons.io.output.FileWriterWithEncoding;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class LoginPages {

        private WebDriver driver;

        public LoginPages() {
            this.driver = DriverSingleton.getDriver();
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//a[@class='nav-link text-h3 lg:text-h5 xl:text-h5 text-black'][normalize-space()='Beranda']")
        WebElement TxtBerhasilUrl;
        @FindBy(xpath = "//a[@class='btn btn-outline-primary w-full']")
        WebElement BtnMasuk;
        @FindBy(name = "email")
        WebElement Username;
        @FindBy(id = "password")
        WebElement KataSandi;
        @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
        WebElement CeklistImnotrobotMasuk;
        @FindBy(xpath = "//button[@type='submit']")
        WebElement BtnSubmit;
        @FindBy(xpath = "//span[@class='text-h5 text-white text-center md:text-left']")
        WebElement TxtBerhasilMasukAwal;
        @FindBy(xpath = "//a[@class='nav-link text-h3 lg:text-h5 xl:text-h5 text-black'][normalize-space()='Beranda']")
        WebElement MasukBeranda;
        @FindBy(xpath = "//a[@class='nav-link text-h3 lg:text-h5 xl:text-h5 text-black'][normalize-space()='Beranda']")
        WebElement TxtBerhasilMasukBeranda;
        @FindBy(xpath = "//a[@class='nav-link text-h3 lg:text-h5 xl:text-h5 text-black'][normalize-space()='Daftar Investasi']")
        WebElement MasukDaftarInvestasi;
        @FindBy(xpath = "//span[@class='text-h3 text-primary font-light']")
        WebElement TxtBerhasilMasukDaftarInvestasi;
        @FindBy(xpath = "//input[@placeholder='Cari']")
        WebElement InputCariDaftarInvestasi;
        @FindBy(xpath = "//button[@class='input-group-text']")
        WebElement BtnCariDaftarInvestasi;
        @FindBy(xpath = "//body/div[contains(@class,'site-content font-light')]/div[@class='container py-10']/div[@id='portfolio-feed']/div[@class='row']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
        WebElement Txtberhasilcariinvestasi;
        @FindBy(xpath = "//a[normalize-space()='Tentang SHAFIQ']")
        WebElement BtnTentangShafiq;
        @FindBy (xpath = "//span[contains(text(),'Membangun Ekonomi Bangsa dengan Nilai-Nilai')]")
        WebElement TxtBerhasilMasukTentangShafiq;



        // ==============================================================================================================================================

    // ==============================================================================================================================================

    // ==============================================================================================================================================

    public String GetTxtBerhasilUrl() {return TxtBerhasilUrl.getText();}
    public void KlikBtnMasuk() {BtnMasuk.click();}
    public void InputUsername(String username) {this.Username.sendKeys((username));}
    public void InputKataSandi(String katasandi) {this.KataSandi.sendKeys(katasandi);}
    public void KlikCeklistImnotrobotMasuk() {CeklistImnotrobotMasuk.click();}
    public void KlikBtnSubmit(){BtnSubmit.click();}
    public String GetTxtBerhasilMasukAwal() {return TxtBerhasilMasukAwal.getText();}
    public void KlikMasukBeranda() {MasukBeranda.click();}
    public String GetTxtBerhasilMasukBeranda(){return TxtBerhasilMasukBeranda.getText();}
    public void KlikMasukDaftarInvestasi(){MasukDaftarInvestasi.click();}
    public String GetTxtBerhasilMasukDaftarInvestasi(){return TxtBerhasilMasukDaftarInvestasi.getText();}
    public void MasukanInputCariDaftarInvestasi(String caridaftarinves){InputCariDaftarInvestasi.sendKeys(caridaftarinves);}
    public void KlikBtnCariDaftarInvestasi(){BtnCariDaftarInvestasi.click();}
    public String GetTxtberhasilcariinvestasi(){return Txtberhasilcariinvestasi.getText();}
    public void KlikBtnTentangShafiq(){BtnTentangShafiq.click();}
    public String GetTxtBerhasilMasukTentangShafiq(){return TxtBerhasilMasukTentangShafiq.getText();}


    //        public void clickBtnLogout() {
//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("arguments[0].click();", btnLogout);
//        }




}
