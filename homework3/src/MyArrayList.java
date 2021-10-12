import java.util.NoSuchElementException;
/**
 * Должен наследовать SimpleList
 *
 * Должен иметь 2 конструктора
 * - без аргументов - создает внутренний массив дефолтного размера
 на ваш выбор
 * - с аргументом - начальный размер массива
 */
public class MyArrayList implements SimpleList {
    public int array[];
    public int current_size = 0;
    public int size = 10;
    public MyArrayList() {
        int array[] = new int[size];
        current_size = size;
    }
    public MyArrayList(int capacity) {
        int array[] = new int[capacity];
        current_size = capacity;
    }
    @Override
    public void add(int item) {
        int[] arrayTemp = new int [current_size + 1];
        for (int j = 0; j <= current_size; j++ ){
            arrayTemp[j] = this.array[j];
        }
        arrayTemp[current_size] = item;
        this.array = arrayTemp;
        current_size++;
    }
    @Override
    public int remove(int idx) throws NoSuchElementException {
        if (idx >= size || idx < 0){
            throw new NoSuchElementException("Index is out of limit");
        }
        int a = array[idx];
        int[] arrayTemp = new int[current_size - 1];
        for (int j = 0; j < current_size; j++){
            if (j == idx){
                continue;
            }
           // else if (j > idx){
             //   continue;
            //}
            else if (j > idx){
                arrayTemp[j - 1] = this.array[j];
            }
            else{
                arrayTemp[j] = this.array[j];
            }
        }
        this.array = arrayTemp;
        current_size--;
        return a;
    }
    @Override
    public int size() {
        return current_size;
    }
    @Override
    public int get(int idx) throws NoSuchElementException{
        if (idx >= size || idx < 0){
            throw new NoSuchElementException("Index is out of limit");
        }
        else {
            return this.array[idx];
        }
    }
}