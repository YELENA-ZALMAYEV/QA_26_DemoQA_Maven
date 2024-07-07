package manager.enums;

public enum Gender {
    MALE("//label[@for='gender-radio-1']"),
    FEMALE("//label[@for='gender-radio-2']"),
    OTHER("//label[@for='gender-radio-3']");
    private final String locator;

    Gender(String locator) {
        this.locator = locator;
    }
    public String getLocator(){
        return locator;
    }
}