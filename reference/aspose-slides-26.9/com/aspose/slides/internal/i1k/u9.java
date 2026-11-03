package com.aspose.slides.internal.i1k;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.b5j.c8;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.t2;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class u9 extends com.aspose.slides.internal.d0e.a6 implements com.aspose.slides.internal.d0e.n5, com.aspose.slides.internal.z9u.n5 {
   public u9() {
      this.u9 = "rect";
      this.k5.addItem("x", "0");
      this.k5.addItem("y", "0");
   }

   public final com.aspose.slides.internal.b3z.a6 a0() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("x"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void l6(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("x", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 d2() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("y"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void k5(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("y", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 d5() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.n5(new String[]{"rx", "ry"}), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 s3() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.n5(new String[]{"ry", "rx"}), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final com.aspose.slides.internal.b3z.a6 p8() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("width"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void u3(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("width", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 f2() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("height"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void a6(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("height", var1.toString());
   }

   @Override
   public final y1 n5(n3 var1, f2 var2) {
      float var3 = var1.n5(this.a0(), "x", this, var2.a6());
      float var4 = var1.n5(this.d2(), "y", this, var2.a6());
      float var5 = var1.n5(this.p8(), "width", this, var2.a6());
      float var6 = var1.n5(this.f2(), "height", this, var2.a6());
      return new y1(var3, var4, var5, var6);
   }

   @Override
   public final List<c8> l6(n3 var1, f2 var2) {
      y1 var3 = this.n5(var1, var2.a6()).y4();
      float var4 = var3.x8() * n3.k5();
      float var5 = var3.n3() * n3.k5();
      float var6 = var3.s7() * n3.k5();
      float var7 = var3.k5() * n3.k5();
      if (!(var6 <= 0.0F) && !(var7 <= 0.0F)) {
         String var8;
         if (!(q1.n5(this.d5().n5()) < 0.001F) && !(q1.n5(this.s3().n5()) < 0.001F)) {
            float var9 = var1.n5(this.d5(), "rx", this, var2.a6()) * n3.k5();
            float var10 = var1.n5(this.s3(), "ry", this, var2.a6()) * n3.k5();
            if (var9 > var6 / 2.0F) {
               var9 = var6 / 2.0F;
            }

            if (var10 > var7 / 2.0F) {
               var10 = var7 / 2.0F;
            }

            a5 var11 = new a5();
            var11.n5(com.aspose.slides.internal.x7n.l6.k5(), "M {0} {1}",new Object[]{ var4 + var9, var5});
            var11.n5(com.aspose.slides.internal.x7n.l6.k5(), "H {0}",new Object[]{ var4 + var6 - var9});
            var11.n5(com.aspose.slides.internal.x7n.l6.k5(), "A {0} {1} 0 0 1 {2} {3}",new Object[]{ var9, var10, var4 + var6, var5 + var10});
            var11.n5(com.aspose.slides.internal.x7n.l6.k5(), "V {0}",new Object[]{ var5 + var7 - var10});
            var11.n5(com.aspose.slides.internal.x7n.l6.k5(), "A {0} {1} 0 0 1 {2} {3}",new Object[]{ var9, var10, var4 + var6 - var9, var5 + var7});
            var11.n5(com.aspose.slides.internal.x7n.l6.k5(), "H {0}",new Object[]{ var4 + var9});
            var11.n5(com.aspose.slides.internal.x7n.l6.k5(), "A {0} {1} 0 0 1 {2} {3}",new Object[]{ var9, var10, var4, var5 + var7 - var10});
            var11.n5(com.aspose.slides.internal.x7n.l6.k5(), "V {0}",new Object[]{ var5 + var10});
            var11.n5(com.aspose.slides.internal.x7n.l6.k5(), "A {0} {1} 0 0 1 {2} {3}",new Object[]{ var9, var10, var4 + var9, var5});
            var11.n5("Z", new Object[]{});
            var11.n5(',', '.');
            var8 = var11.toString();
         } else {
            var8 = d1.n5(
               "M {0} {1} h {2} v {3} h -{2} z",new Object[]{
               com.aspose.slides.internal.b3z.c8.n5(var4),
               com.aspose.slides.internal.b3z.c8.n5(var5),
               com.aspose.slides.internal.b3z.c8.n5(var6),
               com.aspose.slides.internal.b3z.c8.n5(var7)
            });
         }

         return t2.n5(var8, var1);
      } else {
         return new List<>();
      }
   }
}
