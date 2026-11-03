package com.aspose.slides.internal.d8v;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.UriFormatException;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.k5.t1;
import com.aspose.slides.internal.k5.u6;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.r8;
import com.aspose.slides.ms.System.z3;

public class k5 extends com.aspose.slides.internal.d0e.a6 implements com.aspose.slides.internal.d0e.n5 {
   public byte[] c8 = null;

   public k5() {
      this.u9 = "image";
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
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("width"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void u3(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("width", var1.toString());
   }

   public final com.aspose.slides.internal.b3z.a6 s3() {
      return com.aspose.slides.internal.b3z.a6.n5(this.l6.k5("height"), com.aspose.slides.internal.b3z.a6.k5(0.0F));
   }

   public final void a6(com.aspose.slides.internal.b3z.a6 var1) {
      this.l6.l6("height", var1.toString());
   }

   public final String p8() {
      return this.l6.u3("xlink:href");
   }

   public final void s7(String var1) {
      this.l6.l6("xlink:href", var1);
   }

   public final boolean f2() {
      try {
         return !d1.n5(this.p8()) && ".svg".equals(z1.a6(d1.u9(this.p8())));
      } catch (ArgumentException var2) {
         return false;
      }
   }

   public final com.aspose.slides.internal.b3z.k5 i1() {
      return com.aspose.slides.internal.b3z.k5.n5(this.l6.k5("preserveAspectRatio"));
   }

   public final void n5(com.aspose.slides.internal.b3z.k5 var1) {
      this.l6.l6("preserveAspectRatio", var1.toString());
   }

   @Override
   public final y1 n5(n3 var1, f2 var2) {
      float var3 = var1.n5(this.a0(), "x", this, var2.a6());
      float var4 = var1.n5(this.d2(), "y", this, var2.a6());
      float var5 = var1.n5(this.d5(), "width", this, var2.a6());
      float var6 = var1.n5(this.s3(), "height", this, var2.a6());
      return new y1(var3, var4, var5, var6);
   }

   public final byte[] n5(com.aspose.slides.internal.b5j.u3 var1) {
      if (this.c8 != null) {
         return this.c8;
      }

      String var2 = this.p8();
      if (var2 == null) {
         var2 = this.l6.u3("href");
      }

      String var3 = "base64,";
      int var4 = 0;
      if (var2 != null) {
         var4 = d1.c8(var2, var3);
      }

      if (var4 > 0 && d1.l6(var2, "data:")) {
         this.c8 = z3.s7(d1.k5(var2, var4 + var3.length()));
         return this.c8;
      }

      r8 var5 = null;

      try {
         var5 = new r8(var2);
      } catch (UriFormatException var8) {
      }

      t1 var7;
      if (var5 != null && "data".equals(var5.t9())) {
         var7 = new com.aspose.slides.internal.b5j.l6().n5(this, new u6(var2));
      } else if (var5 != null && var5.z3()) {
         var7 = var1.n5(this, new u6(var2));
      } else {
         if (var5 == null && var4 > 0) {
            this.c8 = z3.s7(d1.k5(var2, var4 + var3.length()));
            return this.c8;
         }

         var7 = var1.n5(this, new u6(d1.n5(new String[]{this.n5(), var2})));
      }

      return this.c8 = var7 == null ? null : var7.n5();
   }
}
