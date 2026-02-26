public class MainClass {
    String fname;
    String lname;
    public MainClass(String F_name,String L_name){
        fname=F_name;
        lname=L_name;

    }
    public void displayer(){
        System.out.println("My first name is "+ fname+ " and my last name is " +lname.toUpperCase());
    }
    public static void  main(String[] args){
        MainClass person=new MainClass("Josue","Niyonkunda");
        person.displayer();

    }
}
