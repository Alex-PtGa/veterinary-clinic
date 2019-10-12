
package animals;
import staff.Doctor;

public class Beaver {
    private String name;
    private float weight;
    private int age;
    private String diagnosis;
    private Doctor doctor;
    
    public Beaver(String name, float weight, int age, String diagnosis, Doctor doctor) {
        this.age=age;
        this.name=name;
        this.weight=weight;
        this.diagnosis=diagnosis;
        this.doctor=doctor;
     }
    
    public Beaver(String name, int age) {
        this.age=age;
        this.name=name;
     }
    
    public String getName() {        return name;    }
     public void setName(String name) {        this.name=name;    }
    
     public float getWeight() {        return weight;    }
     public void setWeight(float weight) {        this.weight=weight;    }

     public float getAge() {        return age;    }
     public void setAge(int age) {        this.age=age;    }
     
     public String getDiagnosis() {        return diagnosis;    }
     public void setDiagnosis(String diagnosis) {        this.diagnosis=diagnosis;    }
     
     public Doctor getDoctor() {        return doctor;    }
     public void setDoctor(Doctor doctor) {        this.doctor=doctor;    }
     
}