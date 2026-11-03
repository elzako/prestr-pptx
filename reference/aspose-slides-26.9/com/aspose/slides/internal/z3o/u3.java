package com.aspose.slides.internal.z3o;

import com.aspose.slides.internal.o9b.w1;
import java.util.Iterator;

public class u3 implements com.aspose.slides.internal.t9z.k5 {
   private com.aspose.slides.internal.x7u.u9 n5;
   private h0 l6;
   private w1 k5;
   private w1 u3;

   public u3(com.aspose.slides.internal.x7u.u9 var1) {
      this.n5 = var1;
      this.l6 = new h0();
   }

   public u9 n5(com.aspose.slides.internal.v9l.k5 var1) {
      this.k5 = new w1(0.0F, 0.0F);
      this.u3 = null;
      Iterator var2 = var1.c8().u9();

      while (var2.hasNext()) {
         com.aspose.slides.internal.v9l.l6 var3 = (com.aspose.slides.internal.v9l.l6)var2.next();
         var3.n5(this);
         if (this.u3 != null) {
            break;
         }
      }

      return this.u3 == null ? null : u9.n5(this.n5, this.k5, this.u3);
   }

   @Override
   public void n5(float var1, float var2) {
      this.k5.n5(var1);
      this.k5.l6(var2);
   }

   @Override
   public void l6(float var1, float var2) {
      float[] var3 = this.l6.n5(this.k5.l6(), this.k5.k5(), var1, var2);
      this.u3 = new w1(-var3[0], -var3[1]);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      float[] var5 = this.l6.n5(this.k5.l6(), this.k5.k5(), var1, var2, var3, var4);
      this.u3 = new w1(-var5[0], -var5[1]);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      float[] var7 = this.l6.n5(this.k5.l6(), this.k5.k5(), var1, var2, var3, var4, var5, var6);
      this.u3 = new w1(-var7[0], -var7[1]);
   }

   @Override
   public void n5() {
   }

   @Override
   public void l6() {
   }
}
