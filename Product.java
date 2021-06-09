class Product{
    String timeStamp, userType, user, transactionType, query, itemCategory, id, productName, origPrice, discPrice, available;
    public Product(String timeStamp, String userType, String user, String transactionType, String query, String itemCategory, String id, String productName, String origPrice, String discPrice, String available){
        this.timeStamp = timeStamp;
        this.userType=userType;
        this.user=user;
        this.transactionType = transactionType;
        this.query = query;
        this.itemCategory = itemCategory;
        this.id=id;
        this.productName=productName;
        this.origPrice=origPrice;
        this.discPrice=discPrice;
        this.available=available; 
    }

    public String getTimeStamp(){
        return timeStamp;
    }

    public String getUserType(){
        return userType;
    }

    public String getUser(){
        return user;
    }

    public String getTransactiontype(){
        return transactionType;
    }

    public String getQuery(){
        return query;
    }

    public String getItemCategory(){
        return itemCategory;
    }

    public String getId(){
        return id;
    }

    public String getProductName(){
        return productName;
    }

    public String getOrigPrice(){
        return origPrice;
    }

    public String getDiscPrice(){
        return discPrice;
    }

    public String getAvailable(){
        return available;
    }

    public void changeUser(String newuser){
        this.user=newuser;
    }

    public void changeTransactionType(String newtransctionType){
        this.transactionType=newtransctionType;
    }

    public void changeQuery(String newQuery){
        this.query=newQuery;
    }

    public void changeItemCategory(String newitemcategory){
        this.itemCategory=newitemcategory;
    }

    public void changeID(String newid){
        this.id=newid;
    }

    public void changeProductName(String newproductname){
        this.productName=newproductname;
    }

    public void changeOrigPrice(String neworigprice){
        this.origPrice=neworigprice;
    }

    public void changeDiscPrice(String newdiscprice){
        this.discPrice=newdiscprice;
    }

    public void changeAvailable(String newavailable){
        this.available=newavailable;
    }

    @Override
    public String toString() {
        return timeStamp+" | "+userType+" | "+user+" | "+transactionType+" | "+query+" | "+itemCategory+" | "+id+" | "+productName+" | "
                        +origPrice+" | "+discPrice+" | "+available;
    }
}