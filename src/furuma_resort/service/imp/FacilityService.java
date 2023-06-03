package furuma_resort.service.imp;

import furuma_resort.model.facility.Facility;
import furuma_resort.model.facility.HouseForRent;
import furuma_resort.model.facility.RoomForRent;
import furuma_resort.model.facility.VillaForRent;
import furuma_resort.repository.imp.FacilityRepository;
import furuma_resort.service.IFacilityService;

import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private final Scanner scanner = new Scanner(System.in);
    private final FacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void displayListFacility() {
        Map<Facility, Integer> data = facilityRepository.getData();
        for (Facility facility : data.keySet()) {
            System.out.println(facility + " Time of used: " + data.get(facility));
        }
    }

    @Override
    public void displayListMaintenance() {
        System.out.println("Out of order list: ");
        Map<Facility,Integer> data=facilityRepository.getData();
        for (Facility facility : data.keySet()) {
            if(data.get(facility)>=5)
                System.out.println(facility);
        }
    }

    @Override
    public void add() {
        do {
            System.out.println("1. Add New Villa");
            System.out.println("2. Add New House");
            System.out.println("3. Add New Room");
            System.out.println("4. Back To Menu");
            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
                return;
            }
            switch (choice) {
                case 1:
                    //String idFacility, String nameFacility, int areaUse, long costForRent, int maxPerson, String typeOfRent, String standard, int areaPool, int numberOfFloor
                    Facility villa = createNewVilla();
                    if (!facilityRepository.check(villa.getIdFacility()))
                        facilityRepository.add(villa);
                    else
                        System.out.println("Duplicated");
                    break;
                case 2:
                    Facility house = createNewHouse();
                    if (!facilityRepository.check(house.getIdFacility()))
                        facilityRepository.add(house);
                    else
                        System.out.println("Duplicated");
                    break;
                case 3:
                    Facility room = createNewRoom();
                    if (!facilityRepository.check(room.getIdFacility()))
                        facilityRepository.add(room);
                    else
                        System.out.println("Duplicated");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Your choice incorrect");
            }
        } while (true);
    }

    private Facility createNewRoom() {
        //String idFacility, String nameFacility, int areaUse, long costForRent, int maxPerson, String typeOfRent, String serviceFree

        String idFacility;
        do {
            System.out.println("Enter id ");
            idFacility = scanner.nextLine();
            if (idFacility.matches("^SVVL-[0-9]{4}$"))
                break;
        } while (true);
        String nameFacility;
        do {
            System.out.println("Enter name");
            nameFacility = scanner.nextLine();
            if (nameFacility.matches("^[A-Z].*$"))
                break;
        } while (true);
        float areaUse;
        do {
            System.out.println("Enter area use");
            try {
                areaUse = Float.parseFloat(scanner.nextLine());
                if (areaUse <= Float.MAX_VALUE && areaUse > 30)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        } while (true);
        System.out.println("Enter cost for rent");
        long costForRent;
        do {
            try {
                costForRent = Long.parseLong(scanner.nextLine());
                if (costForRent <= Integer.MAX_VALUE && costForRent > 0)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        } while (true);
        System.out.println("Enter max person");
        int maxPerson;
        do {
            try {
                maxPerson = Integer.parseInt(scanner.nextLine());
                if (maxPerson < 20 && maxPerson > 0)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        } while (true);
        System.out.println("Enter type of rent");
        //String typeOfRent, String standard, float areaPool, int numberOfFloor
        String typeOfRent;
        do {

            typeOfRent = scanner.nextLine();
            if (typeOfRent.matches("^[A-Z].*$"))
                break;
        } while (true);
        System.out.println("Enter service free");
        String serviceFree;
        do {
            serviceFree = scanner.nextLine();
            if (serviceFree.matches("^[A-Z].*$"))
                break;
        } while (true);
        //String idFacility, String nameFacility, int areaUse,
        // long costForRent, int maxPerson, String typeOfRent, String standard, int areaPool, int numberOfFloor
        return new RoomForRent(idFacility, nameFacility, areaUse, costForRent, maxPerson, typeOfRent, serviceFree);
    }

    private Facility createNewHouse() {
        String idFacility;
        do {
            System.out.println("Enter id ");
            idFacility = scanner.nextLine();
            if (idFacility.matches("^SVVL-[0-9]{4}$"))
                break;
        } while (true);
        String nameFacility;
        do {
            System.out.println("Enter name");
            nameFacility = scanner.nextLine();
            if (nameFacility.matches("^[A-Z].*$"))
                break;
        } while (true);

        float areaUse;
        do {
            System.out.println("Enter area use");
            try {
                areaUse = Float.parseFloat(scanner.nextLine());
                if (areaUse <= Float.MAX_VALUE && areaUse > 30)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        } while (true);
        System.out.println("Enter cost for rent");
        long costForRent;
        do {
            try {
                costForRent = Long.parseLong(scanner.nextLine());
                if (costForRent <= Integer.MAX_VALUE && costForRent > 0)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        } while (true);
        System.out.println("Enter max person");
        int maxPerson;
        do {
            try {
                maxPerson = Integer.parseInt(scanner.nextLine());
                if (maxPerson < 20 && maxPerson > 0)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        } while (true);
        System.out.println("Enter type of rent");
        //String typeOfRent, String standard, float areaPool, int numberOfFloor
        String typeOfRent;
        do {

            typeOfRent = scanner.nextLine();
            if (typeOfRent.matches("^[A-Z].*$"))
                break;
        } while (true);
        System.out.println("Enter standard");
        String standard;
        do {
            standard = scanner.nextLine();
            if (standard.matches("^[A-Z].*$"))
                break;
        } while (true);
        System.out.println("Enter number of floor");
        int numberOfFloor;
        do {
            try {
                numberOfFloor = Integer.parseInt(scanner.nextLine());
                if (numberOfFloor > 0)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        } while (true);
        //String idFacility, String nameFacility, int areaUse,
        // long costForRent, int maxPerson, String typeOfRent, String standard, int areaPool, int numberOfFloor
        return new HouseForRent(idFacility, nameFacility, areaUse, costForRent, maxPerson, typeOfRent, standard, numberOfFloor);
    }

    private Facility createNewVilla() {
        System.out.println("Enter id ");
        String idFacility;
        do {
            idFacility = scanner.nextLine();
            if (idFacility.matches("^SVVL-[0-9]{4}$"))
                break;
        } while (true);
        System.out.println("Enter name");
        String nameFacility;
        do {
            nameFacility = scanner.nextLine();
            if (nameFacility.matches("^[A-Z].*$"))
                break;
        } while (true);
        System.out.println("Enter area use");
        float areaUse;
        do {
            try {
                areaUse = Float.parseFloat(scanner.nextLine());
                if (areaUse <= Float.MAX_VALUE && areaUse > 30)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        } while (true);

        long costForRent;
        do {
            System.out.println("Enter cost for rent");
            try {
                costForRent = Long.parseLong(scanner.nextLine());
                if (costForRent <= Integer.MAX_VALUE && costForRent > 0)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        } while (true);

        int maxPerson;
        do {
            System.out.println("Enter max person");
            try {
                maxPerson = Integer.parseInt(scanner.nextLine());
                if (maxPerson < 20 && maxPerson > 0)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        } while (true);
        System.out.println("Enter type of rent");
        //String typeOfRent, String standard, float areaPool, int numberOfFloor
        String typeOfRent;
        do {

            typeOfRent = scanner.nextLine();
            if (typeOfRent.matches("^[A-Z].*$"))
                break;
        } while (true);
        System.out.println("Enter standard");
        String standard;
        do {
            standard = scanner.nextLine();
            if (standard.matches("^[A-Z].*$"))
                break;
        } while (true);
        System.out.println("Enter area pool");
        float areaPool;
        do {
            try {
                areaPool = Float.parseFloat(scanner.nextLine());
                if (areaPool <= Float.MAX_VALUE && areaPool > 30)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        } while (true);
        System.out.println("Enter number of floor");
        int numberOfFloor;
        do {
            try {
                numberOfFloor = Integer.parseInt(scanner.nextLine());
                if (numberOfFloor > 0)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format");
            }
        } while (true);
        //String idFacility, String nameFacility, int areaUse,
        // long costForRent, int maxPerson, String typeOfRent, String standard, int areaPool, int numberOfFloor
        return new VillaForRent(idFacility, nameFacility, areaUse, costForRent, maxPerson, typeOfRent, standard, areaPool, numberOfFloor);
    }

    @Override
    public void delete() {
        System.out.println("Enter id of facility what you want delete");
        String id = scanner.nextLine();
        if (facilityRepository.check(id)) {
            System.out.println("Press 'Y' for delete");
            System.out.println("Press any for return menu");
            String confirm = scanner.nextLine();
            if (confirm.equals("Y"))
                facilityRepository.delete(id);
        } else
            System.out.println("Can't find id facility");
    }
}
