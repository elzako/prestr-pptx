package com.aspose.slides.ms.System.Xml;

public class j4 extends com.aspose.slides.internal.l7h.u9 {
   @Override
   public int n5(byte[] var1, int var2, int var3) {
      return var3;
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5) {
      int var6 = var2;
      int var7 = var5;

      while (var6 < var2 + var3) {
         var4[var7++] = (char)(var1[var6++] & 0xFF);
      }

      return var3;
   }

   @Override
   public void n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, boolean var7, int[] var8, int[] var9, boolean[] var10) {
      if (var6 < var3) {
         var3 = var6;
         var10[0] = false;
      } else {
         var10[0] = true;
      }

      int var11 = var2;
      int var12 = var5;
      int var13 = var2 + var3;

      while (var11 < var13) {
         var4[var12++] = (char)(var1[var11++] & 0xFF);
      }

      var9[0] = var3;
      var8[0] = var3;
   }
}
