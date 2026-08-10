<h2><a href="https://www.geeksforgeeks.org/problems/pell-number1424/1?page=8">Pell Number</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><p class="PDq2pG_selectionAnchorContainer" data-start="36" data-end="100"><span style="font-size: 14pt;">Given an integer <strong data-start="53" data-end="58">n</strong>, find the <strong data-start="69" data-end="99">n<sup>th</sup> </strong>Pell number. </span><span style="font-size: 14pt;">The Pell sequence is defined as:</span></p>
<ul data-start="136" data-end="202">
<li data-section-id="12zh0h1" data-start="136" data-end="146"><span style="font-size: 14pt;">P<sub>0</sub> = 0</span></li>
<li data-section-id="14vvkbp" data-start="147" data-end="157"><span style="font-size: 14pt;">P<sub>1</sub> = 1</span></li>
<li data-section-id="14vvkbp" data-start="147" data-end="157"><span style="font-size: 14pt;">P<sub>n</sub> = 2 × P<sub>(n-1)</sub> + P<sub>(n-2)</sub> for all n ≥ 2</span></li>
</ul>
<p><span style="font-size: 14pt;"> </span></p>
<p data-start="204" data-end="280"><span style="font-size: 14pt;">Since the answer can be very large, return it modulo 10<sup>9</sup> + 7.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input:</strong> </span><span style="font-size: 18px;">n =<strong> </strong>3</span>
<strong><span style="font-size: 18px;">Output:</span> </strong><span style="font-size: 18px;">5</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Explanation:</span> </strong></span><span style="font-size: 18px;">P<sub>0</sub> = 0, P<sub>1</sub> = 1, P<sub>2</sub> = 2*1+0 = 2, P<sub>3</sub> = 2*2+1 = 5</span></pre>
<pre><span style="font-size: 18px;"><strong style="font-size: 18px;">Input:</strong> <span style="font-size: 14pt;">n</span></span><span style="font-size: 18px;"><strong> </strong>=<strong> </strong>4</span>
<strong><span style="font-size: 18px;">Output:</span> </strong><span style="font-size: 18px;">12</span>
<span style="font-size: 18px;"><strong><span style="font-size: 18px;">Explanation:</span> </strong></span><span style="font-size: 18px;">P<sub>0</sub> = 0, P<sub>1</sub> = 1, P<sub>2</sub> = 2*1+0 = 2, P<sub>3</sub> = 2*2+1 = 5, P<sub>4</sub> = 2*5+2 = 12</span></pre>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Mathematical</code>&nbsp;