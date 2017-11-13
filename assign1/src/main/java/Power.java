public enum Power {
    LOW, NORMAL, GREAT, GODLY;

    public String toString(){
        switch(this){
            case LOW: return "Low";
            case NORMAL: return "Normal";
            case GREAT: return "Great";
            case GODLY: return "Godly";
            default: return "Childish";
        }
    }
}
