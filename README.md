# LeetCode 150 Problem Challenge

## I have challenged myself to solve 1 leetcode problem a day for 150 days. These are the problems I have solved so far:
 * Longest Consecutive Sequence:
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
     
  * Encode and Decode Strings:
    * Keys to solving this problem:
      - When encoding the string use the length of the current string in the array and a token to mark the location of a word
      - When decoding you would iterate until reaching the token to get the length of the string
      - Then retrieve the string by using the length and the current index to calculate the substring and store it in the list
     
  * IsPalindrome:
    * Keys to solving this problem:
      - Remove all spaces, special characters and make the string lowercase
      - Have two pointers, one at the start and one at the end
      - Loop until the middle of the string is reached
      - If any of the characters don't match return false else true

  * GroupedAnagrams:
    * Keys to solving this problem:
      - Use a hashmap to keep track of the anagrams
      - The key is a string created from a chararacter array that counts the number of characters in each String
      - Add the values to the hashmap that match the character count key or add a new character count key to the hashmap

  * Two Sum II:
    * Keys to solving this problem:
      - Use two pointers to start at the beginning and the end of the list
      - Check to see if the numbers at the pointers equal the sum
      - If they do return the pointers in a list
      - If the sum is greater than the target sum decrease the end pointer
      - If the sum is less than the target sum increase the start pointer

  * Three Sum:
    * Keys to solving this problem:
      - Sort the input array
      - Loop through the sorted input array
      - Check to see if the previous element is equal to the current element and if so continue the loop
      - Use two pointers to keep track of the current position + 1 and the end of the list
      - Loop until the left pointer is greater than the right pointer and check to see if the sum of the left, right and current position is equal to zero
      - If so add the 3 values to the list
      - If not if the sum is greater than the target decrease the right pointer
      - If the sum is less than the target increase the left pointer
      - If the next position is the same as the previous position keep increasing the left pointer until a unique value is reached
     
  * Max Water Container:
    * Keys to solving this problem
      - Use two pointers one at the beginning of the list and one at the end
      - The current area is the difference between the right and left pointers multiplied by the minimum height
      - If the current area is greater than the max area, set the current as the max
      - If the height is greater at the left pointer decrement the right pointer
      - If the height is greater at the right pointer increment the left pointer
     
  * Trapping Rain Water:
    * Keys to solving this problem
      - Use two pointers at the start and end of the list
      - Keep track of the max left and max right values (start at the location of left and right pointers)
      - If the max left is less than the max right increment the left pointer
      - Take the max of the max left and current left and set it as the max left
      - Calculate the amount of water that can be filled at the current location by taking the min of the maxleft and max right and subtract it from the height array at the left position
      - If the max right is less than the max left decrement the right pointer
      - Take the max of the max right and current right and set it as the max right
      - Calculate the amount of water that can be filled at the current location by taking the min of the maxleft and max right and subtract it from the height array at the right position

  * Buy and Sell Stocks:
    * Keys to solving this problem:
      - Use two pointers to keep track of the buying and selling price
        - The buying price starts at the first element in the input array
        - The selling price is set to the current element in the loop which starts at index 1
      - If the buying price is less than the selling price then calculate the profit and if the profit is greater than the max profit set the max profit to the current profit
      - Otherwise, set the buying price to the selling price

  * Longest Substring:
    * Keys to solving this problem:
      - Use a set to keep track of the characters in the string
      - Use two pointers to keep track of the start and end of the substring
      - If the character at the end pointer is not in the set add it to the set and increment the end pointer
      - If the character at the end pointer is in the set remove the character at the start pointer from the set and increment the start pointer
      - Keep track of the max length of the substring by taking the max of the current length and the max length
          
  * Longest Repeating Substring With Replacements:
    * Keys to solving this problem:
      - Use a hashmap to keep track of the character counts
      - Use two pointers to keep track of the start and end of the substring
      - Keep track of the max length of the substring
      - If the character at the end pointer is not in the hashmap add it to the hashmap and increment the end pointer
      - Set the max occurring character to the max of the current character and the max occurring character
      - If the length of the substring minus the max occurring character is greater than k then remove the character at the start pointer from the hashmap and increment the start pointer
      - Keep track of the max length of the substring by taking the max of the current window and the max length

  * Permutation String:
    * Keys to solving this problem:
      - Count the number of characters in the substring t and the string s until the end of the substring
      - Use two pointers to keep track of the start and end of the substring
      - Keep track of the number of matches
      - Check to see if the counts of the substrings match the counts of the string and increment the matches counter
      - Loop through the string and check to see if the matches == 26 and if so return true
      - Keep track of the start of the substring
      - Get the ascii value of the current character and increment the count in the string count array
      - If the current character count in the substring is equal to the count in the string count array then increment the matches counter
      - If the character after the current character count is equal to the count in the string count array then decrement the matches counter
      - Get the ascii value of the character at the start pointer and decrement the count in the string count array
      - If the count of the character at the start pointer is equal to the count in the substring count array then increment the matches counter
      - If the character before the start character in the substring is equal to the count in the string count array then decrement the matches counter
      - Increment the start pointer

  * Minimum Window:
    * Keys to solving this problem:
      - Use two hashmaps: one to keep track of the character counts for the substring t and one to keep track of the character counts of the current window
      - Keep track of how many character matches are needed, how many there are currently, the minimum length of the substring and the start of the window
      - If the character at the end pointer is in the hashmap add it to the current window hashmap and increment the count of the character
      - If the count of the character in the current window is equal to the count of the character in the substring t then increment the character matches we have
      - If the character matches we have is equal to the number of matches we need then we need to get the length of the substring
        - If the length is less than the current minimum we replace the minimum and store the current substring
        - If the character at the start pointer is in the hashmap then decrement the count of the character in the current window and if the count is less than the count in the substring t then decrement the character matches we have

  * Maximum Sliding Window:
    * Keys to solving this problem:
      - Use a deque to keep track of the maximum values in the current window
      - Keep track of the start and the end pointers
      - Check to see if the current value is greater than the last value in the deque and if so remove the last value
      - Add the current index to the deque
      - Check to see if the starting index is out of bounds of the current window and if so remove the starting index from the deque
      - If the current window is equal to k add the value at the first index in the deque to the results list at the start index
        - Increment the start index
      - Increment the end index 

  * Valid Parentheses: 
    * Keys to solving this problem:
      - Use a stack to keep track of the opening brackets
      - Use a hashmap to store the closing brackets to opening bracket mappings
      - Check to see if the stack is not empty, the current character is a closing bracket and the top of the stack is the opening bracket for the current character
        - If so pop the opening bracket from the stack
        - Else add the character to the stack

  * Min Stack:
    * Keys to solving this problem:
      - Use a stack to keep track of the minimum value
      - When pushing check to see if the value being pushed is less than the current top of the min stack
        - If so push the value to the min stack  
      - When popping remove the value from the min stack and the actual stack
      - When getting the minimum value return the top of the min stack 

  * Evaluate RPN:
    * Keys to solving this problem:
      - Use a stack to keep track of the result
      - When encountering an operation token perform the operation on the top 2 values of the stack and push that result back into the stack
      - When encountering a number push it into the stack
      - Return the top of the stack

  * Generate Parentheses:
    * Keys to solving this problem:
      - Use a recursive function to generate the parentheses
      - Keep track of the number of open and close brackets
      - If the number of open brackets is equal to the number of close brackets and the number of close brackets is equal to n then add the current string to the results list
      - If the number of open brackets is less than n then add an open bracket and call the function again incrementing the open count
      - If the number of close brackets is less than the number of open brackets then add a close bracket and call the function again incrementing the close count

  * Daily Temperatures:
    * Keys to solving this problem: 
      - Use a stack of int arrays to keep track of the current temperature and the index it is located at
      - Check to see if the stack is not empty and if the current element is greater than the top of the stack
        - If the conditions are met, pop the top of the stack and set the result array to the difference between the current index and the index the element is located at
      - Push the current element and its index into the stack

  * Car Fleet:
    * Keys to solving this problem:
      - Sort the position and speed arrays by position and store in a 2d array (pos,speed)
      - Loop through the 2d array starting from the end
      - Use a stack to keep track of the car fleets
      - Calculate the time it takes to reach the target position (target - pos[i])/speed[i]
      - If the time is greater than the top car in the stack then add the car to the fleet

  * Largest Rectangle:
    * Keys to solving this problem:
      - Use a stack to keep track of pairs of indexes and heights
      - Loop through the heights array
      - If the stack is empty or the current height is greater than the top of the stack push the current index and height into the stack
      - If the current height is less than the top of the stack then pop the top of the stack and calculate the area
        - The area is the height of the top of the stack multiplied by the difference between the current index and the index at the top of the stack
        - If the area is greater than the max area then set the max area to the current area
        - Set the current index to the index of the element that was popped from the stack
      - If the stack is not empty then calculate the area of the remaining elements in the stack
        - The area is the height of current element multiplied by the difference between the length of the height array and the index of the current element
        - If the area is greater than the max area then set the max area to the current area

  * Binary Search:
    * Keys to solving this problem:
      - Use two pointers to keep track of the start and end of the array
      - Keep track of the middle index of the array
      - If the middle index is equal to the target return the middle index
      - If the middle index is less than the target decrement the end pointer
      - If the middle index is greater than the target increment the start pointer
      - Set the middle to the start + end divided by 2
      - Loop until the start is less than or equal to the end and return -1 if the target is not found

  * Search 2D Matrix:
    * Keys to solving this problem:
      - Use two pointers to keep track of the top and bottom rows
      - Use a binary search to find the row that the target is located in
      - If the target is not in any row return false
      - Use two pointers to keep track of the start and end of the row
      - If the target exists in a row use a second binary search to find the target in the row

  * Kokos Bananas:
    * Keys to solving this problem:
      - Obtain the max of the piles array
      - The left index is 1 and the right index is the max of the piles array
      - Use binary search and get the potential k value by adding left + right and dividing by
      - Use the k value to calculate the number of hours it will take to eat all the bananas (round up)
      - If the number of hours is less than or equal to h
        - Set the right to k - 1
        - Set the minK to k
      - If the number of hours is greater than h
        - Set the left to k + 1

 * Min In Rotated Array:
   * Keys to solving this problem:
     - Use a binary search
     - If the left element is less than or equal to the right element (sorted in ascending order) return the left element
     - If the middle element is greater than or equal to the left element search the right side of the array
     - Else search the left side of the array

  * Search in Rotated Array
    * Keys to solving this problem:
      - Use a binary search
      - If the middle element is equal to the target return the middle
      - If the middle element is greater than or equal to the left element (left portion of the binary search)
        - If the target is less than the left element or greater than the middle search the right side of the array
        - Else search the left side of the array
      - If the middle element is less than or equal to the right element (right portion of the binary search)
        - If the target is greater than the right element or less than the middle search the left side of the array
        - Else search the right side of the array
