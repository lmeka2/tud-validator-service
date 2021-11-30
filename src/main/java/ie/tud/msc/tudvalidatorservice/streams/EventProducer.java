package ie.tud.msc.tudvalidatorservice.streams;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
//@EnableBinding(ChannelBindings.class)
public class EventProducer {

    private ChannelBindings channelBindings;

    EventProducer(ChannelBindings channelBindings) {
        this.channelBindings = channelBindings;
    }

    public void sendEvents(@Payload String event) {
        channelBindings.processOutput().send(MessageBuilder.withPayload(event).build());
    }
}
