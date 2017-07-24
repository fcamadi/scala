package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    //without the r==c it does not work!
    if  (c==0 ||  r==0 || r==c) 1
    else pascal(c-1,r-1) + pascal(c,r-1)
  }
    
   /**
   * Exercise 2
   */
   def balance(chars: List[Char]): Boolean = {
      def aux(bal:Int, chars:List[Char]): Boolean = {
        if (chars.isEmpty) bal==0
        else { 
          if (chars.head==('('))
            aux(bal+1,chars.tail);
          else if (chars.head==(')'))
            //the "bal>0" is necessary for cases like ())( 
            // -> if we get a bal<=0 it is not going to be balanced
            bal>0 && aux(bal-1,chars.tail)
          else
            aux(bal,chars.tail)
        }
      }
      aux(0,chars);
   }    
  
  /**
   * Exercise 3
   */
   def countChange(money: Int, coins: List[Int]): Int = {
    def aux(count:Int, money:Int, coins: List[Int]): Int = {
      if (money<0) count  //we did not "reach" a solution, count is not increased
      else {
        if (coins.isEmpty) {  //if we have no more coins
          if (money==0)	count+1  //and money is 0, we found a solution, so count+1
          else	count            //if not, no solution was found, count is not increased    
        }
        else //search
          aux(count,money-coins.head,coins) + aux(count,money,coins.tail)
    	}
    }
    aux(0,money,coins)
  }      
   
}
