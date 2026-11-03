package com.aspose.slides.internal.b3;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.d2;

public class k7 extends a5 implements com.aspose.slides.internal.f2.k5 {
   private double n5;
   private int l6;

   public k7(double var1, int var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   @Override
   public final int l6() {
      return this.l6;
   }

   @Override
   public final double n5() {
      return this.n5;
   }

   @Override
   public final double n5(com.aspose.slides.internal.f2.u9 var1) {
      return this.n5;
   }

   @Override
   public final boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.f2.u3 u9() {
      return this;
   }

   @Override
   public Object h0() {
      return this.n5;
   }

   @Override
   public final int u3() {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5, 14);
   }

   @Override
   public final int l6(com.aspose.slides.internal.f2.u9 var1) {
      return com.aspose.slides.internal.v6g.k5.u3(this.n5, 14);
   }

   @Override
   public final void n5(int var1) {
      this.n5 = var1;
   }

   @Override
   public com.aspose.slides.internal.f2.k5 c8() {
      return this.l6 == 1 ? this : null;
   }

   @Override
   public com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.y1.u3 var1) {
      return com.aspose.slides.internal.o9b.c8.u3;
   }

   @Override
   public Object g_() {
      return this;
   }

   @Override
   public String toString() {
      return this.l6 == 1 ? d1.n5(new String[]{a3.l6(com.aspose.slides.internal.v6g.k5.u3(this.n5, 14)), "mpt"}) : d1.n5(new String[]{d2.u9(this.n5), "^", a3.l6(this.l6)});
   }

   @Override
   public int hashCode() {
      byte var1 = 31;
      int var2 = 1;
      var2 = var1 * var2 + this.l6;
      return var1 * var2 + com.aspose.slides.internal.v3.u3.n5(this.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      if (!com.aspose.slides.internal.v6g.k5.l6(obj, k7.class)) {
         return false;
      }

      k7 var2 = (k7)obj;
      return this.l6 == var2.l6 && com.aspose.slides.internal.v3.u3.n5(this.n5, var2.n5);
   }
}
