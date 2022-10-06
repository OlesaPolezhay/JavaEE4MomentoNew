public class Demo {
    public static void main(String[] args) {
        Character player = new Character("Ramized", "bard", "half-elf");

        Stats temp = Stats.generate();
        player.setAttribute(temp);
        player.printSheep();

        CareTaker careTaker = new CareTaker();
        Momento momento = new Momento();

        temp = Stats.generate();
        temp.printStats();
        momento.setState(temp);
        careTaker.add(momento.getState());

        temp = Stats.generate();
        temp.printStats();
        momento.setState(temp);
        careTaker.add(momento.getState());

        temp = Stats.generate();
        temp.printStats();
        momento.setState(temp);
        careTaker.add(momento.getState());

        momento.setState(careTaker.get(0));
        temp = momento.getState();
        temp.printStats();

        momento.setState(careTaker.get(1));
        temp = momento.getState();
        temp.printStats();

        momento.setState(careTaker.get(2));
        temp = momento.getState();
        temp.printStats();

    }
}

