package com.aspose.slides.internal.p1s;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.e1x.o0;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.t9;

public class l6 {
   private i1 n5;
   private float l6;
   private int k5;
   private float u3;
   private float a6;
   private float u9;
   private int h0;
   private float c8;

   public l6(float var1, int var2, i1 var3, int var4) {
      if (var3 == null) {
         throw new ArgumentNullException("trueTypeFont");
      }

      this.n5 = var3;
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = this.n5.n5((float)this.n5.s7(), (float)this.l6);
      this.a6 = this.n5.n5((float)this.n5.x8(), (float)this.l6);
      this.u9 = this.n5.n5((float)this.n5.y4(), (float)this.l6);
      this.h0 = var4;
      if (var4 == 2) {
         float var5 = o0.n5(this.n5) * 1000;
         float var6 = o0.l6(this.n5) * 1000;
         var6 += var6 * 0.1F;
         this.c8 = var6 / var5;
      }
   }

   public l6(float var1, int var2, i1 var3) {
      this(var1, var2, var3, 1);
   }

   public final i1 n5() {
      return this.n5;
   }

   public final int l6() {
      return this.k5;
   }

   public final boolean k5() {
      return (this.k5 & 1) != 0;
   }

   public final boolean u3() {
      return (this.k5 & 2) != 0;
   }

   public final int a6() {
      return this.h0;
   }

   public final float u9() {
      return this.c8;
   }

   public final String h0() {
      return this.n5.n5();
   }

   public final float c8() {
      return this.l6;
   }

   public final void n5(float var1) {
      this.l6 = var1;
   }

   public final float t2() {
      return this.u3;
   }

   public final float s7() {
      return this.a6;
   }

   public final float x8() {
      return this.u3 + this.a6;
   }

   public final float n5(char var1) {
      if (this.h0 == 2 && t9.c8(var1)) {
         var1 = t9.m1(var1);
         float var2 = this.n5.n5(var1, this.l6);
         var2 *= 1000.0F;
         var2 *= this.c8;
         return var2 / 1000.0F;
      } else {
         return this.n5.n5(var1, this.l6);
      }
   }

   public final float n5(String var1) {
      return this.h0 == 1 ? this.n5.n5(var1, this.l6) : this.n5(var1, 0, var1.length());
   }

   public final float n5(String var1, int var2, int var3) {
      if (this.h0 == 1) {
         return this.n5.n5(var1, var2, var3, this.l6);
      }

      float var4 = 0.0F;
      u3 var5 = new u3(d1.l6(var1, var2, var3));

      while (var5.hasNext()) {
         if (!var5.n5().n5()) {
            var4 += this.n5.n5(var5.n5().l6(), this.l6) * 1000.0F;
         } else {
            float var6 = this.n5.n5(d1.s7(var5.n5().l6()), this.l6);
            var6 *= 1000.0F;
            var6 *= this.c8;
            var4 += var6;
         }
      }

      return var4 / 1000.0F;
   }

   public final f2 l6(String var1) {
      return new f2(this.n5(var1), this.x8());
   }
}
