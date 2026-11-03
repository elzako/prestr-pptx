package com.aspose.slides.internal.l6z;

import com.aspose.slides.exceptions.InvalidOperationException;

public class o5 extends n1 {
   private final int n5;
   private w2 l6;
   private n1 k5;

   o5(int var1) {
      this.n5 = var1;
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      if ((com.aspose.slides.internal.l6z.n5.n5(var1) & 65535) == 22) {
         this.l6 = new w2(this.n5);
         this.l6.n5(var1);
      }

      int var2 = com.aspose.slides.internal.l6z.n5.n5(var1);
      switch (var2) {
         case 13:
            this.k5 = new v3(this.n5);
            break;
         case 14:
            this.k5 = new v8();
            break;
         case 47:
         case 51:
            this.k5 = new j8(this.n5);
            break;
         default:
            throw new InvalidOperationException();
      }

      this.k5.n5(var1);
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      if (this.l6 != null) {
         this.l6.n5(var1);
      }

      this.k5.n5(var1);
   }

   public final w2 n5() {
      return this.l6;
   }

   public final void n5(w2 var1) {
      this.l6 = var1;
   }

   public final n1 l6() {
      return this.k5;
   }

   public final void n5(n1 var1) {
      this.k5 = var1;
   }
}
