package L4_file_system;


import java.util.ArrayList;
import java.util.List;

public class Directory implements Inter, Inter2, Inter3  {
    private int size;
    List<File> files = new ArrayList<File>();
    List<Directory> directories = new ArrayList<Directory>();

    public Directory() {
    }

    public Directory(File file, File file1) {
            size =+ file.getSize() + file1.getSize();
    }

    public Directory(File file) {
        size =+ file.getSize();

    }

    public Directory(Directory directory11, File file11) {
        for (File f :
                directory11.files) {
            size =+ file11.getSize();
        }

    }
    public Directory(Directory dir){
        for (File f:
             dir.files) {
            size =+ f.getSize();
        }
    }


    public List<File> getFiles(){
        return files;
    }

    public List<Directory> getDirs(){
        return directories;
    }


    @Override
    public int getSize() {
        return size;
    }


    @Override
    public boolean add(File f) {
        return files.add(f);
    }

    @Override
    public boolean add(Directory d) {
        return directories.add(d);
    }
}

