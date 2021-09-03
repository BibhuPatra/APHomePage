@Functionality 
Feature: Apollo Pharmacy Homepage 

Scenario: Check location detection by Pin 

	Given user can navigate to homepage 
	When customer is clicking on select your location 
	And customer click to enter delivery pincode 
	And customer provide pincode 
	Then Sumbmit the pincode 
	Then Address updated 
	And Closing 
	
@SerchBar_Enable_Functionality 
Scenario: Checking wheather the searchbar button is enable or not 

	Given user can navigate to homepage 
	When customer is clicking on select your location 
	And customer click to enter delivery pincode 
	And customer provide pincode 
	Then Sumbmit the pincode 
	Then Address updated 
	Given user navigates to Homepage with location update 
	Given  user navigates to serach bar 
	When user leaves the search bar empty and clicks on search button 
	And Close 
	
@SearchBar_Functionality 
Scenario: Search for product by entering any value in search bar 

	Given the customer can search medicines,brands and more in the paticular location to buy them 
	Then the customer is searching 3 or more than charachter for autofill predictions 
	And the customer is entering any uppercase,lowecase along with special character 
	Then the button is disabled before customer has inserted three characters or more than three characters 
	
@Offer_Functionality 
Scenario: Offer_Carousel_Functionality 
	Given the customer can click on every slides for more information about the offer information 
	Then  the customer can click on the dots to change to slide 
	
@Upload_Document 
Scenario: Check_The_Documnet_Are_Uploading 
	Given The customer can click on upoload prescription for placing the order 
	When The customer is selecting the document 
	When User Navigate to LogIn Page 
	And the document has maximum size 3 mega-pixel 
	And User enters Credentials to LogIn 
	Then Message displayed Login Successfully 
	
@Hover_Special_Offer 
Scenario: Check_The_Hover_And_Special_Offers 
	Given The customer is hovering on Aurveda 
	When The customer is hovering on HealthDevice 
	And the customer is hovering on BabyCare 
	And The customer is hovering on WomenCare 
	And The customer is hovering on PersonalCare 
	And The customer is hovering on HomeEssentials 
	And The customer is hovering on Health&Nutrition 
	Then The customer is hovering on OTC 
	Then The customer is hovering on ApolloLife 
	Then the customer is hovering on Holland&Barrett 
	
@Category_Functionality 
Scenario: The Shop By Category Functionality 
	Given the customer can access the shop with the categories on the homepage section 
	When customer can click on next button for more categories 
	When the customer can directly add the product to his/her carts without signin 
	And the category for the product is avilable in the homepage 
	Then the customer can only add ten or less then ten quantity of a single product for his/her account only
	
	
	#@CurrentLocation 
	#Scenario: Check location detection 
	#
	#	Given user can navigate to homepage 
	#	When customer is clicking on select your location 
	#	And Website is taking customer location clicking opon use my current location
	#	Then To check whether the customer is on the homepage, Pharmacy and other products more specifically
	