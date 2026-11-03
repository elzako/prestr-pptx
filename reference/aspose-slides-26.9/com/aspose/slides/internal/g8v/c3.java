package com.aspose.slides.internal.g8v;

import com.aspose.slides.exceptions.Exception;

class c3 extends com.aspose.slides.ms.System.h0 {
   // $VF: synthetic field
   final z6 n5;
   // $VF: synthetic field
   final p6 l6;

   c3(p6 var1, z6 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public void n5(com.aspose.slides.ms.System.z7 var1) {
      try {
         p6.l6(this.l6).n5(p6.n5(this.l6), true, var1);
         if (!p6.k5(this.l6)) {
            p6.n5(this.l6, true);
            v8.n5((Object)p6.l6(this.l6));
         }

         long var2 = p6.n5(this.l6).a6();
         if (!p6.u3(this.l6) && var2 == 0L) {
            p6.l6(this.l6, true);
         }

         this.n5.n5(false);
      } catch (a7 var5) {
         this.n5.n5(false, var5);
      } catch (Exception var6) {
         this.n5.n5(false, new a7("Error writing headers", var6, 4));
      }
   }
}
