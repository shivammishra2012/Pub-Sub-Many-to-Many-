package publisher;

import subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class EspnCricketBoardPublisher implements Publisher{

    private int runs;

    private int wickets;

    private float overs;



    private List<Subscriber> subscribers;




    public EspnCricketBoardPublisher() {

        this.subscribers = new ArrayList<>();
    }
    @Override
    public void subscribe(Subscriber subscriber)
    {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);

    }

    @Override
    public void notifyAll(int runs, int wickets, int overs) {
        this.runs=runs;
        this.overs=overs;
        this.wickets=wickets;

        for(Subscriber subscriber:subscribers)
        {
            subscriber.update(this);
        }

    }

    @Override
    public int getRuns() {
        return runs;
    }

    @Override
    public float getOvers() {
        return overs;
    }

    @Override
    public int getWickets() {
        return wickets;
    }

}
