package structural.facade;

// Класс Фасад. Проверяет наличие всех лицензий и разрешения от города на строительство
class Construction {
    private final EnvironmentalService eService;
    private final CityService cService;
    private final CountryService coService;

    public Construction() {
        eService = new EnvironmentalService();
        cService = new CityService();
        coService = new CountryService();
    }

    boolean IsAllowed(Firm pFirm) {
        System.out.println("\nLet's check for all permissions!\n");
        return cService.HasCityAccess(pFirm) && coService.HasBuildingLicense(pFirm) && eService.HasEnvironmentalAccess(pFirm);
    }
}
