package com.varaxina.module12;

/*
1. Абсолютный путь — это когда мы указываем все директории от корневого каталога системы до нашего файла.
Относительный путь — это путь от директории, в которой запускается наше приложение.

2.Метод close() оповещает систему о том, что мы закончили работу с файлом.
Если этого не сделать, то могут возникать различные ошибки с доступом к этому файлу у других программ.

3. StringTokenizer — класс для разбиения строки на части
по разделителю (по умолчанию - по пробелам).
Основные методы: hasMoreTokens, nextToken.

4. Сериализация — это процесс перевода данных в последовательность байт. .
Десериализация — создание данных из байтовой последовательности.

5. Модификатор transient — скрывает поля от сериализации.

Задание:
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class PrintExample {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("result.txt");
        printWriter.print(LocalDateTime.now());
        printWriter.close();
    }
}

 */
