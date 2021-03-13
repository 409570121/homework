package learning;

public class main {
    public static void main(String[] args) {
    customer[] allCustomers = {
            new customer("0013", 490, 0),
            new customer("0052", 1000, 100),
            new customer("0081", 290, 0),
            new customer("2122", 2000, 200)
    };
    for (int i = 0; i < allCustomers.length; i++) {
        allCustomers[i].print();
    }
}
}
