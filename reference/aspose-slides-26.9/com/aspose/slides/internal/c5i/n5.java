package com.aspose.slides.internal.c5i;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.internal.z3b.k5;

public class n5 {
   private final j5 n5;

   public n5(j5 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("encoding");
      }

      this.n5 = var1;
   }

   public final byte[] n5(t4 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("input");
      } else {
         byte[] var3 = new byte[var2];
         int var4 = var1.read(var3, 0, var2);
         if (var4 != var3.length) {
            throw new k5("Invalid bytes count.");
         } else {
            return var3;
         }
      }
   }

   public final String l6(t4 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("input");
      }

      byte[] var3 = this.n5(var1, var2);
      return this.n5.l6(var3, 0, var3.length);
   }
}
