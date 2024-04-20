package net.liopyu.animationjs.events;

import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.event.EventHandler;
import net.liopyu.animationjs.events.UniversalController;

public class EventHandlers {
    public static final EventGroup AnimationJS = EventGroup.of("AnimationJS");
    public static final EventHandler universalController = AnimationJS.server("universalController", () -> UniversalController.class);

}