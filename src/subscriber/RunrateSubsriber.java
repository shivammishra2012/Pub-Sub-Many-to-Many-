package subscriber;

import publisher.Publisher;

import java.util.List;

public class RunrateSubsriber implements Subscriber{
    private int runs;

    private int wickets;

    private float overs;

    private  List<Publisher> publishers;

    public RunrateSubsriber(List<Publisher> publishers) {
        this.publishers = publishers;
        for(Publisher publisher:this.publishers)
        {
            publisher.subscribe(this);
        }
    }

    public List<Publisher> getPublisher() {
        return publishers;
    }

    @Override
    public void update(Publisher publisher) {
        // as per data is pulled from publisher as per requirement
        //now  we have more flexibility to consume as per our reqyuirements

        this.runs= publisher.getRuns();
        this.wickets= publisher.getWickets();
        this.overs= publisher.getOvers();
        // addition logic
        System.out.println(" RunrateSubsricber "+this.runs+" runs"+this.wickets+"wickets"+this.overs+"overs");

    }
}
