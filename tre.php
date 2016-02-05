<?php

$t = trim(fgets(STDIN));

$allUser = array();
$tranArray = array();


while($t--){
    
    $inp = preg_split("/\s/", fgets(STDIN));
    
    $N = trim($inp[0]);
    $tran = trim($inp[1]);
    
    while($N--){
        $temp = trim(fgets(STDIN));
        $allUser[$temp][0] = 0;
        $allUser[$temp][1] = 0;
    }
    
    while($tran--){
        $spender = trim(fgets(STDIN));
        $spent = trim(fgets(STDIN));
        $totalUsr = trim(fgets(STDIN));
        $i=$totalUsr;
        $spenUsr = array();
        while($i--){
            array_push($spenUsr,trim(fgets(STDIN)));
        }
        $i = $totalUsr +1;
        $contrAmt = floor($spent / floatval($i)) * $i;
        
        $dividend = $contrAmt / $i;
        
        foreach ($spenUsr as $value) {
            $allUser[$value][0] = $allUser[$value][0] + $dividend;
        }
        $allUser[$spender][0] = $dividend + ($spent - $contrAmt);
        $allUser[$spender][1] = $allUser[$spender][1]+ $spent;
    }
   
    foreach ($allUser as $key => $value) {       
        foreach ($value as $value1){
            
            
            
        }
    }
   
}