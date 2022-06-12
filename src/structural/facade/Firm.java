package structural.facade;

class Firm {

    private String name;
    private boolean builderLicense;
    private boolean environmentalLicense;
    private boolean cityLicense;

    public Firm() {
        builderLicense = false;
        name = "";
    }

    public Firm(String name, boolean bLicense, boolean eLicense, boolean cLicense) {
        builderLicense = bLicense;
        this.name = name;
        environmentalLicense = eLicense;
        cityLicense = cLicense;
    }

    public String GetName() {
        return name;
    }

    public void SetName(String fName) {
        name = fName;
    }

    public boolean GetBuilderLicense() {
        return builderLicense;
    }

    public void SetBuilderLicense(boolean bLicense) {
        builderLicense = bLicense;
    }

    public boolean GetEnvironmentalLicense() {
        return environmentalLicense;
    }

    public void SetEnvironmentalLicense(boolean eLicense) {
        environmentalLicense = eLicense;
    }

    public boolean GetCityLicense() {
        return cityLicense;
    }

    public void SetCityLicense(boolean cLicense) {
        cityLicense = cLicense;
    }
}

