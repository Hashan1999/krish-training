

const readline = require("readline").createInterface({
   input:process.stdin,
    output:process.stdout
})


readline.question("Enter two words for check anagrams(Example Input :- Tab,Bat)  ", val => {
    const input = val.split(',');

    if(input.length===2){
       anagram_finder(input[0],input[1]);
    }else{
        console.log('Invalid word count for check anagrams');
    }

readline.close();


})



function anagram_finder(word1,word2) {
    let valid_data;
    let output_message;

    //Validations
    if(!word1.trim()){
       valid_data=false;
      output_message='Invalid First Word Input';
   }else if(!word2.trim()){
       valid_data=false;
        output_message='Invalid Second Word Input';
    }else{
        valid_data=true;
    }



   if(valid_data){
       const first_word = Array.from(word1.toLowerCase());
       const second_word = Array.from(word2.toLowerCase());

       sortArray(first_word);
       sortArray(second_word);

       if(first_word.toString()===second_word.toString()){
           console.log(word1+' and '+word2+' are Anagrams');
       }else{
           console.log(word1+' and '+word2+' are Not Anagrams');
       }
   }else{
       console.log(output_message);
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



