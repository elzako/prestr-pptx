package com.aspose.slides.internal.a9y;

import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import java.awt.Shape;
import java.awt.font.TextLayout;
import java.awt.font.TextMeasurer;

public class n5 implements l6 {
   private final com.aspose.slides.internal.p5x.n5 n5;
   private final TextMeasurer l6;
   private TextLayout k5;
   private final int u3;
   private final int a6;

   public n5(com.aspose.slides.internal.p5x.n5 var1, TextMeasurer var2, int var3, int var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.u3 = var3;
      this.a6 = var4;
   }

   @Override
   public void n5(z1 var1, float var2, float var3) {
      this.l6().draw(var1.z8(), var2, var3);
   }

   @Override
   public Shape n5(m1 var1) {
      return this.l6().getOutline(var1.t2());
   }

   @Override
   public float n5() {
      return this.l6 != null ? this.l6().getVisibleAdvance() : this.n5.n5(this.u3, this.a6);
   }

   private TextLayout l6() {
      if (this.k5 == null) {
         this.k5 = this.l6.getLayout(this.u3, this.a6);
      }

      return this.k5;
   }
}
