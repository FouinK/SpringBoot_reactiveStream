package reactiveStreams.webFlux;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

public class MyPub implements Publisher<Integer> {

    @Override
    public void subscribe(Subscriber<? super Integer> s) {
        System.out.println("1. 신문사야 나 너희 신문 볼게");
    }
}
