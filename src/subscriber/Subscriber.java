package subscriber;

import publisher.Publisher;

public interface Subscriber {
    // contarct

    void update(Publisher publisher);
}
