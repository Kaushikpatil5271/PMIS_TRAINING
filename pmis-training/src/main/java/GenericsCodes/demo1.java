package GenericsCodes;
////
//////Multi type parameters
////class Pair<K, V> {
//// private K key;
//// private V value;
////
//// public Pair(K key, V value) {
////     this.key = key;
////     this.value = value;
//// }
////
//// public K getKey() {
////     return key;
//// }
////
//// public V getValue() {
////     return value;
//// }
////}
////
////class demo1{
//// public static void main(String[] args){
////     Pair<String, Integer> p = new Pair<>("Age", 25);
////
////     String k = p.getKey();
////     Integer v = p.getValue();
////
////     System.err.println(k + ":" + v);
//// }
////}
//

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class demo1{
    public static void main(String[] args){
        Pair<String, Integer> p = new Pair<>("Age", 59);

        String k = p.getKey();
        Integer v = p.getValue();

        System.err.println(k + ":" + v);
    }
}
//
///* class Pair{
//    private Object key;
//    private Object value;
//*/

//class Pair {
//    private Object key;
//    private Object value;
//
//    public Pair(Object key, Object value) {
//        this.key = key;
//        this.value = value;
//    }
//
//    public Object getKey() {
//        return key;
//    }
//
//    public Object getValue() {
//        return value;
//    }
//}
//
//class demo1 {
//    public static void main(String[] args) {
//        Pair p = new Pair("Age", "test");
//
//        String k = (String) p.getKey();
//        Integer v = (Integer) p.getValue();
//        System.out.println(k + ":" + v);
//    }
//}
*/
