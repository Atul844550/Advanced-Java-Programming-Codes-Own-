import java.util.*;
import java.util.stream.*;
class employee
{
int empid;
String empname;
int empsal;
char gender;
employee(int id,String nme,int sal,char gen)
{
empid=id;
empname=nme;
empsal=sal;
gender=gen;
}
}
class filter_another_example_multiple_condition
{

public static void main(String args[])
{
ArrayList<employee> ls=new ArrayList<>();
ls.add(new employee(123,"Shruti",17000,'F'));
ls.add(new employee(456,"Rahul",17000,'M'));
ls.add(new employee(789,"Neha",13000,'F'));
ls.add(new employee(346,"rohit",20000,'M'));
ls.add(new employee(987,"Sana",18000,'F'));
ls.stream()
.filter(x->x.empsal>15000 && x.empsal<30000 && x.gender=='F')
.forEach(y->System.out.println(y.empname));
}
}