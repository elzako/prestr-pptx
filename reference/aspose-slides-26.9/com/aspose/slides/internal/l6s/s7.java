package com.aspose.slides.internal.l6s;

import com.aspose.slides.internal.e3j.a6$n5;
import java.awt.geom.AffineTransform;
import java.util.Iterator;

public class s7 implements com.aspose.slides.internal.w9n.n5 {
   private final com.aspose.slides.internal.o8r.k5 n5;

   public s7(float var1, AffineTransform var2) {
      this.n5 = new com.aspose.slides.internal.o8r.k5(var1, var2);
   }

   @Override
   public void n5(com.aspose.slides.internal.t9z.k5 var1, com.aspose.slides.internal.z3o.u9 var2, a6$n5 var3) {
      if (var3 == a6$n5.n5) {
         this.n5(var1, var2.l6.l6(), var2.l6.k5(), var2.k5.n5, var2.k5.l6, var2.k5.k5, var2.k5.u3);
      } else {
         this.n5(var1, var2.l6.l6(), var2.l6.k5(), -var2.k5.n5, -var2.k5.l6, -var2.k5.k5, -var2.k5.u3);
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.t9z.k5 var1, com.aspose.slides.internal.z3o.u9 var2, a6$n5 var3) {
      if (var3 == a6$n5.n5) {
         this.n5(var1, var2.l6.l6(), var2.l6.k5(), -var2.k5.n5, -var2.k5.l6, -var2.k5.k5, -var2.k5.u3);
      } else {
         this.n5(var1, var2.l6.l6(), var2.l6.k5(), var2.k5.n5, var2.k5.l6, var2.k5.k5, var2.k5.u3);
      }
   }

   protected void n5(com.aspose.slides.internal.t9z.k5 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      com.aspose.slides.internal.o8r.n5 var8 = new com.aspose.slides.internal.o8r.n5(this.n5, var4, var5, var6, var7, false);
      this.n5(var1, var2, var3, var8.l6(), var8.n5());
   }

   private void n5(com.aspose.slides.internal.t9z.k5 var1, float var2, float var3, boolean var4, com.aspose.slides.internal.v9l.k5 var5) {
      x8 var6 = new x8(this, var1, var2, var3);
      Iterator var7 = var4 ? var5.h0() : var5.u9();

      while (var7.hasNext()) {
         com.aspose.slides.internal.v9l.l6 var8 = (com.aspose.slides.internal.v9l.l6)var7.next();
         var8.n5(var6);
      }
   }
}
