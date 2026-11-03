package com.aspose.slides.internal.w0;

import com.aspose.slides.exceptions.ArgumentNullException;

public class a6 extends l6 {
   private com.aspose.slides.internal.p1s.n5 n5;
   private com.aspose.slides.internal.p1s.n5 l6;
   private int k5;

   public a6(int var1, com.aspose.slides.internal.p1s.n5 var2, com.aspose.slides.internal.p1s.n5 var3) {
      super(1);
      this.n5(var1);
      this.n5(var2);
      this.l6(var3);
   }

   public final int l6() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.internal.p1s.n5 k5() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.p1s.n5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.l6 = var1;
   }

   public final com.aspose.slides.internal.p1s.n5 u3() {
      return this.n5;
   }

   public final void l6(com.aspose.slides.internal.p1s.n5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      this.n5 = var1;
   }
}
