<h2><a href="https://www.geeksforgeeks.org/problems/sexy-primes3341/1?page=8">Sixy Primes</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 14pt;">Given two integers <strong>l </strong>and <strong>r </strong>representing a range [l, r], find all Sixy prime pairs within the range. </span><span style="font-size: 14pt;">Two prime numbers are called Sixy primes if their difference is exactly 6.&nbsp; </span></p>
<ul>
<li><span style="font-size: 14pt;">Return all pairs in increasing order of the first prime. For every valid pair (p, p + 6), append p followed by p + 6 to the result.&nbsp;</span></li>
<li><span style="font-size: 14pt;"> </span><span style="font-size: 14pt;">If no such pair exists, return an empty list.&nbsp;&nbsp;</span></li>
</ul>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input</strong>: l = 11, r = 19
<strong>Output:</strong>&nbsp;[11, 17, 13, 19]&nbsp;
<strong>Explanation</strong>: There are total two pair possible with difference 6 and these are 11,17,13,19.  
</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>l = 6, r = 20
<strong>Output:&nbsp;</strong>[7, 13, 11, 17, 13, 19]
<strong>Explanation</strong>: There are total three pair possible with difference 6 and these are 7,13,11,17,13,19. 
</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 ≤ l ≤ r ≤ 10<sup>3</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;<code>number-theory</code>&nbsp;