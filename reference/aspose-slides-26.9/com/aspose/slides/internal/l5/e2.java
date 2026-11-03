package com.aspose.slides.internal.l5;

import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.j8;

public final class e2 extends l6 {
   private c8 n5;
   private m1 l6 = new m1();
   private y1 k5 = new y1();
   private int u3 = 0;
   private t2 a6;
   private int u9 = 0;

   public e2(c8 var1) {
      this.u9 = 0;
      this.n5 = var1;
      this.k5 = new y1(0.0F, 0.0F, var1.u9(), var1.h0());
   }

   private e2() {
   }

   public final m1 l6() {
      return this.l6;
   }

   public final void n5(m1 var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.u3;
   }

   @Override
   public com.aspose.slides.internal.o9b.u3 n5() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5, com.aspose.slides.internal.d9.n5.class)) {
         int var10 = 0;
         int var13 = 0;
         if (this.u9 > 1) {
            var10 = com.aspose.slides.internal.v6g.k5.u3(this.k5.s7(), 13);
            var13 = com.aspose.slides.internal.v6g.k5.u3(this.k5.k5(), 13);
         } else {
            var10 = this.n5.u9();
            var13 = this.n5.h0();
         }

         com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(var10, var13);
         z1 var4 = z1.n5(var3);

         try {
            m1 var5 = new m1();
            if (var10 != this.n5.u9() || var13 != this.n5.h0()) {
               var5.n5((float)var10 / this.n5.u9(), (float)var13 / this.n5.h0());
            }

            com.aspose.slides.internal.o1.k5 var6 = com.aspose.slides.internal.o1.k5.n5((com.aspose.slides.internal.d9.n5)this.n5);
            var6.n5(var4, var5);
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }

         u6 var15 = null;
         if (this.u9 == 0) {
            var15 = new u6(var3);
         } else if (this.u9 == 1) {
            var15 = new u6(var3, this.u3);
         } else if (this.u9 == 2) {
            var15 = new u6(var3, this.k5.y4());
         } else if (this.u9 == 3) {
            var15 = new u6(var3, this.u3, this.k5.y4());
         } else {
            var15 = new u6(var3, this.k5.y4(), this.a6.k5());
         }

         var15.k5(this.l6);
         return var15;
      } else {
         u3 var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5, u3.class);
         u6 var2 = null;
         if (this.u9 == 0) {
            var2 = new u6(var1.n5());
         } else if (this.u9 == 1) {
            var2 = new u6(var1.n5(), this.u3);
         } else if (this.u9 == 2) {
            var2 = new u6(var1.n5(), this.k5.y4());
         } else if (this.u9 == 3) {
            var2 = new u6(var1.n5(), this.u3, this.k5.y4());
         } else {
            var2 = new u6(var1.n5(), this.k5.y4(), this.a6.k5());
         }

         var2.k5(this.l6);
         return var2;
      }
   }

   @Override
   public Object deepClone() {
      e2 var1 = new e2();
      var1.n5 = this.n5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      this.k5.a6(var1.k5);
      var1.l6 = this.l6.u9();
      return var1;
   }

   @Override
   public void dispose() {
      this.n5.dispose();
   }

   private boolean n5(e2 var1) {
      return j8.n5(this.n5, var1.n5) && j8.n5(this.l6, var1.l6) && this.k5.equals(var1.k5.y4()) && this.u3 == var1.u3 && j8.n5(this.a6, var1.a6);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else {
         return j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, e2.class) && this.n5((e2)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = 0;
      var1 = var1 * 397 ^ (this.n5 != null ? this.n5.hashCode() : 0);
      var1 = var1 * 397 ^ (this.l6 != null ? this.l6.hashCode() : 0);
      var1 = var1 * 397 ^ this.k5.hashCode();
      var1 = var1 * 397 ^ this.u3;
      return var1 * 397 ^ (this.a6 != null ? this.a6.hashCode() : 0);
   }
}
