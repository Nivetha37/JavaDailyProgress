
/*
this is used to avoid confusion on

       i)class attribute & parameter with same name
*/

public class This {
    String myname;
    This(){
        System.out.println("default constructor");
    }

    void setname(String myname){
        this.myname = myname;
    }

    public static void main(String[] args){
        This obj = new This();
        obj.setname("Mark");
        System.out.println(obj.myname);
    }
}
