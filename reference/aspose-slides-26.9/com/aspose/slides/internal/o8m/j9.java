package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentNullException;
import java.security.SecureRandom;
import java.util.Random;

public final class j9 extends i9 {
   private Random n5 = new SecureRandom();

   public j9() {
      this.l6();
   }

   private void l6() {
   }

   @Override
   public void n5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("data");
      }

      this.n5.nextBytes(var1);
      this.l6();
   }

   @Override
   public void l6(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("data");
      }

      byte[] var2 = new byte[var1.length * 2];
      int var3 = 0;

      while (var3 < var1.length) {
         this.n5.nextBytes(var2);
         this.l6();

         for (int var4 = 0; var4 < var2.length && var3 != var1.length; var4++) {
            if (var2[var4] != 0) {
               var1[var3++] = var2[var4];
            }
         }
      }
   }
}
