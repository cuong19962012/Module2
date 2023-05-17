package ss8_clean_code_and_refactoring.thuc_hanh.imlements_mvc;

/**
 *
 */
public class StudentService {

    private StudentRepository studentRepository = new StudentRepository();

    public void display() {
        Model[] list = studentRepository.getDataDisplay();
        for (Model student : list) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    /**
     *
     * @param id
     * @param name
     * @param classes
     * @return
     */
    public Model[] add(int id, String name, String classes) {
        Model modelForAdd = new Model(id, name, classes);
        Model[] returnData = studentRepository.getDataAdd(modelForAdd);
        if (returnData != null) {
            //System.out.println("Thêm đã thành công!!!");
            return returnData;
        } else {
            //System.out.println("Thêm thất bại!!! Mảng đã hết chỗ để thêm");
            return null;
        }
//        int index = -1;
//        for (int i = 0; i < list.length; i++) {
//            if (list[i] == null) {
//                index = i;
//            }
//        }
//
//        if (index != -1) {
//            list[index] = new Model(id, name, classes);
//        } else {
//            System.out.println("Mảng đã hết chỗ để thêm");
//        }
    }

    public Model delete(int id) {
        Model[] list = studentRepository.getDataDisplay();
        int index = -1;
        for (int i = 0; i < list.length || list[i] != null; i++) {
            if (list[i].getId() == id) {
                index = i;
                Model temp = list[index];
                studentRepository.getDataDelete(index);
                return temp;
            }
        }
        return null;
//        for (int i = 0; i < list.length; i++) {
//            if (list[i].getId() == id) {
//                list[i] = null;
//                return;
//            }
//        }
    }
}
