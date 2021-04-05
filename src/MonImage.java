/**
 *
 * @author larbi
 */

public class MonImage {
    private int Id;
    private  String Url;
    private int Pos[];

    public MonImage() {
    }

    public MonImage(int Id, String Url, int[] Pos) {
        this.Id = Id;
        this.Url = Url;
        this.Pos = Pos;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }



    public int[] getPos() {
        return Pos;
    }

    public void setPos(int[] Pos) {
        this.Pos = Pos;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    @Override
    public String toString() {
        return "MonImage{" + "Id=" + Id + ", Url=" + Url + ", Pos=" + Pos + '}';
    }
    
    
    
}
