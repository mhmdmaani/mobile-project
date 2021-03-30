public class Mobile {

    private String id;
    private String mobileName;
    private int mobileModel;
    private double mobileYear;
    private double memory;
    private double price;

    public Mobile (String id, String mobileName, int mobileModel, double mobileYear, double memory, double price) {
        this.id = id;
        this.mobileName = mobileName;
        this.mobileModel = mobileModel;
        this.mobileYear = mobileYear;
        this.memory = memory;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }


    public int getMobileModel() {
        return mobileModel;
    }

    public void setMobileModel(int mobileModel) {
        this.mobileModel = mobileModel;
    }

    public double getMobileYear() {
        return mobileYear;
    }

    public void setMobileYear(double mobileYear) {
        this.mobileYear = mobileYear;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id: "+id+", Mobile name: "+ mobileName+", Mobile Model: "+mobileModel+", mobileYear: "+mobileYear+", memory: "+memory+", GB, price: "+price+" ";
    }



}
