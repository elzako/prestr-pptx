package com.aspose.slides.internal.i4;

public class q1 extends u6 {
   private j9 u3;

   public final g7 n5(y1 var1, g7[] var2) {
      return this.u3.c4().u9(com.aspose.slides.ms.System.d1.n5(new String[]{"[object ", var1.u3(), "]"}));
   }

   public static g7 l6(y1 var0, g7[] var1) {
      return var0;
   }

   public final g7 k5(y1 var1, g7[] var2) {
      return this.u3.t9().n5(var1.k5(var2[0]));
   }

   public final g7 u3(y1 var1, g7[] var2) {
      if (!"Object".equals(var1.u3())) {
         return this.u3.t9().t2();
      } else {
         return this.n5(var1) ? this.u3.t9().s7() : this.u3.t9().t2();
      }
   }

   public final g7 a6(y1 var1, g7[] var2) {
      if (!var1.k5(var2[0])) {
         return this.u3.t9().t2();
      }

      g7 var3 = var1.n5(var2[0]);
      return this.u3.t9().n5((var3.y1() & 2) == 0);
   }

   public final g7 n5(g7[] var1) {
      if (!"Object".equals(var1[0].u3())) {
         throw new n1(this.u3.m3().s7());
      }

      j4 var2 = com.aspose.slides.internal.v6g.k5.n5(var1[0], j4.class);
      j4 var3 = com.aspose.slides.internal.v6g.k5.n5((var2 != null ? var2 : l5.n5).n5("constructor"), j4.class);
      return (var3 != null ? var3 : l5.n5).n5("prototype");
   }

   public final g7 l6(g7[] var1) {
      g7 var2 = var1[0];
      if (!com.aspose.slides.internal.v6g.k5.l6(var2, y1.class)) {
         throw new n1(this.u3.m3().s7());
      }

      String var3 = var1[1].toString();
      y2 var4 = y2.n5(this.u3, (y1)var2, var3, var1[2]);
      ((y1)var2).n5(var4);
      return var2;
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      g7 var4;
      if ("toString".equals(this.n5)) {
         var4 = this.n5(var2, var3);
      } else if ("toLocaleString".equals(this.n5)) {
         var4 = this.n5(var2, var3);
      } else if ("valueOf".equals(this.n5)) {
         var4 = l6(var2, var3);
      } else if ("hasOwnProperty".equals(this.n5)) {
         var4 = this.k5(var2, var3);
      } else if ("isPrototypeOf".equals(this.n5)) {
         var4 = this.u3(var2, var3);
      } else if ("propertyIsEnumerable".equals(this.n5)) {
         var4 = this.a6(var2, var3);
      } else if ("getPrototypeOf".equals(this.n5)) {
         var4 = this.n5(var3);
      } else if ("defineProperty".equals(this.n5)) {
         var4 = this.l6(var3);
      } else if ("__lookupGetter__".equals(this.n5)) {
         var4 = this.u6(var2, var3);
      } else {
         if (!"__lookupSetter__".equals(this.n5)) {
            throw new j3("unknown object function");
         }

         var4 = this.t1(var2, var3);
      }

      var1.l6(var4);
      return var4;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("function {0}", new Object[]{this.n3()});
   }

   public q1(j9 var1, String var2, j4 var3) {
      super(var3);
      this.n5 = var2;
      this.u3 = var1;
   }
}
