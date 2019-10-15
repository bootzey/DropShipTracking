import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ShipmentRepo {
    ArrayList<Shipment> shipments = new ArrayList<>();
    String fileName;

    public void loadShipments(String fileName){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine()) != null){
                List<String> fields = new ArrayList<String>(Arrays.asList(line.split(",")));
                shipments.add(new Shipment(fields.get(0),fields.get(1),fields.get(4),fields.get(8),fields.get(9),fields.get(10)));
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printAll()
    {
        for(Shipment s: shipments){
            System.out.println(s);
        }
    }

    public Optional<Shipment> findShipment(String refNum){
        Optional<Shipment> shipment = null;
        for(Shipment s: shipments)
            if(s.getReferenceNumbers().contains(refNum)){
                shipment = Optional.of(s);
            }
        return shipment;

    }

}
