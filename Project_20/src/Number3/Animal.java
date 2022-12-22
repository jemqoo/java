package Number3;

public class Animal {
    private Integer iAge;
    private String stName;

    public Animal(Integer iAge, String stName) {//Конструктор
        this.iAge = iAge;
        this.stName = stName;
    }

    //Функции "геттеры" и "сеттеры"
    public Integer getAge() {
        return iAge;
    }

    public void setAge(Integer iAge) {
        this.iAge = iAge;
    }

    public String getName() {
        return stName;
    }

    public void setName(String stName) {
        this.stName = stName;
    }
}
