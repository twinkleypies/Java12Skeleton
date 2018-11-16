//ensures index file runs first before the function ready causing an error
document.addEventListener('DOMContentLoaded', ready);

function ready() {
    //defines variables, gets from index and carries out the function chosen
    let input_one = document.getElementById("input_one");
    let input_two = document.getElementById("input_two");
    input_one.addEventListener("input", changeHandlerOne);
    //makes it so the first text box is equal to the second box but if something's typed in the second box it wont change the info in the first box
    function changeHandlerOne(event) {
        input_two.value = input_one.value;
    }
}