package Core.Oops.ObjectMethods.Bus;

public class Ksrtc {
    String src;
    String dst;

    Ksrtc(String src,String dst){
        this.src = src;
        this.dst = dst;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Ksrtc){
            Ksrtc k = (Ksrtc) obj;

            return this.src.equals(k.src) && this.dst.equals(k.dst);
        }
        return false;
    }
}
