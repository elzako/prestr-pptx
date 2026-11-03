package com.aspose.slides.internal.w4c;

import com.aspose.slides.internal.e3j.u3;
import com.aspose.slides.internal.e3j.u9;
import com.aspose.slides.internal.o9b.w1;

public class n5 implements l6 {
   private final w1 a6;
   private final w1 u9;
   private final w1 h0;
   private final w1 c8;
   private final w1 t2;
   public final boolean n5;
   public final w1 l6;
   public final u3 k5;
   public final u3 u3;

   public n5(w1 var1, w1 var2, w1 var3, w1 var4) {
      this.a6 = var1;
      this.u9 = var2;
      this.h0 = var3;
      this.c8 = this.n5(var1, var2, var4);
      this.t2 = this.n5(var1, var3, var4);
      this.n5 = com.aspose.slides.internal.e3j.u9.n5(this.c8, this.t2, 0.1F);
      if (this.n5) {
         this.l6 = this.c8;
      } else {
         u3 var5 = new u3(this.u9, this.c8);
         u3 var6 = new u3(this.h0, this.t2);
         if (var5.l6(var6)) {
            float var7 = (this.c8.l6() + this.t2.l6()) / 2.0F;
            float var8 = (this.c8.k5() + this.t2.k5()) / 2.0F;
            this.l6 = new w1(var7, var8);
         } else {
            this.l6 = var5.n5(var6);
         }
      }

      this.k5 = new u3(this.u9, this.h0);
      this.u3 = new u3(this.c8, this.t2);
   }

   @Override
   public boolean n5(double var1, double var3) {
      return this.k5(var1, var3) || this.u3(var1, var3);
   }

   @Override
   public boolean l6(double var1, double var3) {
      return false;
   }

   public boolean k5(double var1, double var3) {
      return com.aspose.slides.internal.e3j.u9.n5(this.a6, this.c8, this.t2, var1, var3);
   }

   public boolean u3(double var1, double var3) {
      return com.aspose.slides.internal.e3j.u9.n5(this.c8, this.u9, this.h0, var1, var3)
         || com.aspose.slides.internal.e3j.u9.n5(this.c8, this.h0, this.t2, var1, var3);
   }

   private w1 n5(w1 var1, w1 var2, w1 var3) {
      w1 var4 = new w1();
      var4.n5(this.n5(var1.l6(), var2.l6(), var3.l6()));
      var4.l6(this.n5(var1.k5(), var2.k5(), var3.k5()));
      return var4;
   }

   private float n5(float var1, float var2, float var3) {
      var3 = Math.max(0.0F, Math.min(var3, 1.0F));
      if (var1 > var2) {
         float var6 = var1 - var2;
         return var1 - var3 * var6;
      } else {
         float var4 = var2 - var1;
         return var1 + var3 * var4;
      }
   }
}
