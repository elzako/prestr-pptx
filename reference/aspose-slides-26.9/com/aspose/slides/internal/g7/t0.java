package com.aspose.slides.internal.g7;

public class t0 extends b0 {
   public t0(y7 var1) {
      super(var1);
   }

   @Override
   public void n5(v2 var1, k6 var2, i7 var3) {
      var2.n5(var1);
      var2.n5(var1.a6(), var1.u9());
      y7 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, y7.class);
      if (var4 != null) {
         for (Object recoveredElement$var6$341 : var2.u9().n5()) {
            q9 var6 = (q9)recoveredElement$var6$341;
            j0 var7;
            if ((var7 = com.aspose.slides.internal.v6g.k5.n5(var6, j0.class)) != null) {
               var4.n5(var7);
            } else {
               f7 var8;
               if ((var8 = com.aspose.slides.internal.v6g.k5.n5(var6, f7.class)) != null) {
                  var4.n5(var8);
               } else {
                  z5 var9;
                  if ((var9 = com.aspose.slides.internal.v6g.k5.n5(var6, z5.class)) != null) {
                     var4.n5(var9);
                  } else if (com.aspose.slides.internal.v6g.k5.l6(var6, b5.class)) {
                     var4.n5();
                  }
               }
            }
         }
      }
   }
}
