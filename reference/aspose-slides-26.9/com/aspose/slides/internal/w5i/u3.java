package com.aspose.slides.internal.w5i;

import com.aspose.slides.internal.b3z.s7;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.t9;
import com.aspose.slides.internal.b5j.x8;
import com.aspose.slides.internal.b5j.y4;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.x4g.m1;

public class u3 extends com.aspose.slides.internal.d0e.a6 {
   private u3 c8 = null;

   public u3() {
      this.u9 = "pattern";
   }

   public final int a0() {
      return !this.l6.n5("patternUnits") && this.b3() != null
         ? this.b3().a0()
         : com.aspose.slides.internal.a3s.n5.n5(this.l6.k5("patternUnits", "objectBoundingBox"));
   }

   public final void h0(int var1) {
      this.l6.l6("patternUnits", com.aspose.slides.internal.a3s.n5.n5(var1));
   }

   public final int d2() {
      return !this.l6.n5("patternContentUnits") && this.b3() != null
         ? this.b3().d2()
         : com.aspose.slides.internal.a3s.n5.n5(this.l6.k5("patternContentUnits", "userSpaceOnUse"));
   }

   public final com.aspose.slides.internal.b3z.a6 d5() {
      return !this.l6.n5("x") && this.b3() != null
         ? this.b3().d5()
         : com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("x"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void l6(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("x", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 s3() {
      return !this.l6.n5("y") && this.b3() != null
         ? this.b3().s3()
         : com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("y"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void k5(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("y", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 p8() {
      return !this.l6.n5("width") && this.b3() != null
         ? this.b3().p8()
         : com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("width"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void u3(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("width", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 f2() {
      return !this.l6.n5("height") && this.b3() != null
         ? this.b3().f2()
         : com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("height"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void a6(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("height", var1.toString());
   }

   public final s7 i1() {
      return !this.l6.n5("viewBox") && this.b3() != null ? this.b3().i1() : s7.n5(this.l6.k5("viewBox"));
   }

   public final String e5() {
      return !this.l6.n5("patternTransform") && this.b3() != null ? this.b3().e5() : this.l6.k5("patternTransform");
   }

   public final void s7(String var1) {
      this.l6.l6("patternTransform", var1);
   }

   public final u3 b3() {
      return this.c8;
   }

   public final void n5(u3 var1) {
      this.c8 = var1;
   }

   public final void n5(x8 var1) {
      if (this.l6.n5("xlink:href")) {
         String var2 = y4.k5(this.l6.k5("xlink:href"));
         this.n5(com.aspose.slides.internal.v6g.k5.n5(var1.n5(var2), u3.class));
         if (this.b3() != null) {
            this.b3().n5(var1);
         }
      }
   }

   public final m1 n5(n3 var1, f2 var2) {
      m1 var3 = new m1();
      if (this.e5() != null) {
         t9 var4 = new t9(var1);
         m1 var5 = var4.n5(this.e5(), var2.a6());
         var3.l6(var5);
      }

      return var3;
   }
}
