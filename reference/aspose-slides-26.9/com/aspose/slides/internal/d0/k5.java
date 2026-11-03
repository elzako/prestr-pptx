package com.aspose.slides.internal.d0;

import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;

public class k5 {
   private final byte[] n5;
   private final int l6;

   public k5(byte[] var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final byte[] n5(byte[] var1) {
      e2 var2 = new e2();

      try {
         u3 var3 = this.n5(var2);
         var3.write(var1, 0, var1.length);
         return var2.toArray();
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public final u3 n5(t4 var1) {
      return new u3(var1, this.n5, 0, this.l6);
   }
}
