package labs_examples.lambdas.labs;

public class ConstructorRef {
    public static void main(String[] args) {

        // Modify the line below to use a constructor reference rather than a lambda expression

        // CatInterface catCreator = (name, color) -> {
        //   return new Cat(name, color);
        // };

        CatInterface catCreator = Cat::new;

        Cat kitten = catCreator.createCat("Lucy", "Orange");
        System.out.println(kitten.toString());
    }
}

    interface CatInterface {
        Cat createCat(String name, String color);
    }

    class Cat {
        String name;
        String color;

        public Cat(String name, String color) {
            this.name = name;
            this.color = color;
        }

        @Override
        public String toString() {
            return name + " the cat is " + color;
        }
    }
