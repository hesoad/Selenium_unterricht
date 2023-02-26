package day04_JunitFrameWork;

import org.junit.*;

public class C05_BirlikteKullanim {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before classs calisti \n===============================");
    }
    @AfterClass
    public static void afterClass (){
        System.out.println("=============================\nafter class calisiti ");
    }
    @Before
    public void before (){

        System.out.println("\nbefore classi calisti ");
    }
    @After
    public void after (){

        System.out.println("\nbefore classi calisti ");
    }
    @Test
    public void test01(){
        System.out.println("Test 01 calisti ");
    }
    @Test
    public void test02(){
        System.out.println("Test 02 calisti ");
    }
    @Test
    public void test03(){
        System.out.println("Test 03 calisti ");
    }
}
