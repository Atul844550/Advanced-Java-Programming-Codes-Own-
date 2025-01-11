class MyName{
private final String fname;
private final String mname;
private final String lname;
private MyName(MyNestName ref)
{
this.fname=ref.fname;
this.mname=ref.mname;
this.lname=ref.lname;
}
public String toString()
{
return "My name is :- "+fname+" "+mname+" "+lname+"."; 
}
public static class MyNestName {
private final String fname;
private String mname;
private String lname;

public MyNestName(String fname){
this.fname=fname;
}
public MyNestName mname(String mname)
{
this.mname=mname;
return this;
}
public MyNestName lname(String lname)
{
this.lname=lname;
return this;
}
public MyName build()
{
MyName mn=new MyName(this);
return mn;
}
}
}
class builder_design_pattern
{
public static void main(String shruti[])
{
MyName n1=new MyName.MyNestName("Shruti").build();
System.out.println(n1);
MyName n2=new MyName.MyNestName("Shruti").mname("Jairath").build();
System.out.println(n2);
MyName n3=new MyName.MyNestName("Shruti").mname("Jairath").lname("Gandhi").build();
System.out.println(n3);
MyName n4=new MyName.MyNestName("Shruti").lname("Gandhi").build();
System.out.println(n4);
MyName n5=new MyName.MyNestName("Shruti").mname("Jairath").build();
System.out.println(n5);
}
}