package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;

public abstract class z6 extends a6 {
   public static z6 k5() {
      return n5(e9.class.getName());
   }

   public static z6 n5(String var0) {
      return (z6)y4.n5(var0);
   }

   protected z6() {
   }

   public abstract byte[] n5(byte[] var1);

   public abstract byte[] l6(byte[] var1);

   public abstract j4 l6(boolean var1);

   public abstract void n5(j4 var1);

   void l6(j4 var1) {
      if (var1.n5 != null) {
         com.aspose.slides.ms.System.u3.n5(var1.n5, 0, var1.n5.length);
      }

      if (var1.l6 != null) {
         com.aspose.slides.ms.System.u3.n5(var1.l6, 0, var1.l6.length);
      }

      if (var1.u3 != null) {
         com.aspose.slides.ms.System.u3.n5(var1.u3, 0, var1.u3.length);
      }

      if (var1.a6 != null) {
         com.aspose.slides.ms.System.u3.n5(var1.a6, 0, var1.a6.length);
      }

      if (var1.u9 != null) {
         com.aspose.slides.ms.System.u3.n5(var1.u9, 0, var1.u9.length);
      }

      if (var1.k5 != null) {
         com.aspose.slides.ms.System.u3.n5(var1.k5, 0, var1.k5.length);
      }
   }

   public void l6(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("xmlString");
      }

      j4 var2 = new j4();

      try {
         var2.n5 = n5(var1, "P");
         var2.l6 = n5(var1, "Q");
         var2.k5 = n5(var1, "D");
         var2.u3 = n5(var1, "DP");
         var2.a6 = n5(var1, "DQ");
         var2.u9 = n5(var1, "InverseQ");
         var2.c8 = n5(var1, "Exponent");
         var2.h0 = n5(var1, "Modulus");
         this.n5(var2.n5());
      } catch (RuntimeException var7) {
         this.l6(var2.n5());
         throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("Couldn't decode XML"), var7);
      } finally {
         this.l6(var2.n5());
      }
   }

   public String k5(boolean var1) {
      StringBuilder var2 = new StringBuilder();
      j4 var3 = this.l6(var1).n5();

      try {
         var2.append("<RSAKeyValue>");
         var2.append("<Modulus>");
         var2.append(com.aspose.slides.ms.System.z3.n5(var3.h0));
         var2.append("</Modulus>");
         var2.append("<Exponent>");
         var2.append(com.aspose.slides.ms.System.z3.n5(var3.c8));
         var2.append("</Exponent>");
         if (var1) {
            if (var3.k5 == null) {
               String var6 = com.aspose.slides.internal.x8w.z3.n5("Missing D parameter for the private key.");
               throw new ArgumentNullException("rsaParams.D", var6);
            }

            if (var3.n5 == null || var3.l6 == null || var3.u3 == null || var3.a6 == null || var3.u9 == null) {
               String var4 = com.aspose.slides.internal.x8w.z3.n5("Missing some CRT parameters for the private key.");
               throw new CryptographicException(var4);
            }

            var2.append("<P>");
            var2.append(com.aspose.slides.ms.System.z3.n5(var3.n5));
            var2.append("</P>");
            var2.append("<Q>");
            var2.append(com.aspose.slides.ms.System.z3.n5(var3.l6));
            var2.append("</Q>");
            var2.append("<DP>");
            var2.append(com.aspose.slides.ms.System.z3.n5(var3.u3));
            var2.append("</DP>");
            var2.append("<DQ>");
            var2.append(com.aspose.slides.ms.System.z3.n5(var3.a6));
            var2.append("</DQ>");
            var2.append("<InverseQ>");
            var2.append(com.aspose.slides.ms.System.z3.n5(var3.u9));
            var2.append("</InverseQ>");
            var2.append("<D>");
            var2.append(com.aspose.slides.ms.System.z3.n5(var3.k5));
            var2.append("</D>");
         }

         var2.append("</RSAKeyValue>");
      } catch (RuntimeException var5) {
         this.l6(var3.n5());
         throw var5;
      }

      return var2.toString();
   }
}
