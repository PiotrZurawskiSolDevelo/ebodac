package org.motechproject.ebodac.uitest.page;

import org.motechproject.uitest.page.AbstractBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BookingAppPage extends AbstractBasePage {

    public static final String URL_PATH = "/#/bookingApp/";

    public static final By CAPACITY_INFO = By.linkText("Capacity Info");
    public static final By ADVANCED_SETTINGS = By.linkText("Advanced Settings");
    public static final By SCREENING = By.linkText("Screening");
    public static final By RESCHEDULE_VISIT = By.linkText("Visit Schedule/Reschedule");
    public static final By UNSCHEDULED_VISIT = By.linkText("Unscheduled Visit");
    public static final By PRIME_VACCINATION = By.linkText("Prime Vaccination");
    public static final By CLINIC_VISIT_SCHEDULE = By.linkText("Prime Vacc. 1st Follow-up");

    public BookingAppPage(WebDriver driver) {
        super(driver);
    }

    public void openCapacityInfo() throws InterruptedException {
        clickWhenVisible(CAPACITY_INFO);
    }

    public void openAdvancedSettings() throws InterruptedException {
        clickWhenVisible(ADVANCED_SETTINGS);
    }

    public void openScreening() throws InterruptedException {
        clickWhenVisible(SCREENING);
    }

    public void openRescheduleVisit() throws InterruptedException {
        clickWhenVisible(RESCHEDULE_VISIT);
    }

    public void openPrimeVaccination() throws InterruptedException {
        clickWhenVisible(PRIME_VACCINATION);
    }

    public void openClinicVisitSchedule() throws InterruptedException {
        clickWhenVisible(CLINIC_VISIT_SCHEDULE);
    }

    public void openUnscheduledVisit() throws InterruptedException {
        clickWhenVisible(UNSCHEDULED_VISIT);
    }

    public void openPrimeVaccination() throws InterruptedException {
        clickWhenVisible(PRIME_VACCINATION);
    }

    public void openClinicVisitSchedule() throws InterruptedException {
        clickWhenVisible(CLINIC_VISIT_SCHEDULE);
    }


    @Override
    public String expectedUrlPath() {
        return getServerURL() + URL_PATH;
    }

    @Override
    public void goToPage() {

    }
}
