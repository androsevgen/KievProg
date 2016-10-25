package L4_file;

public class File implements Inter {
    private int size;

    public File(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    public File setSize(int size) {
        this.size = size;
        return this;
    }
}
