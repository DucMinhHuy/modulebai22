package thuchanh2;

public class LinkedIn implements SocialShare{
    private String message;
    @Override
    public void setMessage(String message) {
        this.message=message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to linkdin :"+this.message);
    }
}
