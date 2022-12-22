package Number3;

public class NewAnimal extends Animal{
    private Integer iHeight;
    public NewAnimal(Integer iAge, String stName, Integer iHeight) {//Конструктор
        super(iAge, stName);//Вызов конструктора родителя
        this.iHeight = iHeight;
    }
}
