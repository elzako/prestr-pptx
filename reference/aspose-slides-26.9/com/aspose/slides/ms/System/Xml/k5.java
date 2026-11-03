package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.XmlException;

public class k5 extends p3 {
   private byte[] n5;
   private int l6;
   private int k5;
   private boolean[] u3;
   private byte[] a6;

   @Override
   public boolean n5() {
      return this.l6 == this.k5;
   }

   @Override
   public int n5(char[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("chars");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("len");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("startPos");
      }

      if (var1.length - var2 < var3) {
         throw new ArgumentOutOfRangeException("len");
      }

      if (var3 == 0) {
         return 0;
      }

      int[] var4 = new int[]{0};
      int[] var5 = new int[]{0};
      char[] var6 = var1;
      byte[] var7 = this.n5;
      n5(var6, var2, var2 + var3, var7, this.l6, this.k5, this.u3, this.a6, var5, var4);
      this.l6 = this.l6 + var4[0];
      return var5[0];
   }

   public static byte[] n5(char[] var0, boolean var1) {
      if (var0 == null) {
         throw new ArgumentNullException("chars");
      }

      int var2 = var0.length;
      if (var2 == 0) {
         return new byte[0];
      }

      byte[] var3 = new byte[(var2 + 1) / 2];
      int[] var4 = new int[]{0};
      int[] var5 = new int[]{0};
      boolean[] var6 = new boolean[]{false};
      byte[] var7 = new byte[]{0};
      char[] var8 = var0;
      byte[] var9 = var3;
      n5(var8, 0, var2, var9, 0, var3.length, var6, var7, var5, var4);
      if (var6[0] && !var1) {
         throw new XmlException(
            "'{0}' is not a valid BinHex text sequence. The sequence must contain an even number of characters.", com.aspose.slides.ms.System.d1.n5(var0)
         );
      }

      if (var4[0] < var3.length) {
         byte[] var10 = new byte[var4[0]];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var10)), 0, var4[0]);
         var3 = var10;
      }

      return var3;
   }

   private static void n5(char[] var0, int var1, int var2, byte[] var3, int var4, int var5, boolean[] var6, byte[] var7, int[] var8, int[] var9) {
      int var10 = var1;
      int var11 = var4;
      u4 var12 = u4.n5().l6();

      while (var10 < var2 && var11 < var5) {
         char var13 = var0[var10++];
         byte var14;
         if (var13 >= 'a' && var13 <= 'f') {
            var14 = (byte)(var13 - 'a' + 10);
         } else if (var13 >= 'A' && var13 <= 'F') {
            var14 = (byte)(var13 - 'A' + 10);
         } else {
            if (var13 < '0' || var13 > '9') {
               if ((var12.n5[var13] & 255 & 1) == 0) {
                  throw new XmlException("'{0}' is not a valid BinHex text sequence.", com.aspose.slides.ms.System.d1.n5(var0, 0, var2 - var1));
               }
               continue;
            }

            var14 = (byte)(var13 - '0');
         }

         if (var6[0]) {
            var3[var11++] = (byte)(((var7[0] & 255) << 4) + (var14 & 255));
            var6[0] = false;
         } else {
            var7[0] = var14;
            var6[0] = true;
         }
      }

      var9[0] = var11 - var4;
      var8[0] = var10 - var1;
   }
}
