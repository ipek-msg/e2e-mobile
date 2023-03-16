package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Allpages;
import utilities.ConfigReader;
import utilities.Driver;


public class HomePageStepDefs {

    Allpages elements = new Allpages();


    @Given("Alltricks anasayfasina git")
    public void alltricks_anasayfasina_git() throws InterruptedException {

        Driver.getAppiumDriver().get(ConfigReader.getProperty("Url"));

        Thread.sleep(2000);
        elements.btnAccepter.click();


    }

    @And("Profil sekmesine geç")
    public void profil_sekmesine_geç() {

        elements.btnProfil.click();
    }

    @Then("Adresim kismina emaili gir")
    public void adresim_kismina_emaili_gir() throws InterruptedException {

        elements.monProfil.click();

    }

    @Given("cookiesi kabul et")
    public void cookiesiKabulEt() {
        elements.AggreeandCloseButton.click();
    }
}