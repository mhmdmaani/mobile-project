import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    @Test
    @DisplayName("test fetch all  function when the mobiles array is empty")
    void testFindAllWhenItsEmpty(){
        MobileManagement mobileManager = new MobileManagement(new ArrayList<Mobile>());
        assertThat(mobileManager.fetchAll().size()).isEqualTo(0);
    }
    @Test
    @DisplayName("check fetch all  function when the mobiles array")
    void testFindAllWhenArrayContinsMobiles () {
        ArrayList<Mobile> mobiles = new ArrayList<Mobile>() ;

        mobiles.add(new Mobile("1","Iphone 5",2010 ,2010,256,2000));
        mobiles.add(new Mobile("2","Iphone 6",2011 ,2010,256,3000));
        mobiles.add(new Mobile("3","Iphone 7",2012 ,2010,256,4200));
    MobileManagement mobileManager = new MobileManagement(mobiles);

    assertThat(mobileManager.fetchAll().size()).isEqualTo(3);




}

}