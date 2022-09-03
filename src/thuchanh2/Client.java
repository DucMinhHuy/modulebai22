package thuchanh2;

public class Client {
    public void share(String message){
       SociaMediaFacade smf=new SociaMediaFacade();
         smf.share(message);
    }

    public static void main(String[] args) {
        Client client=new Client();
        client.share("this is a post");
    }
}
