public class task7
{
    private String name;

    public Student(String name){
        this.name=name;
    }

    public Student(){
        this("Irfan");
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}