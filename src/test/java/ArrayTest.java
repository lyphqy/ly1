import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
    //说明：由于题目要求传值类型为整形，所以浮点型、数值溢出等测试因为编译时期就会报错，所以无需设计案例
    @Test//内容相同，有序
    public void arrayCompareTestNormal001() {
        int array1[] = {1, 2, 3};
        int array2[] = {1, 2, 3};
        Assert.assertTrue(new Array().arrayCompare(array1, array2));
    }

    @Test//内容相同，无序
    public void arrayCompareTestNormal002() {
        int array1[] = {1, 3, 2};
        int array2[] = {1, 2, 3};
        Assert.assertTrue(new Array().arrayCompare(array1, array2));
    }

    @Test//负数，0
    public void arrayCompareTestNormal003() {
        int array1[] = {-1, 0, 2};
        int array2[] = {-1, 2, 0};
        Assert.assertTrue(new Array().arrayCompare(array1, array2));
    }

    @Test//同一个值
    public void arrayCompareTestNormal004() {
        int array1[] = {0, 0, 0};
        int array2[] = {0, 0, 0};
        Assert.assertTrue(new Array().arrayCompare(array1, array2));
    }

    @Test//大数
    public void arrayCompareTestNormal005() {
        int array1[] = {2147483647, 2147483646, -2147483648};
        int array2[] = {-2147483648, 2147483646, 2147483647};
        Assert.assertTrue(new Array().arrayCompare(array1, array2));
    }

    @Test//数值格式化
    public void arrayCompareTestNormal006() {
        int array1[] = {00001, 0033, 000};
        int array2[] = {00, 0033, 00001};
        Assert.assertTrue(new Array().arrayCompare(array1, array2));
    }

    @Test//只有一个值
    public void arrayCompareTestNormal007() {
        int array1[] = {1};
        int array2[] = {1};
        Assert.assertTrue(new Array().arrayCompare(array1, array2));
    }

    @Test//都为空值
    public void arrayCompareTestNormal008() {
        int array1[] = {};
        int array2[] = {};
        Assert.assertTrue(new Array().arrayCompare(array1, array2));
    }

    @Test//内容不同
    public void arrayCompareTestException001() {
        int array1[] = {1, 2, 3};
        int array2[] = {1, 3, 4};
        Assert.assertFalse(new Array().arrayCompare(array1, array2));
    }

    @Test//个数不匹配
    public void arrayCompareTestException002() {
        int array1[] = {1, 2, 3};
        int array2[] = {1, 2};
        Assert.assertFalse(new Array().arrayCompare(array1, array2));
    }

    @Test//同一个值，个数不匹配
    public void arrayCompareTestException003() {
        int array1[] = {1, 1, 1};
        int array2[] = {1, 1};
        Assert.assertFalse(new Array().arrayCompare(array1, array2));
    }

    @Test//有一方空值
    public void arrayCompareTestException004() {
        int array1[] = {1, 1};
        int array2[] = {};
        Assert.assertFalse(new Array().arrayCompare(array1, array2));
    }
}
