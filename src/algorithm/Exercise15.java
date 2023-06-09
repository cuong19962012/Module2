package algorithm;

public class Exercise15 {
    public static void main(String[] args) {
        String fileClass = "class";
        String filePackage = "package";
        String fileField = "field";
        String fileMethod = "method";
        String str1 = "hello_world";
        String str2 = "Package";
        if (str2.toLowerCase().equals(fileClass))
            System.out.println(checkClass(str1));
        if (str2.toLowerCase().equals(filePackage))
            System.out.println(checkPackage(str1));
        if (str2.toLowerCase().equals(fileField) || str2.toLowerCase().equals(fileMethod))
            System.out.println(checkFieldAndMethod(str1));
    }

    static boolean checkClass(String nameClass) {
        if (nameClass.charAt(0) > 64 && nameClass.charAt(0) < 91)
            return true;
        return false;
    }

    static boolean checkPackage(String namePackage) {
        char charAfterDivide = namePackage.charAt(namePackage.indexOf("_") + 1);
        char charFirst = namePackage.charAt(0);
        if (namePackage.contains("_") && charFirst > 96 && charFirst < 123 && charAfterDivide > 96 && charAfterDivide < 123)
            return true;
        return false;
    }

    static boolean checkFieldAndMethod(String nameFieldAndMethod) {
        if (nameFieldAndMethod.charAt(0) > 96 && nameFieldAndMethod.charAt(0) < 123)
            return true;
        return false;
    }
}
