public class MobilePhone extends Phone {
    private double screenSize;
    private boolean isFoldable;

    public MobilePhone(int number, String modelName, double weight,double screenSize,boolean isFoldable) {
        super(number, modelName, weight);
        this.screenSize = screenSize;
        this.isFoldable = isFoldable;
    }

    public void sendMessage(String message, int number) {
        System.out.println("Отправить сообщение " +'"' + message + '"' + " на номер : " + number);
    }

    @Override
    public String toString() {
        return ("Номер: "+ GetNumber() + "\n" + "Модель: "+ GetModel() + "\n" +
                "Вес: " + GetWeight() + "\n" + "IsFoldable : " + isFoldable +
                "\n" + "Диагональ экрана : " + screenSize);
    }
    @Override
    public void ring() {
        System.out.println("Звонит мобильный телефон");
    }
}
