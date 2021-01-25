package org.vision.eventplugin;

import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

public class KafkaLogFilterPlugin extends Plugin {

    public KafkaLogFilterPlugin(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
    }

    @Override
    public void stop() {
        MessageSenderImpl.getInstance().close();
    }
}
