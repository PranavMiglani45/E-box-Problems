class GoldStall extends Stall{
    
    private Integer tvSet;
    private Integer cost;
    
    public GoldStall(){}
    public GoldStall(Integer tvSet){
        this.tvSet=tvSet;
    }
    
    public void setTvSet(Integer tvSet){
        this.tvSet=tvSet;
    }
    public Integer getTvSet(){
        return tvSet;
    }
    public void setCost(Integer cost){
        this.cost=1000;
    }
    public Integer getCost(){
        return cost;
    }
    
    protected void display(){
        System.out.println(super.getName()+","+super.getDetail()+","+this.getTvSet()+","+this.getCost());
    }
    
    
}
