function getCount($str) {
  $vowelsCount = 0;
  
  for ($i=0; $i<strlen($str); $i++) {
      if ($str{$i}=='a') {
          $vowelsCount++;
      }
      if ($str{$i}=='e') {
          $vowelsCount++;
      }
      if ($str{$i}=='i') {
          $vowelsCount++;
      }
      if ($str{$i}=='o') {
          $vowelsCount++;
      }
      if ($str{$i}=='u') {
          $vowelsCount++;
      }
   }   
      
  
  return $vowelsCount;
}
