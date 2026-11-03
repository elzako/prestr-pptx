package com.aspose.slides.internal.m4d;

import com.aspose.slides.Collections.Generic.List;
import java.awt.image.IndexColorModel;
import java.util.Map;

public class a6 {
   private final com.aspose.slides.internal.e2l.u9 n5;
   private final List<com.aspose.slides.internal.v2x.k5> l6;
   private final Map<Integer, Integer> k5;

   a6(com.aspose.slides.internal.e2l.u9 var1, List<com.aspose.slides.internal.v2x.k5> var2, Map<Integer, Integer> var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public IndexColorModel n5(int var1) {
      h0 var2 = this.l6(var1);
      return new IndexColorModel(var2.u9, var2.a6, var2.l6, var2.k5, var2.u3, var2.n5);
   }

   public h0 l6(int var1) {
      com.aspose.slides.internal.j3b.u3 var2 = null;
      com.aspose.slides.internal.v2x.k5 var3 = this.l6.get_Item(var1);
      if (var3.y4() != null) {
         var2 = var3.y4();
      } else {
         var2 = this.n5.y4();
      }

      if (var2 == null) {
         throw new IllegalArgumentException("palette == null");
      }

      short var4 = 256;
      byte[] var5 = new byte[var4];
      byte[] var6 = new byte[var4];
      byte[] var7 = new byte[var4];

      for (int var8 = 0; var8 < var2.n5(); var8++) {
         int var9 = var2.l6(var8);
         var5[var8] = (byte)(var9 >> 16 & 0xFF);
         var6[var8] = (byte)(var9 >> 8 & 0xFF);
         var7[var8] = (byte)(var9 >> 0 & 0xFF);
      }

      byte var12 = 0;
      if (var4 == 2) {
         var12 = 1;
      } else if (var4 == 4) {
         var12 = 2;
      } else if (var4 != 8 && var4 != 16) {
         var12 = 8;
      } else {
         var12 = 4;
      }

      boolean var14 = this.k5.containsKey(var1);
      h0 var10 = new h0();
      var10.n5 = var14 ? this.k5.get(var1) : -1;
      var10.l6 = var5;
      var10.k5 = var6;
      var10.u3 = var7;
      var10.a6 = var4;
      var10.u9 = var12;
      return var10;
   }
}
