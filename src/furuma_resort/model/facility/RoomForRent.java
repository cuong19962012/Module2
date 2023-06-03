package furuma_resort.model.facility;

public class RoomForRent extends Facility {
    private String serviceFree;

    public RoomForRent() {
    }

    public RoomForRent(String idFacility, String nameFacility, float areaUse, long costForRent, int maxPerson, String typeOfRent, String serviceFree) {
        super(idFacility, nameFacility, areaUse, costForRent, maxPerson, typeOfRent);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
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
        return "RoomForRent{" +
                ", idFacility=" + getIdFacility() +
                ", nameFacility='" + getNameFacility() + '\'' +
                ", areaUse=" + getAreaUse() +
                ", costForRent=" + getCostForRent() +
                ", maxPerson=" + getMaxPerson() +
                ", typeOfRent='" + getTypeOfRent() + '\'' +
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }
}
