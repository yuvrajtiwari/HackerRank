function processData(input) {
    //Enter your code here
    
    var inputArray = input.split(/\r?\n/);
    var convertSteps = 0 ;
    var T = inputArray[0] ;
    
    for(var i = 1 ; i <= T ; i++){
        
        var string = inputArray[i] ;
        
        var charArray = string.split("");
      //  console.log(charArray);
        convertSteps = 0 ;
        
        for(var j = 0 ; j < charArray.length ; j++){
            
            var a = charArray[j] ; var b = charArray[charArray.length-1 - j] ;
            var charA = parseInt(a.charCodeAt(0)) ; var charB = parseInt(b.charCodeAt(0));
          // console.log("start " + convertSteps);
            if( a==b ){
                //console.log("a == b") ;
                continue ;
               // console.log("a == b") ;
            }
            else if(a>b){
                    // console.log("a > b " + convertSteps);
                    convertSteps =  convertSteps + (charA - charB) ;
                    charArray[j] = String.fromCharCode(charB);
                   // console.log("a > b.. Steps are-- "+ convertSteps ) ;
                
            }
            else{
                // console.log("a < b " + convertSteps);
                   convertSteps = convertSteps + (charB - charA) ;
                    charArray[charArray.length-1 - j] = String.fromCharCode(charA);
                  //  console.log("a < b") ;
            }
           
        }
        
         console.log(convertSteps);
        
        
        
    }
    
    
    
    //console.log(input);
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
