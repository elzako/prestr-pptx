package com.aspose.slides.internal.w5i;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.t9;
import com.aspose.slides.internal.b5j.x8;
import com.aspose.slides.internal.b5j.y4;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public abstract class n5 extends com.aspose.slides.internal.d0e.a6 {
   private n5 c8 = null;
   private List<u9> t2 = null;

   public final int a0() {
      return !this.l6.n5("gradientUnits") && this.f2() != null
         ? this.f2().a0()
         : com.aspose.slides.internal.a3s.n5.n5(this.l6.k5("gradientUnits", "objectBoundingBox"));
   }

   public final void h0(int var1) {
      this.l6.l6("gradientUnits", com.aspose.slides.internal.a3s.n5.n5(var1));
   }

   public final boolean d2() {
      return this.a0() == 1;
   }

   public final int d5() {
      return !this.l6.n5("spreadMethod") && this.f2() != null ? this.f2().d5() : com.aspose.slides.internal.a3s.a6.n5(d1.l6(this.l6.k5("spreadMethod", "pad")));
   }

   public final void c8(int var1) {
      this.l6.l6("spreadMethod", com.aspose.slides.internal.a3s.a6.n5(var1));
   }

   public final String s3() {
      return !this.l6.n5("color-interpolation") && this.f2() != null ? this.f2().s3() : d1.l6(this.l6.k5("color-interpolation", "auto"));
   }

   public final String p8() {
      return !this.l6.n5("gradientTransform") && this.f2() != null ? this.f2().p8() : this.l6.k5("gradientTransform");
   }

   public final void s7(String var1) {
      this.l6.l6("gradientTransform", var1);
   }

   public final n5 f2() {
      return this.c8;
   }

   public final void n5(n5 var1) {
      this.c8 = var1;
   }

   public final void n5(x8 var1) {
      if (this.l6.n5("xlink:href")) {
         String var2 = y4.k5(this.l6.k5("xlink:href"));
         this.n5(com.aspose.slides.internal.v6g.k5.n5(var1.n5(var2), n5.class));
         if (this.f2() != null) {
            this.f2().n5(var1);
         }
      }
   }

   public final List<u9> i1() {
      if (this.t2 == null) {
         this.t2 = new List<>();

         for (int var1 = 0; var1 < this.j5().n5(); var1++) {
            u9 var2 = com.aspose.slides.internal.v6g.k5.n5(this.j5().l6(var1), u9.class);
            if (var2 != null) {
               this.t2.addItem(var2);
            }
         }
      }

      if (this.t2.size() == 0 && this.f2() != null) {
         this.t2 = this.f2().i1();
      }

      return this.t2;
   }

   public final m1 n5(n3 var1, f2 var2) {
      m1 var3 = new m1();
      if (this.p8() != null) {
         t9 var4 = new t9(var1);
         m1 var5 = var4.n5(this.p8(), var2.a6());
         var3.l6(var5);
      }

      return var3;
   }

   public final com.aspose.slides.internal.x4g.a6 n5(n3 var1, y1 var2, float var3, boolean var4) {
      int var5 = this.i1().size();
      if (var5 == 0) {
         return null;
      }

      boolean var6 = false;
      boolean var7 = false;
      if (this.i1().get_Item(0).a0() > 0.0F) {
         var5++;
         if (var4) {
            var7 = true;
         } else {
            var6 = true;
         }
      }

      float var8 = this.i1().get_Item(this.i1().size() - 1).a0();
      if (var8 < 1.0F) {
         var5++;
         if (var4) {
            var6 = true;
         } else {
            var7 = true;
         }
      }

      com.aspose.slides.internal.x4g.a6 var9 = new com.aspose.slides.internal.x4g.a6(var5);
      int var10 = 0;
      float var11 = 0.0F;
      float var12 = 0.0F;
      c8 var13 = com.aspose.slides.internal.o9b.c8.m3().o8();

      for (int var14 = 0; var14 < var5; var14++) {
         u9 var15 = this.i1().get_Item(var4 ? this.i1().size() - 1 - var10 : var10);
         float var16 = var2.s7();
         var11 = var3 * var15.d5();
         var12 = var4 ? 1.0F - var15.a0() * var2.s7() / var16 : var15.a0() * var2.s7() / var16;
         com.aspose.slides.internal.o9b.c8.n5(com.aspose.slides.internal.v6g.k5.u3(q1.u3(var11 * 255.0F), 14), var15.d2().n5().o8()).n5(var13);
         var10++;
         if (var6 && var14 == 0) {
            var9.l6()[var14] = 0.0F;
            var13.n5(var9.n5()[var14]);
            var14++;
         }

         var9.l6()[var14] = var12;
         var13.n5(var9.n5()[var14]);
         if (var7 && var14 == var5 - 2) {
            var9.l6()[++var14] = 1.0F;
            var13.n5(var9.n5()[var14]);
         }
      }

      return var9;
   }
}
