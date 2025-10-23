# binary-search
[English](README.md) | [Russian](README-RU.md )
## DESCRIPTION
**binary search** is needed to find elements in an array:
1. Numbers
2. Letters
3. Words

## NOTE
**binary search** works only with a sorted array.

## HOW IT WORKS
we are given an array, for example '[1,4,7,3,2,12,5,6,61,90,0] '
1. We need to sort the list (*from smallest to largest*)
2. we find the length of the array
3. next, we find the middle of the array (this number is ~~6~~ 12)
4. we compare the number we need with the middle:
> if the number x (which we are looking for) is equal to the middle, then we output the index of the number

> if the number x is greater than the found middle, then we cut off the array whose index is less than the middle, and look for ***a new middle*** in ***a new array***

>if the number x is less than the found middle, then we cut off the array whose index is greater than the middle, and look for ***a new middle*** in ***a new array***

5. and so we continue the **cycle** until we find the element we need, but if there is no element, then we write - the element is missing 
##WHERE DID THE INFORMATION COME FROM???
I learned about binary search from the book ***Groke_algorithms.Illustrated by a special feature for programmers and curious people.***
link to the book as a [pdf file](https://kamilbilim.edu.tm/media/books/Groke_algorithms.Illustrated by a special feature for programmers and the curious._2017.pdf)
![](https://cdn1.ozone.ru/s3/multimedia-2/6511970834.jpg )
![](https://avatars.mds.yandex.net/get-mpic/4252138/2a00000194b1f20df3b27fbc7f730c2cb9f2/orig )

| Heading 1 | Heading 2 | Heading 3 |
| --- | --- | --- |
| Cell 1 | Cell 2 | Cell 3 |
| Cell 4 | Cell 5 | Cell 6 |

```
System.out.println("Hello world!")
```
