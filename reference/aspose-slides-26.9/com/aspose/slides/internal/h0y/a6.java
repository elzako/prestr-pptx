package com.aspose.slides.internal.h0y;

import com.aspose.slides.internal.r5w.x8;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;
import java.awt.Shape;
import java.awt.geom.Path2D.Double;

public class a6 extends n5 {
   private final com.aspose.slides.internal.h2v.k5 l6;

   public a6(x8 var1) {
      super(var1);
      this.l6 = new com.aspose.slides.internal.h2v.l6(var1);
   }

   public void n5(com.aspose.slides.internal.o9b.u3 var1, s7 var2) {
      this.n5(new u9(var1, var2));
   }

   @Override
   protected void n5(u9 var1, m1 var2, m1 var3) {
      com.aspose.slides.internal.o9b.u3 var4 = var1.l6;
      com.aspose.slides.internal.c9b.n5 var5 = var1.k5.l6();
      Shape var6 = this.l6.n5(var2, var5);
      this.n5(var4, var2, var3, var5, var6, this.l6);
   }

   protected void n5(com.aspose.slides.internal.o9b.u3 var1, m1 var2, m1 var3, Shape var4, Shape var5, com.aspose.slides.internal.h2v.k5 var6) {
      Shape var7 = this.n5.z8().getClip();

      try {
         this.n5.z8().setClip(this.n5(var7));
         var6.l6();
         com.aspose.slides.internal.k6r.k5 var8 = new com.aspose.slides.internal.k6r.k5(this.n5, var2, var1, var3, var4, var5, var6);
         com.aspose.slides.internal.k6r.a6.n5(var8).n5(var8);
      } finally {
         this.n5.z8().setClip(var7);
      }
   }

   private Shape n5(Shape var1) {
      if (var1 == null) {
         return null;
      }

      Shape var2 = new Double(var1);
      var2 = this.l6.n5(var2);
      return com.aspose.slides.internal.d1z.u3.k5(var2);
   }
}
