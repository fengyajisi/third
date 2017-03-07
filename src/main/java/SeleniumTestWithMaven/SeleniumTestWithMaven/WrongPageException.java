package SeleniumTestWithMaven.SeleniumTestWithMaven;

/**
 * Created by yaoyi on 2017/3/7.
 */
public class WrongPageException extends RuntimeException{
    public WrongPageException(String message){
        super(message);
    }
}
