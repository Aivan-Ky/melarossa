/*
Представьте ситуацию:
        Тендер на строительство еще одной национальной библиотеки. На контракт претендуют несколько бригад строителей.
        В каждой бригаде есть некоторое количество работников, обладающих набором профессиональных навыков (все навыки ограничены специально созданным вами перечисляемым типом(enum); один работник может обладать несколькими навыками), и свое финансовое предложение.
        Для того чтобы получить контракт, надо соответствовать требованиям (столько-то людей с такими-то навыками, столько-то – с такими-то).
        Из подходящих бригад выбрать самую дешевую. Если подходящих не нашлось – закрыть проект строительства.
        Использовать коллекции (списки) для представления бригад.
*/
import java.util.HashSet;

public class Worker {
    private HashSet<Skill> skillSet;
    private double salary;

    public Worker(HashSet<Skill> skillSet, double salary) {
        this.skillSet = skillSet;
        this.salary = salary;
    }
    public Worker() {
    }

    public HashSet<Skill> getSkillSet() {
        return skillSet;
    }
    public double getSalary() {
        return salary;
    }

    public void setSkillSet(HashSet<Skill> skillSet) {
        this.skillSet = skillSet;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Worker workerRandomizer() {
        Worker worker = new Worker();
        HashSet<Skill> skillHashSet = new HashSet<>();
        int maxSkillAmount = 3;
        int minSkillAmount = 1;
        int randomSkillAmount = minSkillAmount + (int)(Math.random() * (maxSkillAmount - minSkillAmount));
        for (int i = 0; i <= randomSkillAmount; i++) {
            int randomSkillOrdinal = (int)(Math.random() * Skill.values().length);
            skillHashSet.add(Skill.values()[randomSkillOrdinal]);
        }
        worker.skillSet = skillHashSet;
        int maxSalary = 1500;
        int minSalary = 700;
        int randomSalary = minSalary + (int)(Math.random() *(maxSalary - minSalary));
        worker.salary = randomSalary;
        return worker;
    }

    @Override
    public String toString() {
        return "\nWorker {" +
                "skillSet = " + skillSet +
                ", salary = " + salary +
                '}';
    }
}
