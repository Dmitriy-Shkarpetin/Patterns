package structural.facade;

class EnvironmentalService {

    // Проверка есть ли у компании разрешение на строительство от природоохранной службы
    public boolean HasEnvironmentalAccess(Firm pFirm) {
        return pFirm.GetEnvironmentalLicense();
    }
}