package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;

public abstract class l6 {
   private List<l6$n5> u3;
   private boolean a6 = true;
   protected int n5;
   private int u9;
   protected com.aspose.slides.internal.v8.u9 l6 = com.aspose.slides.internal.v8.u9.n5;
   protected com.aspose.slides.internal.v8.u9 k5 = com.aspose.slides.internal.v8.u9.n5;

   public static String n5(int var0) {
      switch (var0) {
         case 5:
            return "ALL";
         case 8:
            return "ANY";
         case 9:
            return "AUTO";
         case 28:
            return "COLUMN";
         case 44:
            return "EVEN PAGE";
         case 75:
            return "LINE";
         case 95:
            return "NONE";
         case 100:
            return "ODD PAGE";
         case 104:
            return "PAGE";
         default:
            return com.aspose.slides.ms.System.d1.n5(new String[]{"??? (", com.aspose.slides.ms.System.a3.l6(var0), ")"});
      }
   }

   protected abstract int n5();

   protected abstract boolean l6();

   protected abstract void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2);

   protected abstract y2 k5();

   protected abstract y2 u3();

   protected boolean a6() {
      return true;
   }

   protected boolean u9() {
      return false;
   }

   protected z6 h0() {
      return null;
   }

   protected a0 c8() {
      return null;
   }

   protected abstract List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2);

   protected List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2, j8 var3, y2 var4) {
      throw new NotSupportedException("TODO: implement acceptable fallback");
   }

   public final boolean t2() {
      return this.a6;
   }

   protected void n5(l6$n5 var1, int var2) {
   }

   protected void s7() {
   }

   protected abstract void n5(j9 var1, l6$l6 var2);

   protected t1 x8() {
      return new t1(0);
   }

   protected void n5(t1 var1) {
   }

   public final void n5(int var1, boolean var2) {
      t1 var3 = this.x8();
      var3.n5(com.aspose.slides.internal.v8.u9.n5(var1));
      if (this.n5() == 162) {
         this.n5 = 70;
      } else if (this.n5() == 163) {
         this.n5 = 70;
      } else {
         this.n5 = 135;
      }

      this.u9 = 135;
      if (this.u9() && this.n5 == 70) {
         this.u9 = 70;
      }

      var3.k5(this.n5);
      this.u3 = new List<>();
      int var4 = 8;

      while (this.l6()) {
         this.u3.clear();
         var4 = this.k5(var3, var4);
         this.a6 = this.a6 && this.u3.size() == 0;

         for (int var5 = 0; var5 < this.u3.size(); var5++) {
            l6$n5 var6 = this.u3.get_Item(var5);
            j9 var7 = new j9(this.k5(), this.h0(), this.c8(), this.n5, this.u9, this.l6, this.k5, this.a6(), var2, this.u9());
            l6$n5 var8;
            if (this.n5() == 162) {
               var8 = this.n5(var6, var7, var1);
            } else {
               var8 = var6;
            }

            var7.l6(var1);
            int var9 = var7.n5(var8, 1.0, true, 0);
            if (var7.u3() != 0) {
               this.l6(var7, var9, var6, var8);
               this.u3.clear();
               var4 = this.n5(var3, var7, var8);
               var5 = -1;
            } else {
               this.n5(var7, var9, var6, var8);
            }
         }
      }

      this.u3 = null;
   }

   private boolean n5(j8 var1) {
      y2 var2 = var1.u3();
      if (var2 != null && !var2.z1()) {
         return true;
      }

      j8 var3 = var1.k5();
      return var3 != null && this.n5(var3);
   }

   protected abstract void n5(j9 var1, int var2, l6$n5 var3, l6$n5 var4);

   protected final void l6(j9 var1, int var2, l6$n5 var3, l6$n5 var4) {
      this.n5(var1, 0, var2, var3, var4);
   }

   protected final void n5(j9 var1, int var2, int var3, l6$n5 var4, l6$n5 var5) {
      int var6 = 0;
      int var7 = 0;
      int var8 = -1;

      for (int var9 = var2; var9 < var2 + var3; var9++) {
         l6$l6 var10 = var1.t9().get_Item(var9);
         int var11;
         if (var9 == 0) {
            var11 = var5.a6();
         } else {
            v0 var12 = var5.n5(var7);
            if (var12.y_()) {
               o0 var13 = (o0)var12;
               var11 = var13.t2();
            } else {
               var11 = 28;
            }
         }

         var7 = var10.n5();
         var6 += var6 == 0 ? var5.n5 : 0;
         this.n5(var5, var11);
         int var20 = this.n5();
         int var21 = var7;
         var7 -= var7 == var4.size() - 1 ? var5.l6 : 0;
         if (((i1)var5.get_Item(var7)).x_()) {
            var7--;
         }

         com.aspose.slides.internal.r4.u3 var14 = new com.aspose.slides.internal.r4.u3<>(var5, var6);

         while (var14.l6() && !((i1)var14.k5()).e2()) {
            var6++;
         }

         if (var6 > var7) {
            this.s7();
         } else {
            t1 var15 = new t1(0);
            var15.n5(var10.n5);
            if (var10.l6 != 0 && var20 == 23) {
               var15.h0(var10.l6 / 2);
            } else if (var10.l6 != 0 && var20 == 3) {
               var15.h0(var10.l6);
            } else if (var10.l6 != 0 && var20 == 163 && var9 < var3 - 1) {
               int var16 = 0;
               var14 = new com.aspose.slides.internal.r4.u3<>(var5, var6);

               while (var14.u9() <= var7) {
                  i1 var17 = (i1)((com.aspose.slides.internal.r4.u9)var14.k5()).n5();
                  if (var17.e2() && var17.z1() > 0) {
                     var16++;
                  }
               }

               if (var16 >= 2) {
                  var15.c8(var10.l6 / (var16 - 1));
               }
            }

            if (var20 == 162) {
               int var23 = n5(var5, var6, var7);
               if (var23 != 0) {
                  var15.n5(com.aspose.slides.internal.v8.u9.n5(var23));
               }
            }

            j4.n5(var5, var6, var21, var8);
            this.n5(new z7<>(var5, var6, var7 + 1), var15);
         }

         this.n5(var1, var10);
         var8 = var7;
         var6 = var10.n5() + 1;
      }
   }

   protected int l6(t1 var1, int var2) {
      return var2;
   }

   protected int k5(t1 var1, int var2) {
      return this.n5(var1, var2, null, null, null);
   }

   protected int n5(t1 var1, int var2, j8 var3, y2 var4, List<com.aspose.slides.internal.r4.u9> var5) {
      this.n5(var1);
      var1.u9(0);
      List var6;
      if (var5 == null) {
         var6 = this.n5(var1, this.n5);
      } else if (var3 == null) {
         var6 = var5;
         com.aspose.slides.internal.r4.u3 var7 = new com.aspose.slides.internal.r4.u3(var6, var6.size());

         for (int var8 = 0; var8 < 3; var8++) {
            var7.a6();
            var7.n5();
         }
      } else {
         var6 = this.n5(var1, this.n5, var3, var4);
         var6.insertRange(0, var5);
      }

      if (var6 != null) {
         if (var6.size() == 0) {
            return this.l6(var1, var2);
         }

         l6$n5 var9 = new l6$n5(var2, this.n5(), this);
         var2 = this.l6(var1, var2);
         j8 var10 = null;
         if (q0.l6(var6)) {
            o0 var11 = (o0)com.aspose.slides.internal.v3.t2.l6(var6);
            var10 = var11.k7();
            switch (var11.t2()) {
               case 28:
                  var2 = 28;
                  break;
               case 44:
                  var2 = 44;
                  break;
               case 100:
                  var2 = 100;
                  break;
               case 104:
                  var2 = 8;
                  break;
               default:
                  throw new InvalidOperationException(com.aspose.slides.ms.System.d1.n5(new String[]{"Invalid break class: ", com.aspose.slides.ms.System.a3.l6(var11.t2())}));
            }
         }

         var9.addRange(var6);
         l6$n5 var12 = var9.l6(var10);
         if (var12 != null) {
            this.u3.addItem(var12);
         }
      }

      return var2;
   }

   private int n5(t1 var1, j9 var2, l6$n5 var3) {
      t4$k5 var4 = var2.q0();
      int var5 = var4.n5;
      i1 var6 = var2.u3(var5);
      j8 var7 = var6.k7();
      if (!com.aspose.slides.internal.v6g.k5.l6(var7, j4$n5.class)) {
         throw new NotSupportedException("Don't know how to restart at position " + var7);
      }

      var7 = var7.k5();
      y2 var8 = null;
      List var9 = new List();
      if (this.n5(var7)) {
         if (var2.u3() > 0) {
            com.aspose.slides.internal.i1.u9 var10 = this.u3().y4().q_().m1();
            w1 var11 = n3.n5(var10);
            var11.n5(this);
         }

         var9 = new List();
         boolean var16 = false;
         com.aspose.slides.internal.r4.u3 var18 = new com.aspose.slides.internal.r4.u3<>(var3, var5 + 1);
         j8 var12 = null;

         while (var18.l6() && (var12 == null || this.n5(var12))) {
            var5++;
            i1 var13 = (i1)var18.k5();
            var12 = var13.k7();
            if (var13.e2()) {
               var16 = true;
               var9.addItem(var13);
            } else if (var16) {
               var9.addItem(var13);
            }
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var12, j4$n5.class)) {
            var7 = var12.k5();
         } else {
            var7 = null;
         }
      }

      if (var7 != null && var7.a6() == -1) {
         com.aspose.slides.internal.r4.u3 var19 = new com.aspose.slides.internal.r4.u3<>(var3, var5 + 1);

         j8 var17;
         do {
            i1 var20 = (i1)var19.k5();
            var17 = var20.k7();
         } while (
            var17 == null
               || com.aspose.slides.internal.v6g.k5.l6(var17, j4$l6.class)
               || com.aspose.slides.internal.v6g.k5.l6(var17, j4$n5.class) && var17.k5().a6() == -1
         );

         y2 var21 = var7.u3();

         while (var17.u3() != var21) {
            var17 = var17.k5();
         }

         var8 = var17.k5().u3();
      }

      return this.n5(var1, 28, var7, var8, var9);
   }

   private static int n5(v4 var0, int var1, int var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      com.aspose.slides.internal.r4.u3 var6 = new com.aspose.slides.internal.r4.u3<>(var0, var1);

      while (var6.u9() <= var2) {
         i1 var7 = (i1)var6.k5();
         p8 var8 = com.aspose.slides.internal.v6g.k5.n5(var7, p8.class);
         if (var8 != null) {
            if (var8.y4() > 0) {
               var3++;
               var4 += var8.y4();
            }

            if (var8.n3().n5() > var5) {
               var5 = var8.n3().n5();
            }
         }
      }

      int var9 = 0;
      if (var4 > 0 && var3 > 0) {
         var9 = var4 / var3;
         if (var9 < var5) {
            var9 = var5;
         }
      }

      return var9;
   }

   private l6$n5 n5(l6$n5 var1, j9 var2, int var3) {
      var2.l6(var3);
      com.aspose.slides.internal.r4.u3 var4 = new com.aspose.slides.internal.r4.u3<>(var1);
      com.aspose.slides.internal.r4.u3 var5 = new com.aspose.slides.internal.r4.u3<>(var2.t9());
      i1 var6 = null;

      while (var5.l6()) {
         l6$l6 var7 = (l6$l6)var5.k5();
         int var8 = 0;

         while (var4.l6()) {
            i1 var9 = (i1)((com.aspose.slides.internal.r4.u9)var4.k5()).n5();
            if (var9.e2()) {
               break;
            }

            if (var9.x_()) {
               ((r4)var9.m3()).n5((e5)var9);
            }
         }

         var4.a6();
         com.aspose.slides.internal.v8.u9 var10 = com.aspose.slides.internal.v8.u9.n5;
         com.aspose.slides.internal.v8.u9 var11 = com.aspose.slides.internal.v8.u9.n5;
         List var12 = new List();
         List var13 = new List();
         List var14 = new List();
         boolean var15 = false;

         while (var4.l6() && var4.u9() <= var7.n5()) {
            var6 = (i1)var4.k5();
            if (var6.x_()) {
               e5 var24 = (e5)var6;
               u9 var17 = var24.u9();
               if (var17.equals(com.aspose.slides.internal.p3.u9.l6) || var17.equals(com.aspose.slides.internal.p3.u9.k5)) {
                  var13.addItem(var24);
               } else if (var17.equals(com.aspose.slides.internal.p3.u9.u3)) {
                  var10 = var10.u3(var6.q0());
                  var10 = var10.k5(var6.z3());
                  var14.addItem(var24);
               } else if (var17.equals(com.aspose.slides.internal.p3.u9.a6)) {
               }
            } else if (var6.e2()) {
               if (!var15) {
                  var15 = true;
               } else {
                  while (var13.size() != 0) {
                     e5 var16 = (e5)var13.get_Item(0);
                     var13.removeAt(0);
                     var11 = var11.u3(var16.q0());
                     var11 = var11.k5(var16.z3());
                     var12.addItem(var16);
                  }
               }
            }
         }

         if (var6.y_() && var6.z1() > 0) {
            ((r4)var6.m3()).n5(var6.z1(), var6);
         }

         if (var7.n5 != 0.0 && var7.l6 > 0 && var7.l6 <= var11.k5() || var7.l6 < 0 && var7.l6 >= var11.n5()) {
            var8 += n5(var12, var7.l6, var7.l6 > 0 ? var11.k5() : -var11.n5());
         } else if (var7.n5 != 0.0) {
            var8 += l6(var14, var7.l6, var7.l6 > 0 ? var10.k5() : -var10.n5());
            var8 += n5(var12, var7.l6 - var8, var7.l6 - var8 > 0 ? var11.k5() : -var11.n5());
         }
      }

      l6$n5 var21 = new l6$n5(var1.a6(), var1.u9(), this);
      var21.addRange(this.u3().n5(var1.getRange(0, var1.size() - var1.l6), 0));
      var21.h0();
      var2.t9().clear();
      return var21;
   }

   private static int n5(List<e5> var0, int var1, int var2) {
      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3(var0);
      int var4 = 0;
      byte var5 = 0;

      while (var3.l6()) {
         e5 var6 = (e5)var3.k5();
         var5 += var1 > 0 ? var6.q0() : var6.z3();
         int var7 = ((r4)var6.m3()).n5(com.aspose.slides.internal.v6g.k5.u3((float)var5 * var1 / var2, 13) - var4, var6);
         var4 += var7;
      }

      return var4;
   }

   private static int l6(List<e5> var0, int var1, int var2) {
      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3(var0);
      int var4 = 0;
      byte var5 = 0;

      while (var3.l6()) {
         e5 var6 = (e5)var3.k5();
         var5 += var1 > 0 ? var6.q0() : var6.z3();
         int var7 = ((r4)var6.m3()).n5(com.aspose.slides.internal.v6g.k5.u3((float)var5 * var1 / var2, 13) - var4, var6);
         var4 += var7;
      }

      return var4;
   }
}
