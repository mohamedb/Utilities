/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package dp.abs.factory;

/**
 *
 * @author mohamed
 */
public class TopMenuBuilder implements MenuBuilder{

    @Override
    public Menu createMenu() {
        return new TopMenu();
    }
    
}
