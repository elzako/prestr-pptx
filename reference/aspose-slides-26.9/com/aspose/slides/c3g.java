package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NullReferenceException;

class c3g {
   private static final byte[] n5 = new byte[]{-2, -89, -46, 118, 59, 75, -98, 121};
   private static final byte[] l6 = new byte[]{-41, -86, 15, 109, 48, 97, 52, 78};
   private static final byte[] k5 = new byte[]{20, 110, 11, -25, -85, -84, -48, -42};
   private final com.aspose.slides.ms.System.Xml.l0 u3;
   private final r2o a6 = new r2o();
   private final byte[] u9;
   private byte[] h0;
   private byte[] c8;
   private byte[] t2;
   private byte[] s7;
   private byte[] x8;
   private int n3;
   private byte[] y4;
   private static final com.aspose.slides.internal.v6g.u9 e2 = new com.aspose.slides.internal.v6g.u9("ChainingModeCFB", "ChainingModeCBC");

   public c3g(String var1, com.aspose.slides.ms.System.Xml.l0 var2, byte[] var3) {
      if (var2 == null) {
         throw new ArgumentNullException("encryptionDataNode");
      }

      this.u3 = var2;
      this.a6.n5(var1);
      this.u9 = var3;
      this.k5();
      this.u3();
      this.a6();
      this.u9();
   }

   public final boolean n5() {
      if (this.y4 == this.t2) {
         return true;
      }

      if (this.y4 != null && this.t2 != null) {
         if (this.y4.length != this.t2.length) {
            return false;
         }

         for (int var1 = 0; var1 < this.y4.length; var1++) {
            if ((this.y4[var1] & 255) != (this.t2[var1] & 255)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public final com.aspose.slides.internal.z0k.e2 n5(com.aspose.slides.internal.z0k.e2 var1) {
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2();
      byte[] var3 = new byte[4096];
      int var4 = this.n5(var1, var2, var3, 0L);

      while (var4 < var1.getLength()) {
         int var5 = this.n5(var1, var2, var3, var4);
         if (var5 == 0) {
            break;
         }

         var4 += var5;
      }

      return var2;
   }

   private int n5(com.aspose.slides.internal.z0k.e2 var1, com.aspose.slides.internal.z0k.e2 var2, byte[] var3, long var4) {
      long var6 = var4 / var3.length;
      var1.setPosition(this.n5(var6 * var3.length));
      int var8 = var1.read(var3, 0, var3.length);
      r2o var9 = this.l6();
      com.aspose.slides.internal.o8m.i1 var10 = this.n5(var9, com.aspose.slides.ms.System.x8.l6((int)var6), false);

      try {
         n5(var10, var3, 0, var8);
         var2.write(var3, 0, var3.length);
      } finally {
         if (var10 != null) {
            var10.dispose();
         }
      }

      return var8;
   }

   private r2o l6() {
      r2o var1 = new r2o();
      com.aspose.slides.ms.System.Xml.m8 var2 = this.u3.get_Item("keyData");
      var1.n5(com.aspose.slides.ms.System.z3.s7(var2.getAttributes().n5("saltValue").getValue()));
      var1.l6(var2.getAttributes().n5("cipherAlgorithm").getValue());
      var1.k5(var2.getAttributes().n5("cipherChaining").getValue());
      var1.n5(var2.getAttributes().n5("hashAlgorithm").getValue());
      var1.n5(this.l6(var2));
      var1.l6(this.k5(var2));
      return var1;
   }

   private long n5(long var1) {
      return var1 + com.aspose.slides.internal.v6g.k5.n5(11);
   }

   private void k5() {
      com.aspose.slides.ms.System.Xml.m8 var1 = this.u3.get_Item("keyEncryptors");
      if (var1 == null) {
         throw new InvalidOperationException();
      }

      com.aspose.slides.ms.System.Xml.m8 var2 = var1.get_Item("keyEncryptor");
      if (var2 == null) {
         throw new InvalidOperationException();
      }

      com.aspose.slides.ms.System.Xml.m8 var3 = var2.get_Item("p:encryptedKey");
      this.n5(var3);
      this.a6.n5(this.l6(var3));
      this.a6.l6(this.k5(var3));
      this.a6.n5(com.aspose.slides.ms.System.z3.s7(var3.getAttributes().n5("saltValue").getValue()));
      this.a6.l6(var3.getAttributes().n5("cipherAlgorithm").getValue());
      this.a6.k5(var3.getAttributes().n5("cipherChaining").getValue());
      this.c8 = com.aspose.slides.ms.System.z3.s7(var3.getAttributes().n5("encryptedVerifierHashInput").getValue());
      this.t2 = com.aspose.slides.ms.System.z3.s7(var3.getAttributes().n5("encryptedVerifierHashValue").getValue());
      this.s7 = com.aspose.slides.ms.System.z3.s7(var3.getAttributes().n5("encryptedKeyValue").getValue());
   }

   private void n5(com.aspose.slides.ms.System.Xml.l0 var1) {
      int var2 = 0;
      int[] var3 = new int[]{0};
      boolean var4 = com.aspose.slides.ms.System.a3.n5(var1.getAttributes().n5("spinCount").getValue(), var3);
      var2 = var3[0];
      if (var4) {
         this.n3 = var2;
      } else {
         this.n3 = 100000;
      }
   }

   private int l6(com.aspose.slides.ms.System.Xml.l0 var1) {
      int var2 = 0;
      int[] var3 = new int[]{0};
      boolean var4 = com.aspose.slides.ms.System.a3.n5(var1.getAttributes().n5("keyBits").getValue(), var3);
      var2 = var3[0];
      return var4 ? var2 : 128;
   }

   private int k5(com.aspose.slides.ms.System.Xml.l0 var1) {
      int var2 = 0;
      int[] var3 = new int[]{0};
      boolean var4 = com.aspose.slides.ms.System.a3.n5(var1.getAttributes().n5("blockSize").getValue(), var3);
      var2 = var3[0];
      return var4 ? var2 * 8 : 128;
   }

   private void u3() {
      com.aspose.slides.internal.o8m.f2 var1 = this.h0();

      try {
         var1.n5(this.a6.n5(), 0, this.a6.n5().length, null, 0);
         var1.n5(this.u9, 0, this.u9.length);
         byte[] var2 = var1.n3();

         for (int var3 = 0; var3 < this.n3; var3++) {
            byte[] var4 = com.aspose.slides.ms.System.x8.l6(var3);
            var1.t2();
            var1.n5(var4, 0, var4.length, null, 0);
            var1.n5(var2, 0, var2.length);
            var2 = var1.n3();
         }

         this.h0 = var2;
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   private void a6() {
      byte[] var1 = (byte[])this.c8.clone();
      com.aspose.slides.internal.o8m.i1 var2 = this.n5(n5, false);

      try {
         n5(var2, var1, 0, var1.length);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      com.aspose.slides.internal.o8m.f2 var4 = this.h0();

      byte[] var3;
      try {
         int var5 = var4.y4() / 8;
         var3 = new byte[n5(var5, this.a6.k5() / 8)];
         var4.n5(var1, 0, var1.length);
         com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var4.n3())), 0, com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, var5);
      } finally {
         if (var4 != null) {
            var4.dispose();
         }
      }

      com.aspose.slides.internal.o8m.i1 var20 = this.n5(l6, true);

      try {
         n5(var20, var3, 0, var3.length);
      } finally {
         if (var20 != null) {
            var20.dispose();
         }
      }

      this.y4 = var3;
   }

   private void u9() {
      byte[] var1 = (byte[])this.s7.clone();
      com.aspose.slides.internal.o8m.i1 var2 = this.n5(k5, false);

      try {
         n5(var2, var1, 0, var1.length);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      this.x8 = var1;
   }

   private com.aspose.slides.internal.o8m.i1 n5(byte[] var1, boolean var2) {
      com.aspose.slides.internal.o8m.f2 var3 = this.h0();

      try {
         var3.n5(this.h0, 0, this.h0.length, null, 0);
         var3.n5(var1, 0, var1.length);
         byte[] var4 = n5(var3.n3(), this.a6.l6() / 8, (byte)54);
         byte[] var5 = n5(this.a6.n5(), this.a6.k5() / 8, (byte)54);
         com.aspose.slides.internal.o8m.u8 var6 = this.n5(this.a6);

         try {
            com.aspose.slides.internal.o8m.i1 var7 = null;
            if (var2) {
               var7 = var6.n5(var4, var5);
            } else {
               var7 = var6.l6(var4, var5);
            }

            return var7;
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private com.aspose.slides.internal.o8m.i1 n5(r2o var1, byte[] var2, boolean var3) {
      com.aspose.slides.internal.o8m.f2 var4 = this.n5(var1.u3());
      var4.n5(var1.n5(), 0, var1.n5().length, null, 0);
      var4.n5(var2, 0, var2.length);
      byte[] var5 = n5(var4.n3(), var1.k5() / 8, (byte)54);
      com.aspose.slides.internal.o8m.u8 var6 = this.n5(var1);
      return var3 ? var6.n5(this.x8, var5) : var6.l6(this.x8, var5);
   }

   private static byte[] n5(byte[] var0, int var1, byte var2) {
      byte[] var3 = new byte[var1];
      com.aspose.slides.ms.System.y4.n5(
         com.aspose.slides.ms.System.u3.n5((Object)(var0)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, com.aspose.slides.ms.System.q1.l6(var0.length, var3.length)
      );

      for (int var4 = var0.length; var4 < var3.length; var4++) {
         var3[var4] = var2;
      }

      return var3;
   }

   private static void n5(com.aspose.slides.internal.o8m.i1 var0, byte[] var1, int var2, int var3) {
      if (var3 != 0) {
         int var4 = var0.n5(var1, var2, var3, var1, var2);
         if (var3 != var4) {
            throw new InvalidOperationException();
         }
      }
   }

   private static int n5(int var0, int var1) {
      return var1 == 0 ? var1 : (var0 + var1 - 1) / var1 * var1;
   }

   private com.aspose.slides.internal.o8m.f2 n5(String var1) {
      return com.aspose.slides.internal.o8m.f2.k5(var1);
   }

   private com.aspose.slides.internal.o8m.f2 h0() {
      return this.n5(this.a6.u3());
   }

   private com.aspose.slides.internal.o8m.u8 n5(r2o var1) {
      com.aspose.slides.internal.o8m.u8 var2 = l6(var1.a6());
      if (var2 == null && com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.d1.t2(var1.a6()), "AES")) {
         var2 = new com.aspose.slides.internal.h3k.n5();
      }

      if (var2 != null) {
         var2.l6(var1.k5());
         var2.n5(var1.l6());
         var2.u3(1);
         switch (e2.n5(var1.u9())) {
            case 0:
               var2.k5(4);
               break;
            case 1:
               var2.k5(1);
               break;
            default:
               throw new InvalidOperationException();
         }

         return var2;
      } else {
         throw new NullReferenceException("Algorithm couldn't be empty.");
      }
   }

   private static com.aspose.slides.internal.o8m.u8 l6(String var0) {
      return com.aspose.slides.internal.o8m.u8.l6(var0);
   }
}
