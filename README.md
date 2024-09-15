# LeetCode 150 Problem Challenge

## I have challenged myself to solve 1 leetcode problem a day for 150 days. These are the problems I have solved so far:
 * Longest Consecutive Sequence
   * Keys to solving this problem:
     - Using a set to store the array in sequential order
     - Checking if the current value is the start of a sequence by looking for a value to it's left
     - If the current value is the start of a sequence you count how many consecutive numbers exist in the set
    
 * Valid Sudoku:
   * Keys to solving this problem:
     - Using 3 hashmaps with the integer as the key and a set of characters as the values
       - The key is the row,col or square number
       - The value is a set of characters that exist in the board
       - To get the key for the square = (row index/3) * 3 + (col index/3) -> 3x3 Box number
     - Check to see if the set contains the current character in each row, column and 3x3 square
     - Add the value to the set if it does not exist
    
  * Product Except Self:
    * Keys to solving this problem:
      -  Use 2 passes
      -  Store 2 variables to keep track of the left and right products
      -  1st pass will calculate the left products
      -  2nd pass will calculate right products
     
  * Top K Frequent Elements:
    * Keys to solving this problem:
      - Use a hashmap to count the number of ocurrances of each number in the array
      - Use a list of lists to keep track of how many numbers occur a certain number of times
        - Index is the number of times a number occurs
        - For example in index 1, there will be a list of numbers that occur one time in the list
     -  Finally start from the end of the list of lists and add the most frequent elements to the results lists until k is reached      
     
  * Encode and Decode Strings
    * Keys to solving this problem:
      - When encoding the string use the length of the current string in the array and a token to mark the location of a word
      - When decoding you would iterate until reaching the token to get the length of the string
      - Then retrieve the string by using the length and the current index to calculate the substring and store it in the list         
       
