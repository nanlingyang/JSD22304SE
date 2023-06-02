package string;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String line = "asd123fdsg345dfg345dfg324dsdfg";
        line = line.replaceAll("[0-9]+","#dfesr#");
        System.out.println(line);

        String regex = "(wqnmlgb|dsb|nc|tmd|nmd|wdnmd|cnm|djb)";
        String message = "wqnmlgb,你这个dsb,你怎么这么的nc!你绝对是一个djb";
        message = message.replaceAll(regex,"***");
        System.out.println(message);
    }
}
