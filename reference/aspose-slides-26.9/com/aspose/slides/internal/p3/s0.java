package com.aspose.slides.internal.p3;

public class s0 {
   private a3 u3;
   public int n5 = 0;
   public int l6 = -1;
   public int k5 = -1;

   public s0(a3 var1) {
      this.u3 = var1;
   }

   public final void n5() {
      this.n5 = 0;
      this.l6 = -1;
      this.k5 = -1;
   }

   public final s0 l6() {
      s0 var1 = new s0(this.u3);
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      return var1;
   }

   public final int k5() {
      return this.n5;
   }

   public final int u3() {
      return this.k5;
   }

   public final int a6() {
      return this.l6;
   }

   @Override
   public final String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "length=",
         com.aspose.slides.ms.System.a3.l6(this.n5),
         ", index=",
         com.aspose.slides.ms.System.a3.l6(this.l6),
         ", elt=",
         com.aspose.slides.ms.System.a3.l6(this.k5)
      );
   }
}
