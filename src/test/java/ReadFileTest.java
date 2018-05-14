import project.configure.ReadConfigurationFile;

/**
 * @author
 * @create 2018-05-14 17:43
 **/

public class ReadFileTest {

    public static void main(String[] args) {
        ReadConfigurationFile readConfigurationFile = new ReadConfigurationFile();
        for (String str:readConfigurationFile.getFileLine("D:/test.txt")){
            System.out.println(str);
        }
    }
}
