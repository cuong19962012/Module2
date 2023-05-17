package ss8_clean_code_and_refactoring.thuc_hanh.imlements_mvc;

public class StudentRepository {
    private static Model[] data = new Model[10];

    static {
        Model model1 = new Model(1, "Hoàng", "C03");
        Model model2 = new Model(2, "Loan", "C03");
        Model model3 = new Model(3, "Thắng", "C03");
        data[0] = model1;
        data[1] = model2;
        data[2] = model3;
    }

    public Model[] getDataDisplay() {
        return data;
    }

    public Model[] getDataAdd(Model modelForAdd) {
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                index = i;
            }
        }

        if (index != -1) {
            data[index] = modelForAdd;
        } else {
            return null;
        }
        return data;
    }

    public Model[] getDataDelete(int index) {
        data[index] = null;
        return data;
    }
}
