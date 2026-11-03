package com.aspose.slides.internal.d8v;

import com.aspose.slides.internal.b3z.s7;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.d1;

public class a6 extends com.aspose.slides.internal.d0e.a6 implements com.aspose.slides.internal.d0e.n5 {
   public a6() {
      this.u9 = "svg";
      this.l6.l6("version", "1.1");
      this.l6.l6("xmlns", "http://www.w3.org/2000/svg");
      this.l6.l6("xmlns:xlink", "http://www.w3.org/1999/xlink");
   }

   public final com.aspose.slides.internal.b3z.a6 a0() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("X", "0"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void l6(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("X", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 d2() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("y", "0"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void k5(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("Y", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 d5() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("width", "100%"), com.aspose.slides.internal.b3z.a6.l6(100.0F));
   }

   public final void u3(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("width", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 s3() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("height", "100%"), com.aspose.slides.internal.b3z.a6.l6(100.0F));
   }

   public final void a6(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("height", var1.toString());
   }

   public final boolean p8() {
      return "root".equals(this.n5.u9);
   }

   @Override
   public String l6() {
      String var1 = this.p8() ? "visible" : "hidden";
      return this.l6.k5("overflow", var1);
   }

   @Override
   public void n5(String var1) {
      this.l6.l6("overflow", var1);
   }

   public final boolean f2() {
      String var1 = this.l6();
      return d1.u3("hidden", var1, (short)3) || d1.u3("scroll", var1, (short)3);
   }

   public final s7 i1() {
      return s7.n5(this.l6.k5("viewBox"));
   }

   public final void n5(s7 var1) {
      this.l6.l6("viewBox", var1 == null ? null : var1.toString());
   }

   public final com.aspose.slides.internal.b3z.k5 e5() {
      return com.aspose.slides.internal.b3z.k5.n5(this.l6.k5("preserveAspectRatio"));
   }

   public final void n5(com.aspose.slides.internal.b3z.k5 var1) {
      this.l6.l6("preserveAspectRatio", var1.toString());
   }

   @Override
   public final y1 n5(n3 var1, f2 var2) {
      if (var2.n5() && (this.d5().k5() || this.s3().k5())) {
         s7 var3 = this.i1();
         if (var3 != null) {
            var3.n5(var1).c8().l6(var2);
         } else if (this.d5().n5() != 100.0F || this.s3().n5() != 100.0F) {
            y1 var4 = new y1();

            for (int var5 = 0; var5 < this.j5().n5(); var5++) {
               com.aspose.slides.internal.d0e.n5 var6 = com.aspose.slides.internal.v6g.k5.n5(this.j5().l6(var5), com.aspose.slides.internal.d0e.n5.class);
               if (var6 != null) {
                  y1 var7 = var6.n5(var1, var2.a6()).y4();
                  if (!var7.u3()) {
                     y1.l6(var4.y4(), var7.y4()).a6(var4);
                  }
               }
            }

            var4.c8().l6(var2);
         }
      }

      if (var2.n5()) {
         var2 = new f2(var1.k5(500.0F), var1.k5(500.0F));
      }

      float var8 = this.p8() ? 0.0F : var1.n5(this.a0(), "x", this, var2.a6());
      float var9 = this.p8() ? 0.0F : var1.n5(this.d2(), "y", this, var2.a6());
      float var10 = var1.n5(this.d5(), "width", this, var2.a6());
      float var11 = var1.n5(this.s3(), "height", this, var2.a6());
      return new y1(var8, var9, var10, var11);
   }
}
