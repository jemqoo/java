package pract21.task2_3;

public class ArrayStorage<E>{
    private E[] array;//объявление приватного массива

    public E get(int index){
        return array[index];
    } //метод get(int index) возвращает элемент по указанному индексу

    public void setArray(E[] array){
        this.array = array;
    }
}
