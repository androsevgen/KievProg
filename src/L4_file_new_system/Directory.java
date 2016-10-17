package L4_file_new_system;


import java.util.ArrayList;
import java.util.List;

public class Directory {
    List<File> files = new ArrayList<>();
    List<Directory> dirs = new ArrayList<>();
    private int size;

    public Directory() {
    }

    public Directory(File file, File file1) {
        size += file.getSize() + file1.getSize();
    }

    public Directory(File file2) {
        size += file2.getSize();
    }

    public Directory(Directory directory, File file3) {
        size += file3.getSize() + directory.getSize();
    }

/*
    public Directory(Directory dd) {
        for (File f : dd.files) {
            size += f.getSize();
        }
    }
*/

    public int getSize() {
        for (File f : files) {
            size += f.getSize();
        }
        for (Directory ff :
                dirs) {
            size += ff.getSize();
        }
        return size;
    }

    public void add(File f) {
        files.add(f);
    }

    public void add(Directory d) {
        dirs.add(d);
    }

}

