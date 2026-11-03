package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.k5.l6$n5;
import com.aspose.slides.ms.System.IDisposable;

public class k0 extends com.aspose.slides.internal.n3.h0 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "voice-family";
   }

   @Override
   public int l6() {
      return 276;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      IGenericList var3 = com.aspose.slides.internal.z8.n5.n5(var1);
      List var4 = new List();
      IGenericEnumerator var5 = var3.iterator();

      try {
         while (var5.hasNext()) {
            com.aspose.slides.internal.z8.y4 var6 = (com.aspose.slides.internal.z8.y4)var5.next();
            switch (var6.n5()) {
               case 0:
                  break;
               case 12:
                  if (var4.size() != 0) {
                     var4.clear();
                  }

                  var4.addItem(l6$n5.n5);
                  return new com.aspose.slides.internal.k5.h0(var4);
               case 35:
               case 36:
                  com.aspose.slides.internal.k5.u9 var7 = this.a6().n5(var6.t2());
                  if (var7 == null) {
                     var7 = com.aspose.slides.internal.y4.t9.l6(var6.t2());
                  }

                  var4.addItem(var7);
                  break;
               default:
                  throw this.n5(var6.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return new com.aspose.slides.internal.k5.h0(var4);
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return new com.aspose.slides.internal.k5.h0();
   }

   static {
      n5.n5("male", l6$n5.j7);
      n5.n5("female", l6$n5.k0);
      n5.n5("child", l6$n5.d4);
   }
}
