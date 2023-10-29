// sorting an array in descending

const arr = [1, 2, 5, 4, 3, 6, 7];

function fun(arr) {

    for (let i = 0; i < arr.length; i++) {
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[i] < arr[j]) {
                let temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
    console.log("Deceding order of arr is:- ",arr)
}

fun(arr);
