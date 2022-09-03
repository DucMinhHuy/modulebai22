package thuchanh2;

public class Facebook implements SocialShare{
    private String message;
    @Override
    public void setMessage(String message) {
        this.message=message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to facebook :"+this.message);
    }
}
