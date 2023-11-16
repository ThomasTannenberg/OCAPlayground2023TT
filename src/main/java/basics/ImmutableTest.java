package basics;

public class ImmutableTest {

 class Box {
     private final String content;

        public Box(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

 }
}
