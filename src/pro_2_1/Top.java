package pro_2_1;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.RandomAccessFile;

public class Top {

    public static void main(String[] args) throws Exception {


        byte[] dataArr;
        RandomAccessFile file = new RandomAccessFile("C:\\Users\\admin\\IdeaProjects\\KievProg\\src\\pro_2_1\\json.txt", "r");

        try {
            dataArr = new byte[(int) file.length()];
            file.read(dataArr);
        } finally {
            file.close();
        }

        String result = new String(dataArr);

        Gson gson = new GsonBuilder().create();
        Person person = gson.fromJson(result, Person.class);

        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getAddress().getCity());
        System.out.println(person.getAddress().getStreet());
    }
}
