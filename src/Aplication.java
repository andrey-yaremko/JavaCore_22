public class Aplication {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Cat cat = new Cat();
        cow.say(()-> System.out.println("Корова каже му-му"));
        cat.say(()-> System.out.println("Кішка каже мяу"));
        voice frog = msg -> System.out.println(msg);
        frog.voice("Жаба каже ква-ква");

    }
    @FunctionalInterface
    interface voice {
        void voice(String msg);
    }
}
