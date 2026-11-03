package com.aspose.slides.internal.i7;

import java.util.ArrayList;
import java.util.List;

public class l6 {
   private String n5;
   private String l6;
   private long k5;
   private String u3;
   private List<k5> a6 = new ArrayList<>();
   private t2 u9;

   public static l6 n5(String var0) throws com.aspose.slides.internal.y7.a6 {
      com.aspose.slides.internal.y7.k5 var1 = com.aspose.slides.internal.y7.u3.n5().n5(var0);
      return n5(var1);
   }

   public static l6 n5(com.aspose.slides.internal.y7.k5 var0) {
      l6 var1 = new l6();
      var1.n5 = var0.a6("id");
      var1.l6 = var0.a6("object");
      var1.k5 = var0.k5("created");
      var1.u3 = var0.a6("model");
      if (var0.u9("choices")) {
         for (Object var3 : var0.n5("choices")) {
            if (var3 instanceof com.aspose.slides.internal.y7.k5) {
               var1.a6.add(com.aspose.slides.internal.i7.k5.n5((com.aspose.slides.internal.y7.k5)var3));
            }
         }
      }

      if (var0.u9("usage")) {
         var1.u9 = t2.n5(var0.u3("usage"));
      }

      return var1;
   }

   public List<k5> n5() {
      return this.a6;
   }
}
