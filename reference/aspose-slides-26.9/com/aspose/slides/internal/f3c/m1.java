package com.aspose.slides.internal.f3c;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class m1 extends com.aspose.slides.internal.o8m.u3 {
   private boolean k5;

   protected m1() {
   }

   public m1(String var1, byte[] var2, boolean var3) {
      super(var1, var2);
      this.k5 = var3;
   }

   public boolean u9() {
      return this.k5;
   }

   public void s7(boolean var1) {
      this.k5 = var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.o8m.u3 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("encodedData");
      }

      m1 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, m1.class);
      if (var2 == null) {
         throw new ArgumentException(d1.n5("Expected a X509Extension instance.", new Object[]{}));
      }

      super.n5(var1);
      this.k5 = var2.u9();
   }

   public String k5(byte[] var1) {
      if (var1 != null && var1.length != 0) {
         a5 var2 = new a5();

         for (int var3 = 0; var3 < var1.length; var3++) {
            var2.n5(com.aspose.slides.ms.System.e2.n5(var1[var3], "X2"));
         }

         return var2.toString();
      } else {
         return d1.n5;
      }
   }
}
