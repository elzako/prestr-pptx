package com.aspose.slides.internal.i7;

import java.util.ArrayList;
import java.util.List;

public class n5 {
   private String n5;
   private List<u9> l6 = new ArrayList<>();

   public void n5(String var1) {
      this.n5 = var1;
   }

   public List<u9> n5() {
      return this.l6;
   }

   public void n5(List<u9> var1) {
      this.l6 = var1;
   }

   public String l6() {
      com.aspose.slides.internal.y7.u9 var1 = com.aspose.slides.internal.y7.c8.n5().l6().n5("model", this.n5).l6("messages");

      for (u9 var3 : this.l6) {
         var1.l6().n5("role", var3.n5()).n5("content", var3.l6()).k5();
      }

      var1.k5().k5();
      return var1.n5();
   }
}
