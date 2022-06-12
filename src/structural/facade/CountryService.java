package structural.facade;

class CountryService {

    // проверяет есть ли у компании лицензия на строительство в стране
    public boolean HasBuildingLicense(Firm pFirm) {
        return pFirm.GetBuilderLicense();
    }
}