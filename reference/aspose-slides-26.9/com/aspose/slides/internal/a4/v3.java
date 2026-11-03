package com.aspose.slides.internal.a4;

import com.aspose.slides.internal.i0.a7;
import com.aspose.slides.ms.System.d1;

public class v3 extends j4 {
   private a7 n5;

   public v3() {
      this.l6((short)16426);
   }

   public v3(b3 var1) {
      super(var1);
   }

   public final a7 k5() {
      return this.n5;
   }

   public final void n5(a7 var1) {
      this.n5 = var1;
   }

   protected final boolean n5(v3 var1) {
      return super.n5(var1) && com.aspose.slides.ms.System.j8.n5(this.k5(), var1.k5());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((v3)obj);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode() * 397 ^ (this.k5() != null ? this.k5().hashCode() : 0);
   }

   @Override
   public String toString() {
      return d1.n5("{0}, MatrixData: {1}", super.toString(), this.k5());
   }

   @Override
   public int u9() {
      return 24;
   }
}
