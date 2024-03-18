package exe01;

import java.util.ArrayList;
import java.util.List;
public class Forum {
    private int id;
    private String name;
    private String url;
    private List<Message> message;

    public Forum() {
        this.message = new ArrayList<Message>();
    }

    public Forum(int id, String name, String url) {
        this.setId(id);
        this.setName(name);
        this.setUrl(url);
        this.message = new ArrayList<Message>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Message> getMessage() {
        return message;
    }

    public void setMessage(List<Message> message) {
        this.message = message;
    }

    public void addMessage(int id, String text, Person person){
        this.message.add(new Message(id, text, person));
    }

    @Override
    public String toString() {
        return "Forum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", message=" + message +
                '}';
    }
}
