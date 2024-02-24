<h2><a href="https://leetcode.com/problems/intersection-of-two-arrays/">349. Intersection of Two Arrays</a></h2><h3>Easy</h3><hr><div><p>Given two integer arrays <code>nums1</code> and <code>nums2</code>, return <em>an array of their intersection</em>. Each element in the result must be <strong>unique</strong> and you may return the result in <strong>any order</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums1 = [1,2,2,1], nums2 = [2,2]
<strong>Output:</strong> [2]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums1 = [4,9,5], nums2 = [9,4,9,8,4]
<strong>Output:</strong> [9,4]
<strong>Explanation:</strong> [4,9] is also accepted.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums1.length, nums2.length &lt;= 1000</code></li>
	<li><code>0 &lt;= nums1[i], nums2[i] &lt;= 1000</code></li>
</ul>
<p>&nbsp;</p>
<div>
<h3>Time Complexity Comparison for both solutions</h3>
<ul>
    <li><strong>HashSet Solution:</strong>
        <ul>
            <li>Time Complexity: O(m + n + min(m, n))</li>
            <li>Constructing the hash sets from the input arrays takes O(m + n) time.</li>
            <li>Checking for intersection and constructing the result array take O(min(m, n)) time.</li>
        </ul>
    </li>
    <li><strong>Two-Pointer Solution:</strong>
        <ul>
            <li>Time Complexity: O(n log n + m log m + min(m, n))</li>
            <li>Sorting the input arrays takes O(n log n + m log m) time.</li>
            <li>Finding the intersection using the two-pointer technique takes O(min(m, n)) time.</li>
        </ul>
    </li>
</ul>
<p>So, in terms of time complexity, both solutions are similar. However, the two-pointer solution may perform slightly better in practice due to avoiding hash set operations and sorting overhead, especially when the arrays are already sorted.</p>
</div>