package com.aspose.slides.internal.a3;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.v0.h0;
import com.aspose.slides.internal.v0.s7;
import com.aspose.slides.internal.v0.x8;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class l6 {
   private n5 n5;
   private n5 l6;
   private n5 k5;

   public final n5 n5() {
      return this.n5;
   }

   public final n5 l6() {
      return this.l6 == null ? com.aspose.slides.internal.a3.n5.n5("normal") : this.l6;
   }

   public final n5 k5() {
      return this.k5 == null ? com.aspose.slides.internal.a3.n5.n5(a3.l6(400)) : this.k5;
   }

   protected final List<s7> n5(h0 var1) {
      n5 var2 = this.n5();
      n5 var3 = this.k5();
      n5 var4 = this.l6();
      List var5 = new List();
      com.aspose.slides.internal.r4.u3 var6 = new com.aspose.slides.internal.r4.u3<>(var2);

      while (var6.l6()) {
         String var7 = (String)var6.k5();
         Dictionary var8 = var1.k5();
         if (var8 != null) {
            Dictionary$KeyCollection$Enumerator var9 = var8.getKeys().iterator();

            try {
               while (var9.hasNext()) {
                  s7 var10 = (s7)var9.next();
                  String var11 = var10.n5();
                  if (d1.a6(d1.u9(var7), d1.u9(var11))) {
                     boolean var12 = false;
                     int var13 = var10.k5();
                     com.aspose.slides.internal.r4.u3 var14 = new com.aspose.slides.internal.r4.u3<>(var3);

                     while (var14.l6()) {
                        Object var15 = var14.k5();
                        if (com.aspose.slides.internal.v6g.k5.l6(var15, a6.class)) {
                           a6 var16 = (a6)var15;
                           if (var16.n5(var13)) {
                              var12 = true;
                           }
                        } else if (com.aspose.slides.internal.v6g.k5.l6(var15, String.class)) {
                           String var23 = (String)var15;
                           int var17 = x8.n5(var23);
                           if (var17 == var13) {
                              var12 = true;
                           }
                        } else if (com.aspose.slides.internal.v6g.k5.l6(var15, Integer.class)) {
                           int var24 = com.aspose.slides.internal.v6g.k5.u3(var15, int.class);
                           if (var24 == var13) {
                              var12 = true;
                           }
                        }
                     }

                     boolean var21 = false;
                     String var22 = var10.l6();
                     com.aspose.slides.internal.r4.u3 var25 = new com.aspose.slides.internal.r4.u3<>(var4);

                     while (var25.l6()) {
                        String var26 = (String)var25.k5();
                        if (d1.a6(var22, var26)) {
                           var21 = true;
                        }
                     }

                     if (var12 && var21) {
                        var5.addItem(var10);
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  var9.dispose();
               }
            }
         }
      }

      return var5;
   }

   public final s7 l6(h0 var1) {
      List var2 = this.n5(var1);
      s7 var3 = null;
      if (var2.size() == 1) {
         var3 = (s7)var2.get_Item(0);
      } else {
         com.aspose.slides.internal.r4.u3 var4 = new com.aspose.slides.internal.r4.u3(var2);

         while (var4.l6()) {
            s7 var5 = (s7)var4.k5();
            if (var3 == null) {
               var3 = var5;
            } else {
               int var6 = var5.u3();
               if (var6 < var3.u3()) {
                  var3 = var5;
               }
            }
         }
      }

      return var3;
   }

   public final List<s7> u3() {
      List var1 = new List();
      n5 var2 = this.n5();
      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3<>(var2);

      while (var3.l6()) {
         String var4 = (String)var3.k5();
         n5 var5 = this.l6();
         com.aspose.slides.internal.r4.u3 var6 = new com.aspose.slides.internal.r4.u3<>(var5);

         while (var6.l6()) {
            String var7 = (String)var6.k5();
            n5 var8 = this.k5();
            com.aspose.slides.internal.r4.u3 var9 = new com.aspose.slides.internal.r4.u3<>(var8);

            while (var9.l6()) {
               Object var10 = var9.k5();
               if (com.aspose.slides.internal.v6g.k5.l6(var10, a6.class)) {
                  a6 var15 = (a6)var10;
                  int[] var16 = var15.n5();

                  for (int var13 = 0; var13 < var16.length; var13++) {
                     var1.addItem(new s7(var4, var7, var16[var13], 97));
                  }
               } else if (com.aspose.slides.internal.v6g.k5.l6(var10, String.class)) {
                  String var11 = (String)var10;
                  int var12 = x8.n5(var11);
                  var1.addItem(new s7(var4, var7, var12, 97));
               } else if (com.aspose.slides.internal.v6g.k5.l6(var10, Integer.class)) {
                  int var14 = com.aspose.slides.internal.v6g.k5.u3(var10, int.class);
                  var1.addItem(new s7(var4, var7, var14, 97));
               }
            }
         }
      }

      return var1;
   }

   @Override
   public String toString() {
      String var1 = d1.n5;
      if (this.n5 != null) {
         var1 = d1.n5(var1, "font-family=" + this.n5);
      }

      if (this.l6 != null) {
         if (var1.length() > 0) {
            var1 = d1.n5(var1, ", ");
         }

         var1 = d1.n5(var1, "font-style=" + this.l6);
      }

      if (this.k5 != null) {
         if (var1.length() > 0) {
            var1 = d1.n5(var1, ", ");
         }

         var1 = d1.n5(var1, "font-weight=" + this.k5);
      }

      return var1;
   }
}
