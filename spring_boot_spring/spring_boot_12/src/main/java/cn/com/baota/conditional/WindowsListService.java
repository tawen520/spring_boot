package cn.com.baota.conditional;

/**
 * <p>Description:Windows下要创建的Bean类 </p>
 * <p>Date: 2018-05-23</p>
 * <p>Time: 11:47</p>
 * <p>Author: sunbaota</p>
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
