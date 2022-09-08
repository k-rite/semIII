class java25 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.length(); // 5
        sb.capacity(); //
        sb.charAt(1);
        sb.setCharAt(1, 'i'); //
        sb.setLength(2); //
        sb.append("l").append("1");
        sb.insert(0, "Big");
        sb.replace(3,11,"");
        sb.reverse(); //
    }
}