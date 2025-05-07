interface Display {
    void show();
}

interface Aircraft extends Display {
    String aircraftType();
    int calculateCapacity();
}

class PassengerJet implements Aircraft {
    int rows = 10;
    int seats = 4;

    public String aircraftType() {
        return "Passenger Jet";
    }

    public int calculateCapacity() {
        return rows * seats;
    }

    public void show() {
        System.out.println(aircraftType() + " Capacity: " + calculateCapacity());
    }
}

class CargoPlane implements Aircraft {
    int length = 20;
    int width = 5;

    public String aircraftType() {
        return "Cargo Plane";
    }

    public int calculateCapacity() {
        return length * width;
    }

    public void show() {
        System.out.println(aircraftType() + " Capacity: " + calculateCapacity());
    }
}

class PrivateJet implements Aircraft {
    int seats = 8;

    public String aircraftType() {
        return "Private Jet";
    }

    public int calculateCapacity() {
        return seats;
    }

    public void show() {
        System.out.println(aircraftType() + " Capacity: " + calculateCapacity());
    }
}

public class Main {
    public static void main(String[] args) {
        Aircraft a1 = new PassengerJet();
        Aircraft a2 = new CargoPlane();
        Aircraft a3 = new PrivateJet();

        a1.show();
        a2.show();
        a3.show();
    }
}
