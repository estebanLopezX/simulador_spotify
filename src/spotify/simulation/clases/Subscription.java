package spotify.simulation.clases;


public class Subscription {
    private int idSubscription;
    private String subscriptionName;
    private String benefits;
    private String description;

    public Subscription() {}

    public Subscription(int idSubscription, String subscriptionName, String benefits, String description) {
        this.idSubscription = idSubscription;
        this.subscriptionName = subscriptionName;
        this.benefits = benefits;
        this.description = description;
    }
    public Subscription( String subscriptionName, String benefits, String description) {
        this.subscriptionName = subscriptionName;
        this.benefits = benefits;
        this.description = description;
    }

    public int getIdSubscription() {
        return idSubscription;
    }

    public void setIdSubscription(int idSubscription) {
        this.idSubscription = idSubscription;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
