// public class PaymentService{
//     public void procces(double amount){
//         System.out.println("Stripe");
//         System.out.println("amount: "+amount);
//     }
// }

package zaki.example.store;
public interface PaymentService {
    public void process(double amount);
}
