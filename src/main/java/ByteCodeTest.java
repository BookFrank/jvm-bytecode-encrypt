import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author frank
 * @date 2019/10/12
 */
public class ByteCodeTest {

    public static void main(String[] args) throws IOException {

        // 写进去的是字符串，即使文件以 .class 结尾，打开依然能看见字符串 hello，显示的文件大小是 5字节
        //Path path = Paths.get("/Users/jiaer.ly/Desktop/byte.class");
        //String s = "Hello";
        //Files.write(path, s.getBytes());

        // 那随便写5个字节到一个新文件，看打开是什么
        //Path path1 = Paths.get("/Users/jiaer.ly/Desktop/a.class");
        //byte[] bs1 = new byte[]{1,2,3,4,5};
        //Files.write(path1, bs1);
        // 打开文件显示的是 <0x01><0x02><0x03><0x04><0x05>

        // 那随便写5个字节到一个新文件，看打开是什么
        //Path path2 = Paths.get("/Users/jiaer.ly/Desktop/b.class");
        //byte[] bs2 = new byte[]{121,122,123,124,125};
        //Files.write(path2, bs2);
        // 打开文件显示的是 yz{|}，然后 reopen with encoding hex，显示797a 7b7c 7d

        // 那随便写5个字节到一个新文件，看打开是什么
        //Path path3 = Paths.get("/Users/jiaer.ly/Desktop/c.class");
        //byte[] bs3 = new byte[]{-121,-122,-123,-124,-125};
        //Files.write(path3, bs3);
        // UTF8打开文件显示的是 ?????，乱码原因：127 后面的好像是特殊字符，然后是中文系统，显示会有问题


        // 以下字符在 UTF-8 编码中的位置
        System.out.println((byte)'a'); // 97
        System.out.println((byte)'z'); // 122
        byte b = (byte)-121;
        System.out.println((char)b);
        System.out.println((byte)'ﾇ');
    }
}
