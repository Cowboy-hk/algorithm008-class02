public class Solution {
    public boolean isPalindrome(String s) {
        //高层次（主干）逻辑；
        //1. filter out number & char；
        //2. reverse and compare
        String filteredS = _filterNonNumberAndChar(s);

//        String reversedS = _reverseString(filteredS);
//        return reversedS.equalsIgnoreCase(filteredS);
        return _reverseString(filteredS).equalsIgnoreCase(filteredS);
    }

    //按住Alt + Enter，自动生成以下函数
    private String _reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
        /* SringBuffer类和String一样，也用来代表字符串；
        /* 相比String, StringBuffer在进行字符串处理时，不生成新的对象，在内存使用上要优于String类；
        /* 当遇到插入、删除等字符串操作时，可以考虑用StringBuffer；
          */

        /* 虽然StringBuffer和String都是操作字符串，但两者属于不同的类；
        /* 不能直接兼容，所有需要相互转换，sBuffer.toString();
        /* 则可以从StringBuffer类型转为String类型
         */
    }

    //按住Alt + Enter，自动生成以下函数
    private String _filterNonNumberAndChar(String s) {
        //过滤掉所有的非字母和非数字
        return s.replaceAll("[^A-Za-z0-9]","");
    }
}
