package furuma_resort.model.facility;

import java.util.Objects;

public abstract class Facility {
    private String idFacility;
    private String nameFacility;
    private float areaUse;
    private long costForRent;
    private int maxPerson;
    private String typeOfRent;

    public Facility() {
    }

    public Facility(String idFacility, String nameFacility, float areaUse, long costForRent, int maxPerson, String typeOfRent) {
        this.idFacility = idFacility;
        this.nameFacility = nameFacility;
        this.areaUse = areaUse;
        this.costForRent = costForRent;
        this.maxPerson = maxPerson;
        this.typeOfRent = typeOfRent;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public float getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(float areaUse) {
        this.areaUse = areaUse;
    }

    public long getCostForRent() {
        return costForRent;
    }

    public void setCostForRent(long costForRent) {
        this.costForRent = costForRent;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idFacility=" + idFacility +
                ", nameFacility='" + nameFacility + '\'' +
                ", areaUse=" + areaUse +
                ", costForRent=" + costForRent +
                ", maxPerson=" + maxPerson +
                ", typeOfRent='" + typeOfRent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Facility)) return false;
        Facility facility = (Facility) o;
        return getIdFacility() == facility.getIdFacility();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdFacility());
    }
}
