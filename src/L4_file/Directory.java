package L4_file;


import java.util.ArrayList;
import java.util.List;

public class Directory implements Inter {
    private int size;

    public Directory() {
    }

    public Directory(Inter file) {
        add(file);
    }

    public Directory(Inter file, Inter files) {
        add(file);
        add(files);
    }

    public Directory add(Inter file) {
        if (file.hashCode() == this.hashCode()) {
            throw new IllegalArgumentException("You have hanging");
        } else {
            this.setSize(file.getSize());
        }
        return this;
    }

    public void setSize(int size) {
        this.size += size;
    }

    @Override
    public int getSize() {
        return size;
    }

}

