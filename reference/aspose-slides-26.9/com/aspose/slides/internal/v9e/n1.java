package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.ms.System.Xml.f4;
import com.aspose.slides.ms.System.Xml.k6;

public class n1 extends t9 {
   private k6[] n5;
   private String l6;

   public final k6[] n5() {
      return this.n5;
   }

   public void l6(z1 var1) {
      this.l6 = var1.u3().t4();
      if (this.l6.length() == 0) {
         this.n5 = new k6[0];
      } else {
         String[] var2 = f4.c4(this.l6);

         try {
            this.n5 = new k6[var2.length];

            for (int var3 = 0; var3 < var2.length; var3++) {
               this.n5[var3] = var1.s7(var2[var3]);
            }
         } catch (XsltException var4) {
            if (!var1.n3()) {
               throw var4;
            }

            this.n5 = new k6[0];
         }
      }
   }

   @Override
   public void n5(p3 var1, l6 var2) {
      switch (var2.k5()) {
         case 0:
            var2.l6(0);
            var2.n5(2);
            if (var2.u3() < this.n5.length) {
               u9 var4 = var1.h0().n5(this.n5[var2.u3()]);
               var2.c8();
               var1.n5(var4, var2.u9());
            } else {
               var2.s7();
            }
            break;
         case 2:
            if (var2.u3() < this.n5.length) {
               u9 var3 = var1.h0().n5(this.n5[var2.u3()]);
               var2.c8();
               var1.n5(var3, var2.u9());
            } else {
               var2.s7();
            }
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5("Invalid Container action execution state");
      }
   }
}
