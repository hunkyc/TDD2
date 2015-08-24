public class HiThere {
    String output;

    public HiThere(String name) {
       output = "Hi there ".concat(name);
    }

    public String getOutput() {
        return output;
    }
}