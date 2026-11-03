package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class n3 extends m1 {
   private com.aspose.slides.internal.i0.a6 n5;

   public n3() {
      this.l6((short)16399);
   }

   public n3(b3 var1) {
      super(var1);
   }

   public final byte k5() {
      return this.m3();
   }

   public final boolean u3() {
      return this.u9(14);
   }

   public final com.aspose.slides.internal.i0.a6 c8() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.i0.a6 var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return d1.n5("{0}, RectData: [{1}]", super.toString(), this.n5);
   }

   protected final boolean n5(n3 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((n3)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.n5 != null ? this.n5.hashCode() : 0;
   }

   @Override
   public int u9() {
      return this.n5.u9();
   }
}
