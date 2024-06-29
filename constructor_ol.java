/*A constructor in Java is:
# a special method that is used to initialize objects. 
#The constructor is called when an object of a class is created. 
#It can be used to set initial values for object attributes*/
public class constructor_ol{
    // The constructor overloading --> having more than one constructor with different parameters so that every constructor can perform a different task.
    public static class user{
        int id;
        String name;
        // constructor is always of the same name as the class or structure.
        user(){
            System.out.println("This is a default constructor");
        }

        user(int i,String n){ //parameterized constructor
            id = i;
            name = n;
        }
    }
    public static void main(String[] args) {
        user u = new user();
        System.out.println("Default constructor values");
        System.out.println(u.id +" \n"+ u.name);
        user u1 = new user(101,"Dalima");
        System.out.println("Parameterized constructor values");
        System.out.println("User ID: "+u1.id + " \nUser name: "+ u1.name);
    }
}
