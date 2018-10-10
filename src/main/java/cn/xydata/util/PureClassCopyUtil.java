package cn.xydata.util;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Field;

/**
 * @author kaiqian
 * @CreateDate 2017/12/1
 */
public class PureClassCopyUtil {

    @SuppressWarnings("rawtypes")
    public static void copyProperty(Object oldClazz,Object newClazz) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException{
        //新的class
        Class newClass = newClazz.getClass();
        //老的class
        Class oldClass = oldClazz.getClass();
        //该类所有的属性
        Field[] oldFields = ArrayUtils.addAll(oldClass.getDeclaredFields(),oldClass.getSuperclass().getDeclaredFields());
        //新的属性
        Field newField = null;
        //老的属性
        Field oldField = null;
        for(Field f : oldFields){
            //类中的属性名称
            String fieldName = f.getName();
            //通过属性名称获取属性

            if("id".equals(fieldName) || "gmtCreate".equals(fieldName) || "gmtModified".equals(fieldName) || "nameCreate".equals(fieldName) || "nameModified".equals(fieldName) || "isDeleted".equals(fieldName)){
                newField = newClass.getSuperclass().getSuperclass().getDeclaredField(fieldName);
            }else {
                newField = newClass.getSuperclass().getDeclaredField(fieldName) ;
            }



            //获取属性的值时需要设置为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。
            //值为 false 则指示反射的对象应该实施 Java 语言访问检查。
            newField.setAccessible(true);
            f.setAccessible(true);

            if("int".equals(newField.getType().toString())){

                if("True".equals(f.get(oldClazz))){
                    newField.set(newClazz, 1);
                }else{
                    newField.set(newClazz, 0);
                }
                return;
            }

            //根据属性获取对象上的值
            try {
                newField.set(newClazz, f.get(oldClazz));
            } catch (Exception e) {

                e.printStackTrace();
            }
            //Object newObject = newField.get(newClazz);
            //过滤空的属性或者一些默认值
//            if (isContinue(newObject)) {
//                continue;
//            }
//            oldField = oldClass.getDeclaredField(fieldName);
//            oldField.setAccessible(true);
//            oldField.set(oldClazz, newObject);
        }
    }

    private static boolean isContinue(Object object){
        if (object == null || "".equals(object)) {
            return true;
        }
        String valueStr = object.toString();
        if ("0".equals(valueStr) || "0.0".equals(valueStr)) {
            return true;
        }
        return false;
    }
}
