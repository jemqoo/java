package Matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Matrix<E> {
    ArrayList<ArrayList<E>> matrix = new ArrayList<>();//Создание списка списков элементоп типа E
    int sizeX = 0;//Размер ширины матрицы
    int sizeY = 0;//Размер высоты матрицы

    public void setMatrix(E[][] matrix){//Функция задания матрицы, на вход поступает двухмерный массив
        for (E[] e : matrix){//Цикл для построчного заполнения матрицы
            sizeY +=1;//Увеличиваем высоту
            int sizeXTmp = 0;//Переменная для определения ширины
            ArrayList<E> tmp = new ArrayList<>();//Строка матрицы
            for(E element : e){//Цикл для заполнения строки матрицы
                sizeXTmp++;
                tmp.add(element);
            }
            if(sizeXTmp != sizeX) sizeX = sizeXTmp;//Присваивание переменной ширины нового значние
            this.matrix.add(tmp);//Добавление строки
        }
    }

    public void addColumn(E[] column){//Функция добавления колонки
        sizeX+=1;//Ширина увеличивается на 1
        for(int i = 0; i < column.length; i++){//Построчное добавление элемента
            if (matrix.size() >=i){
                matrix.get(i).add(column[i]);
            }
        }
    }

    public void addRow(E[] row){//Функция добавления строки
        sizeY+=1;//Высота увеличивается на 1
        ArrayList<E> tmp = new ArrayList<>();
        for(int i = 0; i < row.length; i++){
            tmp.add(row[i]);
        }
        matrix.add(tmp);
    }

    public boolean transparentMatrix(){//Функция транспонирования матрицы
        if (sizeX != sizeY) return false;//Проверка возможности транспонировать
        for(int i = 0; i < sizeY; i++){
            for(int j = i; j < sizeX; j++) {
                E tmp = matrix.get(j).get(i);
                matrix.get(j).set(i, matrix.get(i).get(j));
                matrix.get(i).set(j,tmp);
            }
        }
        return true;
    }

    public E findMax(Comparator<? super E> comparator){//Нахождение максимального элемента
        if (sizeY == 0 && sizeX == 0) return null;//Проверка на пустоту
        E max = matrix.get(0).get(0);//Утсановка максимального элемента по умолчанию
        for(int i = 0; i < sizeY; i++){//Цикл для "пробега" по строкам
            for(int j = 0; j < sizeX; j++){//Цикл для "пробега" по столбцам
                if (comparator.compare(max,matrix.get(i).get(i)) < 0){
                    max = matrix.get(i).get(j);
                }
            }
        }
        return max;
    }

    public E findMin(Comparator<? super E> comparator){//Нахождение минимального элемента
        if (sizeY == 0 && sizeX == 0) return null;//Проверка на пустоту
        E min = matrix.get(0).get(0);//Утсановка максимального элемента по умолчанию
        for(int i = 0; i < sizeY; i++){//Цикл для "пробега" по строкам
            for(int j = 0; j < sizeX; j++){//Цикл для "пробега" по столбцам
                if (comparator.compare(min,matrix.get(i).get(i)) > 0){
                    min = matrix.get(i).get(j);
                }
            }
        }
        return min;
    }

    public void deleteColumn(int index){//Функция удаления колонки
        if (index > sizeX) return;//Проверка на существование колонки
        sizeX-=1;//Уменьшение размера
        for(int i = 0; i < sizeY; i++){
            this.matrix.get(i).remove(index);
        }
    }

    public void deleteRow(int index){//Функция удаления строки
        if(index > sizeY) return;//Проверка на существование строки
        sizeY-=1;//Уменьшение размера
        this.matrix.remove(index);
    }

    @Override
    public String toString(){//Функция вывода матрицы
        String result = "" ;
        for(int i = 0; i < sizeY; i++){//По строкам
            for(int j = 0; j < sizeX; j++){//По столбцам
                result += matrix.get(i).get(j) + " ";
            }
            result += "\n";
        }
        return result;
    }
}
