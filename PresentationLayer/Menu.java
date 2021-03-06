package PresentationLayer;

public enum Menu {
    NEW("1. Make a new booking."),
    EDIT("2. Edit a booking."),
    CONFIRMATION("3. Check confirmation status."),
    PAYMENT("4. Make a payment."),
    EXIT("5. Exit from the application.");

    public final String label;

    private Menu(String lbl) {
       this.label = lbl;
    }

}

