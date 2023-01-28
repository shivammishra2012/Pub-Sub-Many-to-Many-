package subscriber;

import publisher.Publisher;

import java.util.List;

public class PredictedScoreSubscriber implements Subscriber{



    private int runs;

    private int wickets;

    private float overs;

    public List<Publisher> getPublisher() {
        return publishers;
    }

    private  List<Publisher> publishers;


    // subsriber subsribes to one publisher as per this code will make it scalable
    public PredictedScoreSubscriber(List<Publisher> publishers) {
        this.publishers = publishers;
        for(Publisher publisher:this.publishers)
        {
            publisher.subscribe(this);
        }

    }

    @Override
    public void update(Publisher publisher) {
        // data is pulled
        this.runs=publisher.getRuns();
        //this.wickets=wickets;
        //this.overs=overs;
        // addition logic

        System.out.println(" PredictedScoreSubsriber "+this.runs+" runs"+this.wickets+"wickets"+this.overs+"overs");

    }

}
