package pro2_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by admin on 18.12.2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException {


        byte[] dataArr;
        RandomAccessFile randomAccessFile = new RandomAccessFile("C:\\Users\\admin\\IdeaProjects\\KievProg\\src\\pro2_json\\jsonik.txt", "r");
        dataArr = new byte[(int) randomAccessFile.length()];
        randomAccessFile.read(dataArr);
        randomAccessFile.close();

        String s = new String(dataArr);

        Gson gson = new GsonBuilder().create();
        Info info = gson.fromJson(s, Info.class);
        Address address = gson.fromJson(s, Address.class);

        System.out.println(info);
        System.out.println(address);

    }
}
