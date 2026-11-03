package com.aspose.slides.internal.f1s;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.internal.z4.a0;
import com.aspose.slides.internal.z4.s3;
import com.aspose.slides.internal.z4.y1;
import com.aspose.slides.ms.System.q1;

public class h0 {
   private final com.aspose.slides.internal.z4.c8 n5;
   private final a0 l6;
   private final y1 k5;
   private static final float[] u3 = new float[0];
   private static final float[] a6 = new float[]{3.0F, 1.0F};
   private static final float[] u9 = new float[]{1.0F, 1.0F};
   private static final float[] h0 = new float[]{3.0F, 1.0F, 1.0F, 1.0F};
   private static final float[] c8 = new float[]{3.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F};

   public h0(com.aspose.slides.internal.z4.c8 var1, y1 var2, a0 var3) {
      this.n5 = var1;
      this.k5 = var2;
      this.l6 = var3;
   }

   public final void n5(com.aspose.slides.internal.w0.s7 var1) {
      this.n5(var1.u9(), true);
      this.n5.x8().k5(var1.l6(), this.l6);
      int var2 = l6(var1);
      this.n5.x8().l6(var2, this.l6);
      int var3 = k5(var1);
      this.n5.x8().k5(var3, this.l6);
      if (var1.a6() == 3) {
         this.n5.x8().u3(var1.h0(), this.l6);
      }

      if (var1.s7() != 0) {
         int var4 = 0;
         if (var2 == 0) {
            var4 = u3(var1);
            this.n5.x8().l6(var4, this.l6);
         }

         float[] var5 = n5(var1, var2 != 0 || var4 != 0);
         n5(var5, var1.c8(), this.l6);
      }
   }

   private static void n5(float[] var0, float var1, a0 var2) {
      var2.n5(var0);
      var2.n5(" ");
      var2.n5(s3.l6(var1));
      var2.n5(" d ");
   }

   public final void n5(com.aspose.slides.internal.w0.l6 var1, boolean var2) {
      switch (var1.n5()) {
         case 0:
            this.n5((com.aspose.slides.internal.w0.n3)var1, var2);
            break;
         default:
            s7 var3 = this.k5.n5(var1, this.n5.x8().l6().l6().k5());
            this.n5.x8().n5(com.aspose.slides.internal.f1s.l6.u3(), var2, this.l6);
            this.l6.k5("/{0} {1}", var3.x8(), var2 ? "SCN" : "scn");
      }
   }

   public final void n5(float var1, float var2) {
      k5 var3 = this.n5.k5().n5(0.0F, 0.0F, true);
      this.l6.l6("/{0} gs", var3.x8());
   }

   private void n5(com.aspose.slides.internal.w0.n3 var1, boolean var2) {
      com.aspose.slides.internal.p1s.n5 var3 = var1.l6();
      if (this.n5.e2() && var1.l6().l6() < 255) {
         var3 = com.aspose.slides.internal.p1s.n5.n5(var3, new com.aspose.slides.internal.p1s.n5(255, 255, 255, 255));
      }

      this.n5.x8().n5(var3, var2, this.l6);
   }

   public final void n5(
      byte[] var1, com.aspose.slides.internal.s5.c8 var2, com.aspose.slides.internal.o9b.y1 var3, com.aspose.slides.internal.s5.a6 var4, boolean var5
   ) {
      this.n5.x8().n5(this.l6);
      com.aspose.slides.internal.w0.c8 var6;
      if (var5) {
         var6 = new com.aspose.slides.internal.w0.c8(var3.s7(), 0.0F, 0.0F, -var3.k5(), var3.x8(), var3.n3() + var3.k5());
      } else {
         var6 = new com.aspose.slides.internal.w0.c8(var3.s7(), 0.0F, 0.0F, var3.k5(), var3.x8(), var3.n3());
      }

      this.n5.x8().n5(var6, this.l6);
      com.aspose.slides.internal.k0t.l6 var7 = this.k5.n5(var1, var2, var4);
      this.l6.k5("/{0} Do", var7.x8());
      this.n5.x8().l6(this.l6);
   }

   private static int l6(com.aspose.slides.internal.w0.s7 var0) {
      switch (var0.k5()) {
         case 1:
            return 2;
         case 2:
            return 1;
         default:
            switch (var0.u3()) {
               case 1:
                  return 2;
               case 2:
                  return 1;
               default:
                  return 0;
            }
      }
   }

   private static int k5(com.aspose.slides.internal.w0.s7 var0) {
      switch (var0.a6()) {
         case 1:
            return 2;
         case 2:
            return 1;
         default:
            return 0;
      }
   }

   private static int u3(com.aspose.slides.internal.w0.s7 var0) {
      switch (var0.t2()) {
         case 2:
            return 1;
         default:
            return 0;
      }
   }

   private static float[] n5(com.aspose.slides.internal.w0.s7 var0, boolean var1) {
      float[] var2;
      switch (var0.s7()) {
         case 0:
            var2 = u3;
            break;
         case 1:
            var2 = a6;
            break;
         case 2:
            var2 = u9;
            break;
         case 3:
            var2 = h0;
            break;
         case 4:
            var2 = c8;
            break;
         case 5:
            var2 = var0.x8();
            break;
         default:
            throw new InvalidOperationException("Unknown dash style.");
      }

      float[] var3 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(var2)).deepClone(), float[].class);
      n5(var0, var3, var1);
      return var3;
   }

   private static void n5(com.aspose.slides.internal.w0.s7 var0, float[] var1, boolean var2) {
      float var3 = q1.n5(var0.l6(), 1.0F);

      for (int var4 = 0; var4 < var1.length; var4++) {
         if (t4.n5(var4)) {
            float var5 = var1[var4];
            if (var2) {
               var5++;
            }

            var1[var4] = var5 * var3;
         } else {
            float var6 = var1[var4];
            if (var2) {
               var6--;
            }

            var1[var4] = var6 * var3;
         }
      }
   }
}
