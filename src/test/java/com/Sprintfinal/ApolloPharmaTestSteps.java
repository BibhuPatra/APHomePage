package com.Sprintfinal;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
//import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApolloPharmaTestSteps {
	Apollo_PageFactory objdemo;
	public static WebDriver driver;
	Scanner data = new Scanner(System.in);

	@Before
	// Launching GoogleChrome. . .
	public void launchBrowser() {
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Integer> contentSettings = new HashMap<String, Integer>();
		HashMap<String, Object> profile = new HashMap<String, Object>();
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		contentSettings.put("notifications", 2);
		contentSettings.put("geolocation", 1);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile", profile);
		options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.apollopharmacy.in/");
		objdemo = new Apollo_PageFactory(driver);
		objdemo = PageFactory.initElements(driver, Apollo_PageFactory.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Given("user can navigate to homepage")
	public void user_can_navigate_to_homepage() throws Throwable {

		Thread.sleep(3000);
	}

//	@When("^customer is clicking on select your location$")
//	public void customer_is_clicking_on_select_your_location() throws Throwable {
//		objdemo.LocByAuto();
//	}
//	@And("Website is taking customer location clicking opon use my current location")
//	public void website_is_taking_customer_location_clicking_opon_use_my_current_details() throws Throwable {
//		objdemo.LocByAuto();
//	}

	@When("customer is clicking on select your location")
	public void customer_is_clicking_on_select_your_location() {
		objdemo.PinMain();
	}

	@And("customer click to enter delivery pincode")
	public void customer_click_to_enter_delivery_pincode() {
		objdemo.clickPopup();
	}

	@And("customer provide pincode")
	public void customer_provide_pincode() {
		System.out.println("Give your pincode");
		String Pincode = data.nextLine();
		objdemo.LocByPin(Pincode);
	}

	@Then("Sumbmit the pincode")
	public void PincodeSubmitHandler() {
		objdemo.PincodeSubmit();
	}

	@Then("Address updated")
	public void adress_updated() {
		System.out.println("Adress Updated");
	}

	@Then("Closing")
	public void BrowserClose() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Closing the Browser");
		driver.close();
	}

	@Given("user navigates to Homepage with location update")
	public void user_navigates_to_Homepage_with_location_update() {
		System.out.println("Navigated to home page with Pincode updated");
	}

	@Given("^user navigates to serach bar$")
	public void user_navigates_to_serach_bar() {
		System.out.println("Clicked Search Bar");
		objdemo.ClickedSearchBar();
	}

	@When("user leaves the search bar empty and clicks on search button")
	public void user_leaves_the_search_bar_empty_and_clicks_on_search_button() {
		objdemo.DisabledButton();
	}

	@Then("Close")
	public void Close() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Closing the Browser");
		driver.close();
	}

	@Given("the customer can search medicines,brands and more in the paticular location to buy them")
	public void the_customer_can_search_medicines_brands_and_more_in_the_paticular_location_to_buy_them()
			throws Exception {
		System.out.println("Clicked Search Bar");
		objdemo.ClickedSearchBar();
		System.out.println("Enter what you want to search");
		objdemo.DisabledButton();
	}

	@Then("the customer is searching {int} or more than charachter for autofill predictions")
	public void the_customer_is_searching_or_more_than_charachter_for_autofill_predictions(Integer int1)
			throws InterruptedException {
		objdemo.ClickedSearchBar();
		System.out.println("Enter what you want to search somthing more than 2 charchters");
		String valuableUserInput = data.nextLine();
		objdemo.SearchedForSearchBar(valuableUserInput);
		System.out.println("Autofill Appeared");
		Thread.sleep(5000);
		objdemo.DisabledButton();
	}

	@Then("the customer is entering any uppercase,lowecase along with special character")
	public void the_customer_is_entering_any_uppercase_lowecase_along_with_special_character()
			throws InterruptedException {
		objdemo.ClickedSearchBar();
		System.out.println("Give some baseless input like special character");
		String baselessUserInput = data.nextLine();
		objdemo.SearchedForSearchBar(baselessUserInput);
		System.out.println("Autofill Appeared again");
		Thread.sleep(5000);
		objdemo.AfterDisabledButton();
	}

	@Then("the button is disabled before customer has inserted three characters or more than three characters")
	public void the_button_is_disabled_while_customer_has_inserted_three_characters_or_more_than_three_characters()
			throws InterruptedException {
		System.out.println("Give some baseless input like special character");
		String UserInputx = data.nextLine();
		objdemo.SearchedForSearchBar(UserInputx);
		if (UserInputx.length() > 2) {
			objdemo.AfterDisabledButton();
			driver.close();
		} else
			System.out.println("You have to give more than three character input");
		Thread.sleep(3000);
		driver.close();
	}

	@Given("the customer can click on every slides for more information about the offer information")
	public void the_customer_can_click_on_every_slides_for_more_information_about_the_offer_information()
			throws InterruptedException {
		objdemo.FirstCarousel();
		Thread.sleep(3000);
		objdemo.SecondCarousel();
		Thread.sleep(3000);
		objdemo.ThirdCarousel();
		Thread.sleep(3000);
		objdemo.FouthCarousel();
		Thread.sleep(3000);
		objdemo.FifthCarousel();
		Thread.sleep(3000);
		objdemo.SixthCarousel();
		Thread.sleep(3000);
		objdemo.SeventhCarousel();
		Thread.sleep(3000);
	}

	@Then("the customer can click on the dots to change to slide")
	public void the_customer_can_click_on_the_dots_to_change_to_slide() throws InterruptedException {
		objdemo.Dot1();
		Thread.sleep(1000);
		objdemo.Dot2();
		Thread.sleep(1000);
		objdemo.Dot3();
		Thread.sleep(1000);
		objdemo.Dot4();
		Thread.sleep(1000);
		objdemo.Dot5();
		Thread.sleep(1000);
		objdemo.Dot6();
		Thread.sleep(1000);
		objdemo.Dot7();
		Thread.sleep(1000);
	}

	@Given("The customer can click on upoload prescription for placing the order")
	public void the_customer_can_click_on_upoload_prescription_for_placing_the_order() throws InterruptedException {
		objdemo.FileLocator();
	}

	@When("The customer is selecting the document")
	public void the_customer_is_selecting_the_document() throws InterruptedException {
		objdemo.fileUpload();
	}

	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() throws InterruptedException {
		System.out.println("You are now navigate to login page");
	}

	@When("the document has maximum size {int} mega-pixel")
	public void the_document_has_maximum_size_mega_pixel(Integer int1) {
		objdemo.fileCheck();
	}

	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in() throws InterruptedException {
		objdemo.login();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() throws InterruptedException {
		driver.getTitle();
		System.out.println("User authenticated!");
		objdemo.profileIcon.click();
		Thread.sleep(4000);
		driver.close();
	}

	@Given("The customer is hovering on Aurveda")
	public void the_customer_is_hovering_on_aurveda() throws InterruptedException {
		customer_is_clicking_on_select_your_location();
		customer_click_to_enter_delivery_pincode();
		customer_provide_pincode();
		PincodeSubmitHandler();
		adress_updated();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(objdemo.Aurveda).build().perform();
		Thread.sleep(2000);
	}

	@When("The customer is hovering on HealthDevice")
	public void the_customer_is_hovering_on_health_device() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(objdemo.HealthDevice).build().perform();
		Thread.sleep(2000);
	}

	@When("the customer is hovering on BabyCare")
	public void the_customer_is_hovering_on_baby_care() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(objdemo.BabyCare).build().perform();
		Thread.sleep(2000);
	}

	@When("The customer is hovering on WomenCare")
	public void the_customer_is_hovering_on_women_care() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(objdemo.WomenCare).build().perform();
		Thread.sleep(2000);
	}

	@When("The customer is hovering on PersonalCare")
	public void the_customer_is_hovering_on_personal_care() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(objdemo.PersonalCare).build().perform();
		Thread.sleep(2000);
	}

	@When("The customer is hovering on HomeEssentials")
	public void the_customer_is_hovering_on_home_essentials() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(objdemo.HomeEssential).build().perform();
		Thread.sleep(2000);
	}

	@When("The customer is hovering on Health&Nutrition")
	public void the_customer_is_hovering_on_health_nutrition() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(objdemo.HealthAndNutrition).build().perform();
		Thread.sleep(2000);
	}

	@Then("The customer is hovering on OTC")
	public void the_customer_is_hovering_on_otc() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(objdemo.OTC).build().perform();
		Thread.sleep(2000);
	}

	@Then("The customer is hovering on ApolloLife")
	public void the_customer_is_hovering_on_apollo_life() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(objdemo.ApolloLife).build().perform();
		Thread.sleep(2000);
	}

	@Then("the customer is hovering on Holland&Barrett")
	public void the_customer_is_hovering_on_holland_barrett() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(objdemo.HollandAndBarrett).build().perform();
		Thread.sleep(2000);
		driver.close();
	}

	@Given("the customer can access the shop with the categories on the homepage section")
	public void the_customer_can_access_the_shop_with_the_categories_on_the_homepage_section()
			throws InterruptedException {
		objdemo.ActivateDiabetesCare();
		System.out.println("Inside DiabetesCare");
		objdemo.ActivateCardiac();
		System.out.println("Inside Cardiac");
		objdemo.ActivateCardiac();
		System.out.println("Inside Covid Care");
		objdemo.ActivateCovidProtection();
		System.out.println("Inside CovidProtection");
		objdemo.ActivateRespiratory();
		System.out.println("Inside Respiratory");
		objdemo.ActivateRightAerrow();
		System.out.println("RightAerrow Clicked");
//		objdemo.ActivateLeftAerrow();
//		System.out.println("LeftAerrow Clicked");
//		objdemo.ActivateRightAerrow();
//		System.out.println("RightAerrow Clicked");
		objdemo.ActivateColdAndImmunity();
		System.out.println("Inside ColdAndImmunity");
		objdemo.ActivateRightAerrow();
		System.out.println("RightAerrow Clicked");
		objdemo.ActivateStomachCare();
		System.out.println("Inside StomachCare");
		objdemo.ActivateRightAerrow();
		System.out.println("RightAerrow Clicked");
		objdemo.ActivateSexualHealth();
		System.out.println("Inside SexualHealth");
		objdemo.ActivateRightAerrow();
		System.out.println("RightAerrow Clicked");
		objdemo.ActivateEyeAndEarCare();
		System.out.println("Inside EyeAndEarCare");
		objdemo.ActivateRightAerrow();
		System.out.println("RightAerrow Clicked");
		objdemo.ActivateElderCare();
		System.out.println("Inside ElderCare");
	}

	@When("customer can click on next button for more categories")
	public void customer_can_click_on_next_button_for_more_categories() throws InterruptedException {
		objdemo.ActivateRightAerrow();
	}

	@When("the customer can directly add the product to his\\/her carts without signin")
	public void the_customer_can_directly_add_the_product_to_his_her_carts_without_signin()
			throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		objdemo.AddToCart();
		System.out.println("Item Added 10 times");
	}

	@When("the category for the product is avilable in the homepage")
	public void the_category_for_the_product_is_avilable_in_the_homepage() throws InterruptedException {
		objdemo.Aurveda.click();
		Thread.sleep(4000);
		driver.navigate().back();
		System.out.println("Catagory product is available in the homepage");
	}

	@Then("the customer can only add ten or less then ten quantity of a single product for his\\/her account only")
	public void the_customer_can_only_add_ten_or_less_then_ten_quantity_of_a_single_product_for_his_her_account_only() {
		System.out.println("Inside Quantity Check");
		objdemo.CheckQuantity();
		System.out.println("Quantity cannot be more than 10");
		driver.close();
	}
}
