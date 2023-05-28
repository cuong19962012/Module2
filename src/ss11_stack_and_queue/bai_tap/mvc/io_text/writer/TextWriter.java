package ss11_stack_and_queue.bai_tap.mvc.io_text.writer;

import java.io.*;

public class TextWriter {
    public void writeFile() {
        File fileStudent = new File("src/ss11_stack_and_queue/bai_tap/mvc/io_text/list_students.csv");
        File fileTeacher = new File("src/ss11_stack_and_queue/bai_tap/mvc/io_text/list_teacher.csv");
        try {
            FileWriter fileWriterStudent = new FileWriter(fileStudent);
            FileWriter fileWriterTeacher = new FileWriter(fileTeacher);
            BufferedWriter bufferedWriterStudent = new BufferedWriter(fileWriterStudent);
            BufferedWriter bufferedWriterTeacher = new BufferedWriter(fileWriterTeacher);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
