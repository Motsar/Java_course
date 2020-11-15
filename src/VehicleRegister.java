import java.util.ArrayList;
import java.util.HashMap;


public class VehicleRegister {
    public HashMap<RegistrationPlate, String> owners;

    public VehicleRegister(){
        owners= new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner){
        if (owners.containsKey(plate)) {
            return false;
        }
        owners.put(plate, owner);
        return true;
    }

    public String get(RegistrationPlate plate){
        if (!owners.containsKey(plate)) {
            return null;
        }
        return owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate){
        if (!owners.containsKey(plate)) {
            return false;
        }
        owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates(){
        for (RegistrationPlate plate: this.owners.keySet()){
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> buffer = new ArrayList<String>();
        String toBuffer;
        for (RegistrationPlate plate: this.owners.keySet()){
            toBuffer = this.owners.get(plate);
            if(!buffer.contains(toBuffer)){
                buffer.add(toBuffer);
            }
        }
        for(String owner : buffer){
            System.out.println(owner);
        }
    }
}
