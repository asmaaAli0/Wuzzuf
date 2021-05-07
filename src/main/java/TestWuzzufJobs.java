import java.util.List;

public class TestWuzzufJobs {
    public static void test() throws Exception{
        IO io = new IO();
        List<JobDetails> jobs =  io.ReadCSVFile("./src/Wuzzuf_Jobs.csv");
        System.out.println(jobs.size());
        JobsDataService filter = new JobsDataService();
        System.out.println("###############################FilterJobsByCountry#############################");
        filter.FilterJobsByCountry(jobs);
        System.out.println("################################FilterJobsByLevel############################");
        filter.FilterJobsByLevel(jobs);
        System.out.println("#################################FilterJobsByTitle###########################");
        filter.FilterJobsByTitle(jobs);
        System.out.println("##################################FilterJobsByYearsExp##########################");
        filter.FilterJobsByYearsExp(jobs);

    }
    public static void main(String[] args) throws Exception {
        test();
    }
}
