package com.aspose.slides.internal.q3;

import com.aspose.slides.internal.i4.f5;
import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j4;
import com.aspose.slides.internal.i4.u5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class a6 extends k5 {
   private Object n5;
   private String l6;
   private String k5;

   public a6(String var1) {
      this.l6 = var1;
   }

   public a6(String var1, Object var2) {
      this(var1);
      this.n5 = var2;
   }

   protected final void n5(g7 var1) {
      this.u3().n5(this.a6(), var1);
   }

   @Override
   public void l6() {
      g7 var2;
      if (this.n5 != null) {
         c8 var1 = this.u3().n5(j8.n5(this.n5));
         var2 = var1.l6(this.n5);
      } else {
         var2 = this.u3().n3().s7();
      }

      this.n5(var2);
      if (!d1.n5(this.k5)) {
         try {
            u5 var5 = f5.n5(this.k5);
            if (var5 != null) {
               var5.n5(new n5((j4)var2, this.u3()));
            }
         } catch (RuntimeException var4) {
         }
      }
   }

   @Override
   public String a6() {
      return this.l6;
   }
}
