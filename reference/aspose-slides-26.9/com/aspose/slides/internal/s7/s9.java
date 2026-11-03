package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.k5.l6$n5;

public class s9 extends com.aspose.slides.internal.n3.t9 {
   @Override
   public String n5() {
      return "font-family";
   }

   @Override
   public int l6() {
      return 114;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return new com.aspose.slides.internal.k5.h0();
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return null;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      List var3 = new List();
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();

      do {
         switch (var1.n5()) {
            case 0:
               if (var4.l6() != 0) {
                  var3.addItem(com.aspose.slides.internal.y4.t9.k5(var4.toString()));
                  var4 = new com.aspose.slides.internal.l7h.a5();
               }
               break;
            case 12:
               return l6$n5.n5;
            case 35:
               if (var4.l6() != 0) {
                  var4.n5(" ").n5(var1.t2());
               } else {
                  var4.n5(var1.t2());
               }
               break;
            case 36:
               var3.addItem(com.aspose.slides.internal.y4.t9.k5(var1.t2()));
               break;
            default:
               throw this.n5(var1.n5());
         }

         var1 = var1.k5();
      } while (var1 != null);

      if (var4.l6() != 0) {
         var3.addItem(com.aspose.slides.internal.y4.t9.k5(var4.toString()));
      }

      return new com.aspose.slides.internal.k5.h0(var3);
   }
}
