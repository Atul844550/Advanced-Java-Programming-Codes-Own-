class cake
{
private final String milk;
private final String sugar;
private final String egg;
private final String fruits;
private final String chocolate;
public cake(Mybakery ref)
{
this.milk=ref.milk;
this.sugar=ref.sugar;
this.egg=ref.egg;
this.fruits=ref.fruits;
this.chocolate=ref.chocolate;
}
public String toString()
{
return "Ingredients required for cake are:- " +milk+" "+sugar+" "+egg+" "+fruits +" "+chocolate+".";
}
public static class Mybakery
{
private final String milk;
private final String sugar;
private String egg;
private String fruits;
private String chocolate;
public Mybakery(String milk,String sugar)
{
this.milk=milk;
this.sugar=sugar;
}
public Mybakery egg(String egg)
{
this.egg=egg;
return this;
}
public Mybakery fruits(String fruits)
{
this.fruits=fruits;
return this;
}
public Mybakery chocolate(String chocolate)
{
this.chocolate=chocolate;
return this;
}
public cake build(){
cake ch=new cake(this);
return ch;
}
}
}
class cake_uilder_design_pattern
{
public static void main(String args[])
{
cake c1=new cake.Mybakery("ammul milk","2 spoon of sugar").build();
System.out.println(c1);
cake c2=new cake.Mybakery("ammul milk","2 spoon of sugar").egg("2 eggs").build();
System.out.println(c2);
cake c3=new cake.Mybakery("ammul milk","2 spoon of sugar").egg("2 eggs").fruits("mixed fruit").build();
System.out.println(c3);
cake c4=new cake.Mybakery("ammul milk","2 spoon of sugar").egg("2 eggs").fruits("mixed fruit").chocolate("choco chips").build();
System.out.println(c4);
cake c5=new cake.Mybakery("ammul milk","2 spoon of sugar").fruits("mixed fruit").build();
System.out.println(c5);
cake c6=new cake.Mybakery("ammul milk","2 spoon of sugar").chocolate("chocochips").build();
System.out.println(c6);
}
}