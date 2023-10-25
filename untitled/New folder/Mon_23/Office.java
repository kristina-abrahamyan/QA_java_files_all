public class Office {
    private String location;

    private int floor;

    public Office(String location, int floor){
        this.location = location;
        this.floor = floor;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void describe(){
        System.out.println("Kat works at the location: " + location + " on floor " + floor);
    }
}
class Electronics extends Office {
    private Boolean privateUse;
    private String equipmentName;
    public Electronics(String location, int floor, Boolean privateUse, String equipmentName){
        super(location, floor);
        this.privateUse = privateUse;
        this.equipmentName = equipmentName;
    }

    public Boolean getPrivateUse() {
        return privateUse;
    }

    public void setPrivateUse(Boolean privateUse) {
        this.privateUse = privateUse;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    @Override
    public void describe(){
        super.describe();
        System.out.println("Is this " + equipmentName + " private use? " + privateUse);
    }

}