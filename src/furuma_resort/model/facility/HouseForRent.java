package furuma_resort.model.facility;

public class HouseForRent extends Facility {
    private String standard;
    private int numberOfFloor;

    public HouseForRent() {
    }

    public HouseForRent(String idFacility, String nameFacility, int areaUse, long costForRent, int maxPerson, String typeOfRent, String standard, int numberOfFloor) {
        super(idFacility, nameFacility, areaUse, costForRent, maxPerson, typeOfRent);
        this.standard = standard;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String getIdFacility() {
        return super.getIdFacility();
    }

    @Override
    public void setIdFacility(String idFacility) {
        super.setIdFacility(idFacility);
    }

    @Override
    public String getNameFacility() {
        return super.getNameFacility();
    }

    @Override
    public void setNameFacility(String nameFacility) {
        super.setNameFacility(nameFacility);
    }

    @Override
    public int getAreaUse() {
        return super.getAreaUse();
    }

    @Override
    public void setAreaUse(int areaUse) {
        super.setAreaUse(areaUse);
    }

    @Override
    public long getCostForRent() {
        return super.getCostForRent();
    }

    @Override
    public void setCostForRent(long costForRent) {
        super.setCostForRent(costForRent);
    }

    @Override
    public int getMaxPerson() {
        return super.getMaxPerson();
    }

    @Override
    public void setMaxPerson(int maxPerson) {
        super.setMaxPerson(maxPerson);
    }

    @Override
    public String getTypeOfRent() {
        return super.getTypeOfRent();
    }

    @Override
    public void setTypeOfRent(String typeOfRent) {
        super.setTypeOfRent(typeOfRent);
    }

    @Override
    public String toString() {
        return "HouseForRent{" +
                ", idFacility=" + getIdFacility() +
                ", nameFacility='" + getNameFacility() + '\'' +
                ", areaUse=" + getAreaUse() +
                ", costForRent=" + getCostForRent() +
                ", maxPerson=" + getMaxPerson() +
                ", typeOfRent='" + getTypeOfRent() + '\'' +
                "standard='" + standard + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
