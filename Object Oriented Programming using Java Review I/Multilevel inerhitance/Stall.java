class Stall{
    protected String name;
    protected String detail;
    protected String owner;
    
    public Stall(){}
    public Stall(String name,String detail,String owner){
        this.name=name;
        this.detail=detail;
        this.owner=owner;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    
    public void setDetail(String detail){
        this.detail=detail;
    }
    public String getDetail(){
        return detail;
    }
    
    public void setOwner(String owner){
        this.owner=owner;
    }
    public String getOwner(){
        return owner;
    }


}
