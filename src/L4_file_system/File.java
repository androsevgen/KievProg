package L4_file_system;

public class File implements Inter {
    private int size;

    public File(int i) {
        size =i;
    }

    @Override
    public int getSize() {
        return size;
    }
}
