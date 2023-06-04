package furuma_resort.repository.imp;

import furuma_resort.model.facility.Facility;
import furuma_resort.model.facility.HouseForRent;
import furuma_resort.model.facility.RoomForRent;
import furuma_resort.model.facility.VillaForRent;
import furuma_resort.repository.IFacilityRepository;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static final Map<Facility, Integer> data = new LinkedHashMap<>();
    private static LocalDate resetTime = LocalDate.now();

    static {

        //String idFacility, String nameFacility, int areaUse, long costForRent, int maxPerson, String typeOfRent, String standard, int numberOfFloor
        Facility house1 = new HouseForRent("SVVL-1111", "House 1", 50, 10000000, 4, "Days 5", "Normal", 1);
        //String idFacility, String nameFacility, int areaUse, long costForRent, int maxPerson, String typeOfRent, String serviceFree
        Facility room1 = new RoomForRent("SVRO-1111", "Room 1", 50, 4000000, 2, "Days 2", "Water");
        //String idFacility, String nameFacility, int areaUse, long costForRent, int maxPerson, String typeOfRent, String standard, int areaPool, int numberOfFloor
        Facility villa1 = new VillaForRent("SVHO-1111", "Villa 1", 50, 10000000, 4, "Month", "Vip", 35, 1);
        data.put(house1, 0);
        data.put(room1, 5);
        data.put(villa1, 0);
        LocalDate now = LocalDate.now();
        if (now.getDayOfMonth() == 1) {
            for (Facility facility : data.keySet())
                data.put(facility, 0);
        }
    }

    @Override
    public Map<Facility, Integer> getData() {
        return data;
    }

    @Override
    public void add(Facility facility) {
        data.put(facility, 0);
    }

    @Override
    public void delete(String id) {
        for (Facility facility : data.keySet()) {
            if (facility.getIdFacility().equals(id)) {
                data.remove(facility);
                return;
            }
        }
    }

    @Override
    public boolean check(String id) {
        for (Facility key : data.keySet()) {
            if (id.equals(key.getIdFacility()))
                return true;
        }
        return false;
    }

    public void maintenance(Facility facility) {
        data.put(facility, data.get(facility) + 1);
    }
}
