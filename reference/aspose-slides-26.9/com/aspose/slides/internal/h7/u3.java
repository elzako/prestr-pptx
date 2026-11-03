package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class u3 extends j4 {
   public u3(com.aspose.slides.internal.t8.l6 var1, com.aspose.slides.internal.t8.n5 var2, com.aspose.slides.internal.k0.u3 var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      String var3 = null;
      String[] var4 = new String[]{var3};
      this.n5(var2, var4);
      var3 = var4[0];
      this.n5(var3);
      if (!this.l6.a6()) {
         this.l6.n5(new com.aspose.slides.internal.x4g.m1());
         this.l6.l6(new com.aspose.slides.internal.x4g.m1());
      }
   }

   private void n5(List<com.aspose.slides.internal.v2.s7> var1, String[] var2) {
      var2[0] = null;
      if (var1.size() >= 2) {
         com.aspose.slides.internal.v2.c8 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.get_Item(0), com.aspose.slides.internal.v2.c8.class);
         if (var3 != null) {
            com.aspose.slides.internal.v2.k5 var4 = com.aspose.slides.internal.v6g.k5.n5(var1.get_Item(1), com.aspose.slides.internal.v2.k5.class);
            if (var4 != null && this.l6.l6() != null) {
               com.aspose.slides.internal.u1.u3 var5 = this.n5.n5().t2().u9();
               if (var5 != null && var5.u3() == null) {
                  var5.n5(com.aspose.slides.internal.p2.h0.k5);
               }

               int var6 = this.l6.n5().size();
               Dictionary$Enumerator var7 = var4.k5().iterator();

               try {
                  while (var7.hasNext()) {
                     KeyValuePair var8 = (KeyValuePair)var7.next();
                     if (var8.getKey() == com.aspose.slides.internal.v2.c8.u3) {
                        com.aspose.slides.internal.v2.y4 var9 = com.aspose.slides.internal.v6g.k5.n5(var8.getValue(), com.aspose.slides.internal.v2.y4.class);
                        if (var9 == null) {
                           continue;
                        }

                        this.n5(var9.n5());
                     }

                     if (var8.getKey() == com.aspose.slides.internal.v2.c8.m9) {
                        com.aspose.slides.internal.v2.y4 var13 = com.aspose.slides.internal.v6g.k5.n5(var8.getValue(), com.aspose.slides.internal.v2.y4.class);
                        var2[0] = var13.l6();
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                     var7.dispose();
                  }
               }

               if (this.l6.n5().size() > var6) {
                  this.l6.n5(true);
               }
            }
         }
      }
   }

   private void n5(String var1) {
      com.aspose.slides.internal.t8.a6 var2 = this.n5.n5();
      com.aspose.slides.internal.t8.c8 var3 = var2.t2().t2();
      var3.n5(var1);
      var2.n5(var3.t2());
      this.n5.n5(var2);
   }
}
