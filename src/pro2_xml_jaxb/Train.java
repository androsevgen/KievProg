package pro2_xml_jaxb;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalTime;
import java.util.Date;

@XmlRootElement(name = "train")
public class Train {

    private int id;
    private String from;
    private String to;
    private Date date;
    private LocalTime departure;


    public Train() {
    }


    public Train(int id, String from, String to, Date date, LocalTime departure) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
    }


    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    @XmlElement
    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    @XmlElement
    public void setTo(String to) {
        this.to = to;
    }

    @XmlJavaTypeAdapter(DateAdapter.class)
    public Date getDate() {
        return date;
    }

    @XmlElement
    public void setDate(Date date) {
        this.date = date;
    }

    @XmlJavaTypeAdapter(LocalTimeAdapter.class)
    public LocalTime getDeparture() {
        return departure;
    }

    @XmlElement
    public void setDeparture(LocalTime departure) {
        this.departure = departure;
    }

    @Override
    public String toString() {
        return id + "Train{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date='" + date + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }
}
