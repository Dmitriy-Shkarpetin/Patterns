package structural.facade;

// class in charge of checking building rights from city services
class CityService {

    // проверка есть ли у компании разрешение на строительство от города
    public boolean HasCityAccess(Firm pFirm) {
        return pFirm.GetCityLicense();
    }
}