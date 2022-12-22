package Number3;

public class TestNumber3 {
    public static void main(String[] args) {
        Classes<Integer, String, NewAnimal> tmp = new Classes<>(5, "tmp", new NewAnimal(5,"tmp",10));
        tmp.showClassesName();
    }
}
