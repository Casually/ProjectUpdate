package project.configure;

import project.util.CommonUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 读取文件父类
 *
 * @author
 * @create 2018-05-14 17:19
 **/

public class ReadFileBase {

    /**
     * 读取文件，输出每行的数据
     *
     * @param filePath
     * @return
     */
    public List<String> getFileLine(String filePath) {
        File file = null;
        if (filePath != null) {
            file = new File(filePath);
        }
        List<String> result = new ArrayList<String>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String txt = "";
            while ((txt = bufferedReader.readLine()) != null) {
                //TODO 后续增加解密工具
                result.add(txt);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
