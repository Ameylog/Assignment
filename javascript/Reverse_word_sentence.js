
function reverseInWord(str) {
    
    let words = [];
    words = str.match(/\S+/g);
  
    let result = "";
    for (let i = 0; i < words.length; i++) {
        result += words[i].split('').reverse().join('')+" ";
    }
    return result;
}

const str="This is a sunny day";

console.log(reverseInWord(str))