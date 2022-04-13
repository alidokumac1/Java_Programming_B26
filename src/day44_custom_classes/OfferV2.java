package day44_custom_classes;

public class OfferV2 {


    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPto;

    public OfferV2(String location, String company) {
        this.location = location;
        this.company = company;
    }

    public OfferV2(String location, String company, double salary) {
        this(company, location);
        this.salary = salary;
    }

    public OfferV2(String location, String company, double salary, boolean isFullTime, int numberOfPto) {
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.numberOfPto = numberOfPto;
    }

    @Override
    public String toString() {
//        return "Offer{" +
//                "location='" + location + '\'' +
//                ", company='" + company + '\'' +
//                ", salary=" + salary +
//                ", isFullTime=" + isFullTime +
//                ", numberOfPto=" + numberOfPto +
//                '}';


        String info = company + "located in  " + location;

        info += "\n" + (salary > 0 ? salary : "");
        info += "\n" + (isFullTime ? " Full Time" : "Contract");
        info += "\n" + (numberOfPto > 0 ? numberOfPto : "");


        return info;

    }
}


