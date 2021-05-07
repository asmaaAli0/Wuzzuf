import org.apache.commons.lang3.tuple.Pair;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JobsDataService {
    //-
    // which output the list of Job Titles and Job popularity(i.e. frequency of job titles) in the console.
   // List<Pair<String ,Integer>>
    public void FilterJobsByTitle(List<JobDetails> jobs){
        Map<String ,Integer> temp = new HashMap<>();
        for (JobDetails job :jobs){
            if (!temp.containsKey(job.title)) {
                temp.put(job.title , 1);
            }
            else {
                int freq = temp.get(job.title).intValue();
                temp.replace(job.title , ++freq);
            }
        }
        temp.forEach((K,V)-> System.out.format("%-60s %d\n" , K,V));
    }
    //////////////////////////////////////////////////////////////////////////
    public void FilterJobsByCountry(List <JobDetails> jobs){
        Map<String ,Integer> temp = new HashMap<>();
        for (JobDetails job :jobs){
            if (!temp.containsKey(job.Country)) {
                temp.put(job.Country , 1);
            }
            else {
                int freq = temp.get(job.Country).intValue();
                temp.replace(job.Country , ++freq);
            }
        }
        temp.forEach((K,V)-> System.out.format("%-20s %d\n" , K,V));


    }
    ///////////////////////////////////////////////////////////////////////////////
    public void FilterJobsByLevel(List <JobDetails> jobs){
        Map<String ,Integer> temp = new HashMap<>();
        for (JobDetails job :jobs){
            if (!temp.containsKey(job.level)) {
                temp.put(job.level , 1);
            }
            else {
                int freq = temp.get(job.level).intValue();
                temp.replace(job.level , ++freq);
            }
        }
        //temp = sortMap(temp);
        temp.forEach((K,V)-> System.out.format("%-20s %d\n" , K,V));


    }
    ////////////////////////////////////////////////////////////////////////////////////
    public LinkedHashMap<String, Integer> sortMap(Map<String, Integer> map){
        LinkedHashMap<String, Integer> sortedByCount = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        return sortedByCount;
    }
    //////////////////////////////////////////////////////////////////////////////////////
    public void FilterJobsByYearsExp(List <JobDetails> jobs){
        Map<String ,Integer> temp = new HashMap<>();
        for (JobDetails job :jobs){
            if (!temp.containsKey(job.yearsExp)) {
                temp.put(job.yearsExp , 1);
            }
            else {
                int freq = temp.get(job.yearsExp).intValue();
                temp.replace(job.yearsExp , ++freq);
            }
        }
        temp = sortMap(temp);
        temp.forEach((K,V)-> System.out.format("%-20s %d\n" , K,V));

    }









}
