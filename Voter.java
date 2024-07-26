package Task4;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeException{
        this.voterId = voterId;
        this.name = name;
        if(age<18){
            throw new InvalidAgeException("Invalid age to Vote");
        }
        this.age = age;
    }

    public void displayVoter(){
        System.out.println(name+ " Voted Successfully");
    }

    public static void main(String[] args) {
        try{
            Voter vo = new Voter(1597856, "Sabarirajan",16);
            vo.displayVoter();
        }catch (InvalidAgeException e){
            System.out.println(e);
        }

    }

}
