public class HelloWorld {
        public static void main(String[] args) {
                String str1 = "Employee";
                String str2 = "Company";
                if (str1.equals(str2)) {
                        System.out.println("Strings are equal");
                } else {
                        System.out.println("Strings are not equal");
                }
                System.out.println("Length of str1: " + str1.length());
                System.out.println("Length of str2: " + str2.length());
                System.out.println("Substring of str1 from index 4: " + str1.substring(4));
                String concatenatedString = str1.concat(str2);
                System.out.println("Concatenated string: " + concatenatedString);
                System.out.println("str1 in lowercase: " + str1.toLowerCase());
                System.out.println("str2 in uppercase: " + str2.toUpperCase());
                int indexOfSubstring = str1.indexOf("lo");
                System.out.println("Index of 'lo' in str1: " + indexOfSubstring);
                System.out.println("NEW UPDATED CODE GOES HERE");
        }
}