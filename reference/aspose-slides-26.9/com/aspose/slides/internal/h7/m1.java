package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.d1;

public class m1 {
   public final String n5;
   private byte[] l6;
   private com.aspose.slides.internal.v2.k5 k5;
   private static final com.aspose.slides.internal.v6g.c8<Dictionary<String, m1>> u3 = new com.aspose.slides.internal.v6g.c8<>(null);

   public final byte[] n5() {
      return this.l6;
   }

   public final void n5(byte[] var1) {
      this.l6 = var1;
   }

   public final void n5(com.aspose.slides.internal.v2.k5 var1) {
      this.k5 = var1;
   }

   public m1(String var1) {
      if (d1.l6(var1, "/")) {
         String var2 = d1.n5("Illegal operator '{0}'. Reason: Not allowed to start with '/'", new Object[]{var1});
         throw new ArgumentException(var2);
      }

      this.n5 = var1;
   }

   public static m1 n5(String var0) {
      if (!"ID".equals(var0) && !"BI".equals(var0)) {
         Dictionary var1 = u3.get();
         if (var1 == null) {
            var1 = new Dictionary();
            u3.set(var1);
         }

         m1 var2 = null;
         m1[] var3 = new m1[]{var2};
         boolean var4 = var1.tryGetValue(var0, var3);
         var2 = var3[0];
         if (var4) {
            return var2;
         }

         var2 = new m1(var0);
         var1.addItem(var0, var2);
         return var2;
      } else {
         return new m1(var0);
      }
   }
}
