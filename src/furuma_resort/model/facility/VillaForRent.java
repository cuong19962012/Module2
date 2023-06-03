package furuma_resort.model.facility;

public class VillaForRent extends Facility {
    private String standard;
    private float areaPool;
    private int numberOfFloor;

    public VillaForRent() {
    }

    public VillaForRent(String idFacility, String nameFacility, float areaUse, long costForRent, int maxPerson, String typeOfRent, String standard, float areaPool, int numberOfFloor) {
        super(idFacility, nameFacility, areaUse, costForRent, maxPerson, typeOfRent);
        this.standard = standard;
        this.areaPool = areaPool;
        this.numberOfFloor = numberOfFloor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public float getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(float areaPool) {
        this.areaPool = areaPool;
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
    public float getAreaUse() {
        return super.getAreaUse();
    }

    @Override
    public void setAreaUse(float areaUse) {
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
        return "VillaForRent{" +
                ", idFacility=" + getIdFacility() +
                ", nameFacility='" + getNameFacility() + '\'' +
                ", areaUse=" + getAreaUse() +
                ", costForRent=" + getCostForRent() +
                ", maxPerson=" + getMaxPerson() +
                ", typeOfRent='" + getTypeOfRent() + '\'' +
                "standard='" + standard + '\'' +
                ", areaPool=" + areaPool +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }
}
