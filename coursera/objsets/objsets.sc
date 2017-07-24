package objsets


object objsets {


 		val set1 = new Empty()            //> set1  : objsets.Empty = objsets.Empty@593634ad
    val set2 = set1.incl(new Tweet("a", "a body", 21))
                                                  //> set2  : objsets.TweetSet = objsets.NonEmpty@39ba5a14
    val set3 = set2.incl(new Tweet("b", "b body", 20))
                                                  //> set3  : objsets.TweetSet = objsets.NonEmpty@57829d67
    val c = new Tweet("c", "c body", 77)          //> c  : objsets.Tweet = User: c
                                                  //| Text: c body [77]
    val d = new Tweet("d", "d body", 9)           //> d  : objsets.Tweet = User: d
                                                  //| Text: d body [9]
    val set4c = set3.incl(c)                      //> set4c  : objsets.TweetSet = objsets.NonEmpty@19dfb72a
    val set4d = set3.incl(d)                      //> set4d  : objsets.TweetSet = objsets.NonEmpty@17c68925
    val set5 = set4c.incl(d)                      //> set5  : objsets.TweetSet = objsets.NonEmpty@7e0ea639

		set5.mostRetweeted                //> res0: objsets.Tweet = User: c
                                                  //| Text: c body [77]
		
    val trends = set5.descendingByRetweet         //> trends  : objsets.TweetList = objsets.Cons@3d24753a

    trends foreach println                        //> User: c
                                                  //| Text: c body [77]
                                                  //| User: a
                                                  //| Text: a body [21]
                                                  //| User: b
                                                  //| Text: b body [20]
                                                  //| User: d
                                                  //| Text: d body [9]
}