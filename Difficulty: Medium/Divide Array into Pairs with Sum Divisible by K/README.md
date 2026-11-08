<h2><a href="https://www.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1">Divide Array into Pairs with Sum Divisible by K</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p><span style="font-size: 18px;">Given an array of integers <strong>arr</strong>&nbsp;and a number <strong>k</strong>, return <strong>true </strong>if the array can be divided into pairs such that sum of every pair is divisible by <strong>k</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[] = [9, 5, 7, 3], k = 6
<strong>Output: </strong>true
<strong>Explanation: </strong>{(9, 3), (5, 7)} is a possible solution. 9 + 3 = 12 is divisible by 6 and 7 + 5 = 12 is also divisible by 6.
</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> arr[] = [4, 4, 4], k = 4
<strong>Output: </strong>false
<strong>Explanation: </strong>You can make 1 pair at max, leaving a single element unpaired.</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>arr[]<strong> </strong>= [4, 4], k = 4
<strong>Output: </strong>true
<strong>Explanation: </strong>Here only {(4,4)} is possible whose sum 4 + 4 = 8 is divisible by 4.</span></pre></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Goldman Sachs</code>&nbsp;<code>Directi</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Hash</code>&nbsp;<code>STL</code>&nbsp;