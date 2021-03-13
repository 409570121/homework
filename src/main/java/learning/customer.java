package learning;

public class customer {String customerID;
    int cost;
            int discount;
            int sum;

public customer(String customerID, int cost, int discount) {
        this.customerID = customerID;
        this.cost = cost;
        this.discount = discount;
        sum = cost - discount;
        }

public void print() {
        System.out.println(customerID + " " + cost + " " + discount + " " + sum);
        }
}
