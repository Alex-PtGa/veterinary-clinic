/*
 * Класс Клиника, в котором осуществляется осмотр и лечение животных описанных в пакете животные
 * Класс Клиника, позволяет сотрудникам класса Доктор выполняять свою деятельность.
 */
package clinic;
import staff.Doctor;
import animals.Beaver;

public class Clinic {
    
    public static void main(String[] args) {
    Doctor doc = new Doctor(26, "Ivan");
    Beaver bv = new Beaver("Vasya", 2);
    Beaver bv1 = new Beaver("Nic", 0, 0, "Здоров", doc);
    }
}
