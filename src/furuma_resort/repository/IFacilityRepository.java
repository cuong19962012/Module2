package furuma_resort.repository;

import furuma_resort.model.facility.Facility;

import java.util.Map;

public interface IFacilityRepository {
    Map<Facility, Integer> getData();

    void add(Facility facility);

    void delete(String id);

    boolean check(String id);
}
