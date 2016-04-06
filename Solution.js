function processData(input) {
   
    var arr = input.split(/\r?\n/);
  
    var m = arr[0]; 
    var n = arr[1] ;
    var globalIslandValue = 0 ; 
    var localIslandValue = 0 ;
    arr = arr.slice(2).map(line => line.split(" ").map(Number)) ;
    
    for(var i = 0 ; i < m ; i++){
        
        for(var j = 0 ; j < n ; j++){
            
            if(arr[i][j] == 1){
                           
                localIslandValue = fillIsland(arr,m,n,i,j);
                 
            }
            if(globalIslandValue < localIslandValue){
                
                globalIslandValue = localIslandValue ;
                
            }
        }
        
    }
    
    console.log(globalIslandValue) ;
    
} 

function fillIsland(arr,m,n,i,j){
     
    if(i < 0 || j < 0 || i >= m || j >= n){
        
        return 0 ;
        
    }
    else if( arr[i][j] == 1 ){
             
        arr[i][j] = 0 ;
        
        return 1+fillIsland(arr,m,n,i-1,j)   
               +fillIsland(arr,m,n,i-1,j+1) 
               +fillIsland(arr,m,n,i,j+1)   
               +fillIsland(arr,m,n,i+1,j+1) 
               +fillIsland(arr,m,n,i+1,j)   
               +fillIsland(arr,m,n,i+1,j-1)  
               +fillIsland(arr,m,n,i,j+1)    
               +fillIsland(arr,m,n,i-1,j-1) ;
        
    }
    
    return 0 ;
    
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
