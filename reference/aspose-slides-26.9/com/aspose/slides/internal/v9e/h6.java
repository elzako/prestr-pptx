package com.aspose.slides.internal.v9e;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.Xml.a4;
import com.aspose.slides.ms.System.Xml.l1;

public class h6 implements y0 {
   private l1 n5;
   private p3 l6;

   public h6(p3 var1, l1 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("writer");
      }

      this.n5 = var2;
      this.l6 = var1;
   }

   @Override
   public final int n5(x9 var1) {
      s7 var2 = var1.u3();
      switch (var2.a6()) {
         case 0:
         case 2:
         case 6:
         case 9:
         case 11:
         case 12:
         case 16:
            break;
         case 1:
            this.n5.n5(var2.k5(), var2.n5(), var2.l6());
            this.n5(var1.a6(), var1.u9());
            if (var2.h0()) {
               this.n5.s7();
            }
            break;
         case 3:
         case 13:
         case 14:
            this.n5.l6(var2.u3());
            break;
         case 4:
            this.n5.a6(var2.u3());
            break;
         case 5:
            this.n5.k5(var2.n5());
            break;
         case 7:
            this.n5.n5(var2.n5(), var2.u3());
            break;
         case 8:
            this.n5.u9(var2.u3());
            break;
         case 10:
            this.n5.c8(var2.u3());
            break;
         case 15:
            this.n5.x8();
            break;
         default:
            com.aspose.slides.internal.f8y.n5.n5(
               com.aspose.slides.ms.System.d1.n5(new String[]{"Invalid NodeType on output: ", com.aspose.slides.ms.System.s3.n5(a4.class, var2.a6())})
            );
      }

      var1.h0();
      return 0;
   }

   @Override
   public final void l6() {
      this.n5.u9();
      this.n5 = null;
   }

   private void n5(ArrayList var1, int var2) {
      for (int var3 = 0; var3 < var2; var3++) {
         s7 var4 = (s7)var1.get_Item(var3);
         this.n5.l6(var4.k5(), var4.n5(), var4.l6(), var4.u3());
      }
   }
}
