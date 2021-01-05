class Pattern14 
{
       public static void main(String[] args) 
         { 
                int i,j,k,star1 = 0,space1= 4,star2 = 4,space2 = 0,space3 = 3,star3 = 3;
                for (i = 1; i<= 4; i++) { 
                    (space1)--;
                    (star1)++;
                    for (j = 1; j<= space1; j++) {  
                        System.out.print("  ");  
                    }   
                    for (k = 1; k <= star1; k++) {  
                        System.out.print("* ");  
                    } 
                    if(i >= 3 || i >=4 ){ 
                  for(j = 1;j<=3;j++){
                      System.out.print("* ");
                  }
                  }
                  else{
                  for(k = 1;k <= 7;k++){
                      System.out.print(" ");
                  }
                  }
                     System.out.println ("");  
                }    
                for (i = 1; i<= 3; i++) {  
                    (space2)++;
                    (star2)--;                                    
                    for (j = 1; j<= space2; j++) {  
                        System.out.print("  ");  
                    }    
                    for (k = 1; k<= star2; k++) {  
                        System.out.print("* ");  
                    } 
                    if(i <= 1 ){ 
                  for(j = 1;j<=3;j++){
                      System.out.print("* ");
                  }
                  }
                  else{
                  for(k = 1;k <= 7;k++){
                      System.out.print(" ");
                  }
                  }  
                    System.out.println("");  
                } 
               
               
          }
}
       
            