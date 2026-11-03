package com.aspose.slides.internal.z2;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.g9.a6;
import com.aspose.slides.internal.v2.c8;
import com.aspose.slides.internal.v2.s7;
import com.aspose.slides.ms.System.d1;

public class l6 extends a6 {
   private final com.aspose.slides.internal.v2.k5 n5;
   private a6 l6;
   private com.aspose.slides.internal.g9.u3 k5;

   @Override
   public com.aspose.slides.internal.g9.u3 k5() {
      if (this.k5 == null) {
         this.k5 = new com.aspose.slides.internal.g9.u3(new float[0], null);
      }

      return this.k5;
   }

   public l6(com.aspose.slides.internal.v2.k5 var1) {
      this.n5 = var1;
   }

   public l6(com.aspose.slides.internal.v2.k5 var1, a6 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public static l6 n5(com.aspose.slides.internal.v2.k5 var0) {
      l6 var1 = null;
      int var2 = var0.n5(c8.e5a, 0);
      switch (var2) {
         case 1:
            var1 = new u3(var0);
            break;
         case 2:
            var1 = new k5(var0);
            break;
         default:
            String var3 = d1.n5("Unknown pattern type is encountered: {0}", new Object[]{var2});
            throw new NotSupportedException(var3);
      }

      return var1;
   }

   @Override
   public s7 t2() {
      return this.n5;
   }

   @Override
   public String u3() {
      return c8.t4r.n5();
   }

   @Override
   public int a6() {
      throw new NotSupportedException();
   }

   @Override
   public float[] n5(float[] var1) {
      return new float[]{1.0F, 1.0F, 1.0F};
   }
}
