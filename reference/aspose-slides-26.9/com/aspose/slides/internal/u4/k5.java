package com.aspose.slides.internal.u4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.k5.u9;
import com.aspose.slides.internal.w8.t9;
import com.aspose.slides.internal.y4.z1;
import com.aspose.slides.internal.z5.a6;
import com.aspose.slides.internal.z5.h0;
import com.aspose.slides.internal.z5.t2;
import com.aspose.slides.internal.z5.u3;
import com.aspose.slides.ms.System.IDisposable;

public class k5 {
   public static void n5(t9 var0, com.aspose.slides.internal.z5.l6 var1) {
      Dictionary var2 = var0.n5().u9();
      List var3 = n5();
      List var4 = l6();
      k5$n5 var5 = new k5$n5();
      List$Enumerator var6 = var3.iterator();

      try {
         while (var6.hasNext()) {
            int var7 = com.aspose.slides.internal.v6g.k5.u3(var6.next(), int.class);
            List$Enumerator var8 = var4.iterator();

            try {
               while (var8.hasNext()) {
                  int var9 = com.aspose.slides.internal.v6g.k5.u3(var8.next(), int.class);
                  if (var2.containsKey(var7)) {
                     int var10 = var0.n5().n5(var9);
                     u9 var11 = ((z1)var2.get_Item(var7)).n5(var10);
                     if (var11 != null) {
                        var5.n5(var7, var9, var11, var1.h0().a6());
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                  var8.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      if (var5.n5()) {
         if (var5.k5()) {
            Dictionary var28 = var5.n5(7);
            n5(var1.h0().a6(), var28);
            if (!var5.l6()) {
               n5(var1);
               var28 = var5.n5(6);
               n5(var1.h0().u9(), var28);
            }
         } else {
            boolean var27 = false;
            List$Enumerator var30 = var3.iterator();

            try {
               while (var30.hasNext()) {
                  int var31 = com.aspose.slides.internal.v6g.k5.u3(var30.next(), int.class);
                  if (var5.l6(var31)) {
                     Dictionary var32 = var5.n5(var31);
                     switch (var31) {
                        case 6:
                           n5(var1);
                           n5(var1.h0().u9(), var32);
                           break;
                        case 7:
                        case 8:
                           if (!var27) {
                              l6(var1);
                              var27 = true;
                           }

                           n5(var31 == 7 ? var1.h0().u3() : var1.h0().k5(), var32);
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
                  var30.dispose();
               }
            }

            if (var1.h0().u9() != null && var1.h0().k5() != null) {
               if (!var0.n5().t2(6)) {
                  var1.h0().l6(var1.h0().k5());
               } else {
                  n5(var1.h0().u9().l6().k5(), var1.h0().k5().l6().k5());
                  n5(var1.h0().u9().l6().n5(), var1.h0().k5().l6().n5());
                  n5(var1.h0().u9().l6().u3(), var1.h0().k5().l6().u3());
                  n5(var1.h0().u9().l6().l6(), var1.h0().k5().l6().l6());
               }
            }
         }
      }
   }

   private static void n5(a6 var0, a6 var1) {
      if (!(var0.l6() > 0.0F)) {
         var0.n5(var1.l6());
      }
   }

   private static void n5(com.aspose.slides.internal.z5.u9 var0, Dictionary<Integer, a6> var1) {
      n5(var0.l6());
      n5(var0.n5());
      Dictionary$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (var3.getValue() != null) {
               switch (((Integer)var3.getKey()).intValue()) {
                  case 163:
                     var0.l6().k5().n5(((a6)var3.getValue()).l6());
                     break;
                  case 164:
                     var0.l6().u3().n5(((a6)var3.getValue()).l6());
                     break;
                  case 165:
                     var0.l6().l6().n5(((a6)var3.getValue()).l6());
                     break;
                  case 166:
                     var0.l6().n5().n5(((a6)var3.getValue()).l6());
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static void n5(com.aspose.slides.internal.z5.l6 var0) {
      com.aspose.slides.internal.z5.u9 var1 = var0.h0().u9();
      if (var1 == null) {
         var1 = new com.aspose.slides.internal.z5.u9(var0.h0().a6().n5());
      }

      var0.h0().l6(var1);
   }

   private static void l6(com.aspose.slides.internal.z5.l6 var0) {
      com.aspose.slides.internal.z5.u9 var1 = var0.h0().k5();
      if (var1 == null) {
         var1 = new com.aspose.slides.internal.z5.u9(var0.h0().a6().n5());
      }

      com.aspose.slides.internal.z5.u9 var2 = var0.h0().u3();
      if (var2 == null) {
         var2 = new com.aspose.slides.internal.z5.u9(var0.h0().a6().n5());
      }

      var0.h0().n5(var1, var2);
   }

   private static List<Integer> n5() {
      List var0 = new List();
      var0.addItem(6);
      var0.addItem(7);
      var0.addItem(8);
      return var0;
   }

   private static List<Integer> l6() {
      List var0 = new List();
      var0.addItem(163);
      var0.addItem(164);
      var0.addItem(165);
      var0.addItem(166);
      return var0;
   }

   private static void n5(u3 var0) {
      h0 var1 = new h0();
      var0.k5(var1.n5(var0.k5()));
      var0.u3(var1.n5(var0.u3()));
      var0.n5(var1.n5(var0.n5()));
      var0.l6(var1.n5(var0.l6()));
   }

   private static void n5(t2 var0) {
      h0 var1 = new h0();
      var0.l6(var1.n5(var0.l6()));
      var0.n5(var1.n5(var0.n5()));
   }
}
