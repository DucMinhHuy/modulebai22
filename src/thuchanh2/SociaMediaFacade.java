package thuchanh2;

public class SociaMediaFacade {
    private Twitter twitter;
    private Facebook facebook;
    private LinkedIn linkedIn;

    public SociaMediaFacade() {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedIn = linkedIn;
    }
    public void share(String message){
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedIn.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.linkedIn.share();
    }

}
