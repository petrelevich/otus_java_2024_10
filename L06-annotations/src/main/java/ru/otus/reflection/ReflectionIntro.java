package ru.otus.reflection;

@SuppressWarnings({"java:S106", "java:S1481", "java:S1854"})
public class ReflectionIntro {
    public static void main(String[] args) throws ClassNotFoundException {
        // Получение Class у класса
        Class<ReflectionIntro> clazz1 = ReflectionIntro.class;
        System.out.println("simpleName:" + clazz1.getSimpleName());

        // Получение Class у экземпляра
        var app = new ReflectionIntro();
        Class<? extends ReflectionIntro> clazz2 = app.getClass();
        System.out.println("simpleName:" + clazz2.getSimpleName());

        // Получение Class через строковое имя класса
        // Например, для создания экземпляров классов, отсутствующих при компиляции (JDBC-драйвер)
        Class<?> classString = Class.forName("java.lang.String");
        System.out.println("simpleName:" + classString.getSimpleName());
        System.out.println("canonicalName:" + classString.getCanonicalName());

        // Получение Class у примитива
        Class<Integer> classInt = int.class;
        System.out.println("TypeName int:" + classInt.getTypeName());

        // Получение Class у обёртки примитива
        Class<Integer> classInteger = Integer.class;
        System.out.println("TypeName Integer:" + classInteger.getTypeName());
    }
}
