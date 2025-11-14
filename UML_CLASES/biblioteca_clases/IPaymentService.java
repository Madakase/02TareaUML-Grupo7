public interface IPaymentService {
    Payment processPayment(PaymentMethod method, double amount);
}