package com.aspose.slides.internal.a4;

import com.aspose.slides.internal.i0.a7;
import com.aspose.slides.ms.System.d1;

public class s3 extends j4 {
   private a7 n5;

   public s3() {
      this.l6((short)16428);
   }

   public s3(b3 var1) {
      super(var1);
   }

   public final boolean k5() {
      return this.u9(13);
   }

   public final void n5(boolean var1) {
      this.n5(13, var1);
   }

   public final a7 u3() {
      return this.n5;
   }

   public final void n5(a7 var1) {
      this.n5 = var1;
   }

   protected final boolean n5(s3 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.u3(), var1.u3());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((s3)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.u3() != null ? this.u3().hashCode() : 0;
   }

   @Override
   public String toString() {
      return d1.n5("{0}, PostMultipledMatrix: {1}, MatrixData: {2}", super.toString(), this.k5(), this.u3());
   }

   @Override
   public int u9() {
      return this.u3().u9();
   }
}
