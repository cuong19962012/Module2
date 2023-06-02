package furuma_resort.repository;

import furuma_resort.model.facility.Facility;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository {
    Map<Facility,Integer> getData();
}
