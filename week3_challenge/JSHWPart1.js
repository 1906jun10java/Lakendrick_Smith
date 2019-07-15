//First make a homework object
var homework = {};

// Task 1: Return the nth fibonacci number

    homework.fibonacci = (n) => {
    for(let i = 0;i< n; i++) {
       var x = i + (i-1);}
    return x;
}

// Task 2: Sort arry of integers

homework.sort = (array) => {

    var Stop = false;
    
    while(!Stop) {
        stop = true;
        for(var i = 1; i < array.length; i += 1) {
            if (array[i - 1] > array[i]) {
                stop = false;
                var temp = array[i-1];
                array[i-1] = array[i];
                array[i] = temp;
            }
        }
    }
   return array; 
}

//Task 3: Return the factorial of n.

homework.factorial = (n) => {
    var x = 0;
    for(let i = 0; i < n; i++) {
        
        x = x +( i * (i-1));
    }
    return x;
}
//Task 4: Rotate Array to the left n number of times.

homework.rotateLeft = (array, n) => {
   // var firstPostion = [array[0]];
    for(let i = 0; i < n; i++) {
        let firstPostion = [array[0]];
        let updatedArray = array;
        updatedArray.shift();
        updatedArray.push(firstPostion);
    }
  return updatedArray;
}
//Task 5: 

homework.balancedBrackets = (bracketsString) => {

    let perfectBalance = [ "(", ")", "[", "]", "{","}"   ];

    for(i = 0; i<bracketsString.length; i++) {
        var temp = bracketsString[i];
        for(j = 0; i<bracketsString.length; i++){

        }
    }
}

	



	