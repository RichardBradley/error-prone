
import lombok.Value;

@Value
public class SomeDataClass {

    public String name;

    @Override
    public String toString() {
        return "SomeDataClass[" + this.getName() + "]";
    }
}
