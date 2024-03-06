/*
 * File : ExceptionOnArray.java
 * Deskripsi : Program penggunaan eksepsi menggunakan class library java
 */
public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayinteger = new Integer[4];
        try{
            arrayinteger[2]=11;
            arrayinteger[4]=10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("Clean out code");
        }
    }
}
