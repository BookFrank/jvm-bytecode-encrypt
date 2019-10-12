import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author frank
 * @date 2019/10/12
 */
public class FileEncryptTest {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/jiaer.ly/Desktop/hi.txt");

        // 1. 往一个文件里面写一个 hello，打开查看文件内容
        //String s = "Hello";
        //Files.write(path, s.getBytes());

        // 2. 读取文件，将每个字节-1，然后再次查看文件内容
        //byte[] bs = Files.readAllBytes(path);
        //for (int i = 0; i < bs.length; i++) {
        //    bs[i] = (byte)(bs[i] - 1);
        //}
        //Files.delete(path);
        //Files.write(path, bs);

        // 3. 再次读取文件，将每个字节+1，然后查看文件
        byte[] bs1 = Files.readAllBytes(path);
        for (int i = 0; i < bs1.length; i++) {
            bs1[i] = (byte)(bs1[i] + 1);
        }
        Files.delete(path);
        Files.write(path, bs1);


        // 以上就是大概对 class 文件进行反编译处理的思路
    }
}
