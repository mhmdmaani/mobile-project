import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MobileManagementTest {

    @Test
    @DisplayName("test insert a new mobile")
    void testInsertMethod(){
        ArrayList<Mobile> mobiles = new ArrayList<Mobile>() ;
         mobiles.add(new Mobile("12","Iphone 4",2010 ,2010,256,200));
        MobileManagement mobileManager = new MobileManagement(mobiles);

       Mobile toInsertMobile = new Mobile("15","Iphone 4",2010 ,2010,256,200);

      Mobile inserted =  mobileManager.insert(toInsertMobile);

       assertThat(mobiles.size()).isEqualTo(2);
       assertThat(inserted).isEqualTo(toInsertMobile);
    }
    @Test
    @DisplayName("test insert an Existed mobile will throw runtime exception")
    void testInsertMethodWithExistedMobile(){
        ArrayList<Mobile> mobiles = new ArrayList<Mobile>() ;
        mobiles.add(new Mobile("12","Iphone 4",2010 ,2010,256,200));
        MobileManagement mobileManager = new MobileManagement(mobiles);

        Mobile toInsertMobile = new Mobile("12","Iphone 4",2010 ,2010,256,200);

        assertThrows(RuntimeException.class,()->{mobileManager.insert(toInsertMobile);});
    }

}