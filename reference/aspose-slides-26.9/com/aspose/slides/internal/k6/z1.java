package com.aspose.slides.internal.k6;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.q1;

public abstract class z1 extends l6 {
   @Override
   public void k5(b3 var1, com.aspose.slides.internal.x3.a6 var2) {
      com.aspose.slides.internal.a4.z3 var3 = (com.aspose.slides.internal.a4.z3)var1;
      var2.u3(var3.u3() & 255);
      var2.n5(var3.c8(), var3.k5());
      e5 var4 = null;
      if (var3.t2() != -1) {
         var2.a6(var3.t2());
         var4 = var2.n3();
      }

      y1 var5 = var3.x8().n5().y4();
      com.aspose.slides.internal.o9b.n3 var6 = this.n5(var2.t2(), var2, var1.z1());
      this.n5(var3, var5.y4(), var6, var4, var2);
   }

   protected abstract void n5(
      com.aspose.slides.internal.a4.z3 var1, y1 var2, com.aspose.slides.internal.o9b.n3 var3, e5 var4, com.aspose.slides.internal.x3.a6 var5
   );

   private com.aspose.slides.internal.o9b.n3 n5(
      com.aspose.slides.internal.o9b.n3 var1, com.aspose.slides.internal.x3.a6 var2, com.aspose.slides.internal.p9.n5 var3
   ) {
      double var4;
      if (var1.y4() <= 2) {
         if (var2.z3() <= 2) {
            var4 = var1.c8();
         } else {
            var4 = var1.c8() * (var3.n5().s7() / 96.0F);
         }
      } else if (var1.y4() > 3 || var3.n5().u3()) {
         float var6 = n5(var2, var3);
         float var7 = var1.c8() / var2.q0() * var6;
         var4 = n5(var1.y4(), var2.z3(), var7);
         var4 = n5(2, var2.z3(), var4);
      } else if (var2.a6().l6()) {
         var4 = var1.c8() * var2.q0() * 96.0F / 72.0F;
      } else {
         var4 = var1.c8() * var2.q0() * (var3.n5().s7() / 72.0F);
      }

      return com.aspose.slides.internal.b0.l6.n5(var1.l6().a6(), (float)var4, var1.x8(), var2.z3() == 1 ? 2 : var2.z3());
   }

   public static double n5(int var0, int var1, double var2) {
      double var4 = var2;
      switch (var1) {
         case 0:
         case 1:
         case 2:
            var4 *= 96.0;
            break;
         case 3:
            var4 *= 72.0;
         case 4:
            break;
         case 5:
            var4 *= 300.0;
            break;
         case 6:
            var4 *= 25.4F;
            break;
         default:
            throw new ArgumentException("Invalid target GraphicsUnit");
      }

      switch (var0) {
         case 0:
         case 1:
         case 2:
            var4 /= 96.0;
            break;
         case 3:
            var4 /= 72.0;
         case 4:
            break;
         case 5:
            var4 /= 300.0;
            break;
         case 6:
            var4 /= 25.4F;
            break;
         default:
            throw new ArgumentException("Invalid source GraphicsUnit");
      }

      return var4;
   }

   private static float n5(com.aspose.slides.internal.x3.a6 var0, com.aspose.slides.internal.p9.n5 var1) {
      if (var0 != null && var1 != null && var1.n5() != null) {
         if (var0.z3() != 2 && var1.n5().u3()) {
            float var2 = 96.0F;
            float var3 = q1.n5((float)(1.0F), (float)(var1.n5().s7()));
            return var3 / 96.0F;
         } else {
            return 1.0F;
         }
      } else {
         return 1.0F;
      }
   }
}
