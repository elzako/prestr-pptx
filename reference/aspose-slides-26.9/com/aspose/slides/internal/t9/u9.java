package com.aspose.slides.internal.t9;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.k5.e2;
import com.aspose.slides.internal.k5.l6$n5;
import com.aspose.slides.internal.k7.m1;
import com.aspose.slides.internal.m3.u6;
import com.aspose.slides.internal.y4.t4;
import com.aspose.slides.ms.System.IDisposable;

public class u9 implements t2 {
   private String n5;
   private IGenericList<h0> l6;
   private int k5 = 0;
   private m1 u3;

   public static u9 n5(e2 var0) {
      com.aspose.slides.internal.h0.l6 var1 = (com.aspose.slides.internal.h0.l6)var0.k5();
      u9 var2 = new u9();
      com.aspose.slides.internal.k5.u9 var3 = var1.l6(114);
      if (var3 != null) {
         var2.n5 = var3.u9();
      }

      var3 = var1.l6(127);
      var3 = n5(var3);
      if (var3 != null) {
         var2.u3 = new m1(var3);
      } else {
         var2.u3 = new m1(l6$n5.e2);
      }

      var3 = var1.l6(119);
      if (var3 != null) {
         var2.k5 = com.aspose.slides.internal.u3.k5.n5(com.aspose.slides.internal.v6g.k5.n5(u6.class), var3.u9());
      } else {
         var2.k5 = 0;
      }

      var2.l6 = new List<>();
      var3 = var1.l6(298);
      if (var3 != null) {
         com.aspose.slides.internal.k5.h0 var4 = (com.aspose.slides.internal.k5.h0)var3;
         IGenericEnumerator var5 = var4.iterator();

         try {
            while (var5.hasNext()) {
               com.aspose.slides.internal.k5.u9 var6 = (com.aspose.slides.internal.k5.u9)var5.next();
               if (com.aspose.slides.internal.v6g.k5.l6(var6, t4.class)) {
                  h0 var7 = new h0();
                  var7.n5(((t4)var6).l6());
                  var2.l6.addItem(var7);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      return var2;
   }

   @Override
   public final String n5() {
      return this.n5;
   }

   @Override
   public final IGenericList<h0> l6() {
      return this.l6;
   }

   public final int k5() {
      return this.k5;
   }

   public final m1 u3() {
      return this.u3;
   }

   private static com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.k5.u9 var0) {
      if (var0 == l6$n5.d2) {
         return l6$n5.e2;
      } else if (var0 == l6$n5.l5) {
         return l6$n5.t4;
      } else if (var0 == l6$n5.e6) {
         return l6$n5.e2;
      } else {
         return var0 == l6$n5.j0 ? l6$n5.e2 : var0;
      }
   }
}
