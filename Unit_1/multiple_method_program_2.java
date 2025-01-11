
import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

class employee
{
int id;
String name;
String deptt;
int sal;
char gender;
employee(int id,String name,String deptt,int sal,char gender){
this.id=id;
this.name=name;
this.deptt=deptt;
this.sal=sal;
this.gender=gender;
}
}
class multiple_method_program_2
{
public static void main(String args[])
{
ArrayList<employee> al=new ArrayList<>();
al.add(new employee(123,"Shruti","CSE",45000,'F'));
al.add(new employee(123,"Tejas","EEE",75000,'M'));
al.add(new employee(123,"Neha","ME",85000,'F'));
al.add(new employee(123,"Sana","CSE",35000,'F'));
al.add(new employee(123,"Sandeep","CE",25000,'M'));
al.add(new employee(123,"Sonia","CSE",15000,'F'));

Stream<employee> str=al.stream()
.filter(x->x.deptt=="CSE" && x.gender=='F');
str.forEach(y->System.out.println(y.id+"\t"+y.name +"\t"+ y.sal));
employee emp=al.stream().min((a,b)->a.sal>b.sal?1:-1).get();
System.out.println(emp.name+"\t"+emp.sal);
}
}
