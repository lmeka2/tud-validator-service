package ie.tud.msc.tudvalidatorservice.streams;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;

public interface ChannelBindings {

    String OUTPUT = "output";

    @Output(Source.OUTPUT)
    MessageChannel processOutput();
}
