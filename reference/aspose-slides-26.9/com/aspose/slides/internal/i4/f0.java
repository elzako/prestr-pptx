package com.aspose.slides.internal.i4;

public class f0 extends u6 {
   private final j9 u3;
   private final w2 a6;
   private static final char[] u9 = new char[]{';', ',', '/', '?', ':', '@', '&', '=', '+', '$', '#'};
   private static final char[] h0 = new char[]{'-', '_', '.', '!', '~', '*', '\'', '(', ')', '[', ']'};

   public final w2 s7() {
      return this.a6;
   }

   public final g7 n5(g7[] var1) {
      if (!"String".equals(var1[0].u3())) {
         return var1[0];
      }

      u5 var2;
      try {
         var2 = f5.n5(var1[0].toString());
      } catch (RuntimeException var5) {
         throw new n1(this.u3.k7().u9(var5.getMessage()));
      }

      try {
         var2.n5((j8)this.s7());
      } catch (RuntimeException var4) {
         throw new n1(this.u3.q0().u9(var4.getMessage()));
      }

      return this.s7().t2();
   }

   public final g7 l6(g7[] var1) {
      if (var1.length >= 1 && var1[0] != l5.n5) {
         String var2 = com.aspose.slides.ms.System.d1.l6(var1[0].toString());
         byte var3 = 1;
         int var4 = 10;
         if (com.aspose.slides.ms.System.d1.n5(var2)) {
            return com.aspose.slides.internal.v6g.k5.n5(this.u3, v0.class).n5("NaN");
         }

         if (com.aspose.slides.ms.System.d1.l6(var2, "-")) {
            var2 = com.aspose.slides.ms.System.d1.k5(var2, 1);
            var3 = -1;
         } else if (com.aspose.slides.ms.System.d1.l6(var2, "+")) {
            var2 = com.aspose.slides.ms.System.d1.k5(var2, 1);
         }

         if (var1.length >= 2 && var1[1] != l5.n5 && !var1[1].equals(0)) {
            var4 = com.aspose.slides.ms.System.z3.h0(var1[1].C_());
         }

         if (var4 == 0) {
            var4 = 10;
         } else if (var4 < 2 || var4 > 36) {
            return com.aspose.slides.internal.v6g.k5.n5(this.u3, v0.class).n5("NaN");
         }

         if (com.aspose.slides.ms.System.d1.l6(com.aspose.slides.ms.System.d1.u9(var2), "0x")) {
            var4 = 16;
         }

         try {
            if (var4 == 10) {
               double var5 = 0.0;
               double[] var7 = new double[]{0.0};
               boolean var8 = com.aspose.slides.ms.System.d2.n5(var2, 511, com.aspose.slides.internal.x7n.l6.k5(), var7);
               var5 = var7[0];
               return var8
                  ? this.u3.w1().n5(var3 * com.aspose.slides.ms.System.q1.k5(var5))
                  : com.aspose.slides.internal.v6g.k5.n5(this.u3, v0.class).n5("NaN");
            } else {
               return this.u3.w1().n5((double)(var3 * com.aspose.slides.ms.System.z3.l6(var2, var4)));
            }
         } catch (RuntimeException var10) {
            return com.aspose.slides.internal.v6g.k5.n5(this.u3, v0.class).n5("NaN");
         }
      } else {
         return l5.n5;
      }
   }

   public final g7 k5(g7[] var1) {
      if (var1.length >= 1 && var1[0] != l5.n5) {
         String var2 = com.aspose.slides.ms.System.d1.l6(var1[0].toString());
         com.aspose.slides.internal.r7c.c8 var3 = new com.aspose.slides.internal.r7c.c8("^[\\+\\-\\d\\.e]*", 66);
         com.aspose.slides.internal.r7c.u3 var4 = var3.l6(var2);
         double var5 = 0.0;
         double[] var7 = new double[]{0.0};
         boolean var8 = var4.u3() && com.aspose.slides.ms.System.d2.n5(var4.k5(), 167, new com.aspose.slides.internal.x7n.l6("en-US"), var7);
         var5 = var7[0];
         return var8 ? this.u3.w1().n5(var5) : com.aspose.slides.internal.v6g.k5.n5(this.u3, v0.class).n5("NaN");
      } else {
         return l5.n5;
      }
   }

   public final g7 u3(g7[] var1) {
      return var1.length >= 1 && var1[0] != l5.n5 ? this.u3.t9().n5(com.aspose.slides.ms.System.d2.l6(Double.NaN, var1[0].l6())) : this.u3.t9().n5(false);
   }

   public final g7 a6(g7[] var1) {
      if (var1.length >= 1 && var1[0] != l5.n5) {
         g7 var2 = var1[0];
         return this.u3.t9().n5(var2 != this.u3.w1().n5("NaN") && var2 != this.u3.w1().n5("POSITIVE_INFINITY") && var2 != this.u3.w1().n5("NEGATIVE_INFINITY"));
      } else {
         return this.u3.t9().t2();
      }
   }

   public final g7 u9(g7[] var1) {
      return var1.length >= 1 && var1[0] != l5.n5
         ? this.u3.c4().u9(com.aspose.slides.ms.System.r8.x8(com.aspose.slides.ms.System.d1.n5(var1[0].toString(), "+", " ")))
         : this.u3.c4().s7();
   }

   public final g7 h0(g7[] var1) {
      return var1.length >= 1 && var1[0] != l5.n5
         ? this.u3.c4().u9(com.aspose.slides.ms.System.r8.x8(com.aspose.slides.ms.System.d1.n5(var1[0].toString(), "+", " ")))
         : this.u3.c4().s7();
   }

   public final g7 c8(g7[] var1) {
      if (var1.length >= 1 && var1[0] != l5.n5) {
         String var2 = com.aspose.slides.ms.System.r8.t2(var1[0].toString());

         for (char var6 : h0) {
            var2 = com.aspose.slides.ms.System.d1.n5(
               var2, com.aspose.slides.ms.System.r8.t2(com.aspose.slides.ms.System.t9.q0(var6)), com.aspose.slides.ms.System.t9.q0(var6)
            );
         }

         return this.u3.c4().u9(var2);
      } else {
         return this.u3.c4().s7();
      }
   }

   public final g7 t2(g7[] var1) {
      if (var1.length >= 1 && var1[0] != l5.n5) {
         String var2 = com.aspose.slides.ms.System.r8.t2(var1[0].toString());

         for (char var6 : u9) {
            var2 = com.aspose.slides.ms.System.d1.n5(
               var2, com.aspose.slides.ms.System.r8.t2(com.aspose.slides.ms.System.t9.q0(var6)), com.aspose.slides.ms.System.t9.q0(var6)
            );
         }

         for (char var10 : h0) {
            var2 = com.aspose.slides.ms.System.d1.n5(
               var2, com.aspose.slides.ms.System.r8.t2(com.aspose.slides.ms.System.t9.q0(var10)), com.aspose.slides.ms.System.t9.q0(var10)
            );
         }

         return this.u3.c4().u9(var2);
      } else {
         return this.u3.c4().s7();
      }
   }

   public final g7 k5(y1 var1) {
      return this.u3.w1().n5((double)(var1.k5()));
   }

   public final g7 n5(g7 var1, g7[] var2) {
      int var3 = com.aspose.slides.internal.v6g.k5.u3(var2[0].l6(), 14);
      if (var3 >= 0 && !com.aspose.slides.ms.System.d2.k5(var3) && !com.aspose.slides.ms.System.d2.l6(var3)) {
         y1 var4 = (y1)var1;
         var4.n5(var3);
         return var2[0];
      } else {
         throw new n1(this.u3.z3().u9("invalid length"));
      }
   }

   public static g7 x8() {
      return l5.n5;
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      g7 var4;
      if ("eval".equals(this.n5)) {
         var4 = this.n5(var3);
      } else if ("parseInt".equals(this.n5)) {
         var4 = this.l6(var3);
      } else if ("parseFloat".equals(this.n5)) {
         var4 = this.k5(var3);
      } else if ("isNaN".equals(this.n5)) {
         var4 = this.u3(var3);
      } else if ("isFinite".equals(this.n5)) {
         var4 = this.a6(var3);
      } else if ("decodeURI".equals(this.n5)) {
         var4 = this.u9(var3);
      } else if ("encodeURI".equals(this.n5)) {
         var4 = this.t2(var3);
      } else if ("decodeURIComponent".equals(this.n5)) {
         var4 = this.h0(var3);
      } else if ("encodeURIComponent".equals(this.n5)) {
         var4 = this.c8(var3);
      } else if ("get_length".equals(this.n5)) {
         var4 = this.k5(var2);
      } else if ("set_length".equals(this.n5)) {
         var4 = this.n5(var2, var3);
      } else {
         if (!"prototype".equals(this.n5)) {
            throw new j3("unknown global function");
         }

         var4 = x8();
      }

      var1.l6(var4);
      return var4;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("function {0}", new Object[]{this.n3()});
   }

   public f0(j9 var1, w2 var2, String var3, j4 var4) {
      super(var4);
      this.n5 = var3;
      this.u3 = var1;
      this.a6 = var2;
   }
}
