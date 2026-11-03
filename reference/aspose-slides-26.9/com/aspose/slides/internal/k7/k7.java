package com.aspose.slides.internal.k7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.m3.j9;
import com.aspose.slides.ms.System.d1;

public class k7 extends n5 {
   private String n5;
   private com.aspose.slides.internal.t4.n5 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("linear-gradient");

   public k7(com.aspose.slides.internal.k5.u9 var1) {
      super(var1);
      if (this.n5()) {
         this.n5 = this.u3();
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.y4.t2.class)) {
         com.aspose.slides.internal.y4.t2 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.y4.t2.class);
         switch (k5.n5(d1.a6(var2.n5()))) {
            case 0:
               com.aspose.slides.internal.k5.u9[] var3 = var2.l6();
               int var4 = (int)com.aspose.slides.ms.System.d5.parse(
                  com.aspose.slides.internal.v6g.k5.n5(j9.class), ((com.aspose.slides.internal.y4.t9)var3[0]).l6()
               );
               k5 var5 = null;
               if (var3[1] != null) {
                  var5 = new k5(var3[1]);
               }

               List var6 = new List();

               for (int var7 = 2; var7 < var3.length; var7++) {
                  var6.addItem(new n3(var3[var7]));
               }

               this.l6 = new com.aspose.slides.internal.t4.l6(var4, var5, var6);
         }
      }
   }

   public final String h0() {
      return this.n5;
   }

   public final com.aspose.slides.internal.t4.n5 c8() {
      return this.l6;
   }

   public final boolean t2() {
      return d1.n5(this.n5) && this.c8() == null;
   }
}
