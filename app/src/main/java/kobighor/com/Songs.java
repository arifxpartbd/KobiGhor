package kobighor.com;

public class Songs {

    String des,title,url;

    public Songs() {
    }

    public Songs(String des, String title, String url) {
        this.des = des;
        this.title = title;
        this.url = url;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
