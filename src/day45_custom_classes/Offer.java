package day45_custom_classes;

public class Offer {
    String location;
    String company;
    double salary;
    boolean isFullTime;
    int numberOfPto;


    public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPto) {
        this.location = location;
        this.company = company;
        this.salary = salary;
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


        String info =  "\n" +
                company + " located in  " + location;

        info += "-" + (salary > 0 ? salary : "");
        info += "-" + (isFullTime ? "Full Time" : "Contract");
        info += "- " + (numberOfPto > 0 ? numberOfPto: "");


        return info;

    }
}
