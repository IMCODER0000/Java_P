package Q;

public class Telephone extends Phone {


    public Telephone(String owner){
        super(owner);
    }


    public void PhoneKind(){
        System.out.println("텔레폰이여유");
    }

    @Override
    public void kind(){
        System.out.println("나는야 텔레폰");
    }




}
