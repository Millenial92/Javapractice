package Practice.SOLIDPrinciples.LSP;

public class Whatsapp extends SocialMedia {

    @Override
    public void chatWithFriend() {

    }

    @Override
    public void publishPost(Object post) {

        // 3. Not a service provided by Whatsapp, hence it violates LSP.

    }

    @Override
    public void sendPhotoAndVideos() {

    }

    @Override
    public void groupVideoCall(String users) {

    }
}
