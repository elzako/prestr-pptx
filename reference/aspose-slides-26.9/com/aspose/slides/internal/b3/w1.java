package com.aspose.slides.internal.b3;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.t1;
import com.aspose.slides.internal.h2.v4;
import com.aspose.slides.internal.h2.x9;
import com.aspose.slides.internal.h2.z7;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.d2;

public class w1 extends r4 {
   private j5 u3;
   private static final Dictionary<String, n3> a6 = new Dictionary<>();

   public static a5 n5(String var0, j5 var1) {
      try {
         return new w1(var0, var1).l6();
      } catch (z8 var3) {
         var3.n5(var1);
         throw var3;
      } catch (RuntimeException var4) {
         throw var4;
      }
   }

   private w1(String var1, j5 var2) {
      super(var1);
      this.u3 = var2;
   }

   private a5 l6() {
      this.n5();
      if (this.n5 == 0) {
         return x9.l6(d1.n5);
      }

      z7 var1 = null;

      while (true) {
         a5 var2 = this.k5();
         if (this.n5 == 0) {
            if (var1 != null) {
               var1.n5(var2);
               return var1;
            }

            return var2;
         }

         if (var1 == null) {
            var1 = new z7(var2);
         } else {
            var1.n5(var2);
         }
      }
   }

   private a5 k5() {
      a5 var1 = this.u3();
      boolean var2 = false;

      while (!var2) {
         switch (this.n5) {
            case 8:
               this.n5();
               var1 = n5(var1.u9(), this.u3().u9());
               break;
            case 9:
               this.n5();
               var1 = l6(var1.u9(), this.u3().u9());
               break;
            default:
               var2 = true;
         }
      }

      return var1;
   }

   private a5 u3() {
      a5 var1 = this.a6();
      boolean var2 = false;

      while (!var2) {
         switch (this.n5) {
            case 2:
               this.n5();
               var1 = k5(var1.u9(), this.a6().u9());
               break;
            case 10:
               this.n5();
               var1 = n5(com.aspose.slides.ms.System.z3.n3(var1.h0()), com.aspose.slides.ms.System.z3.n3(this.a6().h0()));
               break;
            case 11:
               this.n5();
               var1 = u3(var1.u9(), this.a6().u9());
               break;
            default:
               var2 = true;
         }
      }

      return var1;
   }

   private a5 a6() {
      if (this.n5 == 9) {
         this.n5();
         return n5(this.a6().u9());
      } else {
         return this.h0();
      }
   }

   private void u9() {
      if (this.n5 != 4) {
         throw new z8("expected )");
      }

      this.n5();
   }

   private a5 h0() {
      if (this.n5 == 13) {
         this.n5();
      }

      a5 var1;
      switch (this.n5) {
         case 1:
            var1 = new t4(this.l6);
            break;
         case 2:
         case 4:
         case 6:
         case 8:
         case 9:
         case 10:
         case 11:
         case 13:
         default:
            throw new z8("syntax error");
         case 3:
            this.n5();
            var1 = this.k5();
            this.u9();
            return var1;
         case 5:
            var1 = x9.l6(this.l6);
            break;
         case 7:
            n3 var17 = null;
            n3[] var19 = new n3[]{var17};
            boolean var20 = !a6.tryGetValue(this.l6, var19);
            var17 = var19[0];
            if (var20) {
               throw new z8(d1.n5(new String[]{"no such function: ", this.l6}));
            }

            this.n5();
            this.u3.n5(var17);
            if (var17.n5() < 0) {
               var1 = var17.n5(this.l6(var17), this.u3);
            } else {
               var1 = var17.n5(this.n5(var17), this.u3);
            }

            this.u3.u9();
            return var1;
         case 12:
            int var15 = this.l6.length() - this.k5;
            String var6 = d1.k5(this.l6, var15);
            double var7 = d2.n5(com.aspose.slides.internal.v3.x8.n5(this.l6, 0, var15), 511, com.aspose.slides.internal.r4.k5.n5.n5());
            if (d1.a6("em", var6)) {
               var1 = (a5)m1.k5(v4.n5(var7), this.u3.l6());
            } else if (d1.a6("ex", var6)) {
               com.aspose.slides.internal.h2.s7 var9 = this.u3.u3().x8();
               com.aspose.slides.internal.v0.h0 var10 = this.u3.u3().n5().n_().c_();
               com.aspose.slides.internal.v0.s7[] var11 = var9.n5(var10);
               com.aspose.slides.internal.v0.u3 var12 = var10.n5(var11[0], var9.n5.u3(), var9.l6());
               var1 = com.aspose.slides.internal.h2.j5.n5(var7 * var12.x8(), "mpt");
            } else if (d1.a6("px", var6)) {
               float var16 = this.u3.u3().n5().q_().y4();
               var1 = com.aspose.slides.internal.h2.j5.n5(var7, var6, 72.0F / var16);
            } else {
               var1 = com.aspose.slides.internal.h2.j5.n5(var7, var6);
            }
            break;
         case 14:
            double var2 = d2.n5(com.aspose.slides.internal.v3.x8.n5(this.l6, 0, this.l6.length() - 1), 511, com.aspose.slides.internal.r4.k5.n5.n5()) / 100.0;
            com.aspose.slides.internal.f2.a6 var4 = this.u3.n5();
            if (var4 != null) {
               if (var4.n5() == 0) {
                  var1 = v4.n5(var2 * var4.l6());
               } else {
                  if (var4.n5() != 1) {
                     throw new z8("Illegal percent dimension value");
                  }

                  if (com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.f2.h0.class)) {
                     if (var2 == 0.0) {
                        var1 = com.aspose.slides.internal.h2.j5.n5;
                        break;
                     }

                     com.aspose.slides.internal.f2.k5 var5 = ((com.aspose.slides.internal.f2.h0)var4).k5();
                     if (var5 != null && var5.k5()) {
                        var1 = com.aspose.slides.internal.h2.j5.n5(var2 * var5.u3());
                        break;
                     }
                  }

                  var1 = new t1(var2, var4);
               }
            } else {
               var1 = v4.n5(var2);
            }
            break;
         case 15:
            var1 = com.aspose.slides.internal.h2.u9.n5(this.u3.h0(), this.l6);
            break;
         case 16:
            var1 = v4.n5(d2.n5(this.l6, 511, com.aspose.slides.internal.r4.k5.n5.n5()));
            break;
         case 17:
            var1 = v4.n5(d2.n5(this.l6));
      }

      this.n5();
      return var1;
   }

   private a5[] n5(n3 var1) {
      int var2 = var1.n5();
      a5[] var3 = new a5[var2];
      int var4 = 0;
      if (this.n5 == 4) {
         this.n5();
      } else {
         while (true) {
            a5 var5 = this.k5();
            if (var4 < var2) {
               var3[var4++] = var5;
            }

            if (this.n5 != 13) {
               this.u9();
               break;
            }

            this.n5();
         }
      }

      if (var4 == var2 - 1 && var1.k5()) {
         var3[var4++] = x9.l6(this.u3.a6().u3());
      }

      if (var2 != var4) {
         throw new z8(d1.n5(new String[]{"Expected ", a3.l6(var2), ", but got ", a3.l6(var4), " args for function"}));
      } else {
         return var3;
      }
   }

   private a5[] l6(n3 var1) {
      int var2 = -var1.n5();
      List var3 = new List();
      if (this.n5 == 4) {
         this.n5();
      } else {
         while (true) {
            a5 var4 = this.k5();
            var3.addItem(var4);
            if (this.n5 != 13) {
               this.u9();
               break;
            }

            this.n5();
         }
      }

      if (var2 > var3.size()) {
         throw new z8(d1.n5(new String[]{"Expected at least ", a3.l6(var2), ", but got ", a3.l6(var3.size()), " args for function"}));
      } else {
         return com.aspose.slides.internal.v6g.k5.k5(var3.toArray(new a5[0]), a5[].class);
      }
   }

   private static a5 n5(com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1) {
      if (var0 != null && var1 != null) {
         return (a5)m1.n5(var0, var1);
      } else {
         throw new z8("Non numeric operand in addition");
      }
   }

   private static a5 l6(com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1) {
      if (var0 != null && var1 != null) {
         return (a5)m1.l6(var0, var1);
      } else {
         throw new z8("Non numeric operand in subtraction");
      }
   }

   private static a5 n5(com.aspose.slides.internal.f2.u3 var0) {
      if (var0 == null) {
         throw new z8("Non numeric operand to unary minus");
      } else {
         return (a5)m1.l6(var0);
      }
   }

   private static a5 k5(com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1) {
      if (var0 != null && var1 != null) {
         return (a5)m1.k5(var0, var1);
      } else {
         throw new z8("Non numeric operand in multiplication");
      }
   }

   private static a5 u3(com.aspose.slides.internal.f2.u3 var0, com.aspose.slides.internal.f2.u3 var1) {
      if (var0 != null && var1 != null) {
         return (a5)m1.u3(var0, var1);
      } else {
         throw new z8("Non numeric operand in division");
      }
   }

   private static a5 n5(double var0, double var2) {
      return v4.n5(var0 % var2);
   }

   static {
      a6.addItem("ceiling", new a6());
      a6.addItem("floor", new h0());
      a6.addItem("round", new y1());
      a6.addItem("min", new z1());
      a6.addItem("max", new t9());
      a6.addItem("abs", new n5());
      a6.addItem("rgb", new c4());
      a6.addItem("system-color", new a0());
      a6.addItem("from-table-column", new t2());
      a6.addItem("inherited-property-value", new y4());
      a6.addItem("from-parent", new c8());
      a6.addItem("from-nearest-specified-value", new z3());
      a6.addItem("proportional-column-width", new m3());
      a6.addItem("label-end", new e2());
      a6.addItem("body-start", new l6());
      a6.addItem("rgb-icc", new x8());
      a6.addItem("rgb-named-color", new q0());
      a6.addItem("cie-lab-color", new k5());
      a6.addItem("cmyk", new u3());
      a6.addItem("rect", new u9());
   }
}
