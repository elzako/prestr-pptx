package com.aspose.slides.internal.z6y;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.internal.g8v.b5;
import com.aspose.slides.internal.g8v.d5;
import com.aspose.slides.internal.g8v.f2;
import com.aspose.slides.internal.g8v.w1;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.d1;

public class n5 implements d5 {
   static final Hashtable n5 = new Hashtable();

   @Override
   public com.aspose.slides.internal.g8v.l6 n5(String var1, b5 var2, f2 var3) {
      if (var3 != null && var1 != null) {
         String var4 = d1.l6(var1);
         int var5 = d1.c8(d1.u9(var4), "ntlm");
         if (var5 == -1) {
            return null;
         }

         var5 = d1.n5(var4, new char[]{' ', '\t'});
         if (var5 != -1) {
            var4 = d1.l6(d1.k5(var4, var5));
         } else {
            var4 = null;
         }

         w1 var6 = k5.n5(var2, w1.class);
         if (var6 == null) {
            return null;
         }

         synchronized (n5) {
            l6 var8 = (l6)n5.get_Item(var6);
            if (var8 == null) {
               var8 = new l6();
               n5.addItem(var6, var8);
            }

            return var8.n5(var4, var2, var3);
         }
      } else {
         return null;
      }
   }

   @Override
   public com.aspose.slides.internal.g8v.l6 l6(b5 var1, f2 var2) {
      return null;
   }

   @Override
   public String n5() {
      return "NTLM";
   }
}
