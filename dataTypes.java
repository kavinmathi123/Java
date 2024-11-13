class dataTypes{
    public static void main(String args[]){
        byte a=127;
        short b=128;
        int c=1234;
        long d=987654345678l;
        float f=23.4f;
        double e=234.455;
        char ch='e';
        String name="kavi";
        System.out.println("byte "+a);
        System.out.println("short "+b);
        System.out.println("int "+c);   
        System.out.println("long "+d);  // it takes large number and end must use l
        System.out.println("float "+f);  // float values have 6 to 7 decimal point at the end must use f
        System.out.println("double "+e);  // decimal values defaultly use double
        System.out.println("char "+ch);  // store single letter ..
        System.out.println("String "+name);  // String is object . it takes sequence of character .
        System.out.println(name.charAt(0));  // charAt() method is use to get single char in string
    }
}