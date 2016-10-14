package L4_file_system;


import java.util.ArrayList;
import java.util.List;

public class Directory {
    List<File> files = new ArrayList<File>();
    List<Directory> dirs = new ArrayList<Directory>();
   private int size;

    public Directory(File file) {
        size += file.getSize();
    }

    public Directory() {

    }

    public Directory(File file, File file2) {
        size += file.getSize() + file2.getSize();

    }

    public Directory(Directory dir, File file2) {
        for (File f : dir.files) {
            size += f.getSize();
        }
        size += file2.getSize();
    }

    public Directory(Directory d) {
        for (File f : d.files) {
            size += f.getSize();
        }
    }

    public void add(File f) {
        files.add(f);
    }

    public void add(Directory d) {
        dirs.add(d);
    }

    public int getSize() {
        for (File f : files) {
            size += f.getSize();
        }

        //дописать для файлов внутри директорий

        return size;
    }

    public List<File> getFiles() {
        return files;
    }

    public List<Directory> getDirs() {
        return dirs;
    }

}

