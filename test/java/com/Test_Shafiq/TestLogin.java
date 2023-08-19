package com.Test_Shafiq;

import com.Test_Shafiq.Utils.Constants;
import com.Test_Shafiq.pages.LoginPages;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPages login = new LoginPages();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    //=======================================================
    // 001 Masuk Url
    //=======================================================
    @When("TCC.JCC.001 Admin masuk url")
    public void admin_di_halaman_login() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "Admin on login page");
    }
    @Then("TCC.JCC.001 Admin berhasil masuk url")
    public void admin_gagal_login() {
        delay(4);
        Assert.assertTrue(login.GetTxtBerhasilUrl().contains("Beranda"));
        extentTest.log(LogStatus.PASS, "admin berhasil membuka url valid");
    }

    //=======================================================
    // 002 Masuk sebagai User
    //=======================================================
    @When("TCC.JCC.002 User masuk valid")
    public void User_masuk_valid() {
        login.KlikBtnMasuk();
        extentTest.log(LogStatus.PASS, "Admin on login page");
    }
    @And("TCC.JCC.002 User input username valid")
    public void user_input_username_valid() {
        login.InputUsername("bramantyo.bpct@gmail.com");
        extentTest.log(LogStatus.PASS, "Admin input username password invalid");
    }
    @And("TCC.JCC.002 User input password valid")
    public void user_input_password_valid() {
        login.InputKataSandi("@2.6Crjg6y6WM!U");
        delay(2);
        extentTest.log(LogStatus.PASS, "Admin Klik button sign-in valid");
    }
    @And("TCC.JCC.002 User Klik Button Masuk")
    public void user_klik_button_masuk() {
        login.KlikCeklistImnotrobotMasuk();
        delay(4);
        login.KlikBtnSubmit();
        extentTest.log(LogStatus.PASS, "Admin Klik button sign-in valid");
    }
    @Then("TCC.JCC.002 User berhasil masuk ke menu user")
    public void user_berhasil_masuk_kemenu_user() {
        delay(4);
        Assert.assertTrue(login.GetTxtBerhasilMasukAwal().contains("Total Aset Anda"));
        extentTest.log(LogStatus.PASS, "Username atau password tidak ditemukan");
    }


    //=======================================================
    // 003 masuk ke beranda
    //=======================================================

    @When("TCC.JCC.004 User masuk menu beranda")
    public void user_masuk_menu_daftar_beranda() {
        login.KlikMasukBeranda();
        extentTest.log(LogStatus.PASS, "Admin on login page");
    }
    @Then("TCC.JCC.004 User berhasil masuk menu beranda")
    public void user_berhasil_masuk_menu_daftar_beranda() {
        delay(4);
        Assert.assertTrue(login.GetTxtBerhasilMasukBeranda().contains("Daftar"));
        extentTest.log(LogStatus.PASS, "Username atau password tidak ditemukan");
    }

    //=======================================================
    // 004 Masuk ke daftar investasi
    //=======================================================
    @When("TCC.JCC.004 User masuk menu daftar investasi")
    public void user_masuk_menu_daftar_investasi() {
        login.KlikMasukDaftarInvestasi();
        extentTest.log(LogStatus.PASS, "Admin on login page");
    }
    @Then("TCC.JCC.004 User berhasil masuk menu daftar investasi")
    public void user_berhasil_masuk_menu_daftar_investasi() {
        delay(4);
        Assert.assertTrue(login.GetTxtBerhasilMasukDaftarInvestasi().contains("Daftar"));
        extentTest.log(LogStatus.PASS, "Username atau password tidak ditemukan");
    }


    //=======================================================
    // 005 Cari Investasi
    //=======================================================
    @When("TCC.JCC.005 User input nama yang ingin dicari")
    public void user_input_nama_yang_ingin_dicari() {
        login.MasukanInputCariDaftarInvestasi("villa");
        extentTest.log(LogStatus.PASS, "Admin on login page");
    }
    @And("TCC.JCC.005 User klik tanda cari")
    public void user_klik_tanda_cari() {
        login.KlikBtnCariDaftarInvestasi();
        delay(1);
        extentTest.log(LogStatus.PASS, "Admin input username password valid");
    }

    @Then("TCC.JCC.005 Berhasil menampilkan data yang user cari")
    public void berhasil_menampilkan_data_yang_user_cari() {
        delay(1);
        Assert.assertTrue(login.GetTxtberhasilcariinvestasi().contains("SUKUK"));
        delay(2);
        extentTest.log(LogStatus.PASS, "Admin valid credentials Admin berhasil login");
    }

    //=======================================================
    // 006 Masuk ke tentang shafiq
    //=======================================================
    @When("TCC.JCC.006 User masuk menu tentang shafiq")
    public void user_masuk_menu_tentang_shafiq() {
        login.KlikMasukDaftarInvestasi();
        extentTest.log(LogStatus.PASS, "Admin on login page");
    }
    @Then("TCC.JCC.006 User berhasil masuk menu tentang shafiq")
    public void user_berhasil_masuk_menu_tentang_shafiq() {
        delay(1);
        Assert.assertTrue(login.GetTxtBerhasilMasukTentangShafiq().contains("Membangun Ekonomi"));
        extentTest.log(LogStatus.PASS, "Username atau password tidak ditemu");

    //=======================================================
    // 007 Masuk ke berita
    //=======================================================
//    @When("TCC.JCC.005 Admin berada di halaman login")
//    public void admin_di_halaman_valid() {
//        driver.get(Constants.URL);
//        extentTest.log(LogStatus.PASS, "Admin on login page");
//    }
//    @And("TCC.JCC.005 Admin input username password valid")
//    public void admin_input_username_password_valid() {
//        Login.login("admin@connector.com", "admin@connector");
//        delay(4);
//        extentTest.log(LogStatus.PASS, "Admin input username password valid");
//    }
//
//    @And("TCC.JCC.005 Admin Klik button sign-in valid")
//    public void admin_klik_button_signin_valid() {
//        Login.clickBtnSignIn();
//        delay(5);
//        extentTest.log(LogStatus.PASS, "Admin Klik button sign-in valid");
//
//    }
//
//    @Then("TCC.JCC.005 Admin berhasil login")
//    public void admin_berhasil_login() {
//
//        Assert.assertEquals(Login.getTxtDashboard(), "NIK");
//        delay(5);
//        extentTest.log(LogStatus.PASS, "Admin valid credentials Admin berhasil login");
//    }

    //=======================================================
    // 008 Masuk ke pertanyaan tentang shafiq
    //=======================================================
//    @When("TCC.JCC.005 Admin berada di halaman login")
//    public void admin_di_halaman_valid() {
//        driver.get(Constants.URL);
//        extentTest.log(LogStatus.PASS, "Admin on login page");
//    }
//    @And("TCC.JCC.005 Admin input username password valid")
//    public void admin_input_username_password_valid() {
//        Login.login("admin@connector.com", "admin@connector");
//        delay(4);
//        extentTest.log(LogStatus.PASS, "Admin input username password valid");
//    }
//
//    @And("TCC.JCC.005 Admin Klik button sign-in valid")
//    public void admin_klik_button_signin_valid() {
//        Login.clickBtnSignIn();
//        delay(5);
//        extentTest.log(LogStatus.PASS, "Admin Klik button sign-in valid");
//
//    }
//
//    @Then("TCC.JCC.005 Admin berhasil login")
//    public void admin_berhasil_login() {
//
//        Assert.assertEquals(Login.getTxtDashboard(), "NIK");
//        delay(5);
//        extentTest.log(LogStatus.PASS, "Admin valid credentials Admin berhasil login");
//    }

    //=======================================================
    // 009 Masuk ke dashboard user
    //    =======================================================
//    @When("TCC.JCC.005 Admin berada di halaman login")
//    public void admin_di_halaman_valid() {
//        driver.get(Constants.URL);
//        extentTest.log(LogStatus.PASS, "Admin on login page");
//    }
//    @And("TCC.JCC.005 Admin input username password valid")
//    public void admin_input_username_password_valid() {
//        Login.login("admin@connector.com", "admin@connector");
//        delay(4);
//        extentTest.log(LogStatus.PASS, "Admin input username password valid");
//    }
//
//    @And("TCC.JCC.005 Admin Klik button sign-in valid")
//    public void admin_klik_button_signin_valid() {
//        Login.clickBtnSignIn();
//        delay(5);
//        extentTest.log(LogStatus.PASS, "Admin Klik button sign-in valid");
//
//    }
//
//    @Then("TCC.JCC.005 Admin berhasil login")
//    public void admin_berhasil_login() {
//
//        Assert.assertEquals(Login.getTxtDashboard(), "NIK");
//        delay(5);
//        extentTest.log(LogStatus.PASS, "Admin valid credentials Admin berhasil login");
//    }

    //=======================================================
    // 010 Masuk ke tampilan portofolio
    //=======================================================
//    @When("TCC.JCC.005 Admin berada di halaman login")
//    public void admin_di_halaman_valid() {
//        driver.get(Constants.URL);
//        extentTest.log(LogStatus.PASS, "Admin on login page");
//    }
//    @And("TCC.JCC.005 Admin input username password valid")
//    public void admin_input_username_password_valid() {
//        Login.login("admin@connector.com", "admin@connector");
//        delay(4);
//        extentTest.log(LogStatus.PASS, "Admin input username password valid");
//    }
//
//    @And("TCC.JCC.005 Admin Klik button sign-in valid")
//    public void admin_klik_button_signin_valid() {
//        Login.clickBtnSignIn();
//        delay(5);
//        extentTest.log(LogStatus.PASS, "Admin Klik button sign-in valid");
//
//    }
//
//    @Then("TCC.JCC.005 Admin berhasil login")
//    public void admin_berhasil_login() {
//
//        Assert.assertEquals(Login.getTxtDashboard(), "NIK");
//        delay(5);
//        extentTest.log(LogStatus.PASS, "Admin valid credentials Admin berhasil login");
//    }

    //=======================================================
    // 011 Masuk ke tampilan dompet
    //=======================================================
//    @When("TCC.JCC.005 Admin berada di halaman login")
//    public void admin_di_halaman_valid() {
//        driver.get(Constants.URL);
//        extentTest.log(LogStatus.PASS, "Admin on login page");
//    }
//    @And("TCC.JCC.005 Admin input username password valid")
//    public void admin_input_username_password_valid() {
//        Login.login("admin@connector.com", "admin@connector");
//        delay(4);
//        extentTest.log(LogStatus.PASS, "Admin input username password valid");
//    }
//
//    @And("TCC.JCC.005 Admin Klik button sign-in valid")
//    public void admin_klik_button_signin_valid() {
//        Login.clickBtnSignIn();
//        delay(5);
//        extentTest.log(LogStatus.PASS, "Admin Klik button sign-in valid");
//
//    }
//
//    @Then("TCC.JCC.005 Admin berhasil login")
//    public void admin_berhasil_login() {
//
//        Assert.assertEquals(Login.getTxtDashboard(), "NIK");
//        delay(5);
//        extentTest.log(LogStatus.PASS, "Admin valid credentials Admin berhasil login");
//    }

    //=======================================================
    // 012 Masuk ke tampilan profil
    //=======================================================
//    @When("TCC.JCC.005 Admin berada di halaman login")
//    public void admin_di_halaman_valid() {
//        driver.get(Constants.URL);
//        extentTest.log(LogStatus.PASS, "Admin on login page");
//    }
//    @And("TCC.JCC.005 Admin input username password valid")
//    public void admin_input_username_password_valid() {
//        Login.login("admin@connector.com", "admin@connector");
//        delay(4);
//        extentTest.log(LogStatus.PASS, "Admin input username password valid");
//    }
//
//    @And("TCC.JCC.005 Admin Klik button sign-in valid")
//    public void admin_klik_button_signin_valid() {
//        Login.clickBtnSignIn();
//        delay(5);
//        extentTest.log(LogStatus.PASS, "Admin Klik button sign-in valid");
//
//    }
//
//    @Then("TCC.JCC.005 Admin berhasil login")
//    public void admin_berhasil_login() {
//
//        Assert.assertEquals(Login.getTxtDashboard(), "NIK");
//        delay(5);
//        extentTest.log(LogStatus.PASS, "Admin valid credentials Admin berhasil login");
//    }




}
    public static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

}
}

