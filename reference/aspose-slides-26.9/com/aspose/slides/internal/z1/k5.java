package com.aspose.slides.internal.z1;

import com.aspose.slides.exceptions.NotSupportedException;

public abstract class k5 {
   private com.aspose.slides.internal.t9.n5 n5;

   protected k5(com.aspose.slides.internal.t9.n5 var1) {
      this.n5 = var1;
   }

   protected final com.aspose.slides.internal.t9.n5 n5() {
      return this.n5;
   }

   public abstract String n5(int var1);

   public static k5 n5(com.aspose.slides.internal.t9.n5 var0) {
      switch (var0.l6()) {
         case 0:
            return new u9(var0);
         case 1:
            return new a6(var0);
         case 2:
            return new l6(var0);
         case 3:
            return new h0(var0);
         case 4:
            return new n5(var0);
         case 5:
            return new u3(var0);
         default:
            throw new NotSupportedException();
      }
   }
}
