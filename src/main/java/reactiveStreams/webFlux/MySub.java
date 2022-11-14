package reactiveStreams.webFlux;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class MySub implements Subscriber<Integer> {

    private Subscription s;
    @Override
    public void onSubscribe(Subscription s) {
        System.out.println("구독자 : 구독정보 잘 받았어");
        this.s = s;
        System.out.println("구독자 : 나 이제 신문 1개씩 줘");
        s.request(12);       //신문 한개씩 매일 매일 줘
    }

    @Override
    public void onNext(Integer integer) {
        System.out.println("onNext() : "+integer);
    }

    @Override
    public void onError(Throwable t) {
        System.out.println("구독 중 에러");
    }

    @Override
    public void onComplete() {
        System.out.println("구독 완료");
    }


}
