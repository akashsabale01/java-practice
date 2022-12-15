
interface Member{
    void callback();
}

class Store{
    public Member[] memberList = new Member[50];
    public int memberCount = 0;

    public void register(Member m){
        memberList[memberCount++] = m;
    }

    void notifyMemberForSale(){
        for(int i=0; i<memberCount; i++)
            memberList[i].callback();
    }
}

class Customer implements Member{
    public String customerName;

    public Customer(String customerName){
        this.customerName = customerName;
    }
    @Override
    public void callback(){
        System.out.println("Ok, "+ customerName +" will visit the Store");
    }

}



public class Main {
    public static void main(String[] args) {

        Store storeObj = new Store();
        Customer cust1 = new Customer("John");
        Customer cust2 = new Customer("Brad");

        storeObj.register(cust1);
        storeObj.register(cust2);

        storeObj.notifyMemberForSale();


    }
}