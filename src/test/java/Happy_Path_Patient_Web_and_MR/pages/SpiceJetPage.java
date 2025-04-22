package Happy_Path_Patient_Web_and_MR.pages;

import cap.common.BasePage;
import cap.utilities.TestDataUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SpiceJetPage extends BasePage {

    public SpiceJetPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Login')]")
    protected WebElement elmntLoginLink;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Signup')]")
    protected WebElement elemntSignUpbtn;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Submit')]")
    protected WebElement btnSubmit;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Please fill all mandatory fields marked with an')]")
    protected WebElement elmntMandatoryFields;

    @FindBy(how = How.XPATH, using = "//select[@class='form-control form-select ']")
    protected WebElement elmntCrAcTitle;

    protected String elmntTitleSelect = "//select[@class='form-control form-select ']";

    @FindBy(how = How.XPATH, using = "//input[@id='first_name']")
    protected WebElement elmntCrAcFirstName;

    @FindBy(how = How.XPATH, using = "//input[@id='last_name']")
    protected WebElement elmntCrAcLastName;

    @FindBy(how = How.XPATH, using = "//input[@id='dobDate']")
    protected WebElement elmntDOB;

    @FindBy(how = How.XPATH, using = "//input[@type='tel']")
    protected WebElement elmntMobileNumber;

    @FindBy(how = How.XPATH, using = "//input[@id='email_id']")
    protected WebElement elmntEmailId;

    @FindBy(how = How.XPATH, using = "//input[@id='new-password']")
    protected WebElement elmntNewPassword;

    @FindBy(how = How.XPATH, using = "//input[@id='c-password']")
    protected WebElement elmntConfirmPassword;

    @FindBy(how = How.XPATH, using = "//input[@id='defaultCheck1']")
    protected WebElement elmntTC;

    protected String elmntSpicejetInvalidDataValidationMsgs = new StringBuilder().append("//div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using = "//a[@class='link droptown-toggle account-toggle cursor-p']")
    protected WebElement elmntLogoutArrow;

    @FindBy(how = How.XPATH, using = "//div[@class='logout-link-container']/span[contains(text(),'Log Out')]")
    protected WebElement elmntLogoutLink;

    @FindBy(how = How.XPATH, using = "//div[@class='css-1dbjc4n r-zso239']/following-sibling::div/div[contains(text(),'Email')]/parent::div")
    protected WebElement elmntLoginEmailCheckbox;

    @FindBy(how = How.XPATH, using = "//input[@data-testid='user-mobileno-input-box']")
    protected WebElement elmntLoginEmailInput;

    @FindBy(how = How.XPATH, using = "//input[@data-testid='password-input-box-cta']")
    protected WebElement elmntLoginPasswordInput;

    //@FindBy(how = How.XPATH, using = "//div[@data-testid='login-cta']/div[contains(text(),'LOGIN')]")
    //protected WebElement elmntSubmitLogin;

    @FindBy(how = How.XPATH, using = "//div[@data-testid='login-cta']")
    protected WebElement elmntSubmitLogin;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Hi Bhaanu Reaka')]")
    protected WebElement elmntAccountName;

    @FindBy(how = How.XPATH, using = "//label[contains(text(),'OTP Verification')]")
    protected WebElement elmntOTPVerificationLabel;

    @FindBy(how = How.XPATH, using ="//input[@id='first']")
    protected WebElement elmntOTPFirst;

    @FindBy(how = How.XPATH, using ="//input[@id='second']")
    protected WebElement elmntOTPSecond;

    @FindBy(how = How.XPATH, using ="//input[@id='third']")
    protected WebElement elmntOTPThird;

    @FindBy(how = How.XPATH, using ="//input[@id='fourth']")
    protected WebElement elmntOTPFourth;

    @FindBy(how = How.XPATH, using ="//input[@id='fifth']")
    protected WebElement elmntOTPFive;

    @FindBy(how = How.XPATH, using ="//input[@id='sixth']")
    protected WebElement elmntOTPSix;

    @FindBy(how = How.XPATH, using ="//button[contains(text(),'Verify')]")
    protected WebElement elmntVerifyButton;

    @FindBy(how = How.XPATH, using ="//div[contains(text(),'Flights')]")
    protected WebElement elmntFlightsTab;

    @FindBy(how = How.XPATH, using ="//div[contains(text(),'one way')]")
    protected WebElement elmntOneWayRadioBtn;

    @FindBy(how = How.XPATH, using ="//div[contains(text(),'round trip')]")
    protected WebElement elmntTwoWayRadioBtn;
    @FindBy(how = How.XPATH, using ="//div[contains(text(),'From')]/following-sibling::div/input")
    protected WebElement elmntFrom;

    @FindBy(how = How.XPATH, using ="//div[contains(text(),'To')]/following-sibling::div/input")
    protected WebElement elmntTo;

    @FindBy(how = How.XPATH, using ="//div[@data-testid='departure-date-dropdown-label-test-id']")
    protected WebElement elmntFromDatePicker;

    @FindBy(how = How.XPATH, using ="//div[@data-testid='return-date-dropdown-label-test-id']")
    protected WebElement elmntToDatePicker;

    protected String elmntDatePickerList ="//div[@data-testid='undefined-month-May-2025']//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55']/div";

    //protected String elmntDatePickerList ="//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55']/div";
    //protected String elmntDatePickerValue = new StringBuilder().append("//div[@data-testid='undefined-month-May-2025']//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55'][")
            //.append("<<REPLACEMENT1>>").append("]//child::div[contains(text(),'").append("<<REPLACEMENT2>>").append("')]").toString();

    protected String elmntDatePickerValue = new StringBuilder().append("//div[@data-testid='undefined-month-May-2025']//div[@class='css-1dbjc4n r-6koalj r-18u37iz r-d0pm55']/div//child::div[contains(text(),'")
            .append("<<REPLACEMENT>>").append("')]").toString();

    @FindBy(how = How.XPATH, using ="//div[contains(text(),'Departure Date')]/following-sibling::div/div[1]")
    protected WebElement elmntFromDateValue;

    @FindBy(how = How.XPATH, using ="//div[contains(text(),'Return Date')]/following-sibling::div/div[1]")
    protected WebElement elmntToDateValue;

    @FindBy(how = How.XPATH, using ="//div[contains(text(),'I Am Here For')]")
    protected WebElement elmntOutsideDatePickerClick;

    @FindBy(how = How.XPATH, using ="//div[@data-testid='home-page-flight-cta']/div[contains(text(),'Search Flight')]")
    protected WebElement elmntSearchFlightBtn;

    @FindBy(how = How.XPATH, using ="//div[contains(text(),'Unfortunately, there are no flights available.')]")
    protected WebElement elmntNoFlightsAvailabletxt;

    @FindBy(how = How.XPATH, using ="//div[@data-testid='continue-search-page-cta']//div[contains(text(),'Continue')]")
    protected WebElement elmntAvailableFlightContinueBtn;

    @FindBy(how = How.XPATH, using ="//input[@data-testid='first-inputbox-contact-details']")
    protected WebElement elmntContactFirstName;

    @FindBy(how = How.XPATH, using ="//input[@data-testid='last-inputbox-contact-details']")
    protected WebElement elmntContactLastName;

    @FindBy(how = How.XPATH, using ="//input[@data-testid='contact-number-input-box']")
    protected WebElement elmntContactNumber;

    @FindBy(how = How.XPATH, using ="//input[@data-testid='emailAddress-inputbox-contact-details']")
    protected WebElement elmntContactEmailAddress;

    @FindBy(how = How.XPATH, using ="//input[@data-testid='city-inputbox-contact-details']")
    protected WebElement elmntContactCity;

    @FindBy(how = How.XPATH, using ="//div[contains(text(),'I am flying as the primary passenger')]")
    protected WebElement elmntContactPrimaryPassenger;

    @FindBy(how = How.XPATH, using ="//div[@data-testid='traveller-info-continue-cta']/div[contains(text(),'Continue')]")
    protected WebElement elmntTripSummaryContinuebtn;

    @FindBy(how = How.XPATH, using ="//div[@data-testid='add-ons-continue-footer-button']")
    protected WebElement elmntTripSummaryAddOnsContinuebtn;

    @FindBy(how = How.XPATH, using ="//div[contains(text(),'SKIP THIS TO SKIP COMFORT')]")
    protected WebElement elmntSpiceMaxSkipbtn;

    @FindBy(how = How.XPATH, using ="//iframe[@name='card_number_iframe_Snf8LphxWqPf3qsb']")
    protected WebElement elmntCardDetailsFrameName;

    @FindBy(how = How.XPATH, using ="//input[@id='card_number']")
    protected WebElement elmntCardNumber;

    @FindBy(how = How.XPATH, using ="//input[@id='name_on_card']")
    protected WebElement elmntCardName;

    @FindBy(how = How.XPATH, using ="//input[@id='card_exp_month']")
    protected WebElement elmntCardExpiryMonth;

    @FindBy(how = How.XPATH, using ="//input[@id='card_exp_year']")
    protected WebElement elmntCardExpiryYear;

    @FindBy(how = How.XPATH, using ="//input[@id='security_code']")
    protected WebElement elmntCardCVV;

    @FindBy(how = How.XPATH, using ="//div[@data-testid='common-proceed-to-pay']")
    protected WebElement elmntProceedToPaybtn;

    @FindBy(how = How.XPATH, using ="//div[contains(text(),'Sorry! We’re having trouble processing your payment. ')]")
    protected WebElement elmntTestCardPaymentFailure;

    public boolean visitWebsite() {

        boolean blResult = false;
        System.out.println("Inside Visit");
        int WindowsCount = driver.getWindowHandles().size();
        System.out.println("===============>WindowsCount::" + WindowsCount);
        if (WindowsCount == 2) {
            focusWindow(1);
            if (verifyElement(elmntLoginLink)) {
                driver.manage().deleteAllCookies();
                System.out.println("User here in Provider home page");
            } else {

//                System.out.println("Else Part ::::::Window Count 2");
                driver.manage().deleteAllCookies();
                visit(TestDataUtil.getValue("&URL&"));

            }
        }
        if (WindowsCount == 1) {
            if (verifyElement(elmntLoginLink)) {
                driver.manage().deleteAllCookies();
                System.out.println("Inside WindowsCount 1 - IF Block");
                System.out.println("User is in Country Selection Landing Page");
                takeScreenshot(driver);
            } else {
                System.out.println("Inside WindowsCount 1 - ELSE Block");
                visit(TestDataUtil.getValue("&URL&"));
                driver.manage().deleteAllCookies();
            }

        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean checkSpiceJetValidURL(String strcurrrentCountryURL) {

        boolean blResult = false;
        try {
            String strActualCurrentURL = driver.getCurrentUrl();

            if (strActualCurrentURL.equals(strcurrrentCountryURL)) {

                System.out.println("Current URL is: " + strcurrrentCountryURL);

                URL urllink = new URL(strActualCurrentURL);

                HttpURLConnection connection = (HttpURLConnection) urllink.openConnection();
                connection.setRequestMethod("HEAD");
                connection.setConnectTimeout(3000);
                connection.connect();

                int httpResponseCode = connection.getResponseCode();
                if (httpResponseCode >= 400) {
                    System.out.println("URL is Broken/Invalid " + httpResponseCode);
                } else {
                    System.out.println("URL is Not Broken/Valid " + httpResponseCode);
                    blResult = true;

                }
                System.out.println("checkSpiceJetValidURL boolean value is: " + blResult);
                takeScreenshot(driver);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean goToCreateAccountPage() {

        boolean blResult = false;
        try {
            waitForElement(elemntSignUpbtn);
            blResult = click(elemntSignUpbtn);
            waitForSeconds(3);

            // Get all window handles
            Set<String> windowHandles = driver.getWindowHandles();

            // Convert the set to a list for indexed access
            List<String> windowList = new ArrayList<>(windowHandles);
            System.out.println("Windows Size is: "+windowList.size());

            // Check if a second window exists
            if (windowList.size() > 1) {
                // Switch to the second window
                driver.switchTo().window(windowList.get(1));
                System.out.println("Inside IF goToCreateAccountPage - Switched to Window 2");
            } else {
                System.out.println("Only one window is open.");
            }
            takeScreenshot(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean clickSubmitButton() {

        boolean blResult = false;
        try {
            blResult = verifyElement(btnSubmit);
            jsClickScroll(btnSubmit);
            click(btnSubmit);
            waitForSeconds(5);
            takeScreenshot(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }



    public boolean checkSpiceJetNoDataValidationMessages(String strNoDataValidationMessages) {
        boolean blResult = false;
        try {

                blResult = verifyElement(elmntMandatoryFields);
                String strActualValidationMsg = elmntMandatoryFields.getText();
                if (strActualValidationMsg.equals(strActualValidationMsg)) {
                    System.out.println("Expected Msg " + strActualValidationMsg);
                    System.out.println("Actual Msg " + strActualValidationMsg);
                    blResult = true;
                }


            System.out.println("checkSpiceJetNoDataValidationMessages return boolean value is " + blResult);
            takeScreenshot(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean enterSpiceJetInvalidDataCreateAccountPage(List<String> strInvalidTestData) {
        boolean blResult = false;
        try {

            //blResult = verifyElement(elmntCrAcTitle);
            //ElementselectByVisibleString(elmntCrAcTitle,strInvalidTestData.get(0));

            selectElement(elmntTitleSelect,strInvalidTestData.get(0));

            /*WebElement element = driver.findElement(By.xpath("//select[@class='form-control form-select ']"));

            if (element.getTagName().equalsIgnoreCase("select")) {
                Select dropdown = new Select(element);
                dropdown.selectByVisibleText(strInvalidTestData.get(0));
            } else {
                System.out.println("Element is not a <select> tag.");
                // Use JavaScript or click logic for custom dropdowns
            }*/

            blResult = verifyElement(elmntCrAcFirstName);
            enterValue(elmntCrAcFirstName, strInvalidTestData.get(1));
            blResult = verifyElement(elmntCrAcLastName);
            enterValue(elmntCrAcLastName, strInvalidTestData.get(2));
            blResult = verifyElement(elmntDOB);
            enterValue(elmntDOB, strInvalidTestData.get(3));


            blResult = verifyElement(elmntMobileNumber);
            jsScrollIntoView(elmntMobileNumber);
            click(elmntMobileNumber);
            enterValue(elmntMobileNumber, strInvalidTestData.get(4));

            blResult = verifyElement(elmntEmailId);
            enterValue(elmntEmailId, strInvalidTestData.get(5));

            blResult = verifyElement(elmntNewPassword);
            enterValue(elmntNewPassword, strInvalidTestData.get(6));
            blResult = verifyElement(elmntConfirmPassword);

            enterValue(elmntConfirmPassword, strInvalidTestData.get(7));
            blResult = verifyElement(elmntTC);
            blResult = click(elmntTC);

            waitForSeconds(2);

            waitForElement(btnSubmit);
            blResult = click(btnSubmit);
            waitForSeconds(2);

            System.out.println("enterSpiceJetInvalidDataCreateAccountPage return boolean value is " + blResult);
            takeScreenshot(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean checkInvalidDataSpicejetValidationMessages(List<String> strInvalidDataValidationMessages) {
        boolean blResult = false;
        try {
            for (String strExpectedValidationMsg : strInvalidDataValidationMessages) {
                WebElement elmntValidationmessages = waitForElement(By.xpath(elmntSpicejetInvalidDataValidationMsgs.replace("<<REPLACEMENT>>", TestDataUtil.getValue(strExpectedValidationMsg))));
                blResult = verifyElement(elmntValidationmessages);
                String strActualValidationMsg = elmntValidationmessages.getText();
                if (strExpectedValidationMsg.equals(strActualValidationMsg)) {
                    System.out.println("Expected Msg " + strExpectedValidationMsg);
                    System.out.println("Actual Msg " + strActualValidationMsg);
                    blResult = true;
                }
            }
            takeScreenshot(driver);
            System.out.println("checkInvalidDataSpicejetValidationMessages return boolean value is " + blResult);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean enterValidDataCreateAccountPage(List<String> strValidTestData) {
        boolean blResult = false;
        try {

            //blResult = verifyElement(elmntCrAcTitle);
            //ElementselectByVisibleString(elmntCrAcTitle, strValidTestData.get(0));

            refreshBrowser();
            waitForSeconds(5);
            jsScrollIntoView(elmntCrAcFirstName);


            selectElement(elmntTitleSelect,strValidTestData.get(0));

            blResult = verifyElement(elmntCrAcFirstName);
            enterValue(elmntCrAcFirstName, strValidTestData.get(1));
            blResult = verifyElement(elmntCrAcLastName);
            enterValue(elmntCrAcLastName, strValidTestData.get(2));
            blResult = verifyElement(elmntDOB);
            enterValue(elmntDOB, strValidTestData.get(3));

            blResult = verifyElement(elmntMobileNumber);
            jsScrollIntoView(elmntMobileNumber);
            click(elmntMobileNumber);
            enterValue(elmntMobileNumber, strValidTestData.get(4));

            System.out.println("Email Id is: "+strValidTestData.get(5));
            blResult = verifyElement(elmntEmailId);
            click(elmntEmailId);
            enterValue(elmntEmailId, strValidTestData.get(5));

            blResult = verifyElement(elmntNewPassword);
            click(elmntNewPassword);
            enterValue(elmntNewPassword, strValidTestData.get(6));
            blResult = verifyElement(elmntConfirmPassword);
            click(elmntConfirmPassword);
            enterValue(elmntConfirmPassword, strValidTestData.get(7));
            blResult = verifyElement(elmntTC);
            blResult = click(elmntTC);

            waitForSeconds(2);

            waitForElement(btnSubmit);
            blResult = click(btnSubmit);
            waitForSeconds(2);

            System.out.println("enterValidDataCreateAccountPage return boolean value is " + blResult);
            takeScreenshot(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean checkSpicejetAccountIsCreatedSuccessfully() {
        boolean blResult = false;
        try {
            waitForSeconds(20);
            takeScreenshot(driver);
            blResult = true;

            verifyElement(elmntOTPVerificationLabel);

            //Manually enter OTP Code sent to Mobile Number and click Verify button


        } catch (Exception e) {
            System.out.println("Inside checkSpicejetAccountIsCreatedSuccessfully catch " + blResult);
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }



    public boolean signoutFromSpicejet() {
        boolean blResult = false;
        try {
            blResult = verifyElement(elmntLogoutArrow);
            click(elmntLogoutArrow);
            blResult = verifyElement(elmntLogoutLink);
            click(elmntLogoutLink);
            waitForSeconds(3);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return blResult;
    }


    public boolean navigateToSpicejetSignInButton() {
        boolean blResult = false;
        try {
            blResult = verifyElement(elmntLoginLink);
            click(elmntLoginLink);
            waitForSeconds(2);
            blResult = verifyElement(elmntLoginEmailCheckbox);
            click(elmntLoginEmailCheckbox);
            waitForSeconds(2);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean enterSpicejetUserName(String strUserName) {

        boolean blResult = false;
        try {
            blResult = verifyElement(elmntLoginEmailInput);
            blResult = enterValue(elmntLoginEmailInput,strUserName);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean enterSpicejetPassword(String strPassword) {

        boolean blResult = false;
        try {
            blResult = verifyElement(elmntLoginPasswordInput);
            blResult = enterValue(elmntLoginPasswordInput,strPassword);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }



    public boolean navigateToSpicejetLoginButton() {

        boolean blResult = false;
        try {
            blResult = verifyElement(elmntSubmitLogin);

            jsClickScroll(elmntSubmitLogin);
            click(elmntSubmitLogin);
            waitForSeconds(5);
            blResult = verifyElement(elmntAccountName);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean clickOnFlightsTab() {
        boolean blResult = false;
        try {
            blResult = verifyElement(elmntFlightsTab);
            click(elmntFlightsTab);
            waitForSeconds(2);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean enterFlightDetailsInTheFlightsTab(List<String> strEnterWrongFlightDetails) {
        boolean blResult = false;
        try {

            blResult = verifyElement(elmntOneWayRadioBtn);
            click(elmntOneWayRadioBtn);
            waitForSeconds(2);

            blResult = verifyElement(elmntFrom);
            click(elmntFrom);
            System.out.println("From Place is: "+strEnterWrongFlightDetails.get(0));
            enterValue(elmntFrom,strEnterWrongFlightDetails.get(0));

            blResult = verifyElement(elmntTo);
            click(elmntTo);
            System.out.println("To Place is: "+strEnterWrongFlightDetails.get(1));
            //enterValue(elmntTo,strEnterWrongFlightDetails.get(1));
            jsEnterValue(elmntTo,strEnterWrongFlightDetails.get(1));

            //Select From Date Value from Datepicker
            blResult = verifyElement(elmntFromDatePicker);
            jsClickScroll(elmntFromDatePicker);
            waitForSeconds(2);

            int productListSize = listWebelemSize(elmntDatePickerList);
            //Print the List size
            System.out.println("Products List Size: " + productListSize);

            //Select From Date Value from Datepicker
            for (int i = 1; i <= productListSize; i++) {
                //String strFromDate = elmntDatePickerValue.replace("<<REPLACEMENT1>>", Integer.toString(i)).replace("<<REPLACEMENT2>>", Integer.toString(i));
                String strFromDate = elmntDatePickerValue.replace("<<REPLACEMENT>>", Integer.toString(i));
                System.out.println("FromDate Xpath String is: "+strFromDate);
                WebElement fromDateElem1 = driver.findElement(By.xpath(strFromDate));
                if (fromDateElem1.isEnabled()) {
                    fromDateElem1.click();
                    //jsClickScroll(fromDateElem1);
                    waitForSeconds(5);
                    System.out.println("INSIDE IF FROM DATE - Element is enabled and clicked");
                    //System.out.println("Selected date is: "+fromDateElem1.getText());
                    blResult = true;
                    break;
                } else {
                    System.out.println("INSIDE ELSE FROM DATE - Element is not enabled.");
                }
            }

            String enteredFromDateValue = elmntFromDateValue.getText();
            System.out.println("Selected From Date is: "+enteredFromDateValue);

            blResult = verifyElement(elmntOutsideDatePickerClick);
            jsClickScroll(elmntOutsideDatePickerClick);
            waitForSeconds(5);

            //Select To Date Value from Datepicker
            blResult = verifyElement(elmntToDatePicker);
            jsScrollPageTop();
            waitForSeconds(5);
            click(elmntToDatePicker);
            waitForSeconds(2);

            int productListSize1 = listWebelemSize(elmntDatePickerList);
            //Print the List size
            System.out.println("Products List Size: " + productListSize1);

            //Select From Date Value from Datepicker
            for (int i = 1; i <= productListSize1; i++) {
                //String strFromDate = elmntDatePickerValue.replace("<<REPLACEMENT1>>", Integer.toString(i)).replace("<<REPLACEMENT2>>", Integer.toString(i));
                String strFromDate = elmntDatePickerValue.replace("<<REPLACEMENT>>", Integer.toString(i));
                System.out.println("FromDate Xpath String is: "+strFromDate);
                WebElement fromDateElem1 = driver.findElement(By.xpath(strFromDate));
                if (fromDateElem1.isEnabled()) {
                    fromDateElem1.click();
                    //jsClickScroll(fromDateElem1);
                    waitForSeconds(5);
                    System.out.println("INSIDE IF TO DATE - Element is enabled and clicked");
                    //System.out.println("Selected date is: "+fromDateElem1.getText());
                    blResult = true;
                    break;
                } else {
                    System.out.println("INSIDE ELSE TO DATE - Element is not enabled.");
                }
            }

            String enteredToDateValue = elmntToDateValue.getText();
            System.out.println("Selected To Date is: "+enteredToDateValue);


        } catch (Exception e) {
            System.out.println("Inside catch enterFlightDetailsInTheFlightsTab "+e.getMessage());
            e.printStackTrace();
        }
        takeScreenshot(driver);
        System.out.println("enterFlightDetailsInTheFlightsTab bool value is: "+blResult);
        return blResult;
    }

    public boolean clickOnSearchFlight() {
        boolean blResult = false;
        try {

            waitForSeconds(5);
            blResult = verifyElement(elmntSearchFlightBtn);
            //Actions actions = new Actions(driver);
            //actions.moveToElement(elmntSearchFlightBtn).click().perform();
            actionsClick(elmntSearchFlightBtn);
            waitForSeconds(10);

        } catch (Exception e) {

            System.out.println("clickOnSearchFlight catch exception: "+e.getMessage());
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean checkFlightIsNotAvailableForTheEnteredDatetime() {
        boolean blResult = false;
        try {
            waitForSeconds(5);
            blResult = verifyElement(elmntNoFlightsAvailabletxt);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }



    public boolean enterOneWayFlightDetailsInTheFlightsTab(List<String> strEnterOneWayFlightDetails) {
        boolean blResult = false;
        try {

            blResult = verifyElement(elmntOneWayRadioBtn);
            click(elmntOneWayRadioBtn);
            waitForSeconds(2);

            blResult = verifyElement(elmntFrom);
            click(elmntFrom);
            System.out.println("From Place is: "+strEnterOneWayFlightDetails.get(0));
            enterValue(elmntFrom,strEnterOneWayFlightDetails.get(0));

            blResult = verifyElement(elmntTo);
            click(elmntTo);
            System.out.println("To Place is: "+strEnterOneWayFlightDetails.get(1));
            //enterValue(elmntTo,strEnterOneWayFlightDetails.get(1));
            jsEnterValue(elmntTo,strEnterOneWayFlightDetails.get(1));

            //Select From Date Value from Datepicker
            blResult = verifyElement(elmntFromDatePicker);
            jsClickScroll(elmntFromDatePicker);
            waitForSeconds(2);

            int productListSize = listWebelemSize(elmntDatePickerList);
            //Print the List size
            System.out.println("Products List Size: " + productListSize);

            //Select From Date Value from Datepicker
            for (int i = 1; i <= productListSize; i++) {
                //String strFromDate = elmntDatePickerValue.replace("<<REPLACEMENT1>>", Integer.toString(i)).replace("<<REPLACEMENT2>>", Integer.toString(i));
                String strFromDate = elmntDatePickerValue.replace("<<REPLACEMENT>>", Integer.toString(i));
                System.out.println("FromDate Xpath String is: "+strFromDate);
                WebElement fromDateElem1 = driver.findElement(By.xpath(strFromDate));
                if (fromDateElem1.isEnabled()) {
                    fromDateElem1.click();
                    //jsClickScroll(fromDateElem1);
                    waitForSeconds(5);
                    System.out.println("INSIDE IF FROM DATE - Element is enabled and clicked");
                    //System.out.println("Selected date is: "+fromDateElem1.getText());
                    blResult = true;
                    break;
                } else {
                    System.out.println("INSIDE ELSE FROM DATE - Element is not enabled.");
                }
            }

            String enteredFromDateValue = elmntFromDateValue.getText();
            System.out.println("Selected From Date is: "+enteredFromDateValue);

        } catch (Exception e) {
            System.out.println("Inside catch enterOneWayFlightDetailsInTheFlightsTab "+e.getMessage());
            e.printStackTrace();
        }
        takeScreenshot(driver);
        System.out.println("enterOneWayFlightDetailsInTheFlightsTab bool value is: "+blResult);
        return blResult;
    }




    public boolean checkFlightIsAvailableAndClickContinue() {
        boolean blResult = false;
        try {
            waitForSeconds(5);
            blResult = verifyElement(elmntAvailableFlightContinueBtn);
            actionsClick(elmntAvailableFlightContinueBtn);
            waitForSeconds(5);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }


    public boolean enterContactDetailsInPassengersPage(List<String> strEnterOneWayFlightDetails) {
        boolean blResult = false;
        try {

            waitForSeconds(10);
            blResult = verifyElement(elmntContactFirstName);
            click(elmntContactFirstName);
            //enterValue(elmntContactFirstName,strEnterOneWayFlightDetails.get(0));
            jsEnterValue(elmntContactFirstName,strEnterOneWayFlightDetails.get(0));
            waitForSeconds(2);

            blResult = verifyElement(elmntContactLastName);
            click(elmntContactLastName);
            //enterValue(elmntContactLastName,strEnterOneWayFlightDetails.get(1));
            jsEnterValue(elmntContactLastName,strEnterOneWayFlightDetails.get(1));
            waitForSeconds(2);

            blResult = verifyElement(elmntContactNumber);
            click(elmntContactNumber);
            //enterValue(elmntContactNumber,strEnterOneWayFlightDetails.get(2));
            jsEnterValue(elmntContactNumber,strEnterOneWayFlightDetails.get(2));
            waitForSeconds(2);

            blResult = verifyElement(elmntContactEmailAddress);
            click(elmntContactEmailAddress);
            //enterValue(elmntContactEmailAddress,strEnterOneWayFlightDetails.get(3));
            jsEnterValue(elmntContactEmailAddress,strEnterOneWayFlightDetails.get(3));
            waitForSeconds(2);

            blResult = verifyElement(elmntContactCity);
            click(elmntContactCity);
            //enterValue(elmntContactCity,strEnterOneWayFlightDetails.get(4));
            jsEnterValue(elmntContactCity,strEnterOneWayFlightDetails.get(4));
            waitForSeconds(5);

        } catch (Exception e) {
            System.out.println("Inside catch enterContactDetailsInPassengersPage "+e.getMessage());
            e.printStackTrace();
        }
        takeScreenshot(driver);
        System.out.println("enterContactDetailsInPassengersPage bool value is: "+blResult);
        return blResult;
    }

    public boolean clickOnPrimaryPassengerCheckbox() {
        boolean blResult = false;
        try {

            blResult = verifyElement(elmntContactPrimaryPassenger);
            //click(elmntContactPrimaryPassenger);
            actionsClick(elmntContactPrimaryPassenger);
            waitForSeconds(5);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        return blResult;
    }

    public boolean clickOnContinueButtonInTripSummaryPage() {
        boolean blResult = false;
        try {
            blResult = verifyElement(elmntTripSummaryContinuebtn);
            //click(elmntTripSummaryContinuebtn);
            actionsClick(elmntTripSummaryContinuebtn);
            waitForSeconds(5);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        System.out.println("clickOnContinueButtonInTripSummaryPage return bool value is : "+blResult);
        return blResult;
    }


    public boolean clickOnContinueButtonInAddOnsTripSummaryPage() {
        boolean blResult = false;
        try {

            waitForSeconds(5);
            blResult = verifyElement(elmntTripSummaryAddOnsContinuebtn);
            //click(elmntTripSummaryAddOnsContinuebtn);
            jsClick(elmntTripSummaryAddOnsContinuebtn);
            click(elmntTripSummaryAddOnsContinuebtn);
            waitForSeconds(5);

            blResult = verifyElement(elmntSpiceMaxSkipbtn);
            //click(elmntSpiceMaxSkipbtn);
            jsClick(elmntSpiceMaxSkipbtn);
            click(elmntSpiceMaxSkipbtn);
            waitForSeconds(5);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        System.out.println("clickOnContinueButtonInAddOnsTripSummaryPage return bool value is : "+blResult);
        return blResult;
    }


    public boolean enterCardDetailsInThePageAndClickProceedToPay(List<String> strCardDetails) {
        boolean blResult = false;
        try {

           /* // Get all frame elements (iframe and frame)
            List<WebElement> frames = driver.findElements(By.tagName("iframe"));
            frames.addAll(driver.findElements(By.tagName("iframe")));

            // Print the total number of frames
            System.out.println("Total frames: " + frames.size());

            // Loop through and print each frame's name attribute
            for (int i = 0; i < frames.size(); i++) {
                String name = frames.get(i).getAttribute("name");
                System.out.println("Frame " + i + " name: " + name);
            }
           */

            driver.switchTo().frame(0);
            waitForSeconds(2);
            blResult = verifyElement(elmntCardNumber);
            //click(elmntCardNumber);
            actionsClick(elmntCardNumber);
            enterValue(elmntCardNumber,strCardDetails.get(0));
            waitForSeconds(2);
            focusBackToDefaultFrame();
            waitForSeconds(2);

            driver.switchTo().frame(1);
            waitForSeconds(2);
            blResult = verifyElement(elmntCardName);
            //click(elmntCardName);
            actionsClick(elmntCardName);
            enterValue(elmntCardName,strCardDetails.get(1));
            waitForSeconds(2);
            focusBackToDefaultFrame();
            waitForSeconds(2);

            driver.switchTo().frame(2);
            waitForSeconds(2);
            blResult = verifyElement(elmntCardExpiryMonth);
            //click(elmntCardExpiryMonth);
            actionsClick(elmntCardExpiryMonth);
            enterValue(elmntCardExpiryMonth,strCardDetails.get(2));
            waitForSeconds(2);
            focusBackToDefaultFrame();
            waitForSeconds(2);


            driver.switchTo().frame(3);
            waitForSeconds(2);
            blResult = verifyElement(elmntCardExpiryYear);
            //click(elmntCardExpiryYear);
            actionsClick(elmntCardExpiryYear);
            enterValue(elmntCardExpiryYear,strCardDetails.get(3));
            waitForSeconds(2);
            focusBackToDefaultFrame();
            waitForSeconds(2);

            driver.switchTo().frame(4);
            waitForSeconds(2);
            blResult = verifyElement(elmntCardCVV);
            //click(elmntCardCVV);
            actionsClick(elmntCardCVV);
            enterValue(elmntCardCVV,strCardDetails.get(4));
            waitForSeconds(2);
            focusBackToDefaultFrame();
            waitForSeconds(5);

            try {
                System.out.println("Inside try Proceed to Payment button");
                blResult = verifyElement(elmntProceedToPaybtn);
                //click(elmntProceedToPaybtn);
                actionsClick(elmntProceedToPaybtn);
                click(elmntProceedToPaybtn);
                waitForSeconds(5);
            }catch(Exception ex){
                System.out.println("Click on Proceed to Payment: "+ex.getMessage());
            }



        } catch (Exception e) {
            System.out.println("Inside catch enterCardDetailsInThePageAndClickProceedToPay "+e.getMessage());
            e.printStackTrace();
        }
        takeScreenshot(driver);
        System.out.println("enterCardDetailsInThePageAndClickProceedToPay bool value is: "+blResult);
        return blResult;
    }



    public boolean checkFlightBookingIsSuccessfull() {
        boolean blResult = false;
        try {

            waitForSeconds(50);
            blResult = verifyElement(elmntTestCardPaymentFailure);
            waitForSeconds(5);

        } catch (Exception e) {
            e.printStackTrace();
        }
        takeScreenshot(driver);
        System.out.println("checkFlightBookingIsSuccessfull return bool value is : "+blResult);
        return blResult;
    }

    public boolean enterTwoWayFlightDetailsInTheFlightsTab(List<String> strEnterTwoWayFlightDetails) {
        boolean blResult = false;
        try {

            blResult = verifyElement(elmntTwoWayRadioBtn);
            click(elmntTwoWayRadioBtn);
            waitForSeconds(2);

            blResult = verifyElement(elmntFrom);
            click(elmntFrom);
            System.out.println("From Place is: "+strEnterTwoWayFlightDetails.get(0));
            enterValue(elmntFrom,strEnterTwoWayFlightDetails.get(0));

            blResult = verifyElement(elmntTo);
            click(elmntTo);
            System.out.println("To Place is: "+strEnterTwoWayFlightDetails.get(1));
            //enterValue(elmntTo,strEnterOneWayFlightDetails.get(1));
            jsEnterValue(elmntTo,strEnterTwoWayFlightDetails.get(1));

            //Select From Date Value from Datepicker
            blResult = verifyElement(elmntFromDatePicker);
            jsClickScroll(elmntFromDatePicker);
            waitForSeconds(2);

            int productListSize = listWebelemSize(elmntDatePickerList);
            //Print the List size
            System.out.println("Products List Size: " + productListSize);

            //Select From Date Value from Datepicker
            for (int i = 1; i <= productListSize; i++) {
                //String strFromDate = elmntDatePickerValue.replace("<<REPLACEMENT1>>", Integer.toString(i)).replace("<<REPLACEMENT2>>", Integer.toString(i));
                String strFromDate = elmntDatePickerValue.replace("<<REPLACEMENT>>", Integer.toString(i));
                System.out.println("FromDate Xpath String is: "+strFromDate);
                WebElement fromDateElem1 = driver.findElement(By.xpath(strFromDate));
                if (fromDateElem1.isEnabled()) {
                    fromDateElem1.click();
                    //jsClickScroll(fromDateElem1);
                    waitForSeconds(5);
                    System.out.println("INSIDE IF FROM DATE - Element is enabled and clicked");
                    //System.out.println("Selected date is: "+fromDateElem1.getText());
                    blResult = true;
                    break;
                } else {
                    System.out.println("INSIDE ELSE FROM DATE - Element is not enabled.");
                }
            }

            String enteredFromDateValue = elmntFromDateValue.getText();
            System.out.println("Selected From Date is: "+enteredFromDateValue);

            blResult = verifyElement(elmntOutsideDatePickerClick);
            jsClickScroll(elmntOutsideDatePickerClick);
            waitForSeconds(5);

            int productListSize1 = listWebelemSize(elmntDatePickerList);
            //Print the List size
            System.out.println("Products List Size: " + productListSize1);

            //Select From Date Value from Datepicker
            for (int i = 2; i <= productListSize1; i++) {
                //String strFromDate = elmntDatePickerValue.replace("<<REPLACEMENT1>>", Integer.toString(i)).replace("<<REPLACEMENT2>>", Integer.toString(i));
                String strFromDate = elmntDatePickerValue.replace("<<REPLACEMENT>>", Integer.toString(i));
                System.out.println("FromDate Xpath String is: "+strFromDate);
                WebElement fromDateElem1 = driver.findElement(By.xpath(strFromDate));
                if (fromDateElem1.isEnabled()) {
                    fromDateElem1.click();
                    //jsClickScroll(fromDateElem1);
                    waitForSeconds(5);
                    System.out.println("INSIDE IF TO DATE - Element is enabled and clicked");
                    //System.out.println("Selected date is: "+fromDateElem1.getText());
                    blResult = true;
                    break;
                } else {
                    System.out.println("INSIDE ELSE TO DATE - Element is not enabled.");
                }
            }

            String enteredToDateValue = elmntToDateValue.getText();
            System.out.println("Selected To Date is: "+enteredToDateValue);

            blResult = verifyElement(elmntOutsideDatePickerClick);
            jsClickScroll(elmntOutsideDatePickerClick);
            waitForSeconds(5);

        } catch (Exception e) {
            System.out.println("Inside catch enterTwoWayFlightDetailsInTheFlightsTab "+e.getMessage());
            e.printStackTrace();
        }
        takeScreenshot(driver);
        System.out.println("enterTwoWayFlightDetailsInTheFlightsTab bool value is: "+blResult);
        return blResult;
    }

}
