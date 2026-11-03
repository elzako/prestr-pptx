package com.aspose.slides.internal.b5j;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.q1;

public class n3 {
   private final Dictionary<String, Float> l6 = new Dictionary<>();
   private final List<String> k5 = new List<>(com.aspose.slides.ms.System.u3.n5(new String[]{"x", "x1", "x2", "cx", "rx", "width"}));
   private final List<String> u3 = new List<>(com.aspose.slides.ms.System.u3.n5(new String[]{"y", "y1", "y2", "cy", "ry", "height"}));
   private final List<String> a6 = new List<>(com.aspose.slides.ms.System.u3.n5(new String[]{"xy"}));
   private float u9 = 0.0F;
   private float h0 = 0.0F;
   public int n5;

   public static float n5() {
      return (float)com.aspose.slides.internal.n2d.t2.n5;
   }

   public static float l6() {
      return n5() / 96.0F;
   }

   public static float k5() {
      return 96.0F / n5();
   }

   public final float u3() {
      return this.u9;
   }

   public final void n5(float var1) {
      this.u9 = var1;
   }

   public final float a6() {
      return this.h0;
   }

   public final void l6(float var1) {
      this.h0 = var1;
   }

   public final float n5(String var1, String var2, com.aspose.slides.internal.d0e.t2 var3) {
      return this.n5(var1, var2, var3, f2.n5.a6());
   }

   public final float k5(float var1) {
      return var1 * l6();
   }

   public final float n5(String var1, com.aspose.slides.internal.d0e.t2 var2, float var3) {
      float var4 = 0.0F;
      Float[] var5 = new Float[]{var4};
      boolean var6 = this.l6.tryGetValue(var1, var5);
      var4 = var5[0];
      if (var6) {
         return var4;
      }

      com.aspose.slides.internal.b3z.a6 var7 = com.aspose.slides.internal.b3z.a6.n5(var1, com.aspose.slides.internal.b3z.a6.k5(0.0F));

      try {
         float var8 = var7.n5();
         if (q1.n5(var8) <= 1.0F && this.n5 == 1) {
            float var9 = var8 * 100.0F;
            var8 = var9;
            var7.n5(var9);
            var7.n5(2);
         }

         switch (var7.l6()) {
            case 1:
            case 5:
               var8 = this.k5(var8);
               break;
            case 2:
               var8 = var3 * (var8 / 100.0F);
               break;
            case 3:
               var8 *= var3;
               break;
            case 4:
               var8 /= 4.30554F;
               break;
            case 6:
               var8 *= n5() / 2.54F;
               break;
            case 7:
               var8 *= n5() / 25.4F;
               break;
            case 8:
               var8 *= n5();
               break;
            case 9:
               var8 = var8 / 72.0F * n5();
               break;
            case 10:
               var8 = var8 * 12.0F / 72.0F * n5();
            case 11:
            case 12:
            default:
               break;
            case 13:
               var8 *= 10.0F;
         }

         var4 = var8;
      } catch (RuntimeException var10) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var10;
         }

         var4 = 0.0F;
      }

      if (var7.l6() != 2) {
         this.l6.addItem(var1, var4);
      }

      return var4;
   }

   public final float n5(String var1, String var2, com.aspose.slides.internal.d0e.t2 var3, f2 var4) {
      float var5 = 0.0F;
      Float[] var6 = new Float[]{var5};
      boolean var7 = this.l6.tryGetValue(var1, var6);
      var5 = var6[0];
      if (var7) {
         return var5;
      }

      com.aspose.slides.internal.b3z.a6 var8 = com.aspose.slides.internal.b3z.a6.n5(var1, com.aspose.slides.internal.b3z.a6.k5(0.0F));
      var5 = this.n5(var8, var2, var3, var4.a6());
      if (var8.l6() != 2) {
         this.l6.addItem(var1, var5);
      }

      return var5;
   }

   public final float n5(com.aspose.slides.internal.b3z.a6 var1, String var2, com.aspose.slides.internal.d0e.t2 var3, f2 var4) {
      try {
         float var5 = var1.n5();
         if (q1.n5(var5) <= 1.0F && this.n5 == 1) {
            float var6 = var5 * 100.0F;
            var5 = var6;
            var1.n5(var6);
            var1.n5(2);
         }

         switch (var1.l6()) {
            case 1:
            case 5:
               var5 = this.k5(var5);
               break;
            case 2:
               f2 var9 = (var4.n5() ? new f2(this.u9, this.h0) : var4).a6();
               if (this.k5.containsItem(var2)) {
                  var5 = var5 * var9.l6() / 100.0F;
               }

               if (this.u3.containsItem(var2)) {
                  var5 = var5 * var9.k5() / 100.0F;
               }

               if (this.a6.containsItem(var2)) {
                  var5 = var5 * (float)(q1.z3(var9.l6() * var9.l6() + var9.k5() * var9.k5()) / q1.z3(2.0)) / 100.0F;
               }
               break;
            case 3:
               float var7 = 1.0F;
               if (!"font-size".equals(var2) && var3 != null && var3.l6.n5("font-size")) {
                  var7 = this.n5(var3.l6.k5("font-size"), var3, 10.0F);
               }

               var5 *= var7;
               break;
            case 4:
               var5 /= 4.30554F;
               break;
            case 6:
               var5 *= n5() / 2.54F;
               break;
            case 7:
               var5 *= n5() / 25.4F;
               break;
            case 8:
               var5 *= n5();
               break;
            case 9:
               var5 = var5 / 72.0F * n5();
               break;
            case 10:
               var5 = var5 * 12.0F / 72.0F * n5();
            case 11:
            case 12:
            default:
               break;
            case 13:
               var5 *= 10.0F;
         }

         return var5;
      } catch (RuntimeException var8) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var8;
         } else {
            return 0.0F;
         }
      }
   }

   public final float n5(y1 var1, float var2, boolean var3) {
      return (var3 ? var1.k5() : var1.s7()) / 100.0F * var2;
   }
}
