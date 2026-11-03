package com.aspose.slides.internal.x8w;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.o8m.e9;
import com.aspose.slides.internal.o8m.j4;
import com.aspose.slides.internal.o8m.z6;

public class w1$l6 {
   private int n5 = 0;
   private String l6;
   private byte[] k5;
   private ArrayList u3 = new ArrayList();

   public w1$l6() {
   }

   public w1$l6(byte[] var1) {
      this();
      this.l6(var1);
   }

   public byte[] n5() {
      return this.k5 == null ? null : (byte[])this.k5.clone();
   }

   private void l6(byte[] var1) {
      l6 var2 = new l6(var1);
      if (var2.l6() != 48) {
         throw new CryptographicException("invalid PrivateKeyInfo");
      }

      l6 var3 = var2.n5(0);
      if (var3.l6() != 2) {
         throw new CryptographicException("invalid version");
      }

      this.n5 = var3.u3()[0] & 255;
      l6 var4 = var2.n5(1);
      if (var4.l6() != 48) {
         throw new CryptographicException("invalid algorithm");
      }

      l6 var5 = var4.n5(0);
      if (var5.l6() != 6) {
         throw new CryptographicException("missing algorithm OID");
      }

      this.l6 = com.aspose.slides.internal.x8w.k5.l6(var5);
      l6 var6 = var2.n5(2);
      this.k5 = var6.u3();
      if (var2.n5() > 3) {
         l6 var7 = var2.n5(3);

         for (int var8 = 0; var8 < var7.n5(); var8++) {
            this.u3.addItem(var7.n5(var8));
         }
      }
   }

   private static byte[] k5(byte[] var0) {
      byte var1 = 0;
      int var2 = var0.length;
      if (var0[0] == 0) {
         var1 = 1;
         var2--;
      }

      byte[] var3 = new byte[var2];
      com.aspose.slides.ms.System.y4.n5(var0, var1, var3, 0, var2);
      return var3;
   }

   private static byte[] n5(byte[] var0, int var1) {
      if (var0.length == var1) {
         return var0;
      }

      if (var0.length > var1) {
         return k5(var0);
      }

      byte[] var2 = new byte[var1];
      com.aspose.slides.ms.System.y4.n5(var0, 0, var2, var1 - var0.length, var0.length);
      return var2;
   }

   public static z6 n5(byte[] var0) {
      l6 var1 = new l6(var0);
      if (var1.l6() != 48) {
         throw new CryptographicException("invalid private key format");
      }

      l6 var2 = var1.n5(0);
      if (var2.l6() != 2) {
         throw new CryptographicException("missing version");
      }

      if (var1.n5() < 9) {
         throw new CryptographicException("not enough key parameters");
      }

      j4 var3 = new j4();
      var3.h0 = k5(var1.n5(1).u3());
      int var4 = var3.h0.length;
      int var5 = var4 >> 1;
      var3.k5 = n5(var1.n5(3).u3(), var4);
      var3.u3 = n5(var1.n5(6).u3(), var5);
      var3.a6 = n5(var1.n5(7).u3(), var5);
      var3.c8 = k5(var1.n5(2).u3());
      var3.u9 = n5(var1.n5(8).u3(), var5);
      var3.n5 = n5(var1.n5(4).u3(), var5);
      var3.l6 = n5(var1.n5(5).u3(), var5);
      z6 var6 = null;

      try {
         var6 = z6.k5();
         var6.n5(var3.n5());
      } catch (CryptographicException var9) {
         com.aspose.slides.internal.o8m.t9 var8 = new com.aspose.slides.internal.o8m.t9();
         var8.n5(1);
         var6 = new e9(var8);
         var6.n5(var3.n5());
      }

      return var6;
   }

   public static com.aspose.slides.internal.o8m.z3 n5(byte[] var0, com.aspose.slides.internal.o8m.m3 var1) {
      l6 var2 = new l6(var0);
      if (var2.l6() != 2) {
         throw new CryptographicException("invalid private key format");
      }

      var1.h0 = n5(var2.u3(), 20);
      com.aspose.slides.internal.o8m.z3 var3 = com.aspose.slides.internal.o8m.z3.k5();
      var3.l6(var1.n5());
      return var3;
   }
}
