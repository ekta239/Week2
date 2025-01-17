public class PalindromeChecker {
    private String text;

    // Constructor to initialize the text attribute
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        // Compare the clean text with its reverse
        String reversedText = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversedText);
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }

    // Example usage
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("A man, a plan, a canal: Panama");
        checker.displayResult();
    }
}