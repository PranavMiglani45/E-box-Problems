class PlatinumStall extends GoldStall{
    private Integer projector;
    private Integer cost;
    
    public PlatinumStall(){}
    
    public PlatinumStall(Integer projector){
        this.projector=projector;
    }
    
    public void setProjector(Integer projector){
        this.projector=projector;
    }
    public Integer getProjector(){
        return projector;
    }
    
    public void setCost(Integer cost){
        this.cost=50000;
    }
    public Integer getCost(){
        return cost;
    }
    protected void display(){
        System.out.println(super.getName()+","+super.getDetail()+","+super.getTvSet()+","+this.getProjector+","+super.getCost());
    }
    
}
