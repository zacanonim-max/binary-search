public class binary {

    static int binarySearch(int[] massiv,int item){//создадим метод бинарного поиска
        int low = 0;// точка начала проверки
        int high = massiv.length - 1;//точка конца проверки
        while (low<=high) { //цикл работает пока low меньше или совпадет с high
            int mid = (low + high ) / 2;//середина проверки
            int guess = massiv[mid];// поиск числа по индексу mid
            if(guess == item){//если выбранный элемент равен элементу по среднему значению
                return mid;//возращаем 
            }else if(guess > item){//если среднее значение БОЛЬШЕ чем выбранный элемент
                high = mid - 1;//то присваиваем точке конца проверки середину проверки минус один
            }else{//либо же
                low = mid + 1;//присваиваем точке начала проверки середину проверки плюс один
            }
        }
        return -1;//возращаем 

    }


    public static void main(String[] args) {
        int [ ] massivOne = {1,3,5,7,8,9,5,3,1,9,41,12,11,86}; 
        System.out.println("Индекс числа: "+binarySearch(massivOne, 5));
    }
}
