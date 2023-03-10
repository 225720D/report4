package report4.app.jp.ac.uryukyu.ie.e225720;

public class Warrior extends Hero{
    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing l) {
        if ( this.dead == false ) {
            int damage = (int)(this.attack * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, l.getName(), damage);
            l.wounded(damage);
        }
    }
}