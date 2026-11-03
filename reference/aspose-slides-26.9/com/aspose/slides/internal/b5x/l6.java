package com.aspose.slides.internal.b5x;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.p8;
import com.aspose.slides.ms.System.z3;

public class l6 extends com.aspose.slides.internal.i2i.a6 {
   private int u3;

   public l6(com.aspose.slides.internal.i2i.a6 var1) {
      super(var1);
   }

   public l6() {
      this.n5 = "2.5.29.15";
   }

   @Override
   protected void n5() {
      com.aspose.slides.internal.x8w.l6 var1 = new com.aspose.slides.internal.x8w.l6(this.k5.u3());
      if (var1.l6() != 3) {
         throw new ArgumentException("Invalid KeyUsage extension");
      }

      int var2 = 1;

      while (var2 < var1.u3().length) {
         this.u3 = (this.u3 << 8) + var1.u3()[var2++];
      }
   }

   @Override
   protected void l6() {
      this.k5 = new com.aspose.slides.internal.x8w.l6((byte)4);
      int var1 = this.u3;
      byte var2 = 16;
      if ((var1 & 65535) > 0) {
         for (var2 = 15; (var2 & 255) > 0 && (var1 & 65535 & 32768) != 32768; var2--) {
            var1 <<= 1;
         }

         if (this.u3 > 255) {
            var2 = (byte)((var2 & 255) - 8);
            this.k5.n5(new com.aspose.slides.internal.x8w.l6((byte)3, new byte[]{var2, (byte)this.u3, (byte)(this.u3 >> 8)}));
         } else {
            this.k5.n5(new com.aspose.slides.internal.x8w.l6((byte)3, new byte[]{var2, (byte)this.u3}));
         }
      } else {
         this.k5.n5(new com.aspose.slides.internal.x8w.l6((byte)3, new byte[]{7, 0}));
      }
   }

   public boolean n5(int var1) {
      int var2 = z3.h0(var1, com.aspose.slides.internal.x7n.l6.k5());
      return (var2 & this.u3) == var2;
   }

   @Override
   public String toString() {
      String var1 = " , ";
      a5 var2 = new a5();
      if (this.n5(128)) {
         var2.n5("Digital Signature");
      }

      if (this.n5(64)) {
         if (var2.l6() > 0) {
            var2.n5(var1);
         }

         var2.n5("Non-Repudiation");
      }

      if (this.n5(32)) {
         if (var2.l6() > 0) {
            var2.n5(var1);
         }

         var2.n5("Key Encipherment");
      }

      if (this.n5(16)) {
         if (var2.l6() > 0) {
            var2.n5(var1);
         }

         var2.n5("Data Encipherment");
      }

      if (this.n5(8)) {
         if (var2.l6() > 0) {
            var2.n5(var1);
         }

         var2.n5("Key Agreement");
      }

      if (this.n5(4)) {
         if (var2.l6() > 0) {
            var2.n5(var1);
         }

         var2.n5("Certificate Signing");
      }

      if (this.n5(2)) {
         if (var2.l6() > 0) {
            var2.n5(var1);
         }

         var2.n5("CRL Signing");
      }

      if (this.n5(1)) {
         if (var2.l6() > 0) {
            var2.n5(var1);
         }

         var2.n5("Encipher Only ");
      }

      if (this.n5(2048)) {
         if (var2.l6() > 0) {
            var2.n5(var1);
         }

         var2.n5("Decipher Only");
      }

      var2.n5("(");
      var2.n5(a3.n5(this.u3, "X2", com.aspose.slides.internal.x7n.l6.k5()));
      var2.n5(")");
      var2.n5(p8.n5);
      return var2.toString();
   }
}
