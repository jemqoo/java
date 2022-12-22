package Calculator;

public class MinMax<T extends Comparable>{
    private T[] arMinMax;//Массив элементов типа T
    public MinMax(T[] arMinMax) {
        this.arMinMax = arMinMax;
    }//Установление массива
    public T findMin(){//Функция поиска минимального элемента
        if (arMinMax.length == 0) return null;//Проверка массива на пустоту
        T min = arMinMax[0];//Задание минимальной переменной значения первого элемента масссива
        for(int i = 1; i < arMinMax.length; i++){//Цикл для поиска минимального элемента
            if(arMinMax[i].compareTo(min) < 0 ){
                min = arMinMax[i];
            }
        }
        return min;//Возврат минимального элемента
    }
    public T findMax(){//Функция поиска максимального элемента
        if (arMinMax.length == 0) return null;//Проверка массива на пустоту
        T max = arMinMax[0];//Задание максимальной переменной значения первого элемента масссива
        for(int i = 1; i < arMinMax.length; i++){//Цикл для поиска максимального элемента
            if(arMinMax[i].compareTo(max) > 0 ){
                max = arMinMax[i];
            }
        }
        return max;//Возврат максимального элемента
    }
}

