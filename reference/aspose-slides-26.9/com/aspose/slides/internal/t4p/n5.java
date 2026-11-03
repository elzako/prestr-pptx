package com.aspose.slides.internal.t4p;

import com.aspose.slides.internal.t9z.u9;
import com.aspose.slides.internal.v9l.a6;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.internal.x7u.h0;

public class n5 implements com.aspose.slides.internal.k3w.k5, com.aspose.slides.internal.t9z.k5 {
   private final u3 n5;
   private final k5 l6;

   public n5(
      u9 var1,
      s7 var2,
      boolean var3,
      a6 var4,
      com.aspose.slides.internal.t9z.k5 var5,
      com.aspose.slides.internal.t9z.k5 var6,
      com.aspose.slides.internal.t9z.k5 var7
   ) {
      com.aspose.slides.internal.v9l.k5 var8 = var4.n5();
      if (var8.n5() <= 1) {
         var8 = com.aspose.slides.internal.v9l.u3.n5(var2);
      }

      com.aspose.slides.internal.z3o.u9 var9 = this.n5(var1, var2, var4, var8);
      com.aspose.slides.internal.z3o.u9 var10 = this.l6(var1, var2, var4, var8);
      l6 var11 = new l6(var1, var2, var3, var9, var10, var5, var6, var7);
      this.n5 = new u3(var11);
      this.l6 = new k5(var11);
   }

   private com.aspose.slides.internal.z3o.u9 n5(u9 var1, s7 var2, a6 var3, com.aspose.slides.internal.v9l.k5 var4) {
      com.aspose.slides.internal.x7u.u9 var5 = h0.l6(var1.l6(), var2);
      if (var3.k5() != null) {
         return com.aspose.slides.internal.z3o.u9.n5(var5, var3.l6(), var3.k5());
      }

      com.aspose.slides.internal.z3o.k5 var6 = new com.aspose.slides.internal.z3o.k5(var5);
      return var6.n5(var4);
   }

   private com.aspose.slides.internal.z3o.u9 l6(u9 var1, s7 var2, a6 var3, com.aspose.slides.internal.v9l.k5 var4) {
      com.aspose.slides.internal.x7u.u9 var5 = h0.k5(var1.l6(), var2);
      if (var3.a6() != null) {
         return com.aspose.slides.internal.z3o.u9.n5(var5, var3.u3(), var3.a6());
      }

      com.aspose.slides.internal.z3o.u3 var6 = new com.aspose.slides.internal.z3o.u3(var5);
      return var6.n5(var4);
   }

   @Override
   public void n5(float var1, float var2) {
      this.n5.n5(var1, var2);
      this.l6.n5(var1, var2);
   }

   @Override
   public void l6(float var1, float var2) {
      this.n5.l6(var1, var2);
      this.l6.l6(var1, var2);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4) {
      this.n5.n5(var1, var2, var3, var4);
      this.l6.n5(var1, var2, var3, var4);
   }

   @Override
   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.n5.n5(var1, var2, var3, var4, var5, var6);
      this.l6.n5(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void n5() {
      this.n5.n5();
      this.l6.n5();
   }

   @Override
   public void l6() {
      this.n5.l6();
      this.l6.l6();
   }

   @Override
   public void n5(com.aspose.slides.internal.k3w.u3 var1, boolean var2) {
      this.n5.n5(var1, var2);
      this.l6.n5(var1, var2);
   }
}
