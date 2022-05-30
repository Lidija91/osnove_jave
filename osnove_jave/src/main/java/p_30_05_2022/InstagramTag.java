package p_30_05_2022;

import java.util.ArrayList;

public class InstagramTag {
    public int xKoordinata;
    public int yKoordinata;
    public InstagramUser tagovanUser;

    public InstagramTag(int xKoordinata, int yKoordinata) {
        this.xKoordinata = xKoordinata;
        this.yKoordinata = yKoordinata;
    }

    public int getxKoordinata() {
        return xKoordinata;
    }

    public void setxKoordinata(int xKoordinata) {
        this.xKoordinata = xKoordinata;
    }

    public int getyKoordinata() {
        return yKoordinata;
    }

    public void setyKoordinata(int yKoordinata) {
        this.yKoordinata = yKoordinata;
    }
}
