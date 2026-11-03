package com.aspose.slides.internal.e5;

import com.aspose.slides.internal.h2.a5;
import com.aspose.slides.internal.h2.h2;
import com.aspose.slides.ms.System.d1;

public abstract class w1 {
   private static boolean[] l6;
   protected w1 n5 = null;
   private t9 k5 = null;

   public w1(t9 var1, w1 var2) {
      this.k5 = var1;
      this.n5 = var2;
   }

   public final t9 n5() {
      return this.k5;
   }

   public final t9 l6() {
      return this.n5 != null ? this.n5.n5() : null;
   }

   public final w1 k5() {
      return this.n5;
   }

   public final a5 n5(int var1) {
      a5 var2 = this.l6(var1);
      if (var2 == null) {
         var2 = this.c8(var1);
      }

      return var2;
   }

   public abstract a5 l6(int var1);

   public abstract void n5(int var1, a5 var2);

   public final a5 k5(int var1) {
      return s7(var1) ? this.h0(var1) : this.t2(var1);
   }

   public final a5 u3(int var1) {
      return this.n5(var1, true, true);
   }

   public final a5 a6(int var1) {
      return this.n5(var1, true, true);
   }

   public a5 n5(int var1, boolean var2, boolean var3) {
      h2 var4 = x8(var1 & 511);
      return var4 != null ? var4.n5(var1 & -512, this, var2, var3) : null;
   }

   public final a5 u9(int var1) {
      a5 var2 = null;

      for (w1 var3 = this.n5; var3 != null; var3 = var3.n5) {
         var2 = var3.l6(var1);
         if (var2 != null) {
            return var2;
         }
      }

      return this.t2(var1);
   }

   public final a5 h0(int var1) {
      return this.n5 != null ? this.n5.u3(var1) : this.t2(var1);
   }

   public final int n5(int var1, int var2, int var3, int var4) {
      int var5;
      try {
         switch (this.u3(267).a6()) {
            case 79:
               var5 = var1;
               break;
            case 121:
               var5 = var2;
               break;
            case 140:
               var5 = var3;
               break;
            case 205:
               var5 = var4;
               break;
            default:
               var5 = -1;
         }
      } catch (com.aspose.slides.internal.b3.z8 var7) {
         var5 = -1;
      }

      return var5;
   }

   private String n5(com.aspose.slides.internal.w2.k5 var1, String var2) {
      String var3 = var1.u3(var2);
      if (var3 != null) {
         this.n5(var1, var2, var3);
      }

      return var3;
   }

   public void n5(com.aspose.slides.internal.w2.k5 var1) {
      this.n5(var1, "writing-mode");
      this.n5(var1, "column-number");
      this.n5(var1, "number-columns-spanned");
      String var2 = this.n5(var1, "font");
      if (d1.n5(var2)) {
         this.n5(var1, "font-size");
         this.n5(var1, "font-family");
      }

      com.aspose.slides.internal.y1.u9 var3 = this.n5().q_().a6();

      for (int var4 = 0; var4 < var1.e2(); var4++) {
         String var5 = var1.c8(var4);
         String var6 = var1.s7(var4);
         String var7 = var1.x8(var4);
         if (var5 == null || var5.length() == 0 || d1.a6("xml:lang", var6) || d1.a6("xml:base", var6)) {
            this.n5(var1, var6, var7);
         } else if (!var3.n5(var5)) {
            a6 var8 = var3.u9().n5(var5);
            com.aspose.slides.internal.o0.l6 var9 = new com.aspose.slides.internal.o0.l6(var5, var6);
            if (var8 != null) {
               if (var8.n5(var9) && var8.k5() != null) {
                  this.n5(var1, d1.n5(new String[]{var8.k5(), ":", var9.n5()}), var7);
               } else {
                  this.n5().n5(var9, var7);
               }
            } else {
               this.n5(var9);
            }
         }
      }
   }

   private void n5(com.aspose.slides.internal.w2.k5 var1, String var2, String var3) {
      if (!d1.l6(var2, "xmlns:") && !d1.a6("xmlns", var2)) {
         if (var3 != null) {
            String var4 = n5(var2);
            String var5 = l6(var2);
            int var6 = s7.n5(var4);
            int var7 = s7.l6(var5);
            if (var6 == -1 || var7 == -1 && var5 != null) {
               this.n5(new com.aspose.slides.internal.o0.l6(null, var2));
            }

            t9 var8 = this.k5.l_();
            h2 var9 = x8(var6);
            if (var9 == null) {
               return;
            }

            try {
               a5 var10 = null;
               if (var5 == null) {
                  if (this.l6(var6) != null) {
                     return;
                  }

                  var10 = var9.n5(this, var3, var8);
               } else {
                  a5 var11 = this.n5(var1, var8, var6, var4, var9);
                  var10 = var9.n5(var11, var7, this, var3, var8);
               }

               if (var10 != null) {
                  this.n5(var6, var10);
               }
            } catch (com.aspose.slides.internal.b3.z8 var12) {
               this.k5.y4().n5(this, this.k5.t9(), var2, var3, var12, this.k5.k5);
            }
         }
      }
   }

   private a5 n5(com.aspose.slides.internal.w2.k5 var1, t9 var2, int var3, String var4, h2 var5) {
      a5 var6 = this.l6(var3);
      if (var6 != null) {
         return var6;
      }

      String var7 = var1.u3(var4);
      return var7 != null && var5 != null ? var5.n5(this, var7, var2) : null;
   }

   protected final void n5(com.aspose.slides.internal.o0.l6 var1) {
      if (!d1.l6(var1.l6(), "xmlns")) {
         this.k5.y4().n5(this, this.k5.t9(), var1, true, this.k5.k5);
      }
   }

   protected static String n5(String var0) {
      int var1 = d1.u3(var0, '.');
      String var2 = var0;
      if (var1 > -1) {
         var2 = com.aspose.slides.internal.v3.x8.n5(var0, 0, var1);
      }

      return var2;
   }

   protected static String l6(String var0) {
      int var1 = d1.u3(var0, '.');
      String var2 = null;
      if (var1 > -1) {
         var2 = d1.k5(var0, var1 + 1);
      }

      return var2;
   }

   private a5 c8(int var1) {
      h2 var2 = x8(var1);
      return var2 != null ? var2.a6(this) : null;
   }

   private a5 t2(int var1) {
      h2 var2 = x8(var1);
      return var2 != null ? var2.n5(this) : null;
   }

   private static boolean s7(int var0) {
      if (l6 == null) {
         l6 = new boolean[302];
         h2 var1 = null;

         for (int var2 = 1; var2 <= 301; var2++) {
            var1 = x8(var2);
            l6[var2] = var1 != null && var1.k5();
         }
      }

      return l6[var0];
   }

   private static h2 x8(int var0) {
      return var0 >= 1 && var0 <= 301 ? t9.l6(var0) : null;
   }

   public final com.aspose.slides.internal.h2.t2 u3() {
      return com.aspose.slides.internal.h2.t2.n5(this);
   }

   public final com.aspose.slides.internal.h2.e2 a6() {
      return com.aspose.slides.internal.h2.e2.n5(this);
   }

   public final com.aspose.slides.internal.h2.x8 u9() {
      return com.aspose.slides.internal.h2.x8.n5(this);
   }

   public final com.aspose.slides.internal.h2.n3 h0() {
      return new com.aspose.slides.internal.h2.n3(this);
   }

   public final com.aspose.slides.internal.h2.y4 c8() {
      return new com.aspose.slides.internal.h2.y4(this);
   }

   public final com.aspose.slides.internal.h2.t9 t2() {
      return new com.aspose.slides.internal.h2.t9(this);
   }

   public final com.aspose.slides.internal.h2.h0 s7() {
      return new com.aspose.slides.internal.h2.h0(this);
   }

   public final com.aspose.slides.internal.h2.s7 x8() {
      return com.aspose.slides.internal.h2.s7.n5(this);
   }

   public final com.aspose.slides.internal.h2.z1 n3() {
      return com.aspose.slides.internal.h2.z1.n5(this);
   }

   public final com.aspose.slides.internal.h2.a6 y4() {
      return com.aspose.slides.internal.h2.a6.n5(this);
   }
}
