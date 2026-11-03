package com.aspose.slides.internal.q9r;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p6;
import java.util.HashSet;

public class m1 {
   private final Object n5 = new Object();
   private final Dictionary<String, m3> l6;
   private final IDictionary k5 = com.aspose.slides.internal.z5z.c8.l6();
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("Helvetica", "Khmer", "Lao", "Meiryo", "Segoe");

   public m1(k7[] var1) {
      this.l6 = n5(var1);
   }

   private static Dictionary<String, m3> n5(k7[] var0) {
      Dictionary var1 = new Dictionary<>(p6.u3());
      u9 var2 = new u9();

      for (k7 var6 : var0) {
         try {
            m3[] var7 = var2.n5(var6);
            if (var7 != null) {
               for (m3 var11 : var7) {
                  m3[] var12 = new m3[1];
                  boolean var13 = var1.tryGetValue(var11.l6(), var12);
                  if (var12[0] == null || var11.u3()) {
                     var1.set_Item(var11.l6(), var11);
                  }
               }
            }
         } catch (RuntimeException var14) {
         }
      }

      return var1;
   }

   void n5(k7 var1) {
      HashSet var2 = new HashSet();
      HashSet var3 = new HashSet();
      u9 var4 = new u9();

      try {
         m3[] var5 = var4.n5(var1);
         if (var5 != null) {
            for (m3 var9 : var5) {
               m3[] var10 = new m3[1];
               boolean var11 = this.l6.tryGetValue(var9.l6(), var10);
               if (var10[0] == null || var9.u3()) {
                  this.l6.set_Item(var9.l6(), var9);
                  var2.add(var9.n5());
               }
            }
         }

         for (Object var21 : this.k5) {
            DictionaryEntry var23 = (DictionaryEntry)var21;

            for (Object recoveredElement$var25$2122 : var2) {
               String var25 = (String)recoveredElement$var25$2122;
               String var26 = (String)var23.getKey();
               if (d1.a6(var26, var25)) {
                  var3.add(var25);
               } else {
                  u3 var12 = (u3)var23.getValue();
                  if (var12.n5() != 0) {
                     k5 var13 = var12.n5(0, false);
                     if (var13 != null) {
                        for (String var17 : var13.t2()) {
                           if (d1.a6(var26, var17)) {
                              var3.add(var17);
                           }
                        }
                     }
                  }
               }
            }
         }

         for (Object recoveredElement$var22$2800 : var3) {
            String var22 = (String)recoveredElement$var22$2800;
            this.k5.removeItem(var22);
         }
      } catch (RuntimeException var18) {
      }
   }

   public final k5 n5(String var1, int var2) {
      k5 var3 = this.l6(var1, var2);
      String var4 = null;
      if (var3 == null) {
         switch (u3.n5(var1)) {
            case 0:
               var4 = "Arial";
               break;
            case 1:
               var4 = "Khmer UI";
               break;
            case 2:
               var4 = "Lao UI";
               break;
            case 3:
               var4 = "Meiryo UI";
               break;
            case 4:
               var4 = "Segoe UI";
               break;
            default:
               String[] var5 = new String[]{var4};
               n5(var1, var5);
               var4 = var5[0];
         }

         if (com.aspose.slides.internal.z5z.u9.n5(var4)) {
            var3 = this.l6(var4, var2);
         }
      }

      return var3;
   }

   private static boolean n5(String var0, String[] var1) {
      try {
         com.aspose.slides.internal.o9b.y4 var2 = new com.aspose.slides.internal.o9b.y4(var0);
         var1[0] = var2.a6();
         return true;
      } catch (RuntimeException var3) {
         var1[0] = null;
         return false;
      }
   }

   private k5 l6(String var1, int var2) {
      u3 var3 = this.n5(var1);
      return var3 == null ? null : var3.n5(var2, false);
   }

   public u3 n5(String var1) {
      u3 var2 = (u3)this.k5.get_Item(var1);
      if (var2 == null) {
         synchronized (this.n5) {
            var2 = (u3)this.k5.get_Item(var1);
            if (var2 == null) {
               try {
                  var2 = this.l6(var1);
                  this.k5.set_Item(var1, var2);
               } catch (RuntimeException var6) {
               }
            }
         }
      }

      return var2;
   }

   private u3 l6(String var1) {
      u3 var2 = new u3(var1);
      Dictionary$ValueCollection$Enumerator var3 = this.l6.getValues().iterator();

      try {
         while (var3.hasNext()) {
            m3 var4 = (m3)var3.next();
            if (com.aspose.slides.internal.z5z.s7.n5(var1, var4.n5())) {
               u9 var5 = new u9();
               k5 var6 = var5.n5(var4.k5(), var4.l6());
               if (var6.n5(var1)) {
                  var2.n5(var6);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   public Dictionary<String, m3> n5() {
      return this.l6;
   }
}
