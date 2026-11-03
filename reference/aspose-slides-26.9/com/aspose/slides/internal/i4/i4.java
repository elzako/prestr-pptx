package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class i4 extends u6 {
   private j9 u3;
   private static String a6;
   private static String u9;
   private static String h0;
   private static String c8;
   private static com.aspose.slides.internal.r7c.k5 t2;
   private static s9 s7;
   private static j9 x8;
   private static String n3;
   private static u6 y4;
   private static String e2;
   private static final com.aspose.slides.internal.v6g.u9 t9 = new com.aspose.slides.internal.v6g.u9("$$", "$&", "$`", "$'");

   private static String u3(com.aspose.slides.internal.r7c.u3 var0) {
      switch (t9.n5(var0.k5())) {
         case 0:
            return "$";
         case 1:
            return a6;
         case 2:
            return u9;
         case 3:
            return h0;
         default:
            int var1 = com.aspose.slides.ms.System.a3.n5(com.aspose.slides.ms.System.d1.k5(var0.k5(), 1));
            return var1 == 0 ? var0.k5() : t2.n5(var1).k5();
      }
   }

   private static String a6(com.aspose.slides.internal.r7c.u3 var0) {
      List var1 = new List();
      if (!s7.s7()) {
         s7.n5("lastIndex", x8.w1().n5((double)(var0.n5() + 1)));
      }

      var1.addItem(x8.c4().u9(var0.k5()));

      for (int var2 = 1; var2 < var0.a6().n5(); var2++) {
         if (var0.a6().n5(var2).u3()) {
            var1.addItem(x8.c4().u9(var0.a6().n5(var2).k5()));
         } else {
            var1.addItem(l5.n5);
         }
      }

      var1.addItem(x8.w1().n5((double)(var0.n5())));
      var1.addItem(x8.c4().u9(n3));
      g7[] var9 = new g7[var1.size()];
      int var3 = 0;
      IGenericEnumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            var9[var3++] = var5;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      x8.s7().n5(y4, null, var9);
      return x8.s7().h0().toString();
   }

   private static String u9(com.aspose.slides.internal.r7c.u3 var0) {
      if (!s7.s7()) {
         s7.n5("lastIndex", x8.w1().n5((double)(var0.n5() + 1)));
      }

      String var1 = com.aspose.slides.ms.System.d1.k5(n3, com.aspose.slides.ms.System.q1.l6(n3.length() - 1, var0.n5() + var0.l6()));
      return n5(var0.k5(), com.aspose.slides.ms.System.d1.l6(n3, 0, var0.n5()), var1, e2, var0.a6());
   }

   private static String n5(String var0, String var1, String var2, String var3, com.aspose.slides.internal.r7c.k5 var4) {
      if (com.aspose.slides.ms.System.d1.c8(var3, "$") != -1) {
         a6 = var0;
         u9 = var1;
         h0 = var2;
         c8 = var3;
         t2 = var4;
         com.aspose.slides.internal.r7c.c8 var5 = new com.aspose.slides.internal.r7c.c8("\\$\\$|\\$&|\\$`|\\$'|\\$\\d{1,2}", 0);
         return var5.n5(var3, new i4$1());
      } else {
         return var3;
      }
   }

   public final g7 n5(y1 var1, g7[] var2) {
      u3 var3 = this.u3.e2().h0();
      String var4 = var1.toString();
      if (var2.length == 0 || var2[0] == l5.n5) {
         var3.n5("0", this.u3.c4().u9(var4));
      }

      g7 var5 = var2[0];
      int var6 = var2.length > 1 ? com.aspose.slides.ms.System.z3.h0(var2[1].l6()) : Integer.MAX_VALUE;
      String[] var7;
      if ("RegExp".equals(var5.u3())) {
         var7 = ((s9)var2[0]).e2().n5(var4, var6);
      } else {
         var7 = com.aspose.slides.ms.System.d1.l6(var4, new String[]{var5.toString()}, var6, 0);
      }

      for (int var8 = 0; var8 < var7.length; var8++) {
         var3.n5(com.aspose.slides.ms.System.a3.l6(var8), this.u3.c4().u9(var7[var8]));
      }

      return var3;
   }

   public final g7 l6(y1 var1, g7[] var2) {
      if (var2.length == 0) {
         return this.u3.c4().u9(var1.toString());
      }

      g7 var3 = var2[0];
      g7 var4 = l5.n5;
      if (var2.length > 1) {
         var4 = var2[1];
      }

      String var5 = var1.toString();
      u6 var6 = com.aspose.slides.internal.v6g.k5.n5(var4, u6.class);
      if ("RegExp".equals(var3.u3())) {
         int var18 = ((s9)var2[0]).s7() ? Integer.MAX_VALUE : 1;
         s9 var19 = (s9)var2[0];
         int var21 = var19.s7() ? 0 : com.aspose.slides.ms.System.q1.n5(0, com.aspose.slides.internal.v6g.k5.u3(var19.n5("lastIndex").l6(), 14) - 1);
         if (var19.s7()) {
            var19.n5("lastIndex", this.u3.w1().n5(0.0));
         }

         if (var6 != null) {
            s7 = var19;
            x8 = this.u3;
            n3 = var5;
            y4 = var6;
            String var24 = ((s9)var2[0]).e2().n5(var5, new i4$2(this), var18, var21);
            return this.u3.c4().u9(var24);
         } else {
            e2 = var2[1].toString();
            s7 = var19;
            x8 = this.u3;
            n3 = var5;
            String var23 = ((s9)var2[0]).e2().n5(var1.toString(), new i4$3(this), var18, var21);
            return this.u3.c4().u9(var23);
         }
      } else {
         String var7 = var3.toString();
         int var8 = com.aspose.slides.ms.System.d1.c8(var5, var7);
         if (var8 == -1) {
            return this.u3.c4().u9(var5);
         }

         if (var6 == null) {
            String var20 = com.aspose.slides.ms.System.d1.l6(var5, 0, var8);
            String var22 = com.aspose.slides.ms.System.d1.k5(var5, var8 + var7.length());
            String var25 = n5(var7, var20, var22, var4.toString(), null);
            return this.u3.c4().u9(com.aspose.slides.ms.System.d1.n5(new String[]{var20, var25, var22}));
         }

         List var9 = new List();
         var9.addItem(this.u3.c4().u9(var7));
         var9.addItem(this.u3.w1().n5((double)(var8)));
         var9.addItem(this.u3.c4().u9(var5));
         g7[] var10 = new g7[var9.size()];
         int var11 = 0;
         IGenericEnumerator var12 = var9.iterator();

         try {
            while (var12.hasNext()) {
               g7 var13 = (g7)var12.next();
               var10[var11++] = var13;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
               var12.dispose();
            }
         }

         this.u3.s7().n5(var6, null, var10);
         var4 = this.u3.s7().t2();
         return this.u3
            .c4()
            .u9(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  com.aspose.slides.ms.System.d1.l6(var5, 0, var8), var4.toString(), com.aspose.slides.ms.System.d1.k5(var5, var8 + var7.length())
               })
            );
      }
   }

   public final g7 k5(y1 var1, g7[] var2) {
      return this.u3.c4().u9(var1.toString());
   }

   public final g7 u3(y1 var1, g7[] var2) {
      s9 var3 = "String".equals(var2[0].u3()) ? this.u3.r4().n5(var2[0].toString(), false, false, false) : (s9)var2[0];
      u3 var4 = (u3)this.u3.r4().n5(var3, new g7[]{var1});
      g7[] var5 = new g7[var4.k5()];

      for (int var6 = 0; var6 < var4.k5(); var6++) {
         var5[var6] = var4.n5((g7)this.u3.w1().n5((double)(var6)));
      }

      return this.u3.e2().n5(var5);
   }

   public final g7 a6(y1 var1, g7[] var2) {
      return this.u3.w1().n5((double)(com.aspose.slides.ms.System.d1.u9(var1.toString(), var2[0].toString())));
   }

   public final g7 u9(y1 var1, g7[] var2) {
      String var3 = var1.toString();
      int var4 = 0;
      int var5 = var3.length();
      if (var2.length > 0 && !com.aspose.slides.ms.System.d2.k5(var2[0].l6())) {
         var4 = com.aspose.slides.ms.System.z3.h0(var2[0].l6());
      }

      if (var2.length > 1 && var2[1] != l5.n5 && !com.aspose.slides.ms.System.d2.k5(var2[1].l6())) {
         var5 = com.aspose.slides.ms.System.z3.h0(var2[1].l6());
      }

      var4 = com.aspose.slides.ms.System.q1.l6(com.aspose.slides.ms.System.q1.n5(var4, 0), com.aspose.slides.ms.System.q1.n5(0, var3.length() - 1));
      var5 = com.aspose.slides.ms.System.q1.l6(com.aspose.slides.ms.System.q1.n5(var5, 0), var3.length());
      var3 = com.aspose.slides.ms.System.d1.l6(var3, var4, var5 - var4);
      return this.u3.c4().u9(var3);
   }

   public final g7 h0(y1 var1, g7[] var2) {
      String var3 = var1.toString();
      int var4 = 0;
      int var5 = var3.length();
      if (var2.length > 0 && !com.aspose.slides.ms.System.d2.k5(var2[0].l6())) {
         var4 = com.aspose.slides.ms.System.z3.h0(var2[0].l6());
      }

      if (var2.length > 1 && var2[1] != l5.n5 && !com.aspose.slides.ms.System.d2.k5(var2[1].l6())) {
         var5 = com.aspose.slides.ms.System.z3.h0(var2[1].l6());
      }

      var4 = com.aspose.slides.ms.System.q1.l6(com.aspose.slides.ms.System.q1.n5(var4, 0), com.aspose.slides.ms.System.q1.n5(0, var3.length() - 1));
      var5 = com.aspose.slides.ms.System.q1.l6(com.aspose.slides.ms.System.q1.n5(var5, 0), var3.length());
      var3 = com.aspose.slides.ms.System.d1.l6(var3, var4, var5 - var4);
      return this.u3.c4().u9(var3);
   }

   public final g7 c8(y1 var1, g7[] var2) {
      if ("String".equals(var2[0].u3())) {
         var2[0] = this.u3.r4().n5(var2[0].toString(), false, false, false);
      }

      com.aspose.slides.internal.r7c.u3 var3 = ((s9)var2[0]).e2().l6(var1.toString());
      return var3 != null && var3.u3() ? this.u3.w1().n5((double)(var3.n5())) : this.u3.w1().n5((double)(-1.0));
   }

   public final g7 n5(i9 var1, g7[] var2) {
      return this.u3.c4().u9(var1.toString());
   }

   public final g7 t2(y1 var1, g7[] var2) {
      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      var3.n5(var1.toString());

      for (int var4 = 0; var4 < var2.length; var4++) {
         var3.n5(var2[var4].toString());
      }

      return this.u3.c4().u9(var3.toString());
   }

   public final g7 s7(y1 var1, g7[] var2) {
      return this.u9(var1, new g7[]{var2[0], this.u3.w1().n5(var2[0].l6() + 1.0)});
   }

   public final g7 x8(y1 var1, g7[] var2) {
      String var3 = var1.toString();
      int var4 = com.aspose.slides.internal.v6g.k5.u3(var2[0].l6(), 14);
      return !com.aspose.slides.ms.System.d1.n5(var3) && var4 <= var3.length() - 1
         ? this.u3.w1().n5((double)(com.aspose.slides.ms.System.z3.h0(var3.charAt(var4))))
         : this.u3.y2();
   }

   public final g7 n3(y1 var1, g7[] var2) {
      String var3 = var1.toString();
      String var4 = var2[0].toString();
      int var5 = var2.length > 1 ? com.aspose.slides.internal.v6g.k5.u3(var2[1].l6(), 14) : var3.length();
      return this.u3.w1().n5((double)(com.aspose.slides.ms.System.d1.u3(com.aspose.slides.ms.System.d1.l6(var3, 0, var5), var4)));
   }

   public final g7 y4(y1 var1, g7[] var2) {
      String var3 = var1.toString();
      String var4 = var2[0].toString();
      int var5 = var2.length > 1 ? com.aspose.slides.internal.v6g.k5.u3(var2[1].l6(), 14) : 0;
      if (com.aspose.slides.ms.System.d1.n5(var4)) {
         return var2.length > 1 ? this.u3.w1().n5((double)(com.aspose.slides.ms.System.q1.l6(var3.length(), var5))) : this.u3.w1().n5((double)(0.0));
      } else {
         return var5 >= var3.length() ? this.u3.w1().n5((double)(-1.0)) : this.u3.w1().n5((double)(com.aspose.slides.ms.System.d1.n5(var3, var4, var5)));
      }
   }

   public final g7 e2(y1 var1, g7[] var2) {
      return this.u3.c4().u9(com.aspose.slides.ms.System.d1.a6(var1.toString()));
   }

   public final g7 t9(y1 var1, g7[] var2) {
      return this.u3.c4().u9(com.aspose.slides.ms.System.d1.u9(var1.toString()));
   }

   public final g7 z1(y1 var1, g7[] var2) {
      return this.u3.c4().u9(com.aspose.slides.ms.System.d1.s7(var1.toString()));
   }

   public final g7 t4(y1 var1, g7[] var2) {
      String var3 = var1.toString();
      return this.u3.c4().u9(com.aspose.slides.ms.System.d1.t2(var3));
   }

   public final g7 k5(y1 var1) {
      String var2 = var1.toString();
      return this.u3.w1().n5((double)(var2.length()));
   }

   public final g7 q0(y1 var1, g7[] var2) {
      String var3 = var1.toString();
      int var4 = com.aspose.slides.internal.v6g.k5.u3(var2[0].l6(), 14);
      int var5 = var3.length();
      if (var2.length > 1) {
         var5 = com.aspose.slides.internal.v6g.k5.u3(var2[1].l6(), 14);
         if (var5 < 0) {
            var5 += var3.length();
         }
      }

      if (var4 < 0) {
         var4 += var3.length();
      }

      return this.u3.c4().u9(com.aspose.slides.ms.System.d1.l6(var3, var4, var5 - var4));
   }

   public final g7 z3(y1 var1, g7[] var2) {
      String var3 = com.aspose.slides.ms.System.d1.n5;

      for (g7 var7 : var2) {
         var3 = com.aspose.slides.ms.System.d1.l6(var3, com.aspose.slides.ms.System.z3.l6(com.aspose.slides.ms.System.z3.c8(var7.l6())));
      }

      return this.u3.c4().u9(var3);
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      g7 var4;
      if ("get_length".equals(this.n5)) {
         var4 = this.k5(var2);
      } else if ("split".equals(this.n5)) {
         var4 = this.n5(var2, var3);
      } else if ("replace".equals(this.n5)) {
         var4 = this.l6(var2, var3);
      } else if ("toString".equals(this.n5)) {
         var4 = this.k5(var2, var3);
      } else if ("toLocaleString".equals(this.n5)) {
         var4 = this.k5(var2, var3);
      } else if ("match".equals(this.n5)) {
         var4 = this.u3(var2, var3);
      } else if ("localeCompare".equals(this.n5)) {
         var4 = this.a6(var2, var3);
      } else if ("substring".equals(this.n5)) {
         var4 = this.u9(var2, var3);
      } else if ("substr".equals(this.n5)) {
         var4 = this.h0(var2, var3);
      } else if ("search".equals(this.n5)) {
         var4 = this.c8(var2, var3);
      } else if ("valueOf".equals(this.n5)) {
         var4 = this.n5(com.aspose.slides.internal.v6g.k5.n5(var2, i9.class), var3);
      } else if ("concat".equals(this.n5)) {
         var4 = this.t2(var2, var3);
      } else if ("charAt".equals(this.n5)) {
         var4 = this.s7(var2, var3);
      } else if ("charCodeAt".equals(this.n5)) {
         var4 = this.x8(var2, var3);
      } else if ("lastIndexOf".equals(this.n5)) {
         var4 = this.n3(var2, var3);
      } else if ("indexOf".equals(this.n5)) {
         var4 = this.y4(var2, var3);
      } else if ("toLowerCase".equals(this.n5)) {
         var4 = this.e2(var2, var3);
      } else if ("toLocaleLowerCase".equals(this.n5)) {
         var4 = this.t9(var2, var3);
      } else if ("toUpperCase".equals(this.n5)) {
         var4 = this.z1(var2, var3);
      } else if ("toLocaleUpperCase".equals(this.n5)) {
         var4 = this.t4(var2, var3);
      } else if ("slice".equals(this.n5)) {
         var4 = this.q0(var2, var3);
      } else {
         if (!"fromCharCode".equals(this.n5)) {
            throw new j3("unknown error function");
         }

         var4 = this.z3(var2, var3);
      }

      var1.l6(var4);
      return var4;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("function {0}", new Object[]{this.n3()});
   }

   public i4(j9 var1, String var2, j4 var3) {
      super(var3);
      this.n5 = var2;
      this.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(com.aspose.slides.internal.r7c.u3 var0) {
      return u3(var0);
   }

   // $VF: synthetic method
   static String l6(com.aspose.slides.internal.r7c.u3 var0) {
      return a6(var0);
   }

   // $VF: synthetic method
   static String k5(com.aspose.slides.internal.r7c.u3 var0) {
      return u9(var0);
   }
}
