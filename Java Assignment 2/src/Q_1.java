// Abstract class

abstract class Journey {
    abstract void begin();
}

class India extends Journey {
    void begin() {
        System.out.println("From Abstract Class\n Trip to India begins\n");
    }
}

// Interface 
interface Foreign {
    void begin();
}
class London implements Foreign {
    public void begin() {
        System.out.println("From Interface \n Trip to London begins\n");
    }
}
class Paris implements Foreign {
    public void begin() {
        System.out.println("Trip to Paris begins\n");
    }
}

class Q_1 {
    public static void main(String args[]) {
        Foreign F1 = new London();
        F1.begin();

        Journey J1 = new India();
        J1.begin();
    }
}