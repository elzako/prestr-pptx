package com.aspose.slides.internal.l4;

import com.aspose.slides.internal.c3.h6;
import com.aspose.slides.internal.c3.y8;
import com.aspose.slides.ms.System.d1;

public class a6 extends j5 {
   @Override
   public boolean n5(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      if (var1.h0() && var1.t4().l6()) {
         var2.n5(var1.t4());
      } else if (var1.c8()) {
         var2.n5(var1.z1());
      } else if (var1.t2()) {
         var2.l6(this);
      } else if (var1.s7()) {
         h6 var3 = var1.e2();
         String var4 = var3.n5();
         if (d1.a6(var4, "html")) {
            return h0.n5(var1, var2);
         }

         if (d1.a6(var4, "body")) {
            var2.l6(var3);
            var2.n5(false);
            var2.n5(h0);
         } else if (d1.a6(var4, "frameset")) {
            var2.l6(var3);
            var2.n5(m1);
         } else if (com.aspose.slides.internal.w3.u9.l6(var4, "base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title")
            )
          {
            var2.l6(this);
            com.aspose.slides.internal.f5.z3 var5 = var2.x8();
            var2.l6(var5);
            u3.n5(var1, var2);
            var2.l6().l6(var5);
         } else {
            if (d1.a6(var4, "head")) {
               var2.l6(this);
               return false;
            }

            this.l6(var1, var2);
         }
      } else {
         if (!var1.x8()) {
            return this.l6(var1, var2);
         }

         String var6 = var1.y4().n5();
         if (d1.a6(var6, "template")) {
            return u3.n5(var1, var2);
         }

         if (!com.aspose.slides.internal.w3.u9.l6(var6, "body", "html", "br")) {
            var2.l6(this);
            return false;
         }

         this.l6(var1, var2);
      }

      return true;
   }

   @Override
   public boolean l6(y8 var1, com.aspose.slides.internal.c3.u9 var2) {
      var2.n5("body");
      var2.n5(h0);
      return var2.n5(var1);
   }
}
