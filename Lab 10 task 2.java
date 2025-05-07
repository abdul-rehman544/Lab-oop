abstract class VisitorPass {
    abstract int calculateTicketPrice(int numberOfVisitors);
}

class VIPPass extends VisitorPass {
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 100;
    }
}

class FamilyPass extends VisitorPass {
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 50;
    }
}

class StandardPass extends VisitorPass {
    int calculateTicketPrice(int numberOfVisitors) {
        return numberOfVisitors * 30;
    }
}

public class Main2 {
    public static void main(String[] args) {
        VisitorPass vip = new VIPPass();
        VisitorPass family = new FamilyPass();
        VisitorPass standard = new StandardPass();

        System.out.println("VIP Pass Total: " + vip.calculateTicketPrice(2));
        System.out.println("Family Pass Total: " + family.calculateTicketPrice(4));
        System.out.println("Standard Pass Total: " + standard.calculateTicketPrice(3));
    }
}
