<h1>Challenge 1 - <code>dateIsBefore</code></h1>
<p>>
Write a method <code>dateIsBefore</code> that takes as parameters two month/day combinations and that returns whether or not the first date comes before the second date (true if the first month/day comes before the second month/day, false if it does not). The method will take four integers as parameters that represent the two month/day combinations.

The first integer in each pair represents the month and will be a value between 1 and 12 (1 for January, 2 for February, etc, up to 12 for December). The second integer in each pair represents the day of the month (a value between 1 and 31). One date is considered to come before another if it comes earlier in the year.

Other Requirements:
1. Submit this to a new repository called "dateIsBefore"
2. Your code must live in a file named "Main.java".
2. You must create the <code>main</code> method to test all of the scenarios below
3. Your code must compile
4. Your code must meet the requirements listed up above.

Below are sample calls on the method.

<table>
<tr>
<th>Method Call</th>
<th>Return</th>
<th>Explanation</th>
</tr>
<tr>
    <td>dateIsBefore(6, 3, 9, 20)</td>
    <td>true</td>
    <td>June 3 comes before Sep 20</td>
</tr>
<tr>
    <td>dateIsBefore(10, 1, 2, 25)</td>
    <td>false</td>
    <td>Oct 1 does not come before Feb 25</td>
</tr>
<tr>
    <td>dateIsBefore(8, 15, 8, 15)</td>
    <td>false</td>
    <td>Aug 15 does not come before Aug 15</td>
</tr>
<tr>
    <td>dateIsBefore(8, 15, 8, 16)</td>
    <td>true</td>
    <td>Aug 15 comes before Aug 16</td>
</tr>
</table>
</p>
<p>
<h1>Challenge 2 - Grading Algorithm</h1>
Below is a new grading algorithm that Mr. Krokower has come up with. Here are his new grading requirements:

    

1. If the first letter of your GitHub username starts with a vowel and your shoes are not white, you receive 50 points. Otherwise, you receive 0 points
2. If the last letter of your GitHub username has an ASCII value less than 105 OR your shoes are something other than white, then you receive 3000 points

Write the method <code>grade</code> in the <code>Grader</code> class which meets these requirements.

Other Requirements:
1. Submit this code to the "dateIsBefore" repo you created in Challenge 1
2. Your code must live in a file named "Grader.java".
2. You must create the <code>main</code> method to test all of the scenarios below and any other useful scenarios
3. Your code must compile
4. Your code must meet the requirements listed up above.


<table>
<tr>
<th>Method Call</th>
<th>Return</th>
<th>Explanation</th>
</tr>
<tr>
    <td>grade("EasyPeasy", "black")</td>
    <td>3050</td>
    <td>Starts with a vowel, shoes aren't white, last letter not less than 105</td>
</tr>
<tr>
    <td>grade("APeace", "white")</td>
    <td>3000</td>
    <td>Starts with a vowel, shoes are white, last letter less than 105</td>
</tr>
<tr>
    <td>grade("WhirledPeas", "white")</td>
    <td>0</td>
    <td>Does not start with a vowel, shoes are white, last letter not less than 105</td>
</tr>
<tr>
    <td>grade("Oscar", "red")</td>
    <td>3050</td>
    <td>Starts with a vowel, shoes not white, last letter not less than 105</td>
</tr>
<tr>
    <td>grade("Amy", "white")</td>
    <td>0</td>
    <td>Starts with a vowel, shoes are white, last letter not less than 105</td>
</tr>
<tr>
    <td>grade("Ben", "blue")</td>
    <td>3000</td>
    <td>Doesn't start with a vowel, shoes not white, last letter not less than 105</td>
</tr>