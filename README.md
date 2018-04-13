<p>This project consists of Custom classes for Datastructures presented in Java</p>
<p>A Custom Hashtable class created by making use of custom LinkedList class.</p>
<p>Hashtables are used for storing array, mainly for getting search results quickly without iterating through the whole loop like in linear search.</p>
<h3><strong>Hashtable functionality:</strong></h3>
<p>* The values in the array will be converted into its ascii code equivalent<br />* The modulo for the ascii code with length of array will estimated, which is the index of the array where the value will be stored<br />* So when you need an value inside the array, you can get it by providing the ascii code of the value at instance</p>
<h3><strong>Problem:</strong></h3>
<p>The problem with the above approach is, if we have duplicate value or value with same ascii code which is already present, then the value will be overwritten.</p>
<p>In order to overcome this, we can save the value in linked list. If a duplicate value is inserted then it will add to another node in the linked list.</p>
<p>&nbsp;</p>
