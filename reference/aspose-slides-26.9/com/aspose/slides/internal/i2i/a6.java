package com.aspose.slides.internal.i2i;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;
import com.aspose.slides.ms.System.z3;

public class a6 {
   protected String n5;
   protected boolean l6;
   protected com.aspose.slides.internal.x8w.l6 k5;

   protected a6() {
      this.l6 = false;
   }

   public a6(com.aspose.slides.internal.x8w.l6 var1) {
      if (var1.l6() != 48 || var1.n5() < 2) {
         throw new ArgumentException(d1.n5("Invalid X.509 extension.", new Object[]{}));
      }

      if (var1.n5(0).l6() != 6) {
         throw new ArgumentException(d1.n5("Invalid X.509 extension.", new Object[]{}));
      }

      this.n5 = com.aspose.slides.internal.x8w.k5.l6(var1.n5(0));
      this.l6 = var1.n5(1).l6() == 1 && (var1.n5(1).u3()[0] & 255) == 255;
      this.k5 = var1.n5(var1.n5() - 1);
      if (this.k5.l6() == 4 && this.k5.k5() > 0 && this.k5.n5() == 0) {
         try {
            com.aspose.slides.internal.x8w.l6 var2 = new com.aspose.slides.internal.x8w.l6(this.k5.u3());
            this.k5.n5((byte[])null);
            this.k5.n5(var2);
         } catch (Exception var3) {
         }
      }

      this.n5();
   }

   public a6(a6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("extension");
      }

      if (var1.a6() != null && var1.a6().l6() == 4 && var1.a6().n5() == 1) {
         this.n5 = var1.k5();
         this.l6 = var1.u3();
         this.k5 = var1.a6();
         this.n5();
      } else {
         throw new ArgumentException(d1.n5("Invalid X.509 extension.", new Object[]{}));
      }
   }

   protected void n5() {
   }

   protected void l6() {
   }

   public String k5() {
      return this.n5;
   }

   public boolean u3() {
      return this.l6;
   }

   public com.aspose.slides.internal.x8w.l6 a6() {
      if (this.k5 == null) {
         this.l6();
      }

      return this.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) {
         return false;
      }

      a6 var2 = obj instanceof a6 ? (a6)obj : null;
      if (var2 == null) {
         return false;
      }

      if (this.l6 != var2.l6) {
         return false;
      }

      if (!d1.a6(this.n5, var2.n5)) {
         return false;
      }

      if (this.k5.k5() != var2.k5.k5()) {
         return false;
      }

      for (int var3 = 0; var3 < this.k5.k5(); var3++) {
         if (this.k5.n5(var3) != var2.k5.n5(var3)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public int hashCode() {
      return this.n5.hashCode();
   }

   private void n5(a5 var1, int var2, int var3) {
      byte[] var4 = this.k5.u3();
      int var5 = var3;

      for (int var6 = 0; var6 < 8; var6++) {
         if (var6 < var2) {
            var1.n5(com.aspose.slides.ms.System.e2.n5(var4[var5++], "X2", com.aspose.slides.internal.x7n.l6.k5()));
            var1.n5(" ");
         } else {
            var1.n5("   ");
         }
      }

      var1.n5("  ");
      var5 = var3;

      for (int var9 = 0; var9 < var2; var9++) {
         byte var7 = var4[var5++];
         if ((var7 & 255) < 32) {
            var1.n5(".");
         } else {
            var1.n5(z3.l6(var7));
         }
      }

      var1.n5(p8.n5);
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      int var2 = this.k5.k5() >> 3;
      int var3 = this.k5.k5() - (var2 << 3);
      byte var4 = 0;

      for (int var5 = 0; var5 < var2; var5++) {
         this.n5(var1, 8, var4);
         var4 += 8;
      }

      this.n5(var1, var3, var4);
      return var1.toString();
   }
}
