package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentNullException;

public abstract class t2 {
   protected t2() {
   }

   public abstract void n5(String var1);

   public abstract void n5(a6 var1);

   public abstract byte[] n5(byte[] var1);

   public byte[] n5(f2 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("hash");
      }

      this.n5(var1.toString());
      return this.n5(var1.n3());
   }

   @Override
   public String toString() {
      String var1 = com.aspose.slides.ms.System.j8.n5(this).s7().substring(com.aspose.slides.ms.System.j8.n5(this).s7().lastIndexOf(46) + 1);
      return "System.Security.Cryptography." + var1;
   }
}
