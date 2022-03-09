
const readline = require("readline").createInterface({
    input:process.stdin,
    output:process.stdout
})


readline.question("Enter Number List by separating by comma(Example Input :- 1,4,6,3,7,2)  ", val => {

    //call the method for find the 3rd largest number
    find_third_largest_number(val);

    readline.close();


})

function find_third_largest_number(numberList) {
    const split = numberList.split(',');


    if(split.length!==0){
        if(isNumberArray(split)){
           sortArray(split);
          console.log("Third Largest Number is - "+split[split.length-3]);
        }else{
            console.log("Invalid Input.You can enter only Number List");
        }
    }else{
        console.log("Empty Input");
    }

}
//Sorting Algorithm....We can use in build sort method instead of custom created sort method for sorting

function sortArray(array){

    const n = array.length;
    let temp = 0;


    for (var i = 0; i < n; i++) {
        for (var j = 1; j < (n - i); j++) {
            if (array[j - 1] > array[j]) {
                temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }

        }
    }

}

function isNumberArray(array){

    isNumber=true;
    for (var i=0; i<array.length; i++){
       if(isNaN(array[i]) || !array[i].trim()){

           isNumber=false;
           return isNumber;
       }
    }
    return isNumber;
}

