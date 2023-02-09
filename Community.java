class Community{
    // Instance variables
    private String name;
    private String email;
    private int age;

    // Default constructors without parameters
    public Community(){
         name = "";
         email = "";
         age = 0;
    }

    // parameterised constructor with parameters
    public Community(String initName, String initEmail, int initAge){
        name = initName;
        email = initEmail;
        age = initAge;
    }

    // Method to print 
    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
    }

    // main method for object creation and calling
    public static void main (String[] args){

        Community Cit1 = new Community();
        Community Cit2 = new Community("Ewura Ama", "ewura@gmail.com",21);
        Cit1.print();
        System.out.println(" ");
        Cit2.print();
    }





}

