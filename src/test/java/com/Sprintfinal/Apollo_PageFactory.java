package com.Sprintfinal;

import java.util.Scanner;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Apollo_PageFactory {

	WebDriver driver;
	Scanner data = new Scanner(System.in);

	@FindBy(how = How.XPATH, using = "//DIV[@class='jss200 ']")
	WebElement LocationDetector;

	@FindBy(how = How.XPATH, using = "(//SPAN[@class='path1'])[47]")
	WebElement PopupCrossButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[1]/div[1]/div/header/div[1]/div/div/div[2]/div[1]/p")
	WebElement CurrentLocation;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[1]/div[1]/div/header/div[1]/div/div/div[2]/div[3]/p")
	WebElement AskForPincode;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[3]/div/div/div[1]/div/input")
	WebElement PinPopup;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[1]/div[1]/div/header/div[3]/div[1]/a[3]/span[1]")
	WebElement LabTests;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[1]/div[1]/div/header/div[3]/div[1]/a[2]/span[1]")
	WebElement Pharmacy;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div/div[3]/div[2]/button[2]/span[1]")
	WebElement AutoDetect;

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[3]/div/div/div[2]/button")
	WebElement PinSubmit;

	@FindBy(id = "searchProduct")
	WebElement SearchBar;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[1]/div/div[1]/button")
	WebElement SearchBarButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[1]/div[1]/button")
	WebElement SearchBarButtonAfter;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[1]/img")
	WebElement FirstSlide;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/img")
	WebElement SecondSlide;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[3]/img")
	WebElement ThirdSlide;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[4]/img")
	WebElement FourthSlide;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[5]/img")
	WebElement FifthSlide;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[6]/img")
	WebElement SixthSlide;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[7]/img")
	WebElement SeventhSlide;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/ul/li[1]/span")
	WebElement FirstDot;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/ul/li[2]")
	WebElement SecondDot;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/ul/li[3]")
	WebElement ThirdDot;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/ul/li[4]/span")
	WebElement FourthDot;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/ul/li[5]/span")
	WebElement FifthDot;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/ul/li[6]/span")
	WebElement SixthDot;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div/ul/li[7]/span")
	WebElement SeventhDot;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div/div/div[1]/button")
	WebElement MainUploadButton;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/label/p")
	WebElement ChooseFromGallaryButton;

	@FindBy(how = How.ID, using = "icon-button-file")
	WebElement UploadInput;

	@FindBy(how = How.XPATH, using = "//*[@id=\"__next\"]/div/div[2]/div/div[2]/div[1]/div[2]/button/span[1]")
	WebElement LoginToContinue;

	@FindBy(how = How.NAME, using = "mobileNumber")
	WebElement PhoneNumberInput;

	@FindBy(how = How.XPATH, using = "//button[@class='MuiButtonBase-root MuiFab-root MuiFab-primary']")
	WebElement LoginNextButton;

	@FindBy(how = How.XPATH, using = "//button[@class='MuiButtonBase-root MuiFab-root MuiFab-primary']")
	WebElement OTPNextButton;

	@FindBy(how = How.XPATH, using = "//input[@class='MuiInputBase-input MuiInput-input']")
	WebElement OTPInput;

	@FindBy(how = How.XPATH, using = "//div[@class='jss80 jss81']")
	WebElement profileIcon;

	@FindBy(how = How.XPATH, using = "//A[@href='/shop-by-category/ayurveda'][text()='Ayurveda']")
	WebElement Aurveda;

	@FindBy(how = How.XPATH, using = "//A[@href='/shop-by-category/health-devices'][text()='Health Devices']")
	WebElement HealthDevice;

	@FindBy(how = How.XPATH, using = "//A[@href='/shop-by-category/baby-care'][text()='Baby Care']")
	WebElement BabyCare;

	@FindBy(how = How.XPATH, using = "//A[@href='/shop-by-category/women-care'][text()='Women Care']")
	WebElement WomenCare;

	@FindBy(how = How.XPATH, using = "//A[@href='/shop-by-category/personal-care-1'][text()='Personal Care']")
	WebElement PersonalCare;

	@FindBy(how = How.XPATH, using = "//A[@href='/shop-by-category/home-essentials'][text()='Home Essentials']")
	WebElement HomeEssential;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Health & Nutrition')]")
	WebElement HealthAndNutrition;

	@FindBy(how = How.XPATH, using = "//A[@href='/shop-by-category/otc'][text()='OTC']")
	WebElement OTC;

	@FindBy(how = How.XPATH, using = "//A[@href='/shop-by-category/apollo-products'][text()='Apollo Life']")
	WebElement ApolloLife;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Holland & Barrett')]")
	WebElement HollandAndBarrett;

	@FindBy(how = How.XPATH, using = "(//DIV[@class='jss285'])[1]")
	WebElement DiabetesCare;

	@FindBy(how = How.XPATH, using = "//DIV[@class='jss287'][text()='Cardiac']")
	WebElement Cardiac;

	@FindBy(how = How.XPATH, using = "//DIV[@class='jss287'][text()='Pain Relief']")
	WebElement PainRelief;

	@FindBy(how = How.XPATH, using = "//DIV[@class='jss287'][text()='COVID Care']")
	WebElement CovidCare;

	@FindBy(how = How.XPATH, using = "//DIV[@class='jss287'][text()='COVID Protection']")
	WebElement CovidProtection;

	@FindBy(how = How.XPATH, using = "//DIV[@class='jss287'][text()='Respiratory']")
	WebElement Respiratory;

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Cold & Immunity')]")
	WebElement ColdAndImmunity;

	@FindBy(how = How.XPATH, using = "//DIV[@class='jss287'][text()='Stomach Care']")
	WebElement StomachCare;

	@FindBy(how = How.XPATH, using = "//DIV[@class='jss287'][text()='Sexual Health']")
	WebElement SexualHealth;

	@FindBy(how = How.XPATH, using = "//DIV[@class='jss287'][text()='Eye and Ear Care']")
	WebElement EyeAndEarCare;

	@FindBy(how = How.XPATH, using = "//DIV[@class='jss287'][text()='Elderly Care']")
	WebElement ElderCare;

	@FindBy(how = How.XPATH, using = "(//SPAN[@class='icon-ic_arrow_right'])[1]")
	WebElement RightAerrow;

	@FindBy(how = How.XPATH, using = "//SPAN[@class='icon-ic_arrow_left']")
	WebElement LeftAerrow;

	@FindBy(how = How.XPATH, using = "(//SPAN[@class='MuiButton-label'][text()='Add To Cart'])[1]")
	WebElement AddToCart;

	@FindBy(how = How.XPATH, using = "(//BUTTON[@class='MuiButtonBase-root MuiButton-root jss153 MuiButton-text'])[4]")
	WebElement Add10;

	@FindBy(how = How.XPATH, using = "//SPAN[@class='MuiButton-label'][text()='10']")
	WebElement AddToCartValue;

	public Apollo_PageFactory(WebDriver driver) {
		this.driver = driver;
	}

	public void LocMain() {
		LocationDetector.click();
	}

	String filepath = "C:\\Users\\bibhpatr\\OneDrive - Capgemini\\Desktop\\medical_report_bibhu_patra_2021-42-08-29-21.pdf";

	public void FileLocator() throws InterruptedException {
		MainUploadButton.click();
		Thread.sleep(2000);
	}

	public void fileUpload() throws InterruptedException {
		UploadInput.sendKeys(filepath);
		System.out.println("Reached enough");
		Thread.sleep(2000);
	}

	public void login() throws InterruptedException {
		LoginToContinue.click();
		System.out.println("Give The Phone Number");
		String Phone = data.nextLine();
		PhoneNumberInput.sendKeys(Phone);
		LoginNextButton.click();
		System.out.println("Give The OTP");
		String OTP = data.nextLine();
		OTPInput.sendKeys(OTP);
		Thread.sleep(2000);
		OTPNextButton.click();
	}

	public void fileCheck() {
		long SizeOfFile = filepath.length();
		if (SizeOfFile < 3145728)
			System.out.println("File is acceptable and Uploaded!");
		else
			System.out.println("File size is more than 3 MB");
	}

	public void LocByAuto() throws InterruptedException {
		Thread.sleep(3000);
		CurrentLocation.click();
	}

	public void PinMain() {
		AskForPincode.click();
	}

	public void clickPopup() {
		PinPopup.click();
	}

	public void LocByPin(String pincode) {
		PinPopup.sendKeys(pincode);
	}

	public void PincodeSubmit() {
		PinSubmit.click();
	}

	public void ClickedSearchBar() {
		SearchBar.click();
	}

	public void SearchedForSearchBar(String RandomCharachters) {
		SearchBar.sendKeys(RandomCharachters);
	}

	public void DisabledButton() {
		if (SearchBarButton.isEnabled()) {
			System.out.println("You have entered three or more than three characters");
			SearchBarButton.click();
		} else
			System.out.println("Button is disabled");
	}

	public void AfterDisabledButton() {
		if (SearchBarButtonAfter.isEnabled()) {
			System.out.println("The favoured outupt is here");
			SearchBarButtonAfter.click();
		} else
			System.out.println("Button is disabled");
	}

	public void FirstCarousel() throws InterruptedException {
		FirstSlide.click();
		Thread.sleep(3000);
		System.out.println("Inside the 1st slide of offer carousel");
		System.out.println("Preaparing to naviagate back page");
		driver.navigate().back();
		Thread.sleep(4000);
		SecondDot.click();
	}

	public void SecondCarousel() throws InterruptedException {
		SecondSlide.click();
		Thread.sleep(3000);
		System.out.println("Inside the 2nd slide of offer carousel");
		System.out.println("Preaparing to naviagate back page");
		driver.navigate().back();
		Thread.sleep(4000);
		ThirdDot.click();
	}

	public void ThirdCarousel() throws InterruptedException {
		ThirdSlide.click();
		Thread.sleep(3000);
		System.out.println("Inside the 3rd slide of offer carousel");
		System.out.println("Preaparing to naviagate back page");
		driver.navigate().back();
		Thread.sleep(4000);
		FourthDot.click();
	}

	public void FouthCarousel() throws InterruptedException {
		FourthSlide.click();
		Thread.sleep(3000);
		System.out.println("Inside the 4th slide of offer carousel");
		System.out.println("Preaparing to naviagate back page");
		driver.navigate().back();
		Thread.sleep(4000);
		FifthDot.click();
	}

	public void FifthCarousel() throws InterruptedException {
		FifthSlide.click();
		Thread.sleep(3000);
		System.out.println("Inside the 5th slide of offer carousel");
		System.out.println("Preaparing to naviagate back page");
		driver.navigate().back();
		Thread.sleep(4000);
		SixthDot.click();
	}

	public void SixthCarousel() throws InterruptedException {

		SixthSlide.click();
		Thread.sleep(3000);
		System.out.println("Inside the 6th slide of offer carousel");
		System.out.println("Preaparing to naviagate back page");
		driver.navigate().back();
		Thread.sleep(4000);
		SeventhDot.click();
	}

	public void SeventhCarousel() throws InterruptedException {
		SeventhSlide.click();
		Thread.sleep(3000);
		System.out.println("Inside the 7th slide of offer carousel");
		System.out.println("Preaparing to naviagate back page");
		driver.navigate().back();
		Thread.sleep(4000);
		System.out.println("Browser Closing");

	}

	public void Dot1() {
		FirstDot.click();
	}

	public void Dot2() {
		SecondDot.click();
	}

	public void Dot3() {
		ThirdDot.click();
	}

	public void Dot4() {
		FourthDot.click();
	}

	public void Dot5() {
		FifthDot.click();
	}

	public void Dot6() {
		SixthDot.click();
	}

	public void Dot7() {
		SeventhDot.click();
	}

	public void ActivateDiabetesCare() throws InterruptedException {
		DiabetesCare.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void ActivateCardiac() throws InterruptedException {
		Cardiac.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void ActivatePainRelief() throws InterruptedException {
		PainRelief.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void ActivateCovidCare() throws InterruptedException {
		CovidCare.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void ActivateCovidProtection() throws InterruptedException {
		CovidProtection.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void ActivateRespiratory() throws InterruptedException {
		Respiratory.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void ActivateRightAerrow() throws InterruptedException {
		RightAerrow.click();
		Thread.sleep(2000);
	}

	public void ActivateLeftAerrow() throws InterruptedException {
		LeftAerrow.click();
		Thread.sleep(2000);
	}

	public void ActivateColdAndImmunity() throws InterruptedException {
		ColdAndImmunity.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void ActivateStomachCare() throws InterruptedException {
		StomachCare.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void ActivateSexualHealth() throws InterruptedException {
		SexualHealth.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void ActivateEyeAndEarCare() throws InterruptedException {
		EyeAndEarCare.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void ActivateElderCare() throws InterruptedException {
		ElderCare.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	public void AddToCart() throws InterruptedException {

		AddToCart.click();
		for (int i = 1; i < 10; i++)
			Add10.click();
	}

	public void CheckQuantity() {
		String Temp = AddToCartValue.getText();
		System.out.println("Cart has " + Temp + " quantity");
	}

}
