public class GenericArray<T> {
    private Object[] array; // Используем массив Object для хранения элементов любого типа


    public GenericArray(int size) {
        array = new Object[size];
    }

    public void set(int index, T item) {
        array[index] = item;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        return (T) array[index]; // Извлечение элемента с приведением типа
    }

    public int length() {
        return array.length;
    }

    // Вспомогательный метод для создания GenericArray для данного типа и размера
    public static <E> GenericArray<E> of(Class<E> clazz, int size) {
        return new GenericArray<>(size);
    }
}
