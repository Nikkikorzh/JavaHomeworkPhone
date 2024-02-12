public class LandLinePhone extends Phone{

    private boolean isCallable;
    public LandLinePhone(int number, String modelName, double weight,boolean isCallable) {
        super(number, modelName, weight);
        this.isCallable = isCallable;
    }

    @Override
    public String toString() {
        return ("Номер: "+ GetNumber() + "\n" + "Модель: "+ GetModel() + "\n" +
                "Вес: " + GetWeight() + "\n" + "IsCallable : " + isCallable);
    }
    @Override
    public void ring() {
        System.out.println("Звонит стационарный телефон!");
    }
}
