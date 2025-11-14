public interface PaymentController {

    String startPayment(Object transactionObject);

    String insertPaymentMethod();

    boolean paymentSuccess(String paymentMethod);

}
