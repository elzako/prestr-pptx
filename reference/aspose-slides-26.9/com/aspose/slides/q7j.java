package com.aspose.slides;

class q7j {
   private byte[] n5 = new byte[20];
   private byte[] l6 = new byte[]{-13, 37, 115, -73, -5, -80, 94, 112, -52, 43, -38, 72, -22, -74, 124, -98};
   private byte[] k5 = new byte[]{-122, -39, -127, 105, -11, -77, -126, 51, 86, -80, 21, -69, 51, -7, -33, -53};
   private byte[] u3 = new byte[]{26, -109, 86, 19, 26, 94, -86, -48, -38, 36, -71, -78, 23, -81, -73, -51};
   private byte[] a6 = new byte[]{
      -50, -111, 10, 82, 17, -44, -1, 18, 74, -12, 35, 45, -37, 29, -58, -5, -72, -122, 111, -93, -88, -65, 39, 29, -55, -26, 33, -45, 120, -50, 24, -15
   };
   private byte[] u9 = new byte[]{-57, -104, -55, -34, -51, -97, -53, -72, 39, 88, 114, 127, -18, -8, -26, -25};

   q7j(com.aspose.slides.ms.System.Xml.l0 var1, byte[] var2) {
      com.aspose.slides.ms.System.Xml.u8 var3 = var1.get_Item("keyData").getAttributes().n5("saltValue");
      this.l6 = com.aspose.slides.ms.System.z3.s7(var3.getValue());
      com.aspose.slides.ms.System.Xml.m8 var4 = var1.get_Item("keyEncryptors");
      com.aspose.slides.ms.System.Xml.m8 var5 = var4.get_Item("keyEncryptor").get_Item("p:encryptedKey");
      com.aspose.slides.ms.System.Xml.u8 var6 = var5.getAttributes().n5("saltValue");
      this.k5 = com.aspose.slides.ms.System.z3.s7(var6.getValue());
      com.aspose.slides.ms.System.Xml.u8 var7 = var5.getAttributes().n5("encryptedVerifierHashInput");
      this.u3 = com.aspose.slides.ms.System.z3.s7(var7.getValue());
      com.aspose.slides.ms.System.Xml.u8 var8 = var5.getAttributes().n5("encryptedVerifierHashValue");
      this.a6 = com.aspose.slides.ms.System.z3.s7(var8.getValue());
      com.aspose.slides.ms.System.Xml.u8 var9 = var5.getAttributes().n5("encryptedKeyValue");
      this.u9 = com.aspose.slides.ms.System.z3.s7(var9.getValue());
      byte[] var10 = new byte[this.k5.length + var2.length];
      byte[] var11 = new byte[24];
      System.arraycopy(this.k5, 0, var10, 0, this.k5.length);
      System.arraycopy(var2, 0, var10, this.k5.length, var2.length);
      com.aspose.slides.internal.o8m.h6 var12 = new com.aspose.slides.internal.o8m.h6();

      try {
         this.n5 = var12.l6(var10);

         for (int var13 = 0; var13 < 100000; var13++) {
            System.arraycopy(com.aspose.slides.ms.System.x8.l6(var13), 0, var11, 0, 4);
            System.arraycopy(this.n5, 0, var11, 4, 20);
            this.n5 = var12.l6(var11);
         }
      } finally {
         if (var12 != null) {
            var12.dispose();
         }
      }
   }

   private byte[] n5(byte[] var1, byte[] var2, byte[] var3) {
      byte[] var4 = new byte[]{-2, -89, -46, 118, 59, 75, -98, 121};
      byte[] var5 = new byte[var1.length + var4.length];
      System.arraycopy(var1, 0, var5, 0, var1.length);
      System.arraycopy(var4, 0, var5, var1.length, var4.length);
      byte[] var6 = new byte[16];
      com.aspose.slides.internal.o8m.h6 var7 = new com.aspose.slides.internal.o8m.h6();

      try {
         System.arraycopy(var7.l6(var5), 0, var6, 0, 16);
         byte[] var8 = new byte[var3.length];
         com.aspose.slides.internal.h3k.n5 var9 = new com.aspose.slides.internal.h3k.n5();

         try {
            var9.n5(128);
            var9.k5(1);
            var9.u3(3);
            var9.u3(var2);
            var9.k5(var6);
            com.aspose.slides.internal.o8m.i1 var10 = var9.e2();
            com.aspose.slides.internal.z0k.e2 var11 = new com.aspose.slides.internal.z0k.e2(var3);
            com.aspose.slides.internal.o8m.e2 var12 = new com.aspose.slides.internal.o8m.e2(var11, var10, 0);
            var12.read(var8, 0, var3.length);
            var12.close();
         } finally {
            if (var9 != null) {
               var9.dispose();
            }
         }

         return var7.l6(var8);
      } finally {
         if (var7 != null) {
            var7.dispose();
         }
      }
   }

   private byte[] l6(byte[] var1, byte[] var2, byte[] var3) {
      byte[] var4 = new byte[]{-41, -86, 15, 109, 48, 97, 52, 78};
      byte[] var5 = new byte[var1.length + var4.length];
      System.arraycopy(var1, 0, var5, 0, var1.length);
      System.arraycopy(var4, 0, var5, var1.length, var4.length);
      byte[] var6 = new byte[16];
      com.aspose.slides.internal.o8m.h6 var7 = new com.aspose.slides.internal.o8m.h6();

      try {
         System.arraycopy(var7.l6(var5), 0, var6, 0, 16);
      } finally {
         if (var7 != null) {
            var7.dispose();
         }
      }

      byte[] var8 = new byte[32];
      byte[] var9 = new byte[32];
      System.arraycopy(var3, 0, var8, 0, var3.length);
      com.aspose.slides.internal.h3k.n5 var10 = new com.aspose.slides.internal.h3k.n5();

      try {
         var10.n5(128);
         var10.k5(1);
         var10.u3(3);
         var10.u3(var2);
         var10.k5(var6);
         com.aspose.slides.internal.o8m.i1 var11 = var10.t9();
         com.aspose.slides.internal.z0k.e2 var12 = new com.aspose.slides.internal.z0k.e2(var9);
         com.aspose.slides.internal.o8m.e2 var13 = new com.aspose.slides.internal.o8m.e2(var12, var11, 1);
         var13.write(var8, 0, var8.length);
         var13.close();
      } finally {
         if (var10 != null) {
            var10.dispose();
         }
      }

      return var9;
   }

   final boolean n5() {
      byte[] var1 = this.n5(this.n5, this.k5, this.u3);
      byte[] var2 = this.l6(this.n5, this.k5, var1);
      boolean var3 = true;

      for (int var4 = 0; var4 < var2.length; var4++) {
         if ((var2[var4] & 255) != (this.a6[var4] & 255)) {
            var3 = false;
            break;
         }
      }

      return var3;
   }

   final com.aspose.slides.internal.z0k.e2 n5(com.aspose.slides.internal.z0k.e2 var1) {
      byte[] var2 = new byte[28];
      System.arraycopy(this.n5, 0, var2, 0, 20);
      System.arraycopy(new byte[]{20, 110, 11, -25, -85, -84, -48, -42}, 0, var2, 20, 8);
      com.aspose.slides.internal.o8m.h6 var3 = new com.aspose.slides.internal.o8m.h6();

      try {
         byte[] var4 = var3.l6(var2);
         var2 = new byte[16];
         System.arraycopy(var4, 0, var2, 0, 16);
         byte[] var5 = new byte[16];
         com.aspose.slides.internal.h3k.n5 var6 = new com.aspose.slides.internal.h3k.n5();

         try {
            var6.n5(128);
            var6.k5(1);
            var6.u3(3);
            var6.u3(this.k5);
            var6.k5(var2);
            com.aspose.slides.internal.o8m.i1 var7 = var6.e2();
            com.aspose.slides.internal.z0k.e2 var8 = new com.aspose.slides.internal.z0k.e2(this.u9);
            com.aspose.slides.internal.o8m.e2 var9 = new com.aspose.slides.internal.o8m.e2(var8, var7, 0);
            var9.read(var5, 0, 16);
            var9.close();
            long var10 = var1.getLength();
            long var12 = 0L;
            com.aspose.slides.internal.z0k.e2 var14 = new com.aspose.slides.internal.z0k.e2((int)var1.getLength());
            byte[] var15 = new byte[4096];
            byte[] var16 = new byte[4096];
            var1.setPosition(8L);
            var2 = new byte[20];
            byte[] var17 = new byte[16];

            try {
               while (var12 < var10 - 8L) {
                  System.arraycopy(this.l6, 0, var2, 0, 16);
                  System.arraycopy(com.aspose.slides.ms.System.x8.l6(var12 / 4096L), 0, var2, 16, 4);
                  System.arraycopy(var3.l6(var2), 0, var17, 0, 16);
                  var6.u3(var17);
                  var6.k5(var5);
                  var7 = var6.e2();
                  int var18 = var1.read(var15, 0, 4096);
                  var8 = new com.aspose.slides.internal.z0k.e2(var15);
                  var9 = new com.aspose.slides.internal.o8m.e2(var8, var7, 0);
                  var9.read(var16, 0, var18);
                  var14.write(var16, 0, var18);
                  var9.close();
                  var12 += var18;
               }
            } catch (RuntimeException var27) {
               throw new OOXMLCorruptFileException("Unkown file content!", var27);
            }

            var14.setPosition(0L);
            return var14;
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
}
