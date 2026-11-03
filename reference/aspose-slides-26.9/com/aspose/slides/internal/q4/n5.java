package com.aspose.slides.internal.q4;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.w0.z1;
import com.aspose.slides.internal.z0k.t4;

public class n5 {
   public static void n5(t4 var0, int var1, IGenericList<z1> var2, z1 var3) {
      int var4;
      for (var4 = 0; var4 < var1 && var4 < var2.size(); var4++) {
         z1 var5 = ((z1)var2.get_Item(var4)).n5();
         var0.writeByte(var5.n5);
         var0.writeByte(var5.l6);
         var0.writeByte(var5.k5);
      }

      while (var4 < var1) {
         var0.writeByte(var3.n5);
         var0.writeByte(var3.l6);
         var0.writeByte(var3.k5);
         var4++;
      }
   }
}
