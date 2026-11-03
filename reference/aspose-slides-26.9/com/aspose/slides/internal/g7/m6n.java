package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.ms.System.IDisposable;

public class m6n {
   private z4 n5;
   private n2 l6;

   public final n2 n5(z4 var1) {
      try {
         this.n5 = var1;
         this.n5();
         this.l6();
      } catch (EndOfStreamException var3) {
         if (r6.n5().k5() != 1) {
            throw new e2l("Unexpected font parsing exception", var3);
         }
      } catch (l0 var4) {
         throw var4;
      } catch (RuntimeException var5) {
         throw new e2l("Unexpected font parsing exception", var5);
      }

      return this.l6;
   }

   private void n5() {
   }

   private void l6() {
      f3c var1 = new f3c(this.n5);

      try {
         d7u var2 = d7u.n5();
         var1.n5(this.n5.a6());
         var2.n5(new b9y(var1.y4(), var1.n3(), var1.n3(), var1.n3(), var1.n3()));
         Hashtable var3 = new Hashtable();
         Hashtable var4 = new Hashtable();

         for (int var5 = 0; var5 < com.aspose.slides.internal.v6g.k5.k5(var2.l6().n5(), 8); var5++) {
            String var6 = var1.l6(4);
            var1.y4();
            long var7 = var1.y4();
            var1.y4();
            if ("name".equals(com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.u9(var6)))) {
               var1.n5(com.aspose.slides.internal.v6g.k5.u9(var7, 10));
               var1.n3();
               int var9 = var1.n3();
               int var10 = var1.n3();

               for (int var11 = 0; var11 < com.aspose.slides.internal.v6g.k5.k5(var9, 8); var11++) {
                  int var12 = var1.n3();
                  int var13 = var1.n3();
                  int var14 = var1.n3();
                  int var15 = var1.n3();
                  int var16 = com.aspose.slides.internal.v6g.k5.u3(var1.n3(), 8);
                  int var17 = com.aspose.slides.internal.v6g.k5.u3(var1.n3(), 8);
                  if (com.aspose.slides.internal.v6g.k5.k5(var15, 8) == com.aspose.slides.internal.v6g.k5.k5(4, 8)) {
                     String var18 = n5(var1, var7, var12, var14, var13, var10, var17, var16);
                     if (!com.aspose.slides.ms.System.d1.n5(var18) && !var3.containsKey(var14)) {
                        var3.addItem(var14, var18);
                     }
                  } else if (com.aspose.slides.internal.v6g.k5.k5(var15, 8) == com.aspose.slides.internal.v6g.k5.k5(6, 8)) {
                     String var39 = n5(var1, var7, var12, var14, var13, var10, var17, var16);
                     if (!com.aspose.slides.ms.System.d1.n5(var39) && !var4.containsKey(var14)) {
                        var4.addItem(var14, var39);
                     }
                  }
               }
               break;
            }
         }

         p0 var36 = new p0();
         p0 var37 = new p0();
         IEnumerator var19 = var3.getKeys().iterator();

         try {
            while (var19.hasNext()) {
               int var20 = com.aspose.slides.internal.v6g.k5.u3(var19.next(), int.class);
               var36.n5((String)var3.get_Item(var20), com.aspose.slides.internal.v6g.k5.u3(var20, 8));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
               ((IDisposable)var19).dispose();
            }
         }

         IEnumerator var40 = var4.getKeys().iterator();

         try {
            while (var40.hasNext()) {
               int var38 = com.aspose.slides.internal.v6g.k5.u3(var40.next(), int.class);
               var37.n5((String)var4.get_Item(var38), com.aspose.slides.internal.v6g.k5.u3(var38, 8));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var40, IDisposable.class)) {
               ((IDisposable)var40).dispose();
            }
         }

         this.l6 = new n2(var36, var37, 0, new p9(this.n5));
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   private static String n5(f3c var0, long var1, int var3, int var4, int var5, int var6, int var7, int var8) {
      String var9 = com.aspose.slides.ms.System.d1.n5;
      if (com.aspose.slides.internal.v6g.k5.u3(var3, 8) == r6.n5().l6()) {
         long var10 = var0.n5();
         String var12 = "ISO-8859-1";
         if (com.aspose.slides.internal.v6g.k5.k5(var3, 8) == 0) {
            var12 = "utf-16be";
         } else if (com.aspose.slides.internal.v6g.k5.k5(var3, 8) != 1) {
            if (com.aspose.slides.internal.v6g.k5.k5(var3, 8) == 3) {
               var12 = "utf-16be";
            } else if (com.aspose.slides.internal.v6g.k5.k5(var3, 8) == 2) {
               if (com.aspose.slides.internal.v6g.k5.k5(var5, 8) == 0) {
                  var12 = "us-ascii";
               } else if (com.aspose.slides.internal.v6g.k5.k5(var5, 8) == 1) {
                  var12 = "ISO-10646-UCS-2";
               } else if (com.aspose.slides.internal.v6g.k5.k5(var5, 8) == 2) {
                  var12 = "ISO-8859-1";
               }
            }
         }

         var0.n5(
            com.aspose.slides.internal.v6g.k5.a6(
               com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.internal.v6g.k5.a6(var1, 10) + com.aspose.slides.internal.v6g.k5.a6(var6, 8), 10) + var7,
               11
            )
         );
         var9 = var0.n5(var8, var12, true);
         var0.n5(var10);
      }

      return var9;
   }
}
