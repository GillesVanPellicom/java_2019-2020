
public class Fruitautomaat {
    private int appel;
    private int peer;
    private int aAp;
    private int aPe;

    public Fruitautomaat() {
        this.appel = 47;
        this.peer = 30;
    }

    public Fruitautomaat(int aAp, int aPe) {
        this.appel = aAp;
        this.peer = aPe;
    }

    public int getAppel() {
        return appel;
    }

    public void setAppel(int appel) {
        this.appel = appel;
    }

    public int getPeer() {
        return peer;
    }

    public void setPeer(int peer) {
        this.peer = peer;
    }

    public void appelAanvullen() {
        this.setAppel(50);
    }

    public void peerAanvullen() {
        this.setPeer(50);
    }

    public void koopAppel() {
        this.setAppel(this.getAppel() - 1);
    }

    public void koopPeer() {
        this.setPeer(this.getPeer() - 1);
    }

    public void peerIsUitverkocht() {

    }

}
