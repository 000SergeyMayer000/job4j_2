package ru.job4j_2.array;

/**
 * 6.3. Массив заполнен true или false[#235429]
 */
public class Check {

    /**
     * методmonoпроверяет все ли элименты массива являются однотипными(true или false)
     *
     * @param data - проверяемый масив
     * @return - return
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (data[0] != data[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}