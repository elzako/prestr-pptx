package com.aspose.slides.internal.f3c;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.o8m.e9;
import com.aspose.slides.internal.o8m.j4;
import com.aspose.slides.internal.o8m.u6;
import com.aspose.slides.internal.o8m.z6;
import com.aspose.slides.ms.System.d1;

public final class n5 {
   private com.aspose.slides.internal.o8m.a6 l6;
   private com.aspose.slides.internal.o8m.u3 k5;
   private com.aspose.slides.internal.o8m.u3 u3;
   private u6 a6;
   static byte[] n5 = new byte[0];
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("1.2.840.113549.1.1.1", "1.2.840.10040.4.1");

   public n5(com.aspose.slides.internal.i2i.l6 var1) {
      boolean var2 = true;
      if ("1.2.840.113549.1.1.1".equals(var1.a6())) {
         e9 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.c8(), e9.class);
         if (var3 != null && var3.u3()) {
            this.l6 = var1.c8();
            var2 = false;
         } else {
            com.aspose.slides.internal.x8w.u9 var4 = com.aspose.slides.internal.v6g.k5.n5(var1.c8(), com.aspose.slides.internal.x8w.u9.class);
            if (var4 != null && var4.u3()) {
               this.l6 = var1.c8();
               var2 = false;
            }
         }

         if (var2) {
            j4 var7 = var1.c8().l6(false).n5();
            this.l6 = z6.k5();
            com.aspose.slides.internal.v6g.k5.n5(this.l6, z6.class).n5(var7.n5());
         }
      } else {
         com.aspose.slides.internal.o8m.m1 var5 = com.aspose.slides.internal.v6g.k5.n5(var1.n5(), com.aspose.slides.internal.o8m.m1.class);
         if (var5 != null && var5.u3()) {
            this.l6 = var1.n5();
            var2 = false;
         }

         if (var2) {
            com.aspose.slides.internal.o8m.m3 var8 = var1.n5().l6(false).n5();
            this.l6 = com.aspose.slides.internal.o8m.z3.k5();
            com.aspose.slides.internal.v6g.k5.n5(this.l6, com.aspose.slides.internal.o8m.z3.class).l6(var8.n5());
         }
      }

      this.a6 = new u6(var1.a6());
      this.k5 = new com.aspose.slides.internal.o8m.u3(this.a6, var1.h0());
      byte[] var6 = var1.u9();
      if (var6 == null) {
         var6 = n5;
      }

      this.u3 = new com.aspose.slides.internal.o8m.u3(this.a6, var6);
   }

   public com.aspose.slides.internal.o8m.u3 n5() {
      return this.k5;
   }

   public com.aspose.slides.internal.o8m.u3 l6() {
      return this.u3;
   }

   public com.aspose.slides.internal.o8m.a6 k5() {
      if (this.l6 == null) {
         switch (u9.n5(this.a6.l6())) {
            case 0:
               this.l6 = n5(this.k5.l6());
               break;
            case 1:
               this.l6 = n5(this.k5.l6(), this.u3.l6());
               break;
            default:
               String var1 = d1.n5("Cannot decode public key from unknown OID '{0}'.", new Object[]{this.a6.l6()});
               throw new NotSupportedException(var1);
         }
      }

      return this.l6;
   }

   private static byte[] l6(byte[] var0) {
      if (com.aspose.slides.internal.v6g.k5.u3(var0[0], 6) != 0) {
         return var0;
      }

      int var1 = var0.length - 1;
      byte[] var2 = new byte[var1];
      com.aspose.slides.ms.System.y4.n5(var0, 1, var2, 0, var1);
      return var2;
   }

   public static com.aspose.slides.internal.o8m.z3 n5(byte[] var0, byte[] var1) {
      com.aspose.slides.internal.o8m.m3 var2 = new com.aspose.slides.internal.o8m.m3();

      try {
         com.aspose.slides.internal.x8w.l6 var3 = new com.aspose.slides.internal.x8w.l6(var0);
         if (com.aspose.slides.internal.v6g.k5.u3(var3.l6(), 6) != 2) {
            throw new CryptographicException(d1.n5("Missing DSA Y integer.", new Object[]{}));
         }

         var2.c8 = l6(var3.u3());
         com.aspose.slides.internal.x8w.l6 var7 = new com.aspose.slides.internal.x8w.l6(var1);
         if (var7 == null || com.aspose.slides.internal.v6g.k5.u3(var7.l6(), 6) != 48 || var7.n5() < 3) {
            throw new CryptographicException(d1.n5("Missing DSA parameters.", new Object[]{}));
         }

         if (com.aspose.slides.internal.v6g.k5.u3(var7.n5(0).l6(), 6) != 2
            || com.aspose.slides.internal.v6g.k5.u3(var7.n5(1).l6(), 6) != 2
            || com.aspose.slides.internal.v6g.k5.u3(var7.n5(2).l6(), 6) != 2) {
            throw new CryptographicException(d1.n5("Invalid DSA parameters.", new Object[]{}));
         }

         var2.u3 = l6(var7.n5(0).u3());
         var2.a6 = l6(var7.n5(1).u3());
         var2.l6 = l6(var7.n5(2).u3());
      } catch (RuntimeException var5) {
         String var4 = d1.n5("Error decoding the ASN.1 structure.", new Object[]{});
         throw new CryptographicException(var4, var5);
      }

      com.aspose.slides.internal.o8m.m1 var6 = new com.aspose.slides.internal.o8m.m1(var2.c8.length << 3);
      var6.l6(var2.n5());
      return var6;
   }

   public static z6 n5(byte[] var0) {
      j4 var1 = new j4();

      try {
         com.aspose.slides.internal.x8w.l6 var2 = new com.aspose.slides.internal.x8w.l6(var0);
         if (var2.n5() == 0) {
            throw new CryptographicException(d1.n5("Missing RSA modulus and exponent.", new Object[]{}));
         }

         com.aspose.slides.internal.x8w.l6 var7 = var2.n5(0);
         if (var7 == null || com.aspose.slides.internal.v6g.k5.u3(var7.l6(), 6) != 2) {
            throw new CryptographicException(d1.n5("Missing RSA modulus.", new Object[]{}));
         }

         com.aspose.slides.internal.x8w.l6 var4 = var2.n5(1);
         if (com.aspose.slides.internal.v6g.k5.u3(var4.l6(), 6) != 2) {
            throw new CryptographicException(d1.n5("Missing RSA public exponent.", new Object[]{}));
         }

         var1.h0 = l6(var7.u3());
         var1.c8 = var4.u3();
      } catch (RuntimeException var5) {
         String var3 = d1.n5("Error decoding the ASN.1 structure.", new Object[]{});
         throw new CryptographicException(var3, var5);
      }

      int var6 = var1.h0.length << 3;
      e9 var8 = new e9(var6);
      var8.n5(var1.n5());
      return var8;
   }
}
