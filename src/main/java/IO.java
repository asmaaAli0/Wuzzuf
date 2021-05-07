import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class IO {
    public List<JobDetails> ReadCSVFile(String FileName) throws Exception{
             List<JobDetails> jobs = new ArrayList<>();
            FileReader filereader = new FileReader(FileName);
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;
            nextRecord = csvReader.readNext();
            while ((nextRecord = csvReader.readNext()) != null) {
                String [] temp = nextRecord[7].split(",");
                JobDetails job = new JobDetails(nextRecord[0],nextRecord[1],nextRecord[2],
                        nextRecord[3],nextRecord[4],nextRecord[5],nextRecord[6],temp);
                jobs.add(job);
            }

        return  jobs;
    }
}
