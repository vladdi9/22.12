package pattern.fantasyGame;

public class FantasyGame {
    public static void main(String[] args) {
        Barracks humanBarracks = new HumanBarracks();
        Warrior warrior = humanBarracks.creatWarrior();
        warrior.attack();
        Mage mage = humanBarracks.creatMage();
        mage.cast();
        Archer archer = humanBarracks.creatArcher();
        archer.shoot();

    }
}
abstract class Barracks{
    public abstract Warrior creatWarrior();
    public abstract Mage creatMage();
    public abstract Archer creatArcher();
}
interface Warrior{
    public void attack();
}
interface Mage{
    public void cast();
}
interface Archer{
    public void shoot();
}

class HumanBarracks extends Barracks{
    @Override
    public Warrior creatWarrior() {
        return new HumanWarrior();
    }

    @Override
    public Mage creatMage() {
        return new HumanMage();
    }

    @Override
    public Archer creatArcher() {
        return new HumanArcher();
    }
}
class HumanWarrior implements Warrior{
    @Override
    public void attack() {
        System.out.println("The human warrior is attacking with sword");
    }
}
class HumanMage implements Mage{
    @Override
    public void cast() {
        System.out.println("The human mage is casting a spell");
    }
}
class HumanArcher implements Archer{
    @Override
    public void shoot() {
        System.out.println("The human archer is shooting");
    }
}