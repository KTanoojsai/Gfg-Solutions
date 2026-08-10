<h2><a href="https://www.geeksforgeeks.org/problems/keith-number2745/1?page=9">Keith Number</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p class="PDq2pG_selectionAnchorContainer" data-start="84" data-end="149"><span style="font-size: 14pt;">Given an integer <strong>n</strong>, find if it is a Keith Number. </span><span style="font-size: 14pt;">A number with k digits is called a Keith Number if it appears in a special sequence generated as follows:</span></p>
<ul data-start="264" data-end="464">
<li data-section-id="1qkpxl0" data-start="264" data-end="331"><span style="font-size: 14pt;"> The first <strong>k</strong> terms of the sequence are the digits of the number. </span></li>
<li data-section-id="fy5syr" data-start="332" data-end="393"><span style="font-size: 14pt;"> Every subsequent term is the sum of the previous <strong>k </strong>terms. </span></li>
<li data-section-id="gjx0yi" data-start="394" data-end="464"><span style="font-size: 14pt;"> If the number itself appears in this sequence, it is a Keith Number. </span></li>
</ul>
<p data-start="466" data-end="531"><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><span style="font-size: 18px;"><strong>Input: </strong>n = 197<strong>
Output: </strong>true<strong>
Explanation: </strong>197 has 3 digits. The sequence starts with: 1, 9, 7 Next terms are: 17, 33, 57, 107, 197, ... Since 197 appears in the sequence, it is a Keith Number.</span></span></pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>n = 12<strong>
Output: </strong>false<strong>
Explanation: </strong>The sequence starts with: 1, 2 Next terms are: 3, 5, 8, 13, 21, ... 12 does not appear in the sequence.</span></pre></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;<code>series</code>&nbsp;