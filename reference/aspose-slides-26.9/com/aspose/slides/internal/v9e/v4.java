package com.aspose.slides.internal.v9e;

import com.aspose.slides.ms.System.Xml.a4;
import com.aspose.slides.ms.System.Xml.v9;

public class v4 implements y0 {
   private com.aspose.slides.internal.x6s.l6 n5 = new com.aspose.slides.internal.x6s.l6();
   private int l6;
   private v9 k5;

   public final com.aspose.slides.internal.x6s.a6 n5() {
      return this.n5.createNavigator();
   }

   public v4(String var1) {
      this.k5 = this.n5.n5(1, var1);
   }

   @Override
   public final int n5(x9 var1) {
      s7 var2 = var1.u3();
      this.l6++;
      switch (var2.a6()) {
         case 1:
            this.k5.n5(var2.k5(), var2.n5(), var2.l6());

            for (int var3 = 0; var3 < var1.u9(); var3++) {
               this.l6++;
               s7 var4 = (s7)var1.a6().get_Item(var3);
               if ("http://www.w3.org/2000/xmlns/".equals(var4.l6())) {
                  if (var4.k5().length() == 0) {
                     this.k5.l6(com.aspose.slides.ms.System.d1.n5, var4.u3());
                  } else {
                     this.k5.l6(var4.n5(), var4.u3());
                  }
               } else {
                  this.k5.l6(var4.k5(), var4.n5(), var4.l6(), var4.u3());
               }
            }

            this.k5.n5();
            if (var2.h0()) {
               this.k5.l6(var2.k5(), var2.n5(), var2.l6());
            }
            break;
         case 2:
         case 4:
         case 5:
         case 6:
         case 10:
         case 11:
         case 12:
         default:
            com.aspose.slides.internal.f8y.n5.n5(
               com.aspose.slides.ms.System.d1.n5(new String[]{"Invalid NodeType on output: ", com.aspose.slides.ms.System.s3.n5(a4.class, var2.a6())})
            );
            break;
         case 3:
            this.k5.l6(var2.u3());
            break;
         case 7:
            this.k5.n5(var2.n5(), var2.u3());
            break;
         case 8:
            this.k5.u9(var2.u3());
         case 9:
         case 13:
            break;
         case 14:
            this.k5.l6(var2.u3());
            break;
         case 15:
            this.k5.l6(var2.k5(), var2.n5(), var2.l6());
      }

      var1.h0();
      return 0;
   }

   @Override
   public final void l6() {
      this.k5.a6();
   }
}
