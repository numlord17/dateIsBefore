Write a method <pre>dateIsBefore</pre> that takes as parameters two month/day combinations and that returns whether or not the first date comes before the second date (true if the first month/day comes before the second month/day, false if it does not). The method will take four integers as parameters that represent the two month/day combinations.

The first integer in each pair represents the month and will be a value between 1 and 12 (1 for January, 2 for February, etc, up to 12 for December). The second integer in each pair represents the day of the month (a value between 1 and 31). One date is considered to come before another if it comes earlier in the year.

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

General Requirements:
# Submit this to a new repository called "dateIsBefore"
# Your code must live in a file named "Main.java".
# Your code must compile
# Your code must meet the requirements listed up above.