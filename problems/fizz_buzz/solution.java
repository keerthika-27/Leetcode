class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fizzbuzzlist = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            if (i % 15 == 0) {
                fizzbuzzlist.add("FizzBuzz");
            } else if (i % 3 == 0) {
                fizzbuzzlist.add("Fizz");
            } else if (i % 5 == 0) {
                fizzbuzzlist.add("Buzz");
            } else {
                fizzbuzzlist.add(String.valueOf(i));
            }
        }
        return fizzbuzzlist;
    }
}