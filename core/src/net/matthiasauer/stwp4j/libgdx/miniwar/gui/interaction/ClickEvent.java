package net.matthiasauer.stwp4j.libgdx.miniwar.gui.interaction;

public class ClickEvent {
    private String id;
    
    public ClickEvent set(String id) {
        this.id = id;
        
        return this;
    }
    
    public String getId() {
        return this.id;
    }
}
