package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 * 1) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 * 2) Create a few objects of your generic class with different data types to demonstrate it's
 * dynamic usage.
 */

class GenericClass<T, U> {

    private T name;
    private U courseLength;
    private U cost;

    public GenericClass() {
    }

    public GenericClass(T name, U courseLength, U cost) {
        this.name = name;
        this.courseLength = courseLength;
        this.cost = cost;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public U getCourseLength() {
        return courseLength;
    }

    public void setCourseLength(U courseLength) {
        this.courseLength = courseLength;
    }

    public U getCost() {
        return cost;
    }

    public void setCost(U cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "name=" + name +
                ", courseLength=" + courseLength +
                ", cost=" + cost +
                '}';
    }
}

class Exercise_01 {
    public static void main(String[] args) {
        GenericClass<String, Integer> obj1 = new GenericClass<>();
        obj1.setName("Introduction to SQL");
        obj1.setCourseLength(12);
        obj1.setCost(100);

        System.out.println(obj1.toString());

        GenericClass<Integer, Integer> obj2 = new GenericClass<>();
        obj2.setName(101);
        obj2.setCourseLength(3);
        obj2.setCost(50);

        System.out.println(obj2.toString());

    }
}