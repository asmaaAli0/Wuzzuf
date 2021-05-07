public class JobDetails {
    public String title ;
    public String company ;
    public String location ;
    public String type ;
    public String level ;
    public String yearsExp ;
    public String Country ;
    public String [] skills ;
    public JobDetails (String title, String company,String location , String type, String level,String yearsExp,String country,String [] skills){
        this.title = title;
        this.company = company;
        this.Country = country;
        this.location = location;
        this.type = type;
        this.level = level;
        this.yearsExp = yearsExp;
        this.skills = skills;
    }
}
