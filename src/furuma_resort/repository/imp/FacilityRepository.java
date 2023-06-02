package furuma_resort.repository.imp;

import furuma_resort.model.facility.Facility;
import furuma_resort.model.facility.HouseForRent;
import furuma_resort.repository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static final Map<Facility, Integer> data = new LinkedHashMap<>();

    static {
        //String idFacility, String nameFacility, int areaUse, long costForRent, int maxPerson, String typeOfRent, String standard, int numberOfFloor
        Facility house = new HouseForRent();
        //
        Facility room = new HouseForRent();
        Facility villa = new HouseForRent();

    }

    @Override
    public Map<Facility, Integer> getData() {
        return null;
    }
}
