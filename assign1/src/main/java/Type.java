public enum Type {
    ARQUEBUS, BLUNDERBUSS, MUSKET;

    public String toString(){
        switch(this){
            case ARQUEBUS: return "Arquebus";
            case BLUNDERBUSS: return "Blunderbuss";
            case MUSKET: return "Musket";
            default: return "AK47";
        }
    }
}
