package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

public class j5 extends y4 {
   public j5(com.aspose.slides.internal.v4.y4 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      y2 var3 = null;
      t1 var4 = new t1(0);
      List var5 = new List();

      while (var1.l6()) {
         j8 var6 = (j8)var1.k5();
         if (com.aspose.slides.internal.v6g.k5.l6(var6, f0.class)) {
            j8 var7 = var6.k5();
            if (var7.u3() != this) {
               var5.addItem(var7);
               var3 = var7.u3();
            }
         }
      }

      w2 var9 = new w2(new com.aspose.slides.internal.r4.u3(var5));

      y2 var8;
      while ((var8 = var9.u9()) != null) {
         var4.n5(128, var2.k5() && var8 == var3);
         var8.n5(var9, var4);
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      var1.n5(4);
      this.u3.l6(var1);
   }

   @Override
   public s3 a5() {
      return this.z7();
   }

   @Override
   public s3 v0() {
      return s3.n5;
   }

   @Override
   public s3 h2() {
      return s3.n5;
   }
}
