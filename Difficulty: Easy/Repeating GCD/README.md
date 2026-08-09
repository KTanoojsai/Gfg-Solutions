<h2><a href="https://www.geeksforgeeks.org/problems/repeating-gcd4659/1?page=8">Repeating GCD</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given three integers <strong>n</strong>, <strong>x,</strong> and <strong>y</strong>. Let <strong>a </strong>be the number formed by repeating <strong>n </strong>exactly <strong>x </strong>times consecutively, and let b be the number formed by repeating <strong>n </strong>exactly y times consecutively. </span><span style="font-size: 18px;">Find the <strong>GCD(a, b).</strong><br></span><span style="font-size: 18px;"><strong>Note:</strong> The answer is guaranteed to fit in a 32-bit signed integer.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 1, x = 1, y = 1
<strong>Output: </strong>1
<strong>Explanation: <br></strong>Repeating 1 exactly once forms a = 1 and b = 1.
Therefore, GCD(1, 1) = 1.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 2, x = 2, y = 3
<strong>Output: </strong>2
<strong>Explanation: <br></strong></span><span style="font-size: 18px;">Repeating 2 twice forms a = 22, and repeating it three times forms b = 222.
The greatest common divisor of 22 and 222 is 2, so the answer is 2.</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:<br></strong></span><span style="font-size: 18px;">1 ≤ n ≤ 999<br></span><span style="font-size: 18px;">1 ≤ x, y ≤ 3</span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;