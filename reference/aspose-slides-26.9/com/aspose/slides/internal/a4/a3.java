package com.aspose.slides.internal.a4;

import com.aspose.slides.ms.System.d1;

public class a3 extends u3 {
   private com.aspose.slides.internal.i0.g7 n5;

   public a3() {
      this.l6((short)16434);
   }

   public a3(b3 var1) {
      super(var1);
   }

   public final byte k5() {
      return this.n5();
   }

   public final void l6(byte var1) {
      this.n5(var1);
   }

   public final com.aspose.slides.internal.i0.g7 u3() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.i0.g7 var1) {
      this.n5 = var1;
   }

   protected final boolean n5(a3 var1) {
      return super.n5(var1) && com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((a3)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ (this.n5 != null ? this.n5.hashCode() : 0);
   }

   @Override
   public String toString() {
      return d1.n5(
         "{0}, ClipRect: {1}, Cm: {2}", super.toString(), this.n5, com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.u3.class, this.k5())
      );
   }

   @Override
   public int u9() {
      return this.n5.u9();
   }
}
