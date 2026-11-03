package com.aspose.slides.internal.l5;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.z3;
import com.aspose.slides.ms.System.j8;

public final class s7 extends l6 {
   private z3 n5;

   public s7(w1 var1, w1 var2, com.aspose.slides.internal.o9b.c8 var3, com.aspose.slides.internal.o9b.c8 var4) {
      this.n5 = new z3(var1.u3(), var2.u3(), var3.o8(), var4.o8());
   }

   private s7() {
   }

   public final com.aspose.slides.internal.x4g.u3 l6() {
      return this.n5.h0();
   }

   public final boolean k5() {
      return this.n5.c8();
   }

   public final void n5(boolean var1) {
      this.n5.l6(var1);
   }

   public final com.aspose.slides.internal.o9b.c8[] u3() {
      return this.n5.s7();
   }

   public final com.aspose.slides.internal.x4g.a6 a6() {
      return this.n5.t2();
   }

   public final void n5(com.aspose.slides.internal.x4g.a6 var1) {
      this.n5.n5(var1);
   }

   public final y1 u9() {
      return this.n5.x8();
   }

   public final m1 h0() {
      return this.n5.n3();
   }

   public final int c8() {
      return this.n5.y4();
   }

   public final void n5(int var1) {
      this.n5.n5(var1);
   }

   @Override
   public com.aspose.slides.internal.o9b.u3 n5() {
      return this.n5;
   }

   @Override
   public Object deepClone() {
      s7 var1 = new s7();
      var1.n5 = (z3)this.n5.deepClone();
      return var1;
   }

   @Override
   public void dispose() {
      this.n5.dispose();
   }

   private boolean n5(s7 var1) {
      return j8.n5(this.n5, var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else {
         return j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, s7.class) && this.n5((s7)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 != null ? this.n5.hashCode() : 0;
   }
}
