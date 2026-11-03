package com.aspose.slides.internal.p5x;

import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.q9r.c8;
import com.aspose.slides.ms.System.t9;

public class k5 implements n5 {
   private final String n5;
   private final k5$n5 l6;
   private final k5$n5 k5;
   private final float[] u3;

   public k5(String var1, n3 var2, n3 var3) {
      this.n5 = var1;
      this.l6 = new k5$n5(this, var2);
      this.k5 = var3 != null ? new k5$n5(this, var3) : null;
      this.u3 = new float[var1.length() + 1];
      float var4 = 0.0F;
      int var5 = (int)(k5$n5.n5(this.l6) / 512.0F * 10.0F);
      if (var2.h0().equals("Gulim")) {
         var5 /= 2;
      }

      float var6 = com.aspose.slides.internal.f3l.k5.n5(k5$n5.l6(this.l6), k5$n5.n5(this.l6), var5);

      for (int var7 = 0; var7 < var1.length(); var7++) {
         float var8 = this.n5(var1.charAt(var7));
         if ((var2.x8() & 1) == 1 && var2.l6().l6(var2.x8()).n5().equals("Regular")) {
            var8 += var6;
         }

         var4 += var8;
         this.u3[var7 + 1] = var4;
      }
   }

   @Override
   public float n5(int var1, int var2) {
      return this.u3[var2] - this.u3[var1];
   }

   @Override
   public int n5(int var1, float var2) {
      int var3 = this.n5.length();

      for (int var4 = var1; var4 < var3; var4++) {
         float var5 = this.u3[var4 + 1] - this.u3[var1];
         if (var5 > var2) {
            return var4;
         }
      }

      return var3;
   }

   private float n5(char var1) {
      if (var1 != '\t' && !Character.isIdentifierIgnorable(var1)) {
         c8 var2 = null;
         if (this.k5 != null && k5$n5.k5(this.k5) != null) {
            var2 = k5$n5.k5(this.k5).n5(var1);
            if (var2 != null) {
               return this.n5(k5$n5.l6(this.k5), k5$n5.n5(this.k5), var2);
            }
         }

         if (k5$n5.k5(this.l6) != null) {
            var2 = k5$n5.k5(this.l6).n5(var1);
            if (var2 != null) {
               return this.n5(k5$n5.l6(this.l6), k5$n5.n5(this.l6), var2);
            }
         }

         return this.k5 != null ? k5$n5.u3(this.k5) : (t9.y4(var1) ? k5$n5.u3(this.l6) / 2.0F : k5$n5.u3(this.l6));
      } else {
         return 0.0F;
      }
   }

   private float n5(float var1, float var2, c8 var3) {
      return com.aspose.slides.internal.f3l.k5.n5(var1, var2, var3 == null ? 1 : var3.k5());
   }

   // $VF: synthetic method
   static float n5(k5 var0, float var1, float var2, c8 var3) {
      return var0.n5(var1, var2, var3);
   }
}
