package com.aspose.slides.internal.c8m;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.SortedDictionary;

class j6 extends com.aspose.slides.ms.System.Xml.k1 {
   private Dictionary<String, byte[]> n5 = new Dictionary<>();

   public j6(SortedDictionary<String, byte[]> var1) {
      this.n5 = new Dictionary<>(var1);
   }

   @Override
   public Object n5(com.aspose.slides.ms.System.r8 var1, String var2, com.aspose.slides.ms.System.y8 var3) {
      byte[] var4 = null;
      byte[][] var5 = new byte[][]{var4};
      boolean var6 = var1 != null && this.n5.tryGetValue(var1.l6(), var5);
      var4 = var5[0];
      if (var6) {
         try {
            return new com.aspose.slides.internal.z0k.e2(var4, false);
         } catch (RuntimeException var8) {
            com.aspose.slides.internal.n8e.v4.n5(var8);
            return null;
         }
      } else {
         return null;
      }
   }
}
