package koti.collapsingtoolbar;

/**
 * Created by User on 2/14/2017.
 */

public class Album {

    private int img_id;

    Album(int img_id){
        setImg_id(img_id);
    }

    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }
}
