public class Phone implements  RingAble {
    private int number;
    private String modelName;
    private double weight;

    public Phone(int number,String modelName,double weight) {
        this.number = number;
        this.modelName = modelName;
        this.weight = weight;
    }

    public void SetNumber(int number) {
        this.number = number;
    }
    public int GetNumber() {
        return number;
    }

    public void SetModel(String modelName) {
        this.modelName = modelName;
    }
    public String GetModel() {
        return modelName;
    }
    public void SetWeight(double weight) {
        this.weight = weight;
    }
    public double GetWeight() {
        return weight;
    }
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    @Override
    public String toString() {
        return ("Номер: "+ number + "\n" + "Модель: "+ modelName + "\n" +
                "Весt: " + weight);
    }
    @Override
    public void ring() {
        System.out.println("Звонит телефон");
    }
}
