package com.aspose.slides.internal.h0y;

import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.r5w.x8;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.n3;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

abstract class n5 {
   protected final x8 n5;

   n5(x8 var1) {
      this.n5 = var1;
   }

   protected void n5(u9 var1) {
      Graphics2D var2 = this.n5.z8();
      com.aspose.slides.internal.o9b.u3 var3 = var1.l6;
      m1 var4 = var3.k5();
      k5 var5 = new k5(this.n5, var2, var3);

      try {
         m1 var6 = this.n5(var2);
         this.n5(var3, var6);
         if (var3 instanceof u6) {
            ((u6)var3).l6(this.n5.t9());
         }

         this.n5(var1, var6, var4);
      } finally {
         var5.n5(this.n5, var2, var3);
      }
   }

   protected abstract void n5(u9 var1, m1 var2, m1 var3);

   private m1 n5(Graphics2D var1) {
      this.n5.w1();
      m1 var2 = m1.n5(this.n5.j5());
      m1 var3 = m1.n5(var1.getTransform());
      var2.n5(var3, 1);
      var1.setTransform(m1.k5(m1.n5));
      return var2;
   }

   private void n5(com.aspose.slides.internal.o9b.u3 var1, m1 var2) {
      this.n5(var1);
      if (!(var1 instanceof n3)) {
         m1 var3 = var1.k5();
         var3.n5(var2, 1);
         if (var3.k5()) {
            var1.n5(var3);
         } else if (var2.k5()) {
            var1.n5(var2);
         }
      }
   }

   private void n5(com.aspose.slides.internal.o9b.u3 var1) {
      m1 var2 = var1.k5();
      float var3 = (float)var2.t2().getScaleX();
      float var4 = (float)var2.t2().getScaleY();
      if (Float.isInfinite(var3) && Float.isInfinite(var4)) {
         var3 = var3 < 0.0F ? -1.0F : 1.0F;
         var4 = var4 < 0.0F ? -1.0F : 1.0F;
         AffineTransform var5 = var2.t2();
         AffineTransform var6 = new AffineTransform(var3, var5.getShearY(), var5.getShearX(), var4, var5.getTranslateX(), var5.getTranslateY());
         var1.n5(m1.n5(var6));
      }
   }
}
