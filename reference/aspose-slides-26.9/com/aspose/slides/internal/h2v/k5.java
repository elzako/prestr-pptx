package com.aspose.slides.internal.h2v;

import com.aspose.slides.internal.c9b.u3;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.r5w.c8;
import com.aspose.slides.internal.r5w.x8;
import com.aspose.slides.internal.x4g.m1;
import java.awt.Shape;

public class k5 {
   private static final m1 l6 = new m1(1.0F, 0.0F, 0.0F, 1.0F, 0.5F, 0.5F);
   protected final z1 n5;

   public k5(z1 var1) {
      this.n5 = var1;
   }

   public final void l6() {
      this.k5();
      this.n5();
   }

   public Shape n5(m1 var1, Shape var2) {
      return u3.n5(var1, var2);
   }

   protected void k5() {
      if (this.n5 != null) {
         this.n5.z8().setRenderingHint(c8.u3, this);
      }
   }

   protected void n5() {
   }

   public Shape n5(Shape var1) {
      return this.u3() ? u3.n5(l6, var1) : var1;
   }

   protected boolean u3() {
      x8 var1 = (x8)this.n5;
      return var1.r4();
   }
}
