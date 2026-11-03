package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;

class f4p {
   private static final Dictionary<Long, String> n5 = new Dictionary<>();
   private com.aspose.slides.internal.k4y.x8o l6;

   public final boolean n5() {
      return this.l6 != null;
   }

   public final void n5(String var1) {
      byte[] var2 = new byte[16];
      com.aspose.slides.internal.o8m.j9 var3 = new com.aspose.slides.internal.o8m.j9();
      var3.l6(var2);
      byte[] var4 = com.aspose.slides.internal.l7h.j5.z1().u3(var1);
      byte[] var5 = new byte[var2.length + var4.length];
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var5)), 0, var2.length);
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var5)), var2.length, var4.length);
      long var6 = 100000L;
      com.aspose.slides.internal.o8m.h6 var8 = new com.aspose.slides.internal.o8m.h6();

      try {
         var5 = var8.l6(var5);
         byte[] var9 = new byte[4];

         for (int var10 = 0; var10 < (var6 & 4294967295L); var10++) {
            var9 = com.aspose.slides.ms.System.x8.l6(var10);
            var5 = n5(var9, var5);
            var5 = var8.l6(var5);
         }
      } finally {
         if (var8 != null) {
            var8.dispose();
         }
      }

      this.l6 = new com.aspose.slides.internal.k4y.x8o();
      this.l6.n5(2);
      this.l6.l6(1);
      this.l6.k5(1);
      this.l6.n5(4L);
      this.l6.l6(var6);
      this.l6.n5(com.aspose.slides.ms.System.z3.n5(var2));
      this.l6.l6(com.aspose.slides.ms.System.z3.n5(var5));
   }

   public final void l6() {
      this.l6 = null;
   }

   public final boolean l6(String var1) {
      return !com.aspose.slides.ms.System.d1.n5(var1) && this.l6 != null ? n5(var1, this.l6) : false;
   }

   private static byte[] n5(byte[] var0, byte[] var1) {
      byte[] var2 = new byte[var0.length + var1.length];
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0, var1.length);
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var0)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var2)), var1.length, var0.length);
      return var2;
   }

   public final void n5(com.aspose.slides.internal.k4y.x8o var1) {
      this.l6 = var1;
   }

   public static boolean n5(String var0, com.aspose.slides.internal.k4y.x8o var1) {
      if (var0 == null) {
         throw new ArgumentNullException("password");
      }

      if (var1 == null) {
         throw new ArgumentNullException("data");
      }

      if (var1.n5() != 1) {
         throw new PptxException("An unknown cryptographic algorithm class is encountered for the password to modify.");
      }

      if (var1.l6() != 1) {
         throw new PptxException("An unknown cryptographic algorithm type is encountered for the password to modify.");
      }

      if (!n5.containsKey(var1.k5())) {
         throw new PptxException("An unknown cryptographic hashing algorithm is encountered for the password to modify.");
      }

      byte[] var2 = com.aspose.slides.ms.System.z3.s7(var1.a6());
      byte[] var3 = com.aspose.slides.internal.l7h.j5.z1().u3(var0);
      byte[] var4 = new byte[var2.length + var3.length];
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, var2.length);
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var4)), var2.length, var3.length);
      long var5 = var1.u3();
      com.aspose.slides.internal.o8m.f2 var7 = k5(n5.get_Item(var1.k5()));

      try {
         var4 = var7.l6(var4);
         byte[] var8 = new byte[4];

         for (int var9 = 0; var9 < (var5 & 4294967295L); var9++) {
            var8 = com.aspose.slides.ms.System.x8.l6(var9);
            var4 = n5(var8, var4);
            var4 = var7.l6(var4);
         }

         return com.aspose.slides.ms.System.d1.a6(com.aspose.slides.ms.System.z3.n5(var4), var1.u9());
      } finally {
         if (var7 != null) {
            var7.dispose();
         }
      }
   }

   public final com.aspose.slides.internal.k4y.x8o k5() {
      return this.l6;
   }

   private static com.aspose.slides.internal.o8m.f2 k5(String var0) {
      com.aspose.slides.internal.f8y.n5.n5(!com.aspose.slides.ms.System.d1.n5(var0));
      com.aspose.slides.internal.o8m.f2 var1 = com.aspose.slides.internal.o8m.f2.k5(var0);
      if (var1 == null) {
         String var2 = "The {0} hashing algorithm is not supported for encrypting and decrypting passwords to modify.";
         throw new PptxException(com.aspose.slides.ms.System.d1.n5(var2, new Object[]{var0}));
      } else {
         return var1;
      }
   }

   static {
      n5.addItem(1L, "MD2");
      n5.addItem(2L, "MD4");
      n5.addItem(3L, "MD5");
      n5.addItem(4L, "SHA1");
      n5.addItem(5L, "MAC");
      n5.addItem(6L, "RIPEMD");
      n5.addItem(7L, "RIPEMD160");
      n5.addItem(9L, "HMAC");
      n5.addItem(12L, "SHA256");
      n5.addItem(13L, "SHA384");
      n5.addItem(14L, "SHA512");
   }
}
