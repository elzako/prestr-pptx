package com.aspose.slides.internal.k9;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o8m.h6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.z3;

public final class h0 {
   private String n5;
   private k5 l6;

   private h0(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("bytes");
      }

      this.n5 = this.l6(var1);
   }

   private h0(h0 var1, k5 var2) {
      this.n5 = var1.n5;
      this.l6 = var2;
   }

   private String l6(byte[] var1) {
      h6 var2 = new h6();

      try {
         return z3.n5(var2.l6(var1));
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   @Override
   public int hashCode() {
      int var1 = -324743029 + this.n5.hashCode();
      return var1 * 486187739 + (this.l6 == null ? 0 : this.l6.hashCode());
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }

      h0 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, h0.class);
      if (var2 == null) {
         return false;
      }

      boolean var3;
      if (this.l6 == null && var2.l6 == null) {
         var3 = true;
      } else if (this.l6 == null | var2.l6 == null) {
         var3 = false;
      } else {
         var3 = this.l6.equals(var2.l6);
      }

      return d1.a6(this.n5, var2.n5) && var3;
   }

   @Override
   public String toString() {
      return this.l6 == null ? this.n5 : d1.n5("base: {0} [derived: {1}]", this.n5, this.l6);
   }

   public static h0 n5(byte[] var0) {
      return new h0(var0);
   }

   public static h0 n5(h0 var0, k5 var1) {
      return new h0(var0, var1);
   }
}
