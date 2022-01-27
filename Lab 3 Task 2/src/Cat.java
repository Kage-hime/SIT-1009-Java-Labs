import java.util.Locale;

public class Cat extends Animal
{
    public Cat()
    {

    }

    public Cat(String name, int age, String color)
    {
        this.age = age;
        this.name = name;
        this.color = color;
        System.out.println("In " + this.getClass().getName().toLowerCase() + " constructor");
    }

    @Override
    public void greetings()
    {
        System.out.print("Meow\n");
    }

    @Override
    public void printinfo()
    {
        System.out.print(this.getClass().getName() + " " + this.name + " is " + this.age + " years old and is of "
                + this.color + " color ");
        this.greetings();

    }
}
