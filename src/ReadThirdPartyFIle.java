
public class ReadThirdPartyFIle {

    public static void main(String[] args) {
        ShipmentRepo shipmentRepo = new ShipmentRepo();

        String shipmentsFileName =  FileChooser.getFile();
        shipmentRepo.loadShipments(shipmentsFileName);

        Shipment s = shipmentRepo.findShipment("165733").get();
        System.out.println(s);
    }

}
