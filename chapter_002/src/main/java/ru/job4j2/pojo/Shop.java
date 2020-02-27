package ru.job4j2.pojo;

/**
 * 3. Удаление моделей из массива.[#235615]
 */
public class Shop {

    /**
     * метод удаляет из массива элемент  с заданным индексом, а на пустое место
     * сдвигает остальные элементы массива
     *
     * @param products - массив
     * @param index    - индекс элемента для удаления
     * @return - измененный массив
     */
    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    /**
     * Main
     *
     * @param args - args
     */
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milck", 50);
        products[1] = new Product("Egg", 60);
        products[2] = new Product("Potato", 130);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName() + " " + product.getCount());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();
        Shop shop = new Shop();
        shop.delete(products, 2);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName() + " " + product.getCount());
            } else {
                System.out.println("null");
            }
        }
    }
}
