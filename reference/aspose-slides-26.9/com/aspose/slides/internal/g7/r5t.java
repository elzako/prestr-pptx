package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.exceptions.EndOfStreamException;
import com.aspose.slides.ms.System.IDisposable;

public class r5t extends a4 {
   private n2 n5;
   private u0a l6;
   private g9t k5;
   private d7u u3 = d7u.n5();
   private int a6 = 0;

   @Override
   public i2 n5(n2 var1) {
      try {
         this.n5 = var1;
         this.n5();
         switch (this.a6) {
            case 0:
            case 1:
               this.u3();
               break;
            case 2:
               this.u3();
               this.l6();
               break;
            case 3:
               this.k5();
         }
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
      if (this.n5 == null) {
         throw new s2("Font creation error. Could not find the font.");
      }

      this.a6 = 0;
      if (com.aspose.slides.internal.v6g.k5.l6(this.n5, v5.class)) {
         if (com.aspose.slides.internal.v6g.k5.l6(((v5)this.n5).u9(), v5$a6.class)) {
            this.l6 = new u0a(this.n5, this.u3);
            this.k5 = new p2((v5)this.n5, this.l6, this.u3);
            this.a6 = 2;
         } else {
            this.l6 = new u0a();
            this.a6 = 3;
         }
      } else {
         String var1 = null;
         p9 var2 = null;
         p9 var3 = null;
         if (this.n5.k5().length == 1 && this.n5.k5()[0].l6() == null) {
            x0 var15 = com.aspose.slides.internal.v6g.k5.n5(this.n5.k5()[0].k5(), x0.class);
            if (var15 != null) {
               var1 = com.aspose.slides.ms.System.d1.u3(com.aspose.slides.ms.System.d1.u9(com.aspose.slides.internal.z0k.z1.a6(var15.n5())),new char[]{ '.'});
            }

            var2 = this.n5.k5()[0];
         } else {
            for (int var4 = this.n5.k5().length - 1; var4 >= 0; var4--) {
               if (com.aspose.slides.ms.System.d1.a6(this.n5.k5()[var4].l6(), w1n.n5())
                  || com.aspose.slides.ms.System.d1.a6(this.n5.k5()[var4].l6(), w1n.k5())
                  || com.aspose.slides.ms.System.d1.a6(this.n5.k5()[var4].l6(), w1n.l6())
                  || com.aspose.slides.ms.System.d1.a6(this.n5.k5()[var4].l6(), w1n.u3())
                  || com.aspose.slides.ms.System.d1.a6(this.n5.k5()[var4].l6(), w1n.a6())) {
                  var1 = this.n5.k5()[var4].l6();
                  var2 = this.n5.k5()[var4];
               }
            }
         }

         if (com.aspose.slides.ms.System.d1.n5(var1)) {
            var1 = "ttf";
         }

         if (var2 != null) {
            if (!com.aspose.slides.ms.System.d1.a6(var1, w1n.n5())
               && !com.aspose.slides.ms.System.d1.a6(var1, w1n.k5())
               && !com.aspose.slides.ms.System.d1.a6(var1, w1n.l6())) {
               if (com.aspose.slides.ms.System.d1.a6(var1, w1n.u3()) || com.aspose.slides.ms.System.d1.a6(var1, w1n.a6())) {
                  this.a6 = 1;
                  com.aspose.slides.internal.z0k.t4 var16 = var2.k5().l6();

                  try {
                     com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

                     try {
                        r5 var6 = new r5(var16);
                        var6.n5(var5);
                        var5.close();
                        this.n5 = new n2(0, "ttf", new m3(var5.toArray()));
                        var3 = this.n5.k5()[0];
                     } finally {
                        if (var5 != null) {
                           var5.dispose();
                        }
                     }
                  } finally {
                     if (var16 != null) {
                        var16.dispose();
                     }
                  }
               }
            } else {
               var3 = var2;
            }
         }

         if (var3 == null) {
            throw new l7h("could not load font");
         }

         this.l6 = new u0a(this.n5, this.u3);
         this.k5 = new g9t(var3, this.l6, this.u3);
      }
   }

   private void l6() {
      v5 var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5, v5.class);
      if (var1 != null) {
         this.l6.u3(var1.u9().l6());
         this.l6.n5(new p0(var1.n5()));
         this.l6.n5(var1.u9().l6());
         this.l6.l6().n5(new d2n(this.k5, 0L, 0L, 0L));
         u0a var2 = (u0a)i2.n5(0, this.l6, new x7(false));
         var2.u3(var1.u9().l6());
         var2.n5(new p0(var1.u9().l6()));
         int var3 = 0;
         Dictionary$KeyCollection$Enumerator var4 = var1.u3().getKeys().iterator();

         try {
            while (var4.hasNext()) {
               int var5 = com.aspose.slides.internal.v6g.k5.u3(var4.next(), int.class);
               var3++;
               v5$u9 var6 = (v5$u9)var1.u3().get_Item(var5);
               k6 var7 = this.l6.n5(var5);
               if (com.aspose.slides.internal.v6g.k5.l6(var7, q1.class)) {
                  var7 = ((q1)var7).n5();
               }

               if (this.l6.l6().s7() == null) {
                  var7.k5(var6.n5());
               }

               int var8 = var2.n5(var7);
               var2.s7().n5(var8, (char)var6.h0());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         com.aspose.slides.internal.z0k.e2 var18 = new com.aspose.slides.internal.z0k.e2();

         byte[] var17;
         try {
            b2 var19 = b2.n5(var2, var18);
            var19.n5();
            var18.close();
            var17 = var18.toArray();
         } finally {
            if (var18 != null) {
               var18.dispose();
            }
         }

         this.l6 = (u0a)i2.n5(0, new m3(var17));
      }
   }

   private void k5() {
      v5 var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5, v5.class);
      if (var1 != null) {
         this.l6.u3(var1.u9().l6());
         this.l6.n5(new p0(var1.n5()));
         this.l6.n5(var1.u9().l6());
         this.l6.l6("Regular");
         v5$k5 var2 = (v5$k5)var1.u9();
         int var3 = var2.n5();
         double var4 = (this.l6.t2().u3() & 4294967295L) / (var3 * var1.u9().k5() / 72.0);
         Dictionary$KeyCollection$Enumerator var6 = var1.a6().getKeys().iterator();

         try {
            while (var6.hasNext()) {
               int var7 = com.aspose.slides.internal.v6g.k5.u3(var6.next(), int.class);
               v5$n5 var8 = (v5$n5)var1.a6().get_Item(var7);
               k6 var9 = new k6();
               k9 var10 = new k9(var9, var4);
               var10.n5(var8);
               var9.k5(var8.n5() / 4.0 * var4);
               int var11 = this.l6.n5(var9);
               this.l6.s7().n5(var11, (char)var8.h0());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         com.aspose.slides.internal.z0k.e2 var21 = new com.aspose.slides.internal.z0k.e2();

         byte[] var20;
         try {
            b2 var22 = b2.n5(this.l6, var21);
            var22.n5();
            var21.close();
            var20 = var21.toArray();
         } finally {
            if (var21 != null) {
               var21.dispose();
            }
         }

         this.l6 = (u0a)i2.n5(0, new m3(var20));
      }
   }

   private void u3() {
      f3c var1 = new f3c(this.k5.n5());

      try {
         var1.n5(this.k5.n5().a6());
         long var2 = var1.y4();
         int var4 = var1.n3();
         int var5 = var1.n3();
         int var6 = var1.n3();
         int var7 = var1.n3();
         this.u3.n5(new b9y(var2, var4, var5, var6, var7));

         for (int var8 = 0; var8 < (this.u3.l6().n5() & 65535); var8++) {
            String var9 = var1.l6(4);
            long var10 = var1.y4();
            long var12 = var1.y4();
            long var14 = var1.y4();
            this.l6.n5(var9, this.k5, var10, var12, var14);
         }

         this.n5("head", this.u3.k5(), var1);
         n5("name", this.u3.u3(), var1, false);
         this.n5("maxp", this.u3.a6(), var1);
         n5("loca", this.u3.u9(), var1, false);
         n5("cmap", this.u3.c8(), var1, false);
         n5("hhea", this.u3.t2(), var1, false);
         n5("hmtx", this.u3.s7(), var1, false);
         n5("post", this.u3.x8(), var1, false);
         n5("glyf", this.u3.h0(), var1, false);
         n5("kern", this.u3.n3(), var1, false);
         n5("cff", this.u3.y4(), var1, false);
         n5("cvt", this.u3.e2(), var1, false);
         n5("fpgm", this.u3.t9(), var1, false);
         n5("prep", this.u3.z1(), var1, false);
         n5("OS/2", this.u3.t4(), var1, false);
         n5("GDEF", this.u3.m1(), var1, false);
         n5("GSUB", this.u3.z3(), var1, false);
         n5("GPOS", this.u3.q0(), var1, false);
         if (this.l6.l6().u3() != null) {
            this.l6.u3(this.l6.l6().u3().l6(4));
            this.l6.n5(this.l6.l6().u3().n5(4));
            this.l6.l6(this.l6.l6().u3().n5(6));
            this.l6.n5(this.l6.l6().u3().l6(1));
            this.l6.l6(this.l6.l6().u3().l6(2));
         }
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   private void n5(String var1, s7k var2, f3c var3) {
      n5(var1, var2, var3, true);
   }

   private static void n5(String var0, s7k var1, f3c var2, boolean var3) {
      if (var1 != null && (var1.d2() & 4294967295L) < var2.l6()) {
         try {
            long var4 = var2.n5();
            var1.n5(var2);
            var2.n5(var4);
         } catch (EndOfStreamException var7) {
            if (r6.n5().k5() != 1) {
               throw new e2l("Unexpected font parsing exception", var7);
            }
         } catch (RuntimeException var8) {
            throw new r7c(com.aspose.slides.ms.System.d1.n5("Parsing of table '{0}' has failed.", new Object[]{var0}), var8);
         }
      } else if (var3) {
         if (var1 == null) {
            throw new r7c(com.aspose.slides.ms.System.d1.n5("The required table '{0}' was not found.", new Object[]{var0}));
         }

         throw new r7c(com.aspose.slides.ms.System.d1.n5("The required table '{0}' is out of file. The font file is broken.", new Object[]{var0}));
      }
   }
}
