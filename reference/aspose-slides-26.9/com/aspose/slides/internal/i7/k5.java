package com.aspose.slides.internal.i7;

public class k5 {
   private u9 n5;
   private String l6;
   private int k5;

   public static k5 n5(com.aspose.slides.internal.y7.k5 var0) {
      k5 var1 = new k5();
      if (var0.u9("message")) {
         var1.n5 = u9.n5(var0.u3("message"));
      }

      var1.l6 = var0.a6("finish_reason");
      var1.k5 = var0.l6("index");
      return var1;
   }

   public u9 n5() {
      return this.n5;
   }
}
