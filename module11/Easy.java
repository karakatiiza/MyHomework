package com.varaxina.module11;

/*
1. Коллекции — это специальные классы и интерфейсы в Java,
которые позволяют удобно работать с группами объектов.

2. 3 основных интерфейса, которые наследуются от Collection: List, Set, Queue.

3. Отличия ArrayList от LinkedList:
ArrayList хранит элементы в массиве, то есть быстрый доступ по индексу,
но вставка/удаление из середины медленные.
LinkedList хранит элементы как цепочку, то есть быстрые вставка и удаление,
но доступ к элементу по индексу медленный.

4. Множество (Set) — коллекция, которая хранит только уникальные элементы.
Реализации: HashSet, LinkedHashSet, TreeSet.

5. equals() определяет, равны ли два объекта.
hashCode() возвращает число, по которому объект ищут в хеш-таблицах.
Если equals() возвращает true, то hashCode() должен быть одинаковым.
Коллизия — это когда у разных объектов одинаковый хеш-код, но equals() говорит, что они разные.

6. У двух разных объектов может быть одинаковый хеш-код (это и есть коллизия).

7. Ассоциативный массив — это структура, где данные хранятся в виде ключ-значение.
Реализации интерфейса Map: HashMap, LinkedHashMap, TreeMap, Hashtable.

8.
@Override
public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) return false;
    Human humanObj = (Human) obj;
    boolean result = fio.equals(humanObj.fio)
                && birthday.equals(humanObj.birthday);
    return result;
}
 */
