package pro2_xml_jaxb;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.text.SimpleDateFormat;
import java.util.Date;

@XmlRootElement(name = "train")
public class Train {

    private String from;
    private String to;
    private String date;
    private Date departure;




    public Train() {
    }

    public Train(String from, String to, String date, Date departure) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
    }
    @XmlElement
    public void setFrom(String from) {
        this.from = from;
    }
    @XmlElement
    public void setTo(String to) {
        this.to = to;
    }
    @XmlElement
    public void setDate(String date) {
        this.date = date;
    }
    @XmlElement
    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }


    public String getDate() {
        return date;
    }


    public Date getDeparture() {
        return departure;
    }

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");


    @Override
    public String toString() {
        return "Train{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date='" + date + '\'' +
                ", departure='" + departure + '\'' +
                '}';
    }

}
