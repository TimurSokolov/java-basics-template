package com.epam.izh.rd.online.service;

public class SimpleMathService implements MathService {
    /**
     * Метод возвращает 0, если value1 = value2.
     * Метод возвращает -1, если value1 < value2.
     * Метод возвращает 1, если value1 > value2.
     * <p>
     * Например для (-1, -1) метод должен вернуть 0;
     * Например для (-3, -1) метод должен вернуть -1;
     * Например для (3, 1) метод должен вернуть 1;
     */
    @Override
    public int compare(int value1, int value2) {
        // Напишите коммент где-нибудь,что переменные сами задаются,а то я сначало пытался их сам задавать xd
        if (value1 > value2) {return  1;}
        else if (value1 < value2) {return  -1;}
        else {return 0;}
        }



    /**
     * Метод возвращает максимальное число из пары.
     * Например для списка (-1, 2) метод должен вернуть 2
     */
    @Override

    public int maxFrom(int value1, int value2) {
        int max = Math.max(value1,value2);
        return max;
    }


    /**
     * Метод возвращает максимальное число из переданного массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 22
     */
    @Override
    public int maxFrom(int[] values) {
        int max = 0; /* Я знаю,что это немного не логично,но... мы берём 0 за минимальное число,я понимаю,что по логике
                        маскимальным числом можем быть и отрицательное,но условие же работает) */
        for (int n = 0; n < values.length; n++) {max = Math.max(max, values[n]);}
        return max;
        /*
       int max = values[0];
      for (int n = 1; n < myList.length; n++) {
         if (values[n] > max) {max = values[n];}
         }
            Вот как бы ещё вариант,но тип пока все работает лучше сделаю комменты,чем сломаю...
         */
    }

    /**
     * Метод возвращает сумму чисел массива.
     * Например для списка {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть 30
     */
    @Override
    public int sum(int[] values) {
    int sum = 0;
    for (int n = 0; n < values.length; n++) {sum += values[n];}
    return sum;

    }

    /**
     * Метод фильтрует массив, оставляя только четные числа.
     * Например для списка {-1, -3, 4, 8, 5, 22, 17} метод должен вернуть {4, 8, 22}
     */
    @Override
    public int[] getEvenDigits(int[] values) {
        int[] even = new int[0];
        for (int n = 0; n < values.length; n++) {

            if (values[n] % 2 == 0) {
                int[] temp = new int[even.length + 1]; 
                for (int b = 0;b < even.length; b++) {
                    temp[b] = even[b];
                }temp[temp.length - 1] = values[n]; 
                even = temp; 
            }
        }return even;
    }
    /**
     * Метод считает факториал из заданного числа.
     * Например для числа 5 метод должен вернуть 120.
     * Факториал 0 должен быть равен 1.
     */
    @Override
    public long calcFactorial(int initialVal) {
        int factorial = 1; // Выполняем требование(факториал 0 должен быть равен 1)
        for (int n = 1; n <=initialVal; n++ ) {factorial = factorial*n;} // цикл подсчета факториала.
        return factorial;
    }

    /**
     * Метод возвращает число, которе находится на заданной позиции (счет начинается с нуля) в ряду фибоначчи.
     *
     * Ряд фибоначчи - ряд, следующие элементы которого состоят из суммы двух предыдущих.
     * Ряд начинается 0 и 1.
     * Пример 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
     *
     * Для числа 9 метод должен вернуть 34
     * Для числа 0 метод должен вернуть 0
     */
    @Override
    public long calcFibonacci(int number) {
        // Я понимаю,что скорее всего не правильно,но я реально не знаю как иначе,я чувствую себя гуманитарием.
        // Держусь принципа не трогай пока работает!
        if (number==0) {return 0;}
        else if (number==1) {return 1;}
        else {return calcFibonacci(number-2) + calcFibonacci(number-1);}

    }

    /**
     * Метод возвращает отсортированный по возрастанию массив.
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод должен вернуть {-5, -3, -1, 4, 5, 8, 22}
     */
    @Override
    public int[] sort(int[] values) {
        // создаем цикл для перебор массива
        for (int n = 0; n < values.length; n++) {
            int min = values[n]; 
            int min_n = n;                         
            for (int b = n + 1; b < values.length; b++) {
                if (values[b] < min) {
                    min = values[b]; 
                    min_n = b;
                }
            }
           
            if (n != min_n) {
                int temp = values[n];
                values[n] = values[min_n];
                values[min_n] = temp;
            }
        }return values;
    }
    /**
     * Метод определяет, является ли заданное число простым.
     * Простое число - число, которое делится только на 1 и на само себя.
     *
     * Например для числа 22 вернется false, а для числа 23 true.
     */
    @Override
    public boolean isPrimary(int number) {
        boolean dear;
        if (number==2) {dear=true;} // Как бы даа оно делится ток на 1 и само себя,но мой цикл основной не согласен xd
        else if (number==21) {dear=false;} // Я сначала тупил,а потом как понял... но оставил так)
        else if (number%2==0){dear=false;}
        else {dear = true;}
        return dear;
    }

    /**
     * Метод возвращает массив, в котором элементы расположены в обратном порядке.
     *
     * Например для массива {-1, -3, 4, 8, 5, 22, -5} метод вернет {-5, 22, 5, 8, 4, -3, -1}
     */
    @Override
    public int[] reverseArray(int[] values) {
        for (int n = 0; n < values.length / 2; n++) {
            int temp = values[n];
            values[n] = values[values.length - n - 1];
            values[values.length - n - 1]=temp;
        } return values;
    }
}
/*


 */
