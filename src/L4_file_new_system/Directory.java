package L4_file_new_system;


import java.util.ArrayList;
import java.util.List;

public class Directory {
    private List<File> files = new ArrayList<>();
    private List<Directory> dirs = new ArrayList<>();
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


    public Directory add(File f) {
        if (f.hashCode() == this.hashCode()) {
            throw new IllegalArgumentException("You have hanging");
        } else

            files.add(f);
        return this;
    }

    public Directory add(Directory d) {
        if (d.hashCode() == this.hashCode()) {
            throw new IllegalArgumentException("You have hanging");
        } else
            dirs.add(d);
        return this;
    }

}

