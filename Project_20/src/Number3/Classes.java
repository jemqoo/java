package Number3;

import java.io.Serializable;
import java.util.Comparator;

public class Classes<T extends Comparable, V extends Serializable, K extends Animal> {
    private T tObject;//Объект класса T
    private V vObject;//Объект класса V
    private K kObject;//Объект класса K

    public Classes(T tObject, V vObject, K kObject) {//Конструктор
        this.tObject = tObject;
        this.vObject = vObject;
        this.kObject = kObject;
    }

    //Фкнции "геттеры" и "сеттеры"
    public T getTObject() {
        return tObject;
    }

    public void setTObject(T tObject) {
        this.tObject = tObject;
    }

    public V getVObject() {
        return vObject;
    }

    public void setVObject(V vObject) {
        this.vObject = vObject;
    }

    public K getKObject() {
        return kObject;
    }

    public void setKObject(K kObject) {
        this.kObject = kObject;
    }


    public void showClassesName(){//Вывод объектов и названия их классов
        System.out.println("T: " + tObject.getClass() + "\nV: " + vObject.getClass() + "\nK: " + kObject.getClass());
    }
}
