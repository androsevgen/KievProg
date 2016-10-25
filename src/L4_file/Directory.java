package L4_file;


public class Directory implements Inter {
    private int size;

    public Directory() {
    }

    public Directory(Inter inter) {
        add(inter);
    }

    public Directory(Inter inter, Inter inters) {
        add(inter);
        add(inters);
    }

    public Directory add(Inter inter) {
        if (inter == this) {
            throw new IllegalArgumentException("You have hanging");
        } else {
            this.setSize(inter.getSize());
        }
        return this;
    }

    @Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size += size;
    }

}

