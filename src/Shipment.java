public class Shipment {
    public String trackingNumber,referenceNumbers,shipperName,shipToName,shipToCity,shipToState;

    public Shipment(String trackingNumber, String referenceNumbers, String shipperName, String shipToName, String shipToCity, String shipToState) {
        this.trackingNumber = trackingNumber;
        this.referenceNumbers = referenceNumbers;
        this.shipperName = shipperName;
        this.shipToName = shipToName;
        this.shipToCity = shipToCity;
        this.shipToState = shipToState;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "trackingNumber='" + trackingNumber + '\'' +
                ", referenceNumbers='" + referenceNumbers + '\'' +
                ", shipperName='" + shipperName + '\'' +
                ", shipToName='" + shipToName + '\'' +
                ", shipToCity='" + shipToCity + '\'' +
                ", shipToState='" + shipToState + '\'' +
                '}';
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getReferenceNumbers() {
        return referenceNumbers;
    }

    public void setReferenceNumbers(String referenceNumbers) {
        this.referenceNumbers = referenceNumbers;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public String getShipToName() {
        return shipToName;
    }

    public void setShipToName(String shipToName) {
        this.shipToName = shipToName;
    }

    public String getShipToCity() {
        return shipToCity;
    }

    public void setShipToCity(String shipToCity) {
        this.shipToCity = shipToCity;
    }

    public String getShipToState() {
        return shipToState;
    }

    public void setShipToState(String shipToState) {
        this.shipToState = shipToState;
    }
}
