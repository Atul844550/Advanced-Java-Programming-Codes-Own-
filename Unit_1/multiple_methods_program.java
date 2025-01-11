import java.util.stream.*;
import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
class student
{
int id;
String name;
float cgpa;
student(int id,String name,float cgpa){
this.id=id;
this.name=name;
this.cgpa=cgpa;
}
}
class multiple_methods_program
{
public static void main(String shruti[])
{
ArrayList<student> al=new ArrayList<>();
al.add(new student(123,"Shruti",7.89f));
al.add(new student(234,"Mohan",9.89f));
al.add(new student(345,"Neha",7.89f));
al.add(new student(456,"suraj",4.89f));
al.add(new student(567,"manik",5.89f));
al.add(new student(678,"sonu",6.89f));
al.add(new student(789,"ram",8.89f));
Set<Float> studentscore=al.stream()
.filter(score->score.cgpa>7)
.map(score1->score1.cgpa)
.collect(Collectors.toSet());//to remove duplicate enteries
System.out.println(studentscore);

}
}